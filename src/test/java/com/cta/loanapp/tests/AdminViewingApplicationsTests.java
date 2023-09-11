package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class AdminViewingApplicationsTests {
    private static final WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homePage = new HomePage(driver);
    private final LoginPage loginPage = new LoginPage(driver);
    private final AdminPage adminPage = new AdminPage(driver);
    private final ViewApplicationsPage viewApplicationsPage = new ViewApplicationsPage(driver);
    private final LoanApplicationPage loanApplicationPage = new LoanApplicationPage(driver);

    @BeforeEach
    public void individualSetUp() {
        homePage.goTo();
        homePage.goToLoginPage();
        String adminUsername = "admin";
        String userUsername = "user";
        String password = "password";
        loginPage.logIn(userUsername, password);
        homePage.goToLoanApplicatonPage();
        Map<String, Object> dataForInputs = new HashMap<>();
        dataForInputs.put("firstName", "Aidan");
        dataForInputs.put("lastName", "Comer");
        dataForInputs.put("age", 26);
        dataForInputs.put("addressLine1", "6 Ludgate Hill");
        dataForInputs.put("addressLine2", "Manchester");
        dataForInputs.put("postCode", "M4 4BW");
        dataForInputs.put("email", "alhcomer@hotmail.co.uk");
        dataForInputs.put("amount", 5000);
        loanApplicationPage.submitApplicationDetails(dataForInputs);
        homePage.goTo();
        homePage.goToLoginPage();
        loginPage.logIn(adminUsername, password);
        homePage.goToAdminPage();
        adminPage.goToViewApplications();
    }

    @Test
    public void testAdminCanSeeRecordExists() {
        ;
    }

}
