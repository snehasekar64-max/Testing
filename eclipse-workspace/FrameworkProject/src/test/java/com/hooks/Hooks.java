package com.hooks;

import com.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        
        DriverFactory.getDriver();
    }

    @After
    public void teardown() {
        DriverFactory.quitDriver();
    }
}



