package common;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	/**
	 * This is a class which contain all common handlings related to selenium
	 */
	public WebDriver driver;

//	public TestBase(WebDriver dr) {
//		super();
//		this.driver = dr;
//	}

	public void openWebWithSingeBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\1Auto2023\\05Project\\03Git\\SeleniumAutomation\\SeleniumWithMaven\\test_driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// Todo

		} else if (browserName.equalsIgnoreCase("edge")) {
			// Todo
		}
		driver.get("https://demoqa.com/");
		// Chờ Mặc Định(fix cứng chờ đúng time set) time là 3s
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();

	}

	public void inputText(WebDriver dr, String inputData, By elementLocator) {
		// Explicit wait: chờ đến khi element hiển thị thì clear data
		WebElement element = waitForDisplay(dr, 10, elementLocator);

		element.clear();
		element.sendKeys(inputData);
	}

	// Left click
	public void click(WebDriver dr, By elementLocator) {
		WebElement element = waitForDisplay(dr, 3, elementLocator);
		element.click();

	}
	public String getText(WebDriver dr, By elementLocator) {
		WebElement element = waitForDisplay(dr, 3, elementLocator);
		String result = element.getText();
		return result;
	}

	public WebElement waitForDisplay(WebDriver dr, long timeOutInSecond, By elementLocator) {
		WebElement element = new WebDriverWait(dr, Duration.ofSeconds(timeOutInSecond))
				.until(newDriver -> dr.findElement(elementLocator));
		return element;

	}

}
