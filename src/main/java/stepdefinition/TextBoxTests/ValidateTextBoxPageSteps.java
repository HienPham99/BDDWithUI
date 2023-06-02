package stepdefinition.TextBoxTests;

import static org.testng.Assert.assertEquals;

import common.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class ValidateTextBoxPageSteps {
	TextBoxPage textBoxPage;
	TestBase testBase = new TestBase();
	String inputFullName = "Hien";
	String inputEmailName = "hien@gmail.com";
	String inputCurrentAddress = "Đông Anh";
	String inputPermanentAddress = "Hà nội - Việt Nam";

	@Given("User is in TextBox screen")
	public void user_is_in_text_box_screen() {

		testBase.openWebWithSingeBrowser("chrome");
		HomePage homePage = new HomePage(testBase.driver);
		ElementsPage elementsPage = homePage.clickOnElementsMenu();
		textBoxPage = elementsPage.clickOnTextBoxMenu();
	}

	@When("Input all valid data to all fields")
	public void input_all_valid_data_to_all_fields() {

		textBoxPage.testBase.inputText(testBase.driver, inputFullName, textBoxPage.locFullName);
		textBoxPage.testBase.inputText(testBase.driver, inputEmailName, textBoxPage.locEmailName);
		textBoxPage.testBase.inputText(testBase.driver, inputCurrentAddress, textBoxPage.locCurrentAddress);
		textBoxPage.testBase.inputText(testBase.driver, inputPermanentAddress, textBoxPage.locPermanentAddress);
	}

	@When("Click in Submit")
	public void click_in_submit() {
		textBoxPage.testBase.click(testBase.driver, textBoxPage.locSubmit);

	}

	@Then("All value are display in text")
	public void all_value_are_display_in_text() {
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locName_Displayed), inputFullName);
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locEmail_Displayed), inputEmailName);
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locCurrentAddress_Displayed), inputCurrentAddress);
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locPermanentAddress_Displayed), inputPermanentAddress);

	}

	@When("Input email without @")
	public void input_email_without() {
		String inputEmailName = "hiengmail.com";
		textBoxPage.testBase.inputText(testBase.driver, inputEmailName, textBoxPage.locEmailName);

	}

	@When("Input valid data to other fields")
	public void input_valid_data_to_other_fields() {
		String inputFullName = "Hien";
		String inputCurrentAddress = "Đông Anh";
		String inputPermanentAddress = "Hà nội - Việt Nam";
		textBoxPage.testBase.inputText(testBase.driver, inputFullName, textBoxPage.locFullName);
		textBoxPage.testBase.inputText(testBase.driver, inputCurrentAddress, textBoxPage.locCurrentAddress);
		textBoxPage.testBase.inputText(testBase.driver, inputPermanentAddress, textBoxPage.locPermanentAddress);

	}

	@Then("Red border is displayed, input data is not saved")
	public void red_border_is_displayed_input_data_is_n_t_saved() {
		

	}

}
