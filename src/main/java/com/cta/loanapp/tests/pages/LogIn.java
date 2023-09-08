package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn extends BasePage{
    WebDriver driver;
    public LogIn(WebDriver d){
        super(d);
        driver =d;
    }
    By userN = By.id("username");;

    public void clickSignIn(){
        WebElement sign = driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a"));
        sign.click();
    }
    public void addUserName(String user) {
        driver.findElement(userN).sendKeys(user);
    }
    public void addPass(String password){
        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys(password);

    }
    public void clickSubmit(){
        driver.findElement(By.cssSelector("div:nth-child(1) > input")).click();

    }
    public void adminUser(String admin){
        WebElement adminUsername = driver.findElement(By.id("username"));
        adminUsername.sendKeys(admin);
    }
    public void adminPass(String password){
        WebElement adminPassword = driver.findElement(By.id("password"));
        adminPassword.sendKeys(password);
    }
    public void getText(String text){
        driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a")).getText();
    }

}


