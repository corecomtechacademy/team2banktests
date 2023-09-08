package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search extends BasePage{
    public Search(WebDriver driver) {
        super(driver);
    }
    public void searchInput(){
        driver.findElement(By.cssSelector("body > div.container > div > h2:nth-child(5) > a")).click();
        driver.findElement(By.id("search_input")).sendKeys("arooj");
        driver.findElement(By.cssSelector("button")).click();

    }
}
