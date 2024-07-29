package com.thetestingacademy.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public static void init (){
        if(driver == null){
            EdgeOptions edgeoptions = new EdgeOptions();
            edgeoptions.addArguments("--guest");
            edgeoptions.addArguments("--start-maximized");
            driver = new EdgeDriver(edgeoptions);

        }
    }
    public static void down(){
        if(driver != null){
             driver.quit();
             driver = null;

        }
    }

}
