package stepDefinition;

import static io.restassured.RestAssured.given;

import REST.readJSON;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

//import org.hamcrest.core.IsEqual;

//import static org.hamcrest.MatcherAssert.*;

public class loginAPI {

	String data;
	static ValidatableResponse response_all;	
	String endpoint = "https://fadr-sec-afx-eus-dev.azurewebsites.net/api/v1/security/login";
	readJSON r_json = new readJSON();

	
    @Given("^Prepare \"([^\"]*)\" for Login API$")
    public void prepare_something_for_login_api(String requestbody) throws Exception{
    	data = r_json.readJSONfile(requestbody);
    	System.out.println(" ");
    	System.out.println(data);
    }

    @When("^POST request on Login API$")
    public void post_request_on_login_api() {
    	response_all = (given().
    	    	contentType("application/json")
    	    	.body(data)    	
    	    	.when().
    	    	post(endpoint).then());
    	System.out.println("statuscode" + response_all.extract().statusCode());
    	System.out.println(response_all.extract().asString());
    }

    @Then("^Status code returned is \"([^\"]*)\"$")
    public void status_code_returned_is_something(String statuscode){
    	
    }

    @And("^Error code returned is \"([^\"]*)\"$")
    public void error_code_returned_is_something(String errorcode){
//    	Integer.parseInt(errorcode);
//    	assertThat(response_all.extract().response().path("errorcode"), is(equalTo(errorcode)));
//    	assertThat(response_all.extract().response().body().path("errorCode"), is(errorcode));
//    	JsonPath js = new JsonPath(response_all.toString());
//    	int error_code = (js.getString("errorCode"));
    	assertThat(response_all.extract().body().asString().pa, equalTo(errorcode));

    	}

    @And("^Response body returned is \"([^\"]*)\"$")
    public void response_body_returned_is_something(String errordescription){
    }

}
