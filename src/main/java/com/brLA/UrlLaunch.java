package com.brLA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlLaunch {
	 public static void main(String[] args) {

	       
	        WebDriverManager.chromedriver().setup();

	        
	        WebDriver driver = new ChromeDriver();

	        
	        driver.get("https://demoqa.com/");

	        System.out.println("URL Launched Successfully!");

	        
	        try {
	            Thread.sleep(5000);
	        } catch (Exception e) {}

	        driver.quit();
	    }

}
