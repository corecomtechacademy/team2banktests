package com.cta.loanapp.tests.pages;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Access extends BasePage {
    public Access(WebDriver driver) {
        super(driver);
    }

    public void clickApp() {
        driver.findElement(By.cssSelector("body > div.container > div > h2:nth-child(3) > a")).click();

    }

    public void newApp() {
        driver.findElement(By.cssSelector("body > div.container > div > h2:nth-child(3) > a")).click();


    }

    public void firstName1() {
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("arooj");

    }

    public void lastName1() {
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("mahmood");

    }

    public void age1() {
        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("22");

    }

    public void address1() {
        WebElement firstAddress = driver.findElement(By.id("addressLine1"));
        firstAddress.sendKeys("leeds");

    }

    public void address2() {
        WebElement secondAddress = driver.findElement(By.id("addressLine2"));
        secondAddress.sendKeys("bradford");

    }

    public void postcode() {
        WebElement postcode = driver.findElement(By.id("postCode"));
        postcode.sendKeys("bd119qb");

    }

    public void email() {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("a123@hotmail.com");

    }

    public void amount() {
        WebElement amount = driver.findElement(By.id("amount"));
        amount.sendKeys("2000");

    }
    public void confirm(){
        driver.findElement(By.cssSelector("tr:nth-child(11) > td:nth-child(1) > button")).click();
    }
}

