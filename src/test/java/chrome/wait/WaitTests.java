package chrome.wait;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.DynamicLoadingExample1Page;

public class WaitTests extends BaseTestClass {

	@Test
	public void testWaitUntilHidden() {
		DynamicLoadingExample1Page loadingPage = homePage.clickDynamicLoading().clickExample1();
		loadingPage.clickStart();
		assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
	}
}