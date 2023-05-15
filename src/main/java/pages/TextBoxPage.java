package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import common.Utils;

public class TextBoxPage extends Page {

	public TextBoxPage(WebDriver dr) {
		super(dr);
		driver = dr;
	}
	// =========***=======
	// Cách lấy locator
	// *CÁCH 1:

//	public void inputUserName(String userName) {//		
//		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(userName);//		
//	}
//	public void inputUserEmail (String userEmail) {//		
//		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(userEmail);
	// }
//	public void inputCurrentAddress (String currentAddress) {//		
//		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(currentAddress);
//	}
//	public void inputPermanentAddress (String permanentAddress) {//		
//		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys(permanentAddress);
//	}
//	public void clickSubmitBtn() {
//		driver.findElement(By.xpath("//button[@id='submit']")).click();//		
//	}
//	public TextBoxPage actualResult() {
//		driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).getText();		
//		return new TextBoxPage(driver);
//		
//	}

	// *CÁCH 2:

	public By locFullName = By.xpath("//input[@id='userName']");
	public By locEmailName = By.xpath("//input[@id='userEmail']");
	public By locCurrentAddress = By.xpath("//textarea[@id='currentAddress']");

	public By locPermanentAddress = By.xpath("//textarea[@id='permanentAddress']");
	public By locSubmit = By.xpath("//button[@id='submit']");

	public By locName_Displayed = By.id("name");
	public By locEmail_Displayed = By.id("email");
	public By locCurrentAddress_Displayed = By.id("currentAddress");
	public By locPermanentAddress_Displayed = By.id("permanentAddress");

	public String getTextAfterSubmit(By elementLocator) {
		String fullText = testBase.getText(driver, elementLocator);
		String result = Utils.getSubStringFromCharacter(fullText, ":");// ghép chuỗi string với nhau
		return result;

	}

}
