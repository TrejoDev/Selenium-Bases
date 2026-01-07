package chrome.dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.DropdownPage;

public class DropdownTests extends BaseTestClass {

	@Test
	public void testSelectOption() {
		DropdownPage dropDownPage = homePage.clickDropdown();

		String option = "Option 1";
		dropDownPage.selectFromDropDown(option);
		List<String> selectedOptions = dropDownPage.getSelectedOptions();
		assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
		assertTrue(selectedOptions.contains(option), "Option not selected");
	}
}