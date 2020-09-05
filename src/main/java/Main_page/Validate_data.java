package Main_page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
//Test 2: Validate a user is not able to add a duplicated category. If it does then the following message will display: "The category you want to add already exists: <duplicated category name>."




public class Validate_data {
	WebDriver driver;
	Random rnd = new Random();

	public Validate_data(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.CSS, using = "input[name='categorydata']")

	WebElement AddCategory;

	@FindBy(how = How.XPATH, using = "//span[@id='extra']/child::input[@name='submit']")
	WebElement Submit;

	@FindBy(how = How.XPATH, using = "//body")
	WebElement Body;

	String input;

	public void Input() {
		input = "sun" + rnd.nextInt(999);
		//1st time passing
		AddCategory.sendKeys(input);
		Submit.click();
		//2nd time passing
		String duplicatedvalue = input;
		AddCategory.sendKeys(duplicatedvalue);
		Submit.click();
	}

	boolean valid = true;

	public void validation() {

		if (Body.getText().contains("The category you want to add already exists: " + input + ".")) {
			valid = true;
		}

		Assert.assertTrue(valid,"fail !!");
		
	}}




				
				
				
		