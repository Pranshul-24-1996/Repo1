package com.timekeeping.actiTime.selenium.TaskTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.timekeeping.actiTime.selenium.genericUtility.BaseCalss;
import com.timekeeping.actiTime.selenium.genericUtility.ExcelUtility;
import com.timekeeping.actiTime.selenium.genericUtility.JavaUtility;
import com.timekeeping.actiTime.selenium.pomRepository.CreateNewCustomerPage;
import com.timekeeping.actiTime.selenium.pomRepository.HomePage;
import com.timekeeping.actiTime.selenium.pomRepository.LoginPage;
import com.timekeeping.actiTime.selenium.pomRepository.TaskPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomerInTaskTest extends BaseCalss {

        @Test
        public void createCustomerTest() throws IOException {
        // Object creation statements
        HomePage home = new HomePage(driver);
        TaskPage task = new TaskPage(driver);
        CreateNewCustomerPage createCustomer = new CreateNewCustomerPage(driver);
        // getting random no.
        int randomNo = jUtils.generateRandomNo(1000);
        
       // Fetching data from excel sheet
        
       /* String expectedCustomerName = eUtils.fetchDataFromExcelSheet("Sheet2", 1, 0)+randomNo;
        String description = eUtils.fetchDataFromExcelSheet("Sheet2", 1, 1);
        */
        
        String expectedCustomerName = jUtils.fetchDataFromPropertyFile("customerName")+randomNo;
        String description = jUtils.fetchDataFromPropertyFile("description");
        // Clicking on Task Button
		home.clickonTask();
	    // Clicking on new customer button
		task.clickOnNewCustomerButton();
		// creating customer
		createCustomer.createCustomerAction(expectedCustomerName, description);
		// verification
		String actualCustomerName = task.verifyCustomerName(expectedCustomerName);
		Assert.assertEquals(actualCustomerName, expectedCustomerName);
		System.out.println("The Customer Name has been Verified");
		
		
		
		
		
        }

}
