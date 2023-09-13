package StepDefinitions;

import com.cta.loanapp.tests.WebDriverManager;
import com.cta.loanapp.tests.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Steps {
    protected WebDriverWait wait;

    private static WebDriver driver = WebDriverManager.getDriver();
    private final HomePage homePage = new HomePage(driver);
    private final AboutPage aboutPage = new AboutPage(driver);
    private final LoginPage loginPage = new LoginPage(driver);
    private final LoanApplicationPage loanApplicationPage = new LoanApplicationPage(driver);
    private final SearchPage searchPage = new SearchPage(driver);

    @Given("the {string} is logged in")
    public void user_or_admin_logs_in(String username) {
        homePage.goTo();
        homePage.goToLoginPage();
        loginPage.logIn(username, "password");
    }

    @When("they navigate to the about page")
    public void go_to_about_page() {
        homePage.goToAboutPage();
    }

    @Then("information about the loan app is displayed")
    public String about_page_information() {
        WebElement body = wait.until(d -> driver.findElement(
                By.cssSelector("div.container p")));
        return body.getText();
    }
}
