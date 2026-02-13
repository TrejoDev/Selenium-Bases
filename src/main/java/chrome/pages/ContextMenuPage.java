package chrome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

	private WebDriver driver;
	private By aMenu = By.id("hot-spot");

	public ContextMenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public String rightClickOnMenu() {
		WebElement figure = driver.findElement(aMenu);
		Actions actions = new Actions(driver);
		
		actions.moveToElement(figure).contextClick(figure).perform();
		return driver.switchTo().alert().getText();
	}

	

}
