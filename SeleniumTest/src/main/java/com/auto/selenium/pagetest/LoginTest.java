package com.auto.selenium.pagetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.auto.selenium.base.BaseTest;
import com.auto.selenium.pages.HomePage;
import com.auto.selenium.pages.LoginPage;

/**
 * Test Class for login Page to check for Test case
 * 
 * @author Prince Khanna
 *
 */

public class LoginTest extends BaseTest {

	/**
	 * Method for checking whether field exists
	 */
	@Test
	public void checkCredentialFields() {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.checkeckUserText();
		loginPage.checkPasswdText();

	}

	/**
	 * Method to check Error text
	 */
	@Test
	public void checkErrorText() {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.clickLogin();
		loginPage.checkErrorText();

	}

	/**
	 * Method to validate credentials
	 */
	@Test()
	public void checkValidCredentials() {

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);

		loginPage.enterUserName("testuser");
		loginPage.enterPassword("testuser");
		loginPage.clickLogin();
		homePage.clickOmin();

	}

}
