package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage extends BasePage{
    public AboutPage(WebDriver driver) {
        super(driver);
    }

    public String getAboutTitleText() {
        WebElement title = wait.until(d -> driver.findElement(
                By.cssSelector("div.starter-template h1")));
        return title.getText();
    }

    public String getAboutBodyText() {
        WebElement body = wait.until(d -> driver.findElement(
                By.cssSelector("div.container p")));
        return body.getText();
    }
}
