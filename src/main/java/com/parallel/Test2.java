package com.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	@Test
	public void edge() {
		System.setProperty("webdriver.edge.driver",
			    "C:\\Users\\HARIBALA\\Downloads\\edgedriver_win64\\msedgedriver.exe");

			WebDriver driver = new EdgeDriver();
			driver.get("https://google.com");
			System.out.println("Edge launched");
			//driver.quit();


	}
	}
