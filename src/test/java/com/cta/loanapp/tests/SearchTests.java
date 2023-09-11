package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.Search;
import com.cta.loanapp.tests.webd.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchTests {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);
    private final Search search = new Search(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();

    }
    @Test
    public void searching(){
        homepage.goTo();
        search.searchInput();

        String pageResults = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("Results for arooj", pageResults);




    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
