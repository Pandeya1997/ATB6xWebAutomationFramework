package com.thetestingacademy.pages.pageFactory;

import com.thetestingacademy.base.CommonToAllPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  LoginPage_PF extends CommonToAllPage {
    WebDriver driver;
    public LoginPage_PF(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    // Page Locator
    @FindBy(id = "login-username" )
    private WebElement username;
    @FindBy(id = "login-password")
    private WebElement password;
    @FindBy(id = "js-login-btn")
    private WebElement signButton;
    @FindBy(className = "notification-box-description")
    private WebElement error_msg;

    // Page Actions
   public String loginTOVWOInvalidCreds(){

      username.sendKeys("admin@admin.com");
      password.sendKeys("admin");
      signButton.click();

      try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       return error_msg.getText();
   }
}
