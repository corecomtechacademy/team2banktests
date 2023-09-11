package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void logIn(String username, String password){
        WebElement usernameInput = wait.until(d -> driver.findElement(By.id("username")));
        usernameInput.sendKeys(username);
        WebElement passwordInput = wait.until(d -> driver.findElement(By.id("password")));
        passwordInput.sendKeys(password);
        WebElement submitButton = wait.until(d -> driver.findElement(By.cssSelector("input[type='submit']")));
        submitButton.click();
    }
}
