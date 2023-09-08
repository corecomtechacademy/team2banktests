package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class UserLoginTest {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);
    private final LoginPage loginpage = new LoginPage(driver);

    @Test
    public void testUserLogin() {
        homepage.goTo();
        homepage.clickLoginLink();
        loginpage.userLogin();
    }
}
