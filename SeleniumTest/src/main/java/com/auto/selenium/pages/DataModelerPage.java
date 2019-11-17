package com.auto.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * DateModeler Page Class
 * 
 * @author Prince Khanna
 *
 */
public class DataModelerPage {

	/**
	 * Getting all the web Element in DataModeler page
	 * 
	 * @return
	 */
	@FindBys({ @FindBy(name = "Id"), @FindBy(name = "Name"), @FindBy(name = "Description"),
			@FindBy(name = "Is Default") })
	List<WebElement> tableElements;

	@FindBy(how = How.XPATH, using = "//*[text()='Data modeler']")
	WebElement dataModeler;
	@FindBy(how = How.XPATH, using = "//input[@placeholder= 'Search...']")
	WebElement searchText;
	@FindBy(how = How.XPATH, using = "//a[@href = '/trainer/ui/data-modeler/1']")
	WebElement recordLink;

	/**
	 * Method to check the list of table Elements
	 */
	public void checktableElements() {
		for (WebElement ele : tableElements) {
			ele.getText();

		}
	}

	/**
	 * Method checks the data modeler text
	 */
	public void checkdataModelertext() {
		dataModeler.getText();
	}

	/**
	 * This method will find the input text filled in search field
	 */
	public void findInput(String input) {
		searchText.sendKeys(input);
	}

	/**
	 * Method Find elements in table
	 */
	public void findElementInTable() {
		if (recordLink.isDisplayed()) {
			recordLink.click();
		} else {
			Assert.assertEquals("", "default");
		}
	}
}
