package chrome.shifting_content;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.ShiftingContentPage;
import chrome.pages.ShiftingMenu;

public class ShiftingTest extends BaseTestClass {

	@Test
	public void testCountsMenuElements() throws InterruptedException {
		ShiftingContentPage shiftingContentPage = homePage.clickShiftingContent();

		ShiftingMenu shiftingMenu = shiftingContentPage.clickLink("Example 1: Menu Element");
		List<String> menuElements = shiftingMenu.getElementsMenu();
		
		assertEquals(menuElements.size(), 5);
	}

}
