package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getSearchTitleText() {
        WebElement searchTitle = wait.until(d -> driver.findElement(By.cssSelector(
                "div.starter-template h1"
        )));
        return searchTitle.getText();
    }

    public void searchInput(){
        driver.findElement(By.cssSelector("body > div.container > div > h2:nth-child(5) > a")).click();
        driver.findElement(By.id("search_input")).sendKeys("arooj");
        driver.findElement(By.cssSelector("button")).click();
    }
}
