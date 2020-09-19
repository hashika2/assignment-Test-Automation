package com.test.qa.test;

import java.awt.event.KeyEvent;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.qa.pageobjects.pages.Alerts;
import com.test.qa.pageobjects.pages.BasicAuthPage;
import com.test.qa.pageobjects.pages.FramesPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.KeysPressPage;
import com.test.qa.pageobjects.pages.MultipleWindowsPage;
import com.test.qa.pageobjects.pages.NewWindowPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.pageobjects.utils.PageBase;
import com.test.qa.utils.TestBase;

/**
 * UiAutomationTrainingMediumTest.java - class to execute Tests Created by
 * SrirankanK on 10/3/2018.
 */
public class UiAutomationTrainingMediumTest extends TestBase {

	/**
	 * Verify Alerts
	 */
	@Test(groups = "test", priority = 1)
	public void testVerifyAlertAuths() {
        //Todo - Verify HomePage is displayed
		//Todo - Click and Login to Basic Auth Page
		//Todo - Verify Basic Auth Page Displayed
		//Todo - Verify Success Message Dislayed
		//Todo - Verify Success Message
	}

	@Test(groups = "test", dependsOnMethods = "testVerifyAlertAuths")
	public void testVerifyAlerts() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Alert Link
        //Todo - Wait Till Page Loads

        //Todo - Click Alert Button
        //Todo - Verify Alert is Present
        //Todo - Verify Alert is Message
        //Todo - Click Alert Accept
        //Todo - Verify Alert Confirmation Message

        //Todo - Click AlertConfirm Button
        //Todo - Verify Alert is Present
        //Todo - Verify Alert is Message
        //Todo - Click Alert Accept
        //Todo - Verify Alert Confirmation Message

        //Todo - Click AlertConfirmation Button
        //Todo - Verify Alert is Present
        //Todo - Verify Alert is Message
        //Todo - Click Alert Dismiss
        //Todo - Verify Alert Confirmation Message

        //Todo - Click AlertPrompt Button
        //Todo - Verify Alert is Present
        //Todo - Verify Alert is Message
        //Todo - Send Text to AlertPrompt
        //Todo - Click Alert Accept
        //Todo - Verify Alert Confirmation Message
	}

	@Test(groups = "test", dependsOnMethods = "testVerifyAlerts")
	public void testVerifyNestedFrames() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Frames Link
        //Todo - Wait Till Page Loads
        //Todo - Click Nested Frames Link
        //Todo - Switch to Left Frame
        //Todo - Verify Text Value
        //Todo - Switch to Middle Frame
        //Todo - Verify Text Value
        //Todo - Switch to Right Frame
        //Todo - Verify Text Value
        //Todo - Switch to Bottom Frame
        //Todo - Verify Text Value
	}

	@Test(groups = "test", dependsOnMethods = "testVerifyNestedFrames")
	public void testVerifyIFrames() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Frames Link
        //Todo - Wait Till Page Loads
        //Todo - Click IFrames Link
        //Todo - Switch to IFrame
        //Todo - Verify the IFrame Text Value
        //Todo - Switch to default context
	}

	@Test(groups = "test", dependsOnMethods = "testVerifyIFrames")
	public void testVerifyMultipleWindows() {
        //Todo - Click Multiple Windows Link
        //Todo - Wait Till Page Loads
        //Todo - Open a New Window
        //Todo - Verify New Window Header
        //Todo - Navigate Back to Old Window
        //Todo - Verify Old Window Header
	}

	@Test(groups = "test",  dependsOnMethods = "testVerifyMultipleWindows")
	public void testVerifyKeysPress() {
        //Todo - Click Key Press Link
        //Todo - Wait Till Page Loads
        //Todo - Press 0 Key
        //Todo - Verify 0 is Printed
        //Todo - Press X Key
        //Todo - Verify X is Printed
        //Todo - Press SHIFT Key
        //Todo - Verify SHIFT is Printed
        //Todo - Press HOME Key
        //Todo - Verify HOME is Printed
        //Todo - Press ENTER Key
        //Todo - Verify ENTER is Printed
	}
}
