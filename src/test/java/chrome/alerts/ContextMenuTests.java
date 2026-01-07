package chrome.alerts;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.ContextMenuPage;

public class ContextMenuTests extends BaseTestClass {

	@Test
	public void testGetTextFromAlert() {
		ContextMenuPage contextMenuPage = homePage.clickContextMenu();
		contextMenuPage.rightClickMenu();

		assertTrue(contextMenuPage.alert_getText().contains("You selected a context menu"));
	}
}
