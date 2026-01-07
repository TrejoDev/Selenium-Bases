package chrome.keys;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.KeyPressesPage;

public class KeysTests extends BaseTestClass {

	@Test
	public void testBackspace() {
		KeyPressesPage keyPage = homePage.clickKeyPresses();
		keyPage.enterText("A" + Keys.BACK_SPACE);
		assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
	}

	@Test
	public void testPi() {
		KeyPressesPage keyPage = homePage.clickKeyPresses();
		keyPage.enterPi();
		System.out.println(keyPage.getResult());
		assertTrue(keyPage.getResult().contains("4"));
		/*
		 * NOTE: we didn't finish this test in the video. We debugged to watch it enter
		 * the pi key
		 */
	}
}