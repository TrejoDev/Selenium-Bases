package chrome.login;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.LoginPage;
import chrome.pages.SecureAreaPage;

public class LoginTest extends BaseTestClass {


	@Test
	public void testSuccesfullLogin() throws InterruptedException {
		LoginPage loginPage = homePage.clickFormAuthentication();
		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		String secureString = secureAreaPage.getAlertText();

		assertEquals(secureString, "You logged into a secure area!");

	}

}
