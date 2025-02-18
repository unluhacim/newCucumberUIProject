package stepDefinitions;

import base.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import base.BaseTest; // Import BaseTest
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import java.sql.DriverManager;

public class LoginSteps extends CommonMethods { // Extend BaseTest

    @Given("User enters valid username {string} and password {string}")
    public void userEntersValidCredentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Given("User enters invalid username {string} and password {string}")
    public void userEntersInvalidCredentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("User clicks the login button")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User should be redirected to the home page")
    public void userIsRedirectedToHomePage() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("User should see an error message {string}")
    public void userSeesErrorMessage(String expectedErrorMessage) {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed()); // Check if displayed first
        String actualErrorMessage = loginPage.getErrorMessage();
        System.out.println(actualErrorMessage+" - "+expectedErrorMessage);
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
}
