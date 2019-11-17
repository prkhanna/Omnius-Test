package com.auto.selenium.pagetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.auto.selenium.base.BaseTest;
import com.auto.selenium.pages.HomePage;
import com.auto.selenium.pages.TrainPage;

/**
 * Test Class for Train Page to check for Test case
 * 
 * @author Prince Khanna
 *
 */
public class TrainPageTest extends BaseTest {

	/**
	 * Methods check all the fields present on the Train Screen
	 */
	@Test
	public void checkElementTable() {
		TrainPage trainPage = PageFactory.initElements(driver, TrainPage.class);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		trainPage.checktableElements();
		homePage.clickOmin();
	}

}
