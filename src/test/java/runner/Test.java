package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features="Features",glue={"stepDefinitions"})	
public class Test extends  AbstractTestNGCucumberTests {

}
