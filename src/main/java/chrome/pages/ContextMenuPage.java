package chrome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

	private WebDriver driver;
	private By triggerAlertMenu = By.id("hot-spot");

	public ContextMenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public void rightClickMenu() {
		WebElement figure = driver.findElement(triggerAlertMenu);

		Actions actions = new Actions(driver);
		actions.moveToElement(figure).contextClick();
	}

	public String alert_getText() {
		return driver.switchTo().alert().getText();
	}

}
