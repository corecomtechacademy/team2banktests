package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccessTest {
    private static final WebDriver driver = WebDriverManager.getDriver();
    private static WebDriverWait wait;
    private final HomePage homepage = new HomePage(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();
    }
    @Test
    public void unauthorisedAccess(){
        //admin
        WebElement adminSign = driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a"));
        adminSign.click();
        driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a")).getText();
        WebElement adminUsername = driver.findElement(By.id("username"));
        adminUsername.sendKeys("admin");
        WebElement adminPassword = driver.findElement(By.id("password"));
        adminPassword.sendKeys("password");
        driver.findElement(By.cssSelector("div:nth-child(1) > input")).click();
        //wait.until(ExpectedConditions.urlToBe("http://localhost:8080/"));

        driver.findElement(By.cssSelector("body > div.container > div > h2:nth-child(3) > a")).click();
        String pageTitle = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("403 - Access is denied", pageTitle);
    }
    @Test
    public void userAccess(){

        WebElement sign = driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a"));
        sign.click();
        driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a")).getText();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        driver.findElement(By.cssSelector("div:nth-child(1) > input")).click();

        driver.findElement(By.cssSelector("body > div.container > div > h2:nth-child(3) > a")).click();
        String title = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("New Application", title);

        //creating application
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("arooj");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("mahmood");
        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("22");
        WebElement firstAddress = driver.findElement(By.id("addressLine1"));
        firstAddress.sendKeys("leeds");
        WebElement secondAddress = driver.findElement(By.id("addressLine1"));
        secondAddress.sendKeys("bradford");
        WebElement postcode = driver.findElement(By.id("postCode"));
        postcode.sendKeys("bd119qb");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("a123@hotmail.com");
        WebElement amount = driver.findElement(By.id("amount"));
        amount.sendKeys("2000");
        driver.findElement(By.cssSelector("tr:nth-child(11) > td:nth-child(1) > button")).click();




    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
