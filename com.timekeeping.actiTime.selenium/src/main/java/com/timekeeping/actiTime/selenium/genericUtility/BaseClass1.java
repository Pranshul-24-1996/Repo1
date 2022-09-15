package com.timekeeping.actiTime.selenium.genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass1 {
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("==========Database Connectivity==========");
	}
	
	@BeforeClass
	public void bcConfig() {
		System.out.println("==========Browser Launched==========");
		System.out.println("==========Navigated to the URL==========");
	}
	
	@BeforeMethod
	public void bmConfig() {
		System.out.println("==========Login to the Application==========");
	}
	
	@AfterMethod
	public void amConfig() {
		System.out.println("==========Logout from the Application==========");
	}
	
	@AfterClass
	public void acConfig() {
		System.out.println("==========Browser closed==========");
	}
	
	@AfterSuite
	public void asConfig() {
		System.out.println("==========Database Disconnected");
	}

}
