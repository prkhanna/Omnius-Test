package com.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Class for Login Page
 * 
 * @author Prince Khanna
 *
 */
public class LoginPage {

	/**
	 * Getting all the web Element in login page
	 */
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement userName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement userPassword;
	@FindBy(how = How.XPATH, using = "//*[@id=\"kc-login\"]")
	WebElement login;
	@FindBy(how = How.XPATH, using = "//*[@id=\"kc-content-wrapper\"]/div[1]/span[2]")
	WebElement errorText;

	/**
	 * Method to check the user Text
	 */
	public void checkeckUserText() {
		userName.getText();
	}

	/**
	 * Method to check the text of password input field
	 */
	public void checkPasswdText() {
		userPassword.getText();
	}

	/**
	 * Method checks the userName
	 * 
	 * @param user
	 */
	public void enterUserName(String user) {
		userName.sendKeys(user);
	}

	/**
	 * Method checks for userPassword
	 * 
	 * @param paswd
	 */
	public void enterPassword(String paswd) {
		userPassword.sendKeys(paswd);
	}

	/**
	 * Method for clicking on LoginButton
	 */
	public void clickLogin() {
		login.click();
	}

	/**
	 * Method to check for Error message
	 */
	public void checkErrorText() {
		errorText.getText();
	}

}
