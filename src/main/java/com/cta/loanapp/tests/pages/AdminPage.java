package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage extends BasePage{

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public String getAdminPageTitleText() {
        WebElement helloAdminText = wait.until(
                d -> driver.findElement(By.cssSelector("div.starter-template h2")));
        return helloAdminText.getText();
    }

    public void goToViewApplications() {
        WebElement viewApplicationsLink = wait.until(
                d -> driver.findElement(By.cssSelector("a[href='/applications']")));
        viewApplicationsLink.click();
    }
}
