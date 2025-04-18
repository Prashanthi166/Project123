package Stepdefination;

import Allpages.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepdefination extends loginpage
{

	@Given("user is on login page")
	public static void user_is_on_login_page()
	{
		application_lanuch(brower,url);
		
	}
	
	
	
	@When("^user enters valid Pusername\"([^\"]*)\"$")
	public static void user_enters_valid_username(String username)
	{
		InputEMail(username);
	}
	
	@And("^user enters valid Ppassword\"([^\"]*)\"$")
	public static void user_enters_valid_password(String password)
	{
		Inputpassword(password);
	}
	
	
	
	@When("user enters valid username{string}")
	public static void user_enters_validusername(String username)
	{
		InputEMail(username);
	}
	
	@And("user enters valid password{string}")
	public static void user_enters_validpassword(String password)
	{
		Inputpassword(password);
	}
	
	@And("clicks on submit button")
	public static void clicks_submit_button()
	{
		Button_login();
	}
	
}
