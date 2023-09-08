package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

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

    public void submitApplicationDetails(Map<String, Object> dataForInputs) {
        List<WebElement> formInputs = wait.until(d -> driver.findElements(By.tagName("input")));
        for (WebElement input : formInputs) {
            for (Map.Entry<String, Object> entry : dataForInputs.entrySet()) {
                if (input.getAttribute("name").equals(entry.getKey())) {
                    input.sendKeys(entry.getValue().toString());
                }
            }
        }
        WebElement submitBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        submitBtn.click();
    }

    public String getSuccessfulApplicationResultTitle() {
        WebElement result = driver.findElement(By.cssSelector("div.container h1"));
        return result.getText();
    }
}
