package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AdminViewPageTest {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);
    private final LoginPage loginpage = new LoginPage(driver);

    @Test
    public void adminViewPage() {
        homepage.goTo();
        loginpage.adminLogin();
        homepage.adminViewApp();
        //view applications
    }
}
