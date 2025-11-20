package com.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	 @Test
	    public void launchChrome() {
		 
		 System.out.println("Test");
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://google.com");
	        System.out.println("Chrome Launched from 1");
	        driver.quit();
	    }

}
