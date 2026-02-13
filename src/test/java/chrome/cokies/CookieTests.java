package chrome.cokies;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import chrome.BaseTestClass;

public class CookieTests extends BaseTestClass {
	
	@Test
	public void testDeleteCookie() {
		String cookieName = "optimizelyBuckets";
		Boolean wasCookieDeleted = deleteCookie(cookieName);
		
		assertTrue(wasCookieDeleted);
		setCookie();
	}

}
