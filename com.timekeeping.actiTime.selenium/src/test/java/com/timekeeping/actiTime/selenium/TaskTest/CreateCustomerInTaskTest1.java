package com.timekeeping.actiTime.selenium.TaskTest;

  
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.timekeeping.actiTime.selenium.pomRepository.HomePage1;
import com.timekeeping.actiTime.selenium.pomRepository.LoginPage1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomerInTaskTest1 {
	WebDriver driver;
	
	@Test
	public void createCustomerTest() throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/PropertyData.properties");
		Properties property = new Properties();
		property.load(fis);
		String url = property.getProperty("url");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(5000);
		
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		
		
		LoginPage1 login = new LoginPage1(driver);
		login.loginAction(username,password);
		Thread.sleep(5000);
		
		HomePage1 home = new HomePage1(driver);
		home.clickOnTaskButton();
	}

}
