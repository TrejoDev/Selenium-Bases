package chrome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

	private WebDriver driver;
	private By bodyTag = By.tagName("body");

	public NestedFramesPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLeftFrameText() {
		// Cambiar al frame top primero
		driver.switchTo().frame("frame-top");
		// Luego cambiar al frame left
		driver.switchTo().frame("frame-left");
		String frameT = driver.findElement(bodyTag).getText();
		switchToMainArea();
		return frameT;
	}

	public String getBottomFrameText() {
		// Cambiar directamente al frame bottom (está en el nivel principal)
		driver.switchTo().frame("frame-bottom");
		String frameT = driver.findElement(bodyTag).getText();
		switchToMainArea();
		return frameT;
	}

	public void switchToMainArea() {
		driver.switchTo().defaultContent();
	}

}
