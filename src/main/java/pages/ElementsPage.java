package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.TestBase;

public class ElementsPage extends Page {
public	By locTextBoxMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");

	public ElementsPage(WebDriver dr) {
		super(dr);
		driver = dr;
	}
	
	public TextBoxPage clickOnTextBoxMenu() {
		testBase.click(driver,locTextBoxMenu);
		return new TextBoxPage(driver);
		//driver.navigate().refresh();
	}

}
