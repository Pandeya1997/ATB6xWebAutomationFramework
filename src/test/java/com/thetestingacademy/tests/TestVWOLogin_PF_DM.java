package com.thetestingacademy.tests;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.pages.pageFactory.LoginPage_PF;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.thetestingacademy.driver.DriverManager.driver;

public class TestVWOLogin_PF_DM extends CommonToAllTest {
    @Test
    public void testLoginNegativeVWO()   {

        LoginPage_PF LoginPage_PF= new LoginPage_PF(driver);
        LoginPage_PF.openVWOLoginURL();
        String error_msg = LoginPage_PF.loginTOVWOInvalidCreds();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
        driver.quit();
    }
}
