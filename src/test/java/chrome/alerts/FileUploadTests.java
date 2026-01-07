package chrome.alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import chrome.BaseTestClass;
import chrome.pages.FileUploadPage;

public class FileUploadTests extends BaseTestClass {

	@Test
	public void testFileUpload() {
		FileUploadPage uploadPage = homePage.clickFileUpload();
		uploadPage.uploadFile("localPath/nameOfFile");
		assertEquals(uploadPage.getUploadedFiles(), "nameOfFile", "Uploaded files incorrect");
	}
}