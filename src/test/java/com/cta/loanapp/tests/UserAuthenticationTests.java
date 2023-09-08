package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserAuthenticationTests {

    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);
    private final LoginPage loginpage = new LoginPage(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();
    }
}