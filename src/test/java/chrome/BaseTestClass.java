package chrome;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import chrome.pages.HomePage;
import chrome.utils.EventReporter;
import chrome.utils.WindowManager;

//@TestInstance(Lifecycle.PER_CLASS)
public class BaseTestClass {
	private WebDriver driver;
	protected HomePage homePage;

	@BeforeClass
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox", "--disable-dev-shm-usage");

		// Crea tu listener
		WebDriverListener listener = new EventReporter();

		WebDriver originalDriver = new ChromeDriver(options);
		driver = new EventFiringDecorator<WebDriver>(listener).decorate(originalDriver);
		// --- SOLUCIÓN AL ERROR: Espera implícita ---
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://the-internet.herokuapp.com/");
		homePage = new HomePage(driver);

	}

	@BeforeMethod
	public void goHome() {
		driver.get("https://the-internet.herokuapp.com/");
		homePage = new HomePage(driver);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		if (driver != null) {
			driver.quit();
		}

	}

	@AfterMethod
	public void recordFailure(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot camera = (TakesScreenshot) driver;
			File screenshot = camera.getScreenshotAs(OutputType.FILE);
			try {
				Files.move(screenshot, new File("main/resources/screenshots/" + result.getName() + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public WindowManager getWindowManager() {
		return new WindowManager(driver);
	}
}