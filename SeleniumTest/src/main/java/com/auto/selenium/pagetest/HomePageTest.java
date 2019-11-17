package com.auto.selenium.pagetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.auto.selenium.base.BaseTest;
import com.auto.selenium.pages.AnnotatePage;
import com.auto.selenium.pages.DataModelerPage;
import com.auto.selenium.pages.HomePage;

/**
 * 
 * Test class to test all the test case for HomePageTest Page
 * @author Prince Khanna
 *
 */
public class HomePageTest  extends BaseTest{
	
	/**
	 * This method is check for data page
	 * @throws Exception
	 */
	@Test
	public void checkforDataPage(){
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		DataModelerPage dataModelr = PageFactory.initElements(driver, DataModelerPage.class);
		
		homePage.clickDataModler();
		dataModelr.checkdataModelertext();
		homePage.clickOmin();
		
	}
	
	/**
	 * This method is check for Annotation Page
	 */
	@Test
	public void checkforAnnotationPage()  { 
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		AnnotatePage annotate = PageFactory.initElements(driver, AnnotatePage.class);
		
		homePage.clickAnnotation();
		annotate.checkdocExplorertext();
		homePage.clickOmin();
		
	}
	
	/**
	 *  This method is used to validate whether links are disabled or not
	 */
	@Test
	public void checkforDisabledLink()  { 
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.validateDisabledLinks();;
	
	}

}
