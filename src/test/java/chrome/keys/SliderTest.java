package chrome.keys;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.HorizontalSliderPage;

public class SliderTest extends BaseTestClass {

	@Test
	public void testSliderValue() {
		HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
		horizontalSliderPage
				.pressKeysOnSlider(Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT));
		
		Integer sliderValueInteger = horizontalSliderPage.getSliderValue();
		
		assertEquals(2, sliderValueInteger);
	}

}
