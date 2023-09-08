package com.cta.loanapp.tests.admin;

import com.cta.loanapp.tests.webd.WebDriverManager;
import com.cta.loanapp.tests.pages.Access;
import com.cta.loanapp.tests.pages.AdminRoles;
import com.cta.loanapp.tests.pages.HomePage;
import com.cta.loanapp.tests.pages.LogIn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminViewTests {
    private static final WebDriver driver = WebDriverManager.getDriver();
    private static WebDriverWait wait;
    private final HomePage homepage = new HomePage(driver);
    private final LogIn login = new LogIn(driver);
    private final Access access = new Access(driver);
    private final AdminRoles admin = new AdminRoles(driver);

    @BeforeEach
    public void individualSetUp() {
        homepage.goTo();
    }
    @Test
    public void adminViews(){
        homepage.goTo();
        admin.mainAdminPage();
        login.adminUser("admin");
        login.adminPass("password");
        login.clickSubmit();
        admin.asAdmin();
        String pageName = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("Admin page", pageName);
        admin.viewApp();


    }
    @Test
    public void  adminDel(){
        homepage.goTo();
        admin.mainAdminPage();
        login.adminUser("admin");
        login.adminPass("password");
        login.clickSubmit();
        admin.asAdmin();
        String pageName = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("Admin page", pageName);
        admin.viewApp();
        String pageNew = driver.findElement(By.tagName("h2")).getText();
        Assertions.assertEquals("Applications", pageNew);
        admin.deleteApp();
    }
}
