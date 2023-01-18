package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitions {
	WebDriver driver ;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() 
	{
		driver = new ChromeDriver();
			driver.get(url);
	}
	
	
}