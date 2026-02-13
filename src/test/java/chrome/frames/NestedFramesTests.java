package chrome.frames;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.NestedFramesPage;

public class NestedFramesTests extends BaseTestClass {

	@Test
	public void testNestedFrames() {
		NestedFramesPage nestedFramesPage = homePage.clickNestedFRame();
		String leftFrameTextString = nestedFramesPage.getLeftFrameText();
		String bottomFrameTextString = nestedFramesPage.getBottomFrameText();
		
		assertTrue(leftFrameTextString.contains("LEFT"));
		assertTrue(bottomFrameTextString.contains("BOTTOM"));
	}
}
