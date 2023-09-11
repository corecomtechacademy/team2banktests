package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private static final String URL = "http://localhost:8080/";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(URL);
    }

    public void goToAboutPage() {
        WebElement aboutLink = wait.until(
                d -> driver.findElement(By.cssSelector("h2 a[href='/about']")));
        aboutLink.click();
    }

    public void goToLoginPage() {
        WebElement logInLink = wait.until(d -> driver.findElement(By.cssSelector("a[href='/logout']")));
        logInLink.click();
    }

    public void goToLoanApplicatonPage() {
        WebElement loanApplicationLink = wait.until(d -> driver.findElement(By.cssSelector("a[href='/application']")));
        loanApplicationLink.click();
    }

    public void goToAdminPage() {
        WebElement adminPageLink = wait.until(
                d -> driver.findElement(By.cssSelector("a[href='/admin']")));
        adminPageLink.click();
    }

    public void goToSearchPage() {
        WebElement searchPageLink = wait.until(
                d -> driver.findElement(By.cssSelector("a[href='/search']"))
        );
        searchPageLink.click();
    }

    public String getLoggedInUserText() {
        WebElement loggedUserSpan = wait.until(
                d -> driver.findElement(By.cssSelector("div.container footer span")));
        return loggedUserSpan.getText();
    }


}
