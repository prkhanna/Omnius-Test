package com.auto.selenium.pagetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.auto.selenium.base.BaseTest;
import com.auto.selenium.pages.DataModelerPage;
import com.auto.selenium.pages.HomePage;

/**
 * Test class to test all the test case for Data Modeler Page
 * 
 * @author Prince Khanna
 *
 */
public class DataModelerPageTest extends BaseTest {

	/**
	 * Method check the table columns
	 */
	@Test
	public void checkTable() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		DataModelerPage dataModlr = PageFactory.initElements(driver, DataModelerPage.class);
		homePage.clickDataModler();
		dataModlr.checktableElements();
	}

	/**
	 * Method checks for content in table depending on search criteria
	 */
	@Test(dependsOnMethods = { "checkTable" })
	public void TestSearchData() {
		DataModelerPage dataModlr = PageFactory.initElements(driver, DataModelerPage.class);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		dataModlr.findInput("default");
		homePage.clickOmin();

	}

}
