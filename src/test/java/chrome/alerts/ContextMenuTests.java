package chrome.alerts;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.ContextMenuPage;

public class ContextMenuTests extends BaseTestClass {

	@Test
	public void testGetTextFromAlert() {
		ContextMenuPage contextMenuPage = homePage.clickContextMenu();
		String alertText = contextMenuPage.rightClickOnMenu();
		assertTrue(alertText.contains("You selected a context menu"));
	}
}
