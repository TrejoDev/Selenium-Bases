package chrome.alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.AlertsPage;

public class AlertTests extends BaseTestClass {

	@Test
	public void testAcceptAlert() {
		AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
		alertsPage.triggerAlert();
		alertsPage.alert_clickToAccept();
		assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Results text incorrect");
	}

	@Test
	public void testGetTextFromAlert() {
		AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
		alertsPage.triggerConfirm();
		String text = alertsPage.alert_getText();
		alertsPage.alert_clickToDismiss();
		assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
	}

	@Test
	public void testSetInputInAlert() {
		AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
		alertsPage.triggerPrompt();

		String text = "TAU rocks!";
		alertsPage.alert_setInput(text);
		alertsPage.alert_clickToAccept();
		assertEquals(alertsPage.getResult(), "You entered: " + text, "Results text incorrect");
	}
}