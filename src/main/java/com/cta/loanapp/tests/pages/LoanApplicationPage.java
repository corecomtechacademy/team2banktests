package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoanApplicationPage extends BasePage {
    public LoanApplicationPage(WebDriver driver) {
        super(driver);
    }

    public String extractAdminAccessDeniedText() {
        WebElement adminAccessDeniedDiv = wait.until(
                d -> driver.findElement(By.cssSelector("div.starter-template div"))
        );
        return adminAccessDeniedDiv.getText();
    }

    public String extractLoanApplicationPageTitleText() {
        WebElement loanApplicationTitleText = wait.until(
                d -> driver.findElement(By.cssSelector("div.container h1"))
        );
        return loanApplicationTitleText.getText();
    }
}
