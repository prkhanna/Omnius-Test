package com.auto.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

/**
 * Class for Train Page
 * 
 * @author Prince Khanna
 *
 */
public class TrainPage {

	/**
	 * Getting All the details of Train Page
	 */
	@FindBy(how = How.XPATH, using = "//*[text()='Train']")
	WebElement train;

	@FindBys({ @FindBy(xpath = "//chunk[text()= 'Data model']"), @FindBy(xpath = "//chunk[text()= 'Collections']"),
			@FindBy(xpath = "//chunk[text()= 'AI task']") })
	List<WebElement> trainContent;

	/**
	 * Method checks the Train text
	 */
	public void checkTraintext() {
		train.getText();
	}

	/**
	 * Method Find all elements in table
	 */
	public void checktableElements() {
		for (WebElement ele : trainContent) {
			ele.getText();

		}
	}
}
