package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends Page  {

	public FormPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
		

	
	public PracticeFormPage clickOnPraticeFormMenu() {
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		return new PracticeFormPage(driver);
	}
	

}
