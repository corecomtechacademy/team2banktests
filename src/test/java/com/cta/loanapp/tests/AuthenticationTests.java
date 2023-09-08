package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LogIn;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationTests {

    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);
    private LogIn login = new LogIn(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();

    }

    @Test
    public void testUserLogin() {
        //user
        WebElement sign = driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a"));
        sign.click();
        driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a")).getText();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        driver.findElement(By.cssSelector("div:nth-child(1) > input")).click();

    }

    @Test
    public void testAdminLogin() {

        //admin
        WebElement adminSign = driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a"));
        adminSign.click();
        driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a")).getText();
        WebElement adminUsername = driver.findElement(By.id("username"));
        adminUsername.sendKeys("admin");
        WebElement adminPassword = driver.findElement(By.id("password"));
        adminPassword.sendKeys("password");
        driver.findElement(By.cssSelector("div:nth-child(1) > input")).click();
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
