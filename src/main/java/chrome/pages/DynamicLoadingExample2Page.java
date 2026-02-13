package chrome.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class DynamicLoadingExample2Page {
	private WebDriver driver;
	private By startButton = By.cssSelector("#start button");
	private By loadedText = By.id("finish");


	public DynamicLoadingExample2Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickStart() {
		
		driver.findElement(startButton).click();
		FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(startButton)));
	}
	
	public String getLoadedText() {
		return driver.findElement(loadedText).getText();
	}
	
	public boolean isStartButtonDisplayed() {
		return driver.findElement(startButton).isDisplayed();
	}
	
}
