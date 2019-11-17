package com.auto.selenium.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Base test class for Selenium
 * 
 * @author Prince Khanna
 *
 */
public class BaseTest {
	public static WebDriver driver = null;

	/**
	 * Method used for opening of the Browser
	 */
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\SeleniumTest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://omniustest.omnius.com/trainer/ui/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	/**
	 * Method used for closing of the Browser
	 */
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}
