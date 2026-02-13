package chrome.utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import chrome.pages.DynamicLoadingExample2Page;

public class WindowManager {

	private WebDriver driver;
	private WebDriver.Navigation navigate;

	public WindowManager(WebDriver driver) {
		this.driver = driver;
		navigate = driver.navigate();
	}

	public void goBack() {
		navigate.back();
	}

	public void goForward() {
		navigate.forward();
	}

	public void refreshPage() {
		navigate.refresh();
	}

	public void goTo(String url) {
		navigate.to(url);
	}
	
	public DynamicLoadingExample2Page getDynamicPage() {
		return new DynamicLoadingExample2Page(driver);
	}
	
	public void switchToTab(String tabTitle) {
		Set<String> windows = driver.getWindowHandles();

		System.out.println("Number of tabs: " + windows.size());

		System.out.println("Window handles:");
		windows.forEach(System.out::println);

		for (String window : windows) {
			System.out.println("Switching to window: " + window);
			driver.switchTo().window(window);

			System.out.println("Current window title: " + driver.getTitle());

			if (tabTitle.equals(driver.getTitle())) {
				break;
			}
		}
	}
	
	public void switchToLastTab() {
		Set<String> windows = driver.getWindowHandles();
		String lastWindow = windows.stream().reduce((first, second) -> second).orElse(null);
		if (lastWindow != null) {
			driver.switchTo().window(lastWindow);
		}
	}
}