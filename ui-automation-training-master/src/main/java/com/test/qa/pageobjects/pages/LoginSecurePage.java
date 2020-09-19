package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginSecurePage.java - class to verify LoginSecure Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class LoginSecurePage extends PageBase {

    private static By loginSecureTitle = By.xpath("//h2");
    private static By flashMessage = By.id("flash");
    private static By logOutButton = By.xpath("//a[@href='/logout']");

    public static boolean isLoginSecurePageDisplayed(){
        return getDriver().findElement(loginSecureTitle).isDisplayed();
    }

    public static boolean isAlertDisplayed(){
        return getDriver().findElement(flashMessage).isDisplayed();
    }
    public static String getAlertContent(){
        waiTillVisible(flashMessage,10);
        String result =  getDriver().findElement(flashMessage).getText();
        System.out.println("message"+result);
        return result;
    }

    public static void clickLogout(){
        getDriver().findElement(logOutButton).click();
    }
}
