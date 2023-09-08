package com.cta.loanapp.tests;

import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUserApplicationTest {
    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homepage = new HomePage(driver);
    private final LoginPage loginpage = new LoginPage(driver);


    @Test
    public void addApplication() {
        homepage.goTo();
        homepage.clickLoginLink();
        loginpage.userLogin();
        homepage.clickNewAppLink();


        driver.findElement(By.id("firstName")).sendKeys("Tdizzle");
        driver.findElement(By.id("lastName")).sendKeys("Crabby");
        driver.findElement(By.id("age")).sendKeys("24");
        driver.findElement(By.id("addressLine1")).sendKeys("52 Regent Way");
        driver.findElement(By.id("addressLine2")).sendKeys("Oxford");
        driver.findElement(By.id("postCode")).sendKeys("LS1 5AT");
        driver.findElement(By.id("email")).sendKeys("tdizz-abby73@gmail.com");
        driver.findElement(By.id("amount")).sendKeys("2500");

        WebElement loanSubmission = driver.findElement(By.cssSelector("button"));
        loanSubmission.click();

    }

}
