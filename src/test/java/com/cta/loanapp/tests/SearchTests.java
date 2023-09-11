package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchTests {
    private static final WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homePage = new HomePage(driver);
    private final SearchPage searchPage = new SearchPage(driver);

    @BeforeEach
    public void individualSetUp() {
        homePage.goTo();
    }
    @Test
    public void searchTest(){
        searchPage.searchInput();
        String pageResults = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("Results for arooj", pageResults);
    }


}
