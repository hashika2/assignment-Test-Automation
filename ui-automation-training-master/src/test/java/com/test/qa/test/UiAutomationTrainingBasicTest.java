package com.test.qa.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.qa.pageobjects.pages.ABTestPage;
import com.test.qa.pageobjects.pages.CheckBoxPage;
import com.test.qa.pageobjects.pages.DropDownPage;
import com.test.qa.pageobjects.pages.ForgotPasswordPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.LoginSecurePage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.testdata.UserDetailsDataProvider;
import com.test.qa.utils.TestBase;

/**
 * UiAutomationTrainingBasicTest.java - class to execute Tests Created by
 * SrirankanK on 10/3/2018.
 */
public class UiAutomationTrainingBasicTest extends TestBase {

	/**
	 * Verify Home Page Displayed
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 1)
	public void testVerifyHomePage() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.AB_TEST_LINK);
		ABTestPage.waitTillHeaderLoad();
		softAssert.assertTrue(ABTestPage.isABTestPageDisplayed(), "Home Page is not Displayed");
		ABTestPage.navigateBack();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		softAssert.assertAll();
	}

	/**
	 * Verify Home Page Displayed Slow
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 2)
	public void testVerifyHomePage2() {
		//Todo - Static wait
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
		//Todo - Click Home Page Link
		//Todo - Static wait
		//Todo - Wait Till Page Loads
		//Todo - Static wait
		//Todo - Verify ABTest Page is displayed
		//Todo - Static wait
		//Todo - Navigate Back to Home Page
		//Todo - Static wait
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
	}

	/**
	 * Verify Check Box
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 3)
	public void testVerifyCheckBox() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Check Box Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Check Box 1 is displayed
        //Todo - Verify Check Box 2 is displayed
        //Todo - Check Check Box 1
        //Todo - Verify Check Box 1 is Checked
        //Todo - Uncheck Check Box 1
        //Todo - Verify Check Box 1 is Unchecked
        //Todo - Check Check Box 2
        //Todo - Verify Check Box 2 is Checked
        //Todo - Uncheck Check Box 2
        //Todo - Verify Check Box 2 is Unchecked
        //Todo - Navigate Back to Home Page
        //Todo - Verify HomePage is displayed
	}

	/**
	 * Verify Drop Down
	 */
	@Test(groups = { "test", "regression"}, priority = 4)
	public void testVerifyDropDown() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Drop Down Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Drop Down is displayed
        //Todo - Select Drop Down Option 1
        //Todo - Verify Drop Down Option 1 selected
        //Todo - Select Drop Down Option 2
        //Todo - Verify Drop Down Option 2 selected
	}

	/**
	 * Verify Forgot Password
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 5)
	public void testVerifyForgotPassword() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Forgot Password Link
        //Todo - Set Sample Mail
        //Todo - Click Submit
        //Todo - Verify Forgot Password Message
	}

	/**
	 * Verify Login Valid Scenario
	 */
	@Test(groups = "test", priority = 6)
	public void testVerifyLogin() {
		// Verify HomePage is displayed
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
		// Click Login Link
		HomePage.clickLink(Constants.LOGIN_LINK);
		// Verify Login Page Displayed
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Page is not Displayed");
		// Set Username and Password
		LoginPage.setUsernamePassword(Constants.USER_NAME, Constants.PASSWORD);
		// Click Submit
		LoginPage.clickSubmit();
		// Verify Login Secure Page Displayed
		softAssert.assertTrue(LoginSecurePage.isLoginSecurePageDisplayed(),"Login Secure Page is not Displayed");
		// Verify Login Alert Displayed
		softAssert.assertTrue(LoginSecurePage.isAlertDisplayed(),"Login Alert is not Displayed");
		// Verify Login  Alert Message
		softAssert.assertTrue(LoginSecurePage.getAlertContent().contains(Constants.LOGIN_SUCCESS_MSG),"Login Alert Message is incorrect");
		// Click Logout
		LoginSecurePage.clickLogout();
		// Verify Login Page Displayed
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Page is not Displayed");
		// Verify Logout Alert Displayed
		softAssert.assertTrue(LoginPage.isAlertDisplayed(),"Logout Alert is not Displayed");
		// Verify Logout  Alert Message
		softAssert.assertTrue(LoginPage.getAlertContent().contains(Constants.LOGOUT_SUCCESS_MSG),"Logout Message is incorrect");

		softAssert.assertAll();
	}

	/**
	 * Verify Login Invalid Scenario
	 */
	@Test(groups = { "test", "regression"}, priority = 7, dataProvider = "MultipleUserDetails", dataProviderClass = UserDetailsDataProvider.class)
	public void testVerifyLogin(String username, String password) {
		// Verify HomePage is displayed
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
		// Click Login Link
		HomePage.clickLink(Constants.LOGIN_LINK);
		// Verify Login Page Displayed
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Page is not Displayed");
		// Set Invalid Username and Password
		LoginPage.setUsernamePassword("Constants.USER_NAME", "Constants.PASSWORD");
		// Click Submit
		LoginPage.clickSubmit();
		// Verify Login Alert Displayed
		softAssert.assertTrue(LoginPage.isAlertDisplayed(),"Login Error Alert is not Displayed");
		// Verify Login  Alert Message
		softAssert.assertTrue(LoginPage.getAlertContent().contains(Constants.LOGIN_INVALID_MSG),"Alogin Error Message is incorrect");
		softAssert.assertAll();
	}
}
