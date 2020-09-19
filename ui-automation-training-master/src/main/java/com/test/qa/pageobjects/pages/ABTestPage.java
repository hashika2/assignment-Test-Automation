package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * ABTestPage.java - class to verify ABTest Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class ABTestPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(ABTestPage.class);

    private static By hdrABTest = By.xpath("//h3");

    public static boolean isABTestPageDisplayed() {
        return getDriver().findElement(hdrABTest).isDisplayed();
    }

    public static void waitTillHeaderLoad() {
        waiTillVisible(hdrABTest, 2);
    }
}
