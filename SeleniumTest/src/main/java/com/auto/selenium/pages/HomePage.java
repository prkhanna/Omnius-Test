package com.auto.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * 
 * Home Page Class
 * @author Prince Khanna
 *
 */
public class HomePage {

	
	/**
	 * Getting all the web Element in home page
	 */
	@FindBy(how= How.XPATH, using ="//a[@href = \"/trainer/ui/\"]") WebElement omin;
	@FindBy(how= How.XPATH, using ="//img[@src='platform/source/assets/images/components/pages/console/data-modeler.png']") WebElement dataModeler;
	@FindBy(how= How.XPATH, using ="//img[@src='platform/source/assets/images/components/pages/console/annotate.png']") WebElement annotate;
	@FindBy(how= How.XPATH, using ="//img[@src='platform/source/assets/images/components/pages/console/train.png']") WebElement train;
	@FindBy(how= How.XPATH, using ="//img[@src='platform/source/assets/images/components/pages/console/model-evaluation.png']") WebElement modelEvaluation;
	@FindBy(how= How.XPATH, using ="//img[@src='platform/source/assets/images/components/pages/console/import-export.png']") WebElement importExport;
	@FindBys({
	       @FindBy(xpath = "//a[label= 'System health']"),
           @FindBy(xpath = "//a[label= 'user management']"),
           @FindBy(xpath = "//a[label= 'logs']")
}) List<WebElement> disableLinks;

	
	

	/**
	 * Method to check the heading
	 */
	public void clickDataModler() {
		dataModeler.click();;
	}
	/**
	 * Method to clickAnnotation
	 */
	public void clickAnnotation() {
		annotate.click();
	}
	/**
	 * Method to clickTrain
	 */
	public void clickTrain(){
		train.click();
	}
	/**
	 * Method to clickModelEvaluation
	 */
	public void clickModelEvaluation() {
		modelEvaluation.click();
	}
	/**
	 * Method to clickImpExp
	 */
	public void clickImpExp() {
		importExport.click();;
	}
	
	/**
	 * Method to click OminLink
	 */
	public void clickOmin() {
		omin.click();;
	}
	
	/**
	 * Validate the disabled links
	 */
	public void validateDisabledLinks() {
		for(  WebElement ele : disableLinks) {
			if(ele.isEnabled()) {
				Assert.assertEquals("true", ele);
			}

			}
			
		}
		
	}

