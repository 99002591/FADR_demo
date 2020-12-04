package stepDefinition;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import utils.readJSON;

//import org.hamcrest.core.IsEqual;

//import static org.hamcrest.MatcherAssert.*;

public class loginAPI {

	String data;
	static ValidatableResponse response_all;
	String endpoint = "https://fadr-sec-afx-eus-dev.azurewebsites.net/api/v1/security/login";
	readJSON r_json = new readJSON();

	@Given("^Prepare \"([^\"]*)\" for Login API$")
	public void prepare_something_for_login_api(String requestbody) throws Exception {
		data = r_json.readJSONfile(requestbody);
	}

	@When("^POST request on Login API$")
	public void post_request_on_login_api() {
		response_all = (given().contentType("application/json").body(data).when().post(endpoint).then());
	}

	@Then("^Status code returned is \"([^\"]*)\"$")
	public void status_code_returned_is_something(int statuscode) {
		assertThat(response_all.extract().statusCode(), equalTo(statuscode));
		if(statuscode == 400) {
			assertThat(response_all.extract().statusLine(), equalTo("HTTP/1.1 "+statuscode+" Bad Request"));
		}
		else if(statuscode == 401) {
			assertThat(response_all.extract().statusLine(), equalTo("HTTP/1.1 "+statuscode+" Unauthorized"));
		}
	}

	@And("^Error code returned is \"([^\"]*)\"$")
	public void error_code_returned_is_something(String errorcode) {
		assertThat(response_all.extract().jsonPath().getString("errorCode"), equalTo(errorcode));
	}

	@And("^Response body returned is \"([^\"]*)\"$")
	public void response_body_returned_is_something(String errordescription) {
		assertThat(response_all.extract().jsonPath().getString("errorDescription"), equalTo(errordescription));
	}

}
