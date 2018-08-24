package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.Before;

public class Login extends TestBase {
	
	public TestBase test = new TestBase();
	

	@BeforeTest
	public  void launchBrowser() throws InterruptedException {
		 test.initialization();
		
	}
	@Test
	public void clickOnSignIn() throws InterruptedException {
		test.signin();
	}
	@Test
	public void enterTheUsername() throws InterruptedException {
		
		test.verifyUserName();
	}
	@Test
	public void clickContinue() {
		test.Continue();
	}
	@Test
	public void enterThePassword() throws InterruptedException {
		test.verifyPassword();
	}
	@Test
	public void submit() throws InterruptedException {
		test.signInClick();
	}
	@AfterTest
	public void passed() {
		test.success();
	}
}
	