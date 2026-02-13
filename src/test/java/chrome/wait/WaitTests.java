package chrome.wait;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.DynamicLoadingExample1Page;
import chrome.pages.DynamicLoadingExample2Page;
import chrome.pages.DynamicLoadingPage;

public class WaitTests extends BaseTestClass {

	@Test
	public void testWaitUntilHiddenEx1() {
		DynamicLoadingExample1Page loadingPage = homePage.clickDynamicLoading().clickExample1();
		loadingPage.clickStart();
		assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
	}
	@Test
	public void testWaitUntilHiddenEx2() {
		DynamicLoadingExample2Page loadingPage = homePage.clickDynamicLoading().clickExample2();
		loadingPage.clickStart();
		assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
	}
	@Test
	public void testSwichtWindowsEx2() {
		DynamicLoadingPage loadingPage = homePage.clickDynamicLoading();
		loadingPage.openEx2InNewWindows();
		
		getWindowManager().switchToLastTab();
		
		DynamicLoadingExample2Page example2Page = getWindowManager().getDynamicPage();
		
		assertTrue(example2Page.isStartButtonDisplayed(), "Start button should be displayed");
	}
}