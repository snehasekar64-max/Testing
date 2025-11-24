package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.feature.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new LoginPage(driver);
        System.out.println("Browser launched & login page opened");
    }

    // EXACT MATCH with feature file
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.enterUsername("Admin");      // Correct spelling
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();
    }

    // EXACT MATCH with feature file
    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        loginPage.enterUsername("WrongUser");
        loginPage.enterPassword("wrongPass");
        loginPage.clickLogin();
    }

    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        System.out.println("Home page title: " + driver.getTitle());
        System.out.println("Login successful");
        driver.quit();
        System.out.println("Browser closed");
    }

    @Then("user should see an error message")
    public void user_should_see_an_error_message() {
        String msg = loginPage.getErrorMessage();
        System.out.println("Error message: " + msg);
        driver.quit();
        System.out.println("Browser closed");
    }
}




