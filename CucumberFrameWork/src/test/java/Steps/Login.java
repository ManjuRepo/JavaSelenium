package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step - 1");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step - 2");
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step - 3");
		
	}

	@Then("The user is navigated to Home page")
	public void the_user_is_navigated_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step - 4");
		
	}
}
