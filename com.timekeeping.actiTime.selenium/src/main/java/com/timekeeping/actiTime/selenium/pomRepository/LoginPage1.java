package com.timekeeping.actiTime.selenium.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	WebDriver driver;
	
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id = "username")
	private WebElement usernameTextField;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//label[text()='Keep me logged in']")
	private WebElement checkBox;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;
	
	public void loginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		checkBox.click();
		loginButton.click();
	}

}
