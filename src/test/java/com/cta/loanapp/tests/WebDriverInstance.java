package com.cta.loanapp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WebDriverInstance {

    private static WebDriver driver;
    private static ChromeOptions options;

    public static WebDriver getInstance(){
        if (driver == null){
            options = new ChromeOptions();
//            options.addArguments("--headless");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

}
