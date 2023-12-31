package com.cta.loanapp.tests.accesstests;


import com.cta.loanapp.tests.pages.*;
import com.cta.loanapp.tests.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserAccessTests {
    private static final WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homePage = new HomePage(driver);
    private final LoginPage loginPage = new LoginPage(driver);
    private final LoanApplicationPage loanApplicationPage = new LoanApplicationPage(driver);
    private final SearchPage searchPage = new SearchPage(driver);
    private final AboutPage aboutPage = new AboutPage(driver);

    @BeforeEach
    public void individualSetUp() {
        homePage.goTo();
        homePage.goToLoginPage();
        String username = "user";
        String password = "password";
        loginPage.logIn(username, password);
    }

    @Test
    public void testAdminPageAccessDenied() {
        //TODO: Tidy up into more OOP based approach, ask Thomas how to handle URL handling
        homePage.goToAdminPage();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String expectedURL = "http://localhost:8080/403";
        wait.until(ExpectedConditions.urlToBe(expectedURL));
        String currentURL = driver.getCurrentUrl();
        Assertions.assertEquals(expectedURL, currentURL);
    }

    @Test
    public void testLoanApplicationPageAccess() {
        homePage.goToLoanApplicatonPage();
        String predictedLoanApplicationAccessText = "New Application";
        String extractedAdminAccessDeniedText = loanApplicationPage.extractLoanApplicationPageTitleText();
        Assertions.assertEquals(predictedLoanApplicationAccessText, extractedAdminAccessDeniedText);
    }

    @Test
    public void testSearchPageAccess() {
        homePage.goToSearchPage();
        String extractedSearchPageTitleText = searchPage.getSearchTitleText();
        String predictedSearchPageTitleText = "Search";
        Assertions.assertEquals(predictedSearchPageTitleText, extractedSearchPageTitleText);
    }

    @Test
    public void testAboutPageAccess(){
        homePage.goToAboutPage();
        String extractedBodyText = aboutPage.getAboutTitleText();
        String predictedBodyTest = "About";
        Assertions.assertEquals(predictedBodyTest, extractedBodyText);
    }

    @Test
    public void testViewApplicationsAccess(){
        //TODO: Tidy up into more OOP based approach
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://localhost:8080/applications");
        String expectedURL = "http://localhost:8080/403";
        wait.until(ExpectedConditions.urlToBe(expectedURL));
        String currentURL = driver.getCurrentUrl();
        Assertions.assertEquals(expectedURL, currentURL);
    }
}

