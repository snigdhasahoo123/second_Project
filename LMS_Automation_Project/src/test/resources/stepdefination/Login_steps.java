package stepdefination;

import driver_actions.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_page;

public class Login_steps {
	Login_page loginpage = new Login_page(Driverfactory.getDriver());

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {

		Driverfactory.getDriver().get("https://lms-frontend-phase2.herokuapp.com/login");

		String title = loginpage.getloginpagetitle();
		System.out.println(title);

	}

	@When("User clicks the Login button after entering valid username and password")
	public void user_clicks_the_login_button_after_entering_valid_username_and_password() {
		loginpage.logincred("un", "pwd");
	}

	@Then("User should see the LMS Home page.")
	public void user_should_see_the_lms_home_page() {
		boolean logotestofhome = loginpage.Logotest();

		System.out.println("user can see the homepage");
	}

}
