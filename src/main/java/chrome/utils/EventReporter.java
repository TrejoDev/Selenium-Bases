package chrome.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventReporter implements WebDriverListener {

	@Override
	public void afterClick(WebElement element) {
		System.out.println("Después de click: " + element);
	}

}
