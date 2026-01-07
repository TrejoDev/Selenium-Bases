package chrome.navigation;

import org.testng.annotations.Test;

import chrome.BaseTestClass;

public class NavigationTests extends BaseTestClass {

	@Test
	public void testNavigator() {
		homePage.clickDynamicLoading().clickExample1();
		getWindowManager().goBack();
		getWindowManager().refreshPage();
		getWindowManager().goForward();
		getWindowManager().goTo("https://google.com");
	}

	@Test
	public void testSwitchTab() {
		homePage.clickMultipleWindows().clickHere();
		getWindowManager().switchToTab("New Window");
	}
}