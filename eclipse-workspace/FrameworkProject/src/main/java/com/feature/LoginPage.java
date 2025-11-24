package com.feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");
    By errorMsg = By.xpath("//p[contains(@class,'oxd-alert-content-text')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // WAIT ADDED
    }

    public void enterUsername(String uname) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        userField.sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        passField.sendKeys(pwd);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public String getErrorMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg)).getText();
    }
}


