package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends Page {
	// Zoom In/Out screen
	public void zoomScreen() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom = '0.7'");
	}

	public PracticeFormPage(WebDriver dr) {
		super(dr);
	}

	public void inputFirstName(String firstName) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstName);
	}

	public void inputLastName(String lastName) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
	}

	public void inputEmail(String email) {
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(email);
	}

	public By getGender(String gender) {
		By result = null;
		if (gender.equalsIgnoreCase("Male")) {

			result = By.xpath("//input[@id='gender-radio-1']");

		} else if (gender.equalsIgnoreCase("Female")) {

			result = By.xpath("//input[@id='gender-radio-2']");

		} else {

			result = By.xpath("//input[@id='gender-radio-3']");

		}
		return result;

	}

	public void inputGender(String gender) {
		driver.findElement(getGender(gender)).click();
	}

	public void inputMobile(String mobileNumber) {
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(mobileNumber);
	}

	public void inputDateOfBirthYear(String year) {
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).sendKeys(year);

	}

	public void inputDateOfBirthMorth(String month) {
		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).sendKeys(month);

	}

	public void inputDateOfBirthDay() {
		driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, October 11th, 1990']")).click();

	}

	public void inputSubject(String inputSubject) {

		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys(inputSubject);
		List<WebElement> listItems = driver
				.findElements(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']"));
		inputSubject = listItems.get(0).getText();
		listItems.get(0).click();

	}

	public void selectHobbies() {
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		driver.findElement(By.xpath("//label[text()='Reading']")).click();

	}

	public void inputCurrentAddress(String curentAddress) {
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(curentAddress);
	}

	public void selectState(String state) {
		driver.findElement(By.xpath("//div[@class=' css-yk16xz-control']//div[@class=' css-1hwfws3']")).sendKeys(state);

	}

	public void selectCity(String city) {
		driver.findElement(By.xpath("//div[@id='city']//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']"))
				.sendKeys(city);

	}

	public void clickSubmit() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}

}
