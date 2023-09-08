package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewApplicationsPage extends BasePage{
    public ViewApplicationsPage(WebDriver driver) {
        super(driver);
    }

    public String getViewApplicationsTitleText() {
        WebElement viewApplicationsTitleText = wait.until(
                d -> driver.findElement(By.cssSelector("div h2"))
        );
        return viewApplicationsTitleText.getText();
    }
}
