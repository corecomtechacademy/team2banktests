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
        homepage.clickLoginLink();
        loginpage.testUserLogDetails();
        // Assert.assertTrue(homepage.contains("user"));
    }

    @Test
    public void testAdminLogin() {
        homepage.goTo();
        homepage.clickLoginLink();
        loginpage.testAdminLogDetails();

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        WebElement signInPageClick = driver.findElement(By.cssSelector("div > div.row > div:nth-child(1)"));
        signInPageClick.click();
    }

    @Test
    public void aboutPage() {
        homepage.goTo();
        homepage.aboutPage();
        //add an assertion to find correct text
    }

    @Test
    public void adminViewPage() {
        homepage.goTo();
        homepage.adminViewApp();
        //view applications
    }

    // admin cant view relevant pages

    //add a new application (user)

    //admin view an application

    //admin deleting an application

    //
}
