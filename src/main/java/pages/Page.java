package pages;

import org.openqa.selenium.WebDriver;

import common.TestBase;

public class Page {
	/**
	 * This is a class which contain all common method for 1 website
	 *
	 */
	public WebDriver driver;
	public TestBase testBase = new TestBase();
 
	public Page(WebDriver dr) {
		testBase.driver= dr;
		
	}
	public void clearData() {
		driver.navigate().refresh();
		
	}
	


}
