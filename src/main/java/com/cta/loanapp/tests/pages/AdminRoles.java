package com.cta.loanapp.tests.pages;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminRoles extends BasePage{
    public AdminRoles(WebDriver driver) {
        super(driver);
    }
    public void mainAdminPage(){
       driver.findElement(By.cssSelector("body > div.container > div > h2:nth-child(4) > a")).click();


    }
    public void asAdmin(){
        driver.findElement(By.cssSelector("body > div.container > div > h1"));
    }
    public void viewApp(){
        driver.findElement(By.cssSelector("body > div.container > div > a")).click();
    }
    public void appsPage(){
        driver.findElement(By.tagName("container"));
    }
    public void deleteApp(){
        driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(13) > a"));
        driver.findElement(By.tagName("td")).click();
    }
}
