package com.thetestingacademy.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElemenntException {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        WebElement search_textarea = driver.findElement(By.name("q"));
        driver.navigate().refresh();
        search_textarea.sendKeys("TheTestingacademy");
    }
}
