package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchTests {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();

    }
    @Test
    public void searching(){
        driver.findElement(By.cssSelector("body > div.container > div > h2:nth-child(5) > a")).click();
        driver.findElement(By.id("search_input")).sendKeys("arooj");
        driver.findElement(By.cssSelector("button")).click();
        String pageResults = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("Results for arooj", pageResults);




    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
