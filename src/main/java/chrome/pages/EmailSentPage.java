package chrome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
	
	private WebDriver driver;
	private By titlePage = By.tagName("h1");

	public EmailSentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String getTitlePageString() {
		return driver.findElement(titlePage).getText();
	}

}
