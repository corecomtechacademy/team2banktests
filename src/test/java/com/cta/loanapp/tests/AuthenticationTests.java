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
    private final LogIn login = new LogIn(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();

    }

    @Test
    public void testUserLogin() {
        //user
        login.clickSignIn();
        login.addUserName("username");
        login.addPass("password");
        login.clickSubmit();

    }

    @Test
    public void testAdminLogin() {
        login.clickSignIn();
        login.adminUser("user");
        login.adminPass("password");
        login.clickSubmit();

    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
