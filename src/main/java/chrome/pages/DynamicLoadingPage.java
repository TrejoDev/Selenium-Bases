package chrome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicLoadingPage {

	private WebDriver driver;
	private String linkXpath_Format = ".//a[contains(text(), '%s')]";
	private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
	private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

	public DynamicLoadingPage(WebDriver driver) {
		this.driver = driver;
	}

	public DynamicLoadingExample1Page clickExample1() {
		driver.findElement(link_Example1).click();
		return new DynamicLoadingExample1Page(driver);
	}
	public DynamicLoadingExample2Page clickExample2() {
		driver.findElement(link_Example2).click();
		return new DynamicLoadingExample2Page(driver);
	}
	
	public void openEx2InNewWindows() {
		WebElement linkEx = driver.findElement(link_Example2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open(arguments[0].href, '_blank');", linkEx);
	}
}
