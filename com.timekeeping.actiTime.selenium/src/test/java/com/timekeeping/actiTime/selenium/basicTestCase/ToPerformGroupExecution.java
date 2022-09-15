package com.timekeeping.actiTime.selenium.basicTestCase;

import org.testng.annotations.Test;

public class ToPerformGroupExecution {

	@Test (groups="smokeTesting")
	// to keep a script in a particular group we are using (groups="smokeTestin")
	public void login() {
		System.out.println("Login is successful");
		}
	
	@Test (groups="regressionTesting")   
	public void selectProduct() {
		System.out.println("Product is selected");
		}
	
	@Test (groups="regressionTesting")
	public void addProduct() {
		System.out.println("Product is added to the cart");
		}
	
	@Test (groups="regressionTesting")
	public void payment() {
		System.out.println("payment is successful");
		}
	
	@Test (groups="smokeTesting")
	public void logout() {
		System.out.println("Logout from the application");
		}
	}

