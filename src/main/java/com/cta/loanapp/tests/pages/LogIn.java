package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn extends BasePage{
    WebDriver driver;
    public LogIn(WebDriver d){
        super(d);
        driver =d;
    }
    By userN = By.id("username");
    By pass = By.id("password");
    By submit = By.cssSelector("div:nth-child(1) > input");
    public void addUserName(String username) {
        driver.findElement(userN).sendKeys(username);
    }
    public void addPass(String password){
        driver.findElement(pass).sendKeys(password);


    }
}


