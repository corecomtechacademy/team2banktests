package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class AdminLoginTest {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);
    private final LoginPage loginpage = new LoginPage(driver);

    public void adminLoginTest() {
        // homepage.goTo();
        homepage.clickLoginLink();
        loginpage.adminLogin();
    }
}
