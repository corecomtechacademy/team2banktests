package com.cta.loanapp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Object;
import java.time.Duration;
import java.util.Properties;

public class WebDriverInstance {

    private static WebDriver driver;

    public static WebDriver getInstance(){
        Properties properties = new Properties();
        try (InputStream inputStream = WebDriverInstance.class.getResourceAsStream("/config.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String browserChoice = properties.getProperty("config.browser");
        if (driver == null){
            if (browserChoice.equals("chrome")) {
                ChromeOptions options = new ChromeOptions().addArguments("--headless");
                WebDriverManager.chromedriver().setup();
                driver = WebDriverManager.chromedriver().capabilities(options).create();
            } else if (browserChoice.equals("firefox")) {
                FirefoxOptions options = new FirefoxOptions().addArguments("--headless");
                WebDriverManager.firefoxdriver().setup();
                driver = WebDriverManager.firefoxdriver().capabilities(options).create();
            }
        }
        assert driver != null;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

}
