package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LoanApplicationPage;
import com.cta.loanapp.tests.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;


public class LoanApplicationFormTests {

    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homePage = new HomePage(driver);
    private final LoginPage loginPage = new LoginPage(driver);
    private final LoanApplicationPage loanApplicationPage = new LoanApplicationPage(driver);

    @BeforeEach
    public void individualSetUp() {
        homePage.goTo();
        homePage.goToLoginPage();
        String username = "user";
        String password = "password";
        loginPage.logIn(username, password);
        homePage.goToLoanApplicatonPage();
    }

    @Test
    public void testValidFormSubmission() {
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
        Assertions.assertEquals("Result", loanApplicationPage.getSuccessfulApplicationResultTitle());
    }

    @Test
    public void testBlankFormSubmission() {
        Map<String, Object> dataForInputs = new HashMap<>();
        dataForInputs.put("firstName", "");
        dataForInputs.put("lastName", "");
        dataForInputs.put("age", "");
        dataForInputs.put("addressLine1", "");
        dataForInputs.put("addressLine2", "");
        dataForInputs.put("postCode", "");
        dataForInputs.put("email", "");
        dataForInputs.put("amount", "");
        loanApplicationPage.submitApplicationDetails(dataForInputs);
        Assertions.assertNotEquals("Result", loanApplicationPage.getSuccessfulApplicationResultTitle());
    }

    @Test
    public void testInvalidEmailFormSubmission() {
        Map<String, Object> dataForInputs = new HashMap<>();
        dataForInputs.put("firstName", "Aidan");
        dataForInputs.put("lastName", "Comer");
        dataForInputs.put("age", 26);
        dataForInputs.put("addressLine1", "6 Ludgate Hill");
        dataForInputs.put("addressLine2", "Manchester");
        dataForInputs.put("postCode", "M4 4BW");
        dataForInputs.put("email", "alhcomer@hotmail.");
        dataForInputs.put("amount", 5000);
        loanApplicationPage.submitApplicationDetails(dataForInputs);
        Assertions.assertNotEquals("Result", loanApplicationPage.getSuccessfulApplicationResultTitle());
    }

    @Test
    public void testInvalidFirstNameFormSubmission() {
        Map<String, Object> dataForInputs = new HashMap<>();
        dataForInputs.put("firstName", "a");
        dataForInputs.put("lastName", "Comer");
        dataForInputs.put("age", 26);
        dataForInputs.put("addressLine1", "6 Ludgate Hill");
        dataForInputs.put("addressLine2", "Manchester");
        dataForInputs.put("postCode", "M4 4BW");
        dataForInputs.put("email", "alhcomer@hotmail.co.uk");
        dataForInputs.put("amount", 5000);
        loanApplicationPage.submitApplicationDetails(dataForInputs);
        Assertions.assertNotEquals("Result", loanApplicationPage.getSuccessfulApplicationResultTitle());
    }




    public void checkSuccessfulApplication() {
        String extractedSuccessfulApplicationTitle = loanApplicationPage.getSuccessfulApplicationResultTitle();
        String expectedSuccessfulApplicationTitle = "Result";
        Assertions.assertEquals(expectedSuccessfulApplicationTitle, extractedSuccessfulApplicationTitle);
    }


}
