package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
	By elementsMenu = By.xpath("//div[@class='category-cards']/div[1]//div[@class='card-up']");
	By fromMenu = By.xpath("//h5[text()='Forms']");


	public HomePage(WebDriver dr) {
		super(dr);
		driver = dr;

	}
	//Click on elements item, return ElementsPage

	public ElementsPage clickOnElementsMenu() {
		driver.findElement(elementsMenu).click();
		return new ElementsPage(driver);
	}

	public FormPage clickOnFormsMenu() {
		driver.findElement(fromMenu).click(); 
		return new FormPage(driver);
	}
		
	
}
