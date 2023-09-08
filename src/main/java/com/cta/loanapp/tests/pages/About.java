package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class About extends BasePage{
    public About(WebDriver driver) {
        super(driver);
    }
    public void results(){
        driver.findElement(By.cssSelector("h2:nth-child(6) > a")).click();
    }
}
