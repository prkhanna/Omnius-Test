package com.auto.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Annotate Page Class
 * 
 * @author Prince Khanna
 *
 */
public class AnnotatePage {

	/**
	 * Getting All the details of data Modeler
	 */
	@FindBy(how = How.XPATH, using = "//*[text()='Document explorer']")
	WebElement docExplorer;
	@FindBy(how = How.CLASS_NAME, using = "iconPlus")
	WebElement plusIcon;
	@FindBy(how = How.XPATH, using = "//input[@placeholder= 'Name']")
	WebElement nameText;
	@FindBy(how = How.XPATH, using = "//button[text()= 'Create']")
	WebElement createButton;
	@FindBy(how = How.XPATH, using = "//paragraph[contains(text(),'Try again')]")
	WebElement ErroMsg;
	@FindBy(how = How.XPATH, using = "//button[text()= 'Cancel']")
	WebElement cancelButton;

	/**
	 * Method checks the doc explore text
	 */
	public void checkdocExplorertext() {
		docExplorer.getText();
	}

	/**
	 * Method checks the doc explore text
	 */
	public void clickIcon() {
		plusIcon.click();
	}

	/**
	 * Method enters input name in popup
	 */
	public void sendName(String input) {
		nameText.sendKeys(input);
	}

	/**
	 * Method Button Click
	 */
	public void clickButton() {
		createButton.click();
		if (ErroMsg.isDisplayed()) {
			cancelButton.click();
		}

	}

}
