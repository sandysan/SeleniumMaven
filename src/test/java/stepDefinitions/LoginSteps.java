package stepDefinitions;
import cucumber.api.PendingException;
import cucumber.runtime.CucumberException;
import org.testng.TestNGException;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;
import pages.TestBase;

public class LoginSteps extends Login {
	//TestBase test  = new TestBase();
	Login login = new Login();
//Login login;
	@Given("^User should launch Browser$")
	public void user_should_launch_Browser() throws TestNGException {
	   
		test.initialization();
	   // throw new PendingException();
	}

	@And("^Click on SignIn Button$")
	public void Click_on_SignIn_Button()  throws InterruptedException {
		// login = new Login();
		test.signin();
		//login.clickOnsignin();
	//	test.signin();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	    
	}

	@When("^User Enter the username$")
	public void user_Enter_the_Username() throws InterruptedException  {
	//login.enterTheUsername();
	login.verifyUserName();
	
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("^Click on continue button$")
	public void click_on_continue_button() throws InterruptedException {
		login.clickContinue();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enter the Password$")
	public void user_should_enter_Password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		login.verifyPassword();
	    
	}

	@And("^Click on Submit Button$")
	public void click_on_Submit_Button() throws InterruptedException {
		login.signInClick();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^User should login Successfully$")
	public void user_should_login_Successfully()  {
	  login.success();
	   
	}


}
