package com.cta.loanapp.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<HashMap<String, String>> getListOfRecords() {
        List<HashMap<String, String>> listOfRecords = new ArrayList<>();
        List<WebElement> tableRows = new ArrayList<>();
        Map<String, String> individualRecord = new HashMap<>();
        return listOfRecords;
    }
}
