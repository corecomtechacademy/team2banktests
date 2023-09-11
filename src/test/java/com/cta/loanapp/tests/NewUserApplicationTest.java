package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LoginPage;
import com.cta.loanapp.tests.pages.UserNewApplication;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUserApplicationTest {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);
    private final LoginPage loginpage = new LoginPage(driver);
    private final UserNewApplication newapplication = new UserNewApplication(driver);

    @Test
    public void addApplication() {
        homepage.goTo();
        homepage.clickLoginLink();
        loginpage.userLogin();
        homepage.clickNewAppLink();
        newapplication.createNewApplication();


    }

}
