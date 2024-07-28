package com.thetestingacademy;

import com.thetestingacademy.pages.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_POM  {
    @Test
    public void testLoginNegativeVWO()  {
        WebDriver driver = new EdgeDriver();

        LoginPage_POM loginPage_pom = new LoginPage_POM(driver);
        String error_msg_text = loginPage_pom.loginToVWOInvalidCreds("admin@admin.com","admin" );
        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
        driver.quit();



    }    @Test
    public void testLoginNegativeVWO02()  {
        WebDriver driver = new EdgeDriver();

        LoginPage_POM loginPage_pom = new LoginPage_POM(driver);
        String error_msg_text = loginPage_pom.loginToVWOInvalidCreds("abhishek123@aarrsol.com","admin" );
        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
        driver.quit();



    }
}
