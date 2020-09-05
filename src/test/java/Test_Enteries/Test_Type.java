package Test_Enteries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Main_page.Validate_data;
import browser_page.Launch_browser;

public class Test_Type {
	WebDriver driver;
	Launch_browser browser;

	Validate_data data;
	@Test
	public void browser() {
		driver=Launch_browser.Launch();
//		Main_Data data=PageFactory.initElements(driver, Main_Data .class);
//		data.Entries("solo");
//		data.submit();
		Validate_data AllData= PageFactory.initElements(driver,Validate_data.class);
		
		AllData.Input();
		AllData.validation();
		
		
		
		
		
		
	}
	

}
