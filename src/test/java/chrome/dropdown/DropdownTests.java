package chrome.dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.DropdownPage;

public class DropdownTests extends BaseTestClass {
	private String option1 = "Option 1";
	private String option2 = "Option 2";

	@Test
	public void testSelectOption() {
		DropdownPage dropDownPage = homePage.clickDropdown();

		dropDownPage.selectFromDropDown(option1);
		List<String> selectedOptions = dropDownPage.getSelectedOptions();
		assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
		assertTrue(selectedOptions.contains(option1), "Option not selected");
	}
	@Test
	public void testSelectMultipleOptions() {
		DropdownPage dropDownPage = homePage.clickDropdown();
		
		dropDownPage.setMultipleDropDownOptions();
		dropDownPage.selectFromDropDown(option1);
		dropDownPage.selectFromDropDown(option2);
		
		List<String> selectedOptions = dropDownPage.getSelectedOptions();
		assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
	}
}