package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {super(driver);}

    public void testUserLogDetails() {
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("password");
        WebElement signInPageClick = driver.findElement(By.cssSelector("div.container div div.row > div:nth-child(1)"));
        signInPageClick.click();
    }

    public void testAdminLogDetails() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        WebElement signInPageClick = driver.findElement(By.cssSelector("div > div.row > div:nth-child(1)"));
        signInPageClick.click();

    }
}
