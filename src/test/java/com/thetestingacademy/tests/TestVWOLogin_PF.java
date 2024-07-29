package com.thetestingacademy.tests;

import com.thetestingacademy.pages.pageFactory.LoginPage_PF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_PF {
    @Test
    public void testLoginNegativeVWO()  {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");


        LoginPage_PF LoginPage_PF= new LoginPage_PF(driver);
        String error_msg = LoginPage_PF.loginTOVWOInvalidCreds();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
        driver.quit();
    }
}
