package com.cta.loanapp.tests.accesstests;

import com.cta.loanapp.tests.WebDriverManager;
import com.cta.loanapp.tests.pages.*;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminAccessTests {
    private static final WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homePage = new HomePage(driver);
    private final LoginPage loginPage = new LoginPage(driver);
    private final AdminPage adminPage = new AdminPage(driver);
    private final LoanApplicationPage loanApplicationPage = new LoanApplicationPage(driver);
    private final SearchPage searchPage = new SearchPage(driver);
    private final AboutPage aboutPage = new AboutPage(driver);
    private final ViewApplicationsPage viewApplicationsPage = new ViewApplicationsPage(driver);


    @BeforeEach
    public void individualSetUp() {
        homePage.goTo();
        homePage.goToLoginPage();
        String username = "admin";
        String password = "password";
        loginPage.logIn(username, password);
    }

    @Test
    public void testAdminPageAccess() {
        homePage.goToAdminPage();
        String predictedAdminTitleText = "Hello admin!";
        String extractedAdminTitleText = adminPage.getAdminPageTitleText();
        Assertions.assertEquals(predictedAdminTitleText, extractedAdminTitleText);
    }

    @Test
    public void testLoanApplicationPageAccessDenied() {
        homePage.goToLoanApplicatonPage();
        String predictedAdminAccessDeniedText = "Hello 'admin', you do not have permission to access this page.";
        String extractedAdminAccessDeniedText = loanApplicationPage.extractAdminAccessDeniedText();
        Assertions.assertEquals(predictedAdminAccessDeniedText, extractedAdminAccessDeniedText);
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
        homePage.goToAdminPage();
        adminPage.goToViewApplications();
        String extractedViewApplicationsTitleText = viewApplicationsPage.getViewApplicationsTitleText();
        String predictedViewApplicationsTitleText = "Applications";
        Assertions.assertEquals(predictedViewApplicationsTitleText, extractedViewApplicationsTitleText);
    }
}