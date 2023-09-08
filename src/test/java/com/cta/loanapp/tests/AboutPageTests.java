package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.AboutPage;
import com.cta.loanapp.tests.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AboutPageTests {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homePage = new HomePage(driver);
    private final AboutPage aboutPage = new AboutPage(driver);

    @BeforeEach
    public void individualSetUp() {
        homePage.goTo();
        homePage.goToAboutPage();
    }

    @Test
    public void testAboutTitleText() {
        String extractedTitleText = aboutPage.getAboutTitleText();
        String predictedTitleText = "About";
        Assertions.assertEquals(extractedTitleText, predictedTitleText);
    }

    @Test
    public void testAboutBodyTest() {
        String extractedBodyText = aboutPage.getAboutBodyText();
        String predictedBodyTest = "This application is to be used to process applications for loans by bank branch staff.\n" +
                "Normal users can process applications and admin users can view and delete existing applications.";
        Assertions.assertEquals(extractedBodyText, predictedBodyTest);
    }
}
