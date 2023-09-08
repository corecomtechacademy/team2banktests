package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserAuthenticationTests {

    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();
    }

    @Test
    public void testUserLogin() {
        homepage.goTo();
        WebElement logInClick = driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a"));
        logInClick.click();

        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("password");
        WebElement signInPageClick = driver.findElement(By.cssSelector("div > div.row > div:nth-child(1)"));
        signInPageClick.click(); //div.container div div.row > div:nth-child(1)
        // Assert.assertTrue(homepage.contains("user"));
    }

    @Test
    public void testAdminLogin() {
        homepage.goTo();
        WebElement logInClick = driver.findElement(By.cssSelector("div:nth-child(4) span > a"));
        logInClick.click();

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        WebElement signInPageClick = driver.findElement(By.cssSelector("div > div.row > div:nth-child(1)"));
        signInPageClick.click();
    }

    @Test
    public void aboutPage() {
        homepage.goTo();
        WebElement clickAboutPage = driver.findElement(By.linkText("About page"));
        clickAboutPage.click();
        //add an assertion to find correct text
    }
    @Test
    public void adminViewPage(){
        homepage.goTo();
        WebElement adminView = driver.findElement(By.linkText("Admin page"));
        adminView.click();
        //view applications
    }

    // admin cant view relevant pages

    //add a new application (user)

    //admin view an application

    //admin deleting an application

    //
}