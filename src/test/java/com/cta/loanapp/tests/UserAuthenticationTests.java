package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import com.cta.loanapp.tests.pages.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthenticationTests {

    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homePage = new HomePage(driver);
    private final LoginPage loginPage = new LoginPage(driver);


    @BeforeEach
    public void individualSetUp() {
        homePage.goTo();
        homePage.goToLoginPage();
    }

    @Test
    public void testUserLogin() {
        String username = "user";
        String password = "password";
        loginPage.logIn(username, password);
        String loggedInUserText = homePage.getLoggedInUserText();
        String usernameOnPageText = extractUserRegEx(loggedInUserText);
        Assertions.assertEquals(username, usernameOnPageText);
    }

    @Test
    public void testAdminLogin() {
        String username = "admin";
        String password = "password";
        loginPage.logIn(username, password);
        String loggedInUserText = homePage.getLoggedInUserText();
        String usernameOnPageText = extractUserRegEx(loggedInUserText);
        Assertions.assertEquals(username, usernameOnPageText);
    }

    private String extractUserRegEx(String loggedInUserText) {
        Pattern pattern = Pattern.compile("\\| Logged user: (\\w+) \\|");
        Matcher matcher = pattern.matcher(loggedInUserText);
        matcher.find();
        return matcher.group(1);
    }

}
