package com.timekeeping.actiTime.selenium.basicTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToPerformCrossBrowserTesting {

	@Parameters("borwser")
	@Test
	public void cross(String browser) {
		if(browser.equals("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.com");
		}
		else {
			System.out.println("Browser is not present");
		}
	}
	
}
