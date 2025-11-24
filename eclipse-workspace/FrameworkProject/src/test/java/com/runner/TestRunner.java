package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.stepDefinitions", "com.hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests { }

