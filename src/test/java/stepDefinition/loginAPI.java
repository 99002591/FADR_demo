package stepDefinition;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginAPI {
	
	FileReader fread;
	BufferedReader bread;
	String data;
	
	WebDriver driver;
	
    @Given("^Prepare \"([^\"]*)\" for Login API$")
    public void prepare_something_for_login_api(String requestbody) throws Throwable {
    	fread = new FileReader("/fadrdemo/src/test/resources/API_requests/"+ requestbody);
    	bread = new BufferedReader(fread);
    	data = bread.readLine();
        throw new PendingException();
    }

    @When("^POST request on Login API$")
    public void post_request_on_login_api() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "D:/Eclipse_Workspace/Selenium/WebDrivers/chromedriver.exe");
        throw new PendingException();
    }

    @Then("^Status code returned is \"([^\"]*)\"$")
    public void status_code_returned_is_something(String statuscode) throws Throwable {
        throw new PendingException();
    }

    @And("^Error code returned is \"([^\"]*)\"$")
    public void error_code_returned_is_something(String errorcode) throws Throwable {
        throw new PendingException();
    }

    @And("^Response body returned is \"([^\"]*)\"$")
    public void response_body_returned_is_something(String errordescription) throws Throwable {
        throw new PendingException();
    }

}
