package com.cta.loanapp.tests.accesstests;

import com.cta.loanapp.tests.pages.*;
import com.cta.loanapp.tests.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminAccessTests {
    private static final WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homePage = new HomePage(driver);
    private final LoginPage loginPage = new LoginPage(driver);
    private final AdminPage adminPage = new AdminPage(driver);
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
    public void testSearchPageAccess() {
        homePage.goToSearchPage();
        String extractedSearchPageTitleText = searchPage.getSearchTitleText();
        String predictedSearchPageTitleText = "Search";
        Assertions.assertEquals(predictedSearchPageTitleText, extractedSearchPageTitleText);
    }

    @Test
    public void testAboutPageAccess() {
        homePage.goToAboutPage();
        String extractedBodyText = aboutPage.getAboutTitleText();
        String predictedBodyTest = "About";
        Assertions.assertEquals(predictedBodyTest, extractedBodyText);
    }

    @Test
    public void testViewApplicationsAccess() {
        homePage.goToAdminPage();
        adminPage.goToViewApplications();
        String extractedViewApplicationsTitleText = viewApplicationsPage.getViewApplicationsTitleText();
        String predictedViewApplicationsTitleText = "Applications";
        Assertions.assertEquals(predictedViewApplicationsTitleText, extractedViewApplicationsTitleText);
    }

    @Test
    public void adminViewingAdminPageTest() {
        homePage.goToAdminPage();
        String pageName = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("Admin page", pageName);
        adminPage.goToViewApplications();
        String appCheck = driver.findElement(By.cssSelector("div.container td:nth-child(12)")).getText();
        Assertions.assertEquals("Waiting for overnight processing", appCheck);
    }


    @Test
    public void adminDel() {
        //TODO: Need to test that the application is deleted using an assertion
        homePage.goToAdminPage();
        adminPage.goToViewApplications();
        String pageNew = driver.findElement(By.tagName("h2")).getText();
        Assertions.assertEquals("Applications", pageNew);
        viewApplicationsPage.deleteApp();

    }

    @Test
    public void unauthorisedAccess() {
        homePage.goToLoanApplicatonPage();
        String pageTitle = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("403 - Access is denied", pageTitle);
    }
}
