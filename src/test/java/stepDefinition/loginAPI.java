package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginAPI {
    @Given("^Prepare \"([^\"]*)\" for Login API$")
    public void prepare_something_for_login_api(String requestbody) throws Throwable {
        throw new PendingException();
    }

    @When("^POST request on Login API$")
    public void post_request_on_login_api() throws Throwable {
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
