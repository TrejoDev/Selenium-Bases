package chrome.hover;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.HoversPage;
import chrome.pages.HoversPage.FigureCaption;

public class HoverTests extends BaseTestClass {

    @Test
    public void testHoverUser1(){
		HoversPage hoversPage = homePage.clickHovers();
		FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}