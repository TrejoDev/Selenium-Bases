package chrome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
	
	private WebDriver driver;
	private By slider = By.cssSelector(".sliderContainer > input");
	private By sliderValue = By.id("range");
	
	public HorizontalSliderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void pressKeysOnSlider(String key) {
		driver.findElement(slider).sendKeys(key);
	}
	
	public Integer getSliderValue() {
		String sliderValueString = driver.findElement(sliderValue).getText();
		return Integer.parseInt(sliderValueString);
	}

}
