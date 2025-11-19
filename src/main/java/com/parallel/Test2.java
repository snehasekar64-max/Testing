package com.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

    @Test
    public void chrome2() {
        WebDriverManager.chromedriver().setup();     
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("chrome Launched from 2");
        driver.quit();
    }
}

