package com.test.qa.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.qa.pageobjects.pages.BrokenImagePage;
import com.test.qa.pageobjects.pages.DragAndDropPage;
import com.test.qa.pageobjects.pages.FileDownloadPage;
import com.test.qa.pageobjects.pages.FileUploadPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.utils.TestBase;

/**
 * UiAutomationTrainingAdvanceTest.java - class to execute Tests Created by
 * SrirankanK on 10/3/2018.
 */
public class UiAutomationTrainingAdvanceTest extends TestBase {

	@Test(groups = "test", priority = 1)
	public void testVerifyBrokenImage() {
		//Todo - Click Broken Images Link
		//Todo - Wait Till Page Loads
		//Todo - Verify Image 1 whether it is broken
		//Todo - Verify Image 2 whether it is broken
		//Todo - Verify Image 3 whether it is broken
	}

	@Test(groups = "test", priority = 2)
	public void testVerifyFileUplaod() {
        //Todo - Click File Upload Link
        //Todo - Wait Till Page Loads
        //Todo - Upload File
        //Todo - Submit File
        //Todo - Verify Uploaded File
	}
	
	@Test(groups = "test", priority = 3)
	public void testVerifyFileDownload() {
        //Todo - Clear Directory before Download
        //Todo - Click File Download Link
        //Todo - Wait Till Page Loads
        //Todo - Download File
        //Todo - Verify Downloaded File
	}
	
	@Test(groups = "test", priority = 4)
	public void testVerifyDragAndDrop() {
        //Todo - Click Drag and Drop Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Text inside the Boxes
        //Todo - Swap the Boxes using drag and drop
        //Todo - Verify Text inside the Boxes
        //Todo - Swap back the Boxes using drag and drop
        //Todo - Verify Text inside the Boxes
	}
}
