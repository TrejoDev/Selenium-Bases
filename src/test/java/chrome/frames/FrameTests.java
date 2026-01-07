package chrome.frames;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.WysiwygEditorPage;

public class FrameTests extends BaseTestClass {

	@Test
	public void testWysiwyg() {
		WysiwygEditorPage editorPage = homePage.clickWysiwygEditor();
		editorPage.clearTextArea();

		String text1 = "hello ";
		String text2 = "world";

		editorPage.setTextArea(text1);
		editorPage.decreaseIndention();
		editorPage.setTextArea(text2);

		assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text from editor is incorrect");
	}
}