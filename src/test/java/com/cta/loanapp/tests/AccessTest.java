package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.Access;
import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LogIn;
import com.cta.loanapp.tests.webd.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccessTest {
    private static final WebDriver driver = WebDriverManager.getDriver();
    private static WebDriverWait wait;
    private final HomePage homepage = new HomePage(driver);
    private final LogIn login = new LogIn(driver);
    private final Access access = new Access(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();
    }
    @Test
    public void unauthorisedAccess(){
        homepage.goTo();
        //admin
        login.clickSignIn();
        login.adminUser("admin");
        login.adminPass("password");
        login.clickSubmit();
        access.clickApp();

        String pageTitle = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("403 - Access is denied", pageTitle);
    }
    @Test
    public void userAccess(){
        homepage.goTo();
        login.clickSignIn();
        login.addUserName("user");
        login.addPass("password");
        login.clickSubmit();


        access.newApp();
        String title = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("New Application", title);

        //creating application
        access.firstName1();
        access.lastName1();
        access.age1();
        access.address1();
        access.address2();
        access.postcode();
        access.email();
        access.amount();
        access.confirm();


    }
    @Test
    public void makeAppInvalid(){
        homepage.goTo();
        login.clickSignIn();


    }
    @Test
    public void userAccessIn(){
        login.clickSignIn();
        login.addUserName("user");
        login.addPass("password");


    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
