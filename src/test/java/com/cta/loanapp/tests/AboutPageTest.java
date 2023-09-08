package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.About;
import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LogIn;
import com.cta.loanapp.tests.webd.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPageTest {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);
    private final About about = new About(driver);
    private final LogIn login = new LogIn(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();
    }

    @Test
    public void correctText() {
        homepage.goTo();
        login.clickSignIn();
        login.addUserName("user");
        login.addPass("password");
        login.clickSubmit();
        about.results();

        //driver.findElement(By.linkText("About page")).click();
        String pageTitle = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("About", pageTitle);

    }
   // @Test confused Test
    //public void paragraph() {
      //  driver.findElement(By.cssSelector("h2:nth-child(6) > a")).click();
        //driver.findElement(By.linkText("About page")).click();
        //String para = driver.findElement(By.cssSelector("> p")).getText();
        //Assertions.assertEquals("This application is to be used to process applications for loans by bank branch staff", para);
    //}

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }


}

