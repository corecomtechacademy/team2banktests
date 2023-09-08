package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void userLogin() {
        String userUsername = "user";
        String userPassword = "password";

        driver.findElement(By.id("username")).sendKeys(userUsername);
        driver.findElement(By.id("password")).sendKeys(userPassword);
        WebElement signInPageClick = driver.findElement(By.cssSelector("div.container div div.row > div:nth-child(1)"));
        signInPageClick.click();
    }

    public void adminLogin() {
        String adminUsername = "admin";
        String adminPassword = "password";

        driver.findElement(By.id("username")).sendKeys(adminUsername);
        driver.findElement(By.id("password")).sendKeys(adminPassword);
        WebElement signInPageClick = driver.findElement(By.cssSelector("div > div.row > div:nth-child(1)"));
        signInPageClick.click();

    }
}
