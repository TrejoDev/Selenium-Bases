package chrome.pages;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShiftingMenu {
	
	private WebDriver driver;
	private By menuElement = By.cssSelector("li>a[href]");

	public ShiftingMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<String> getElementsMenu() {
		 List<String> listElement =  driver.findElements(menuElement).stream().map( e -> e.getText()).collect(Collectors.toList());
		return listElement;
	}
	

}
