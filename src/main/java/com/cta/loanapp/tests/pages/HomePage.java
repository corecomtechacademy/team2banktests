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

    public void clickLoginLink() {
        WebElement logInClick = driver.findElement(By.cssSelector("body > div:nth-child(4) > div > footer > span > a"));
        logInClick.click();
    }

    public void aboutPage() {
        WebElement clickAboutPage = driver.findElement(By.linkText("About page"));
        clickAboutPage.click();
    }

    public void adminViewApp() {
        WebElement adminView = driver.findElement(By.linkText("Admin page"));
        adminView.click();
    }

    public void clickNewAppLink() {
        WebElement loanApplicationClick = driver.findElement(By.linkText("Loan Application"));
        loanApplicationClick.click();
    }

}
