package com.cta.loanapp.tests.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final String URL = "http://localhost:8080/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(URL);
    }

public void userSignIn(){

}


public void adminSignIn(){

}

}
