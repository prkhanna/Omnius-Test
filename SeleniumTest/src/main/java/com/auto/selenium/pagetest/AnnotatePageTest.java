package com.auto.selenium.pagetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.auto.selenium.base.BaseTest;
import com.auto.selenium.pages.AnnotatePage;
import com.auto.selenium.pages.HomePage;

/**
 * Test class to test all the test case for Annotate Page
 * 
 * @author Prince Khanna
 *
 */
public class AnnotatePageTest extends BaseTest {

	/**
	 * Added this method to add entry in collection
	 */
	@Test
	public void AddCollection() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		AnnotatePage annotatePage = PageFactory.initElements(driver, AnnotatePage.class);
		homePage.clickAnnotation();
		annotatePage.clickIcon();
		driver.switchTo().activeElement();
		annotatePage.sendName("OmniTest3");
		annotatePage.clickButton();

	}

}
