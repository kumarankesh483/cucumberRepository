package StepDefinitions;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public WebDriver driver;
	@Given("^User is on the landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Java and Selenium learning\\eclipse_workspace\\CucumberProject\\global.properties");
		
		prop.load(fis);
		
	   driver=Base.getDriver();
	   driver.get(prop.getProperty("URL"));

	}

	@When("^user enter the \"([^\"]*)\" name and click on the search button$")
	public void user_enter_the_name_and_click_on_the_search_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^item should be displayed$")
	public void item_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
