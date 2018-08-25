package pages;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class TestBase {

	
	 static WebDriver driver;
	 static Properties prop;
 public TestBase() {
	 try {
		 prop = new Properties();
		 FileInputStream fis = new FileInputStream("C:\\Users\\sandy\\eclipse-workspace\\SeleniumMaven\\src\\test\\resources\\properties\\Config.properties");
	prop.load(fis);
	 }catch(IOException e) {
		 e.getMessage();
	 }
 }
	 public void initialization() {
		 String browsername = prop.getProperty("browser");
		 
		 if(browsername.equals("Chrome")) {
			 System.setProperty( "webdriver.chrome.driver", "C:\\Users\\sandy\\Desktop\\QAPractice\\chromedriver.exe");
	   	  driver = new ChromeDriver();	
	   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 
		  }else if (browsername.equals("FF")) { 
			// System.setProperty( "webdriver.gecko.driver", "C:\\Users\\sandy\\Desktop\\QAPractice\\geckodriver.exe");
             
				driver = new FirefoxDriver();
				 }
		 
		 driver.get(prop.getProperty("url"));
	 }
	 public void signin() throws InterruptedException {
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).click().build().perform();
			Thread.sleep(5000);
			
		}
	public void verifyUserName() throws InterruptedException {
		driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("name"));
		Thread.sleep(5000);
	}
	public void Continue() {
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}
	public void verifyPassword() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(prop.getProperty("Pwd"));
		Thread.sleep(5000);
	}
	public void signInClick() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(5000);
	}
	public void success() {
		System.out.println("Test Passed");
	}
}
