package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserNewApplication extends BasePage {
    public UserNewApplication(WebDriver driver) {
        super(driver);
    }

    public void createNewApplication() {
        String firstname = "Tdizzle";
        String lastname = "Crabby";
        String age = "24";
        String addressLine1 = "52 Regent Way";
        String addressLine2 = "Oxford";
        String postcode = "LS1 5AT";
        String email = "tdizz-abby73@gmail.com";
        String amount = "2500";

        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.id("age")).sendKeys(age);
        driver.findElement(By.id("addressLine1")).sendKeys(addressLine1);
        driver.findElement(By.id("addressLine2")).sendKeys(addressLine2);
        driver.findElement(By.id("postCode")).sendKeys(postcode);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("amount")).sendKeys(amount);

        WebElement loanSubmission = driver.findElement(By.cssSelector("button"));
        loanSubmission.click();
    }
}
