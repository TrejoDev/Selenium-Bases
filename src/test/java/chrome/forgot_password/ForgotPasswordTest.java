package chrome.forgot_password;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.EmailSentPage;
import chrome.pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTestClass{
	
	@Test
	public void testForgotPassword() {
		ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
		forgotPasswordPage.setEmail("tau@example.com");
		EmailSentPage emailSentPage = forgotPasswordPage.clickSubmitButton();
		
		String titlePage = emailSentPage.getTitlePageString();
		
		assertEquals("Internal Server Error", titlePage);
	}

}
