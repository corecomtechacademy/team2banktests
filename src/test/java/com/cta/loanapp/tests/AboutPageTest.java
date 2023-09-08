package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AboutPageTest {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);

    @Test
    public void aboutPage() {
        homepage.goTo();
        homepage.aboutPage();
    }
}
