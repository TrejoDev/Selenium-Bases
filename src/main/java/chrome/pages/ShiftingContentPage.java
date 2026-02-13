package chrome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
	
	private WebDriver driver;

	public ShiftingContentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public ShiftingMenu clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
		return new ShiftingMenu(driver);
	}
}
