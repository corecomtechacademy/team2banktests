package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserNewApplication extends BasePage {
    public UserNewApplication(WebDriver driver) {
        super(driver);
    }

    public void createNewApplication() {
        driver.findElement(By.id("firstName")).sendKeys("Tdizzle");
        driver.findElement(By.id("lastName")).sendKeys("Crabby");
        driver.findElement(By.id("age")).sendKeys("24");
        driver.findElement(By.id("addressLine1")).sendKeys("52 Regent Way");
        driver.findElement(By.id("addressLine2")).sendKeys("Oxford");
        driver.findElement(By.id("postCode")).sendKeys("LS1 5AT");
        driver.findElement(By.id("email")).sendKeys("tdizz-abby73@gmail.com");
        driver.findElement(By.id("amount")).sendKeys("2500");

        WebElement loanSubmission = driver.findElement(By.cssSelector("button"));
        loanSubmission.click();
    }
}
