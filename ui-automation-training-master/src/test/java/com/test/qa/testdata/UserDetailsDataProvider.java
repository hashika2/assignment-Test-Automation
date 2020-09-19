package com.test.qa.testdata;

import org.testng.annotations.DataProvider;

/**
 * UserDetailsDataProvider.java - To Manage User related Data Set
 * Created by SrirankanK on 10/3/2018.
 */
public class UserDetailsDataProvider {

    @DataProvider
    public static Object[][] MultipleUserDetails() {
        return new Object[][]{
        	    {"", ""},
        		{"John", "John123"},
                {"Siva", "Siva456"}
        };
    }


}
