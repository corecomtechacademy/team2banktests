package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationTests {

    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);

    @BeforeEach
    public void individualSetUp(){
        homepage.goTo();
    }

    @Test
    public void testUserLogin(){
    }

}
