package chrome.javascript;

import org.testng.annotations.Test;

import chrome.BaseTestClass;

public class JavaScriptTests extends BaseTestClass {

	@Test
	public void testScrollToTable() {
		homePage.clickLargeAndDeepDom().scrollToTable();
	}

	@Test
	public void testScrollToFifthParagraph() {
		homePage.clickInfiniteScroll().scrollToParagraph(5);
	}
}