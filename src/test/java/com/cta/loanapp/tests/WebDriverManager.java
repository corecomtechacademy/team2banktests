package com.cta.loanapp.tests;
import org.openqa.selenium.WebDriver;


public class WebDriverManager {
    private static final WebDriver driver = WebDriverInstance.getInstance();
    private static final Thread THREAD = new Thread(driver::quit);
    static {
        Runtime.getRuntime().addShutdownHook(THREAD);
    }    public static WebDriver getDriver(){
        return driver;
    }

}
