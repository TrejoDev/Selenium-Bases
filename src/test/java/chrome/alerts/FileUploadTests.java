package chrome.alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.FileUploadPage;

public class FileUploadTests extends BaseTestClass {

	@Test
	public void testFileUpload() {
		FileUploadPage uploadPage = homePage.clickFileUpload();
		uploadPage.uploadFile("/Users/trejodev/Desktop/Developer/QA/Cv.pdf");
		assertEquals(uploadPage.getUploadedFiles(), "Cv.pdf", "Uploaded files incorrect");
	}
}