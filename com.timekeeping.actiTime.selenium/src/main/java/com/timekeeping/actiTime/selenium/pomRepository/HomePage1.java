package com.timekeeping.actiTime.selenium.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	WebDriver driver;
	
	public HomePage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement taskButton;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTaskButton() {
		return taskButton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public void clickOnTaskButton() {
		taskButton.click();
	}
	public void clickOnLogoutLink() {
		logoutLink.click();
	}

}
