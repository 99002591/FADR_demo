package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginUI {


    @Given("^Open the browser$")
    public void open_the_browser() throws Throwable {
        throw new PendingException();
    }

    @When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_something_and_something(String email, String password, String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

    @When("^Remember Me button is (.+)$")
    public void remember_me_button_is(String button) throws Throwable {
        throw new PendingException();
    }

    @When("^Eye button is clicked (.+)$")
    public void eye_button_is_clicked(String times) throws Throwable {
        throw new PendingException();
    }

    @When("^Forgot password link is clicked$")
    public void forgot_password_link_is_clicked() throws Throwable {
        throw new PendingException();
    }

    @When("^Contact EATON support representative link is clicked$")
    public void contact_eaton_support_representative_link_is_clicked() throws Throwable {
        throw new PendingException();
    }

    @Then("^Login fails with error message \"([^\"]*)\"$")
    public void login_fails_with_error_message_something(String errormessage, String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^Verify if username field on login page is (.+)$")
    public void verify_if_username_field_on_login_page_is(String usernamefield) throws Throwable {
        throw new PendingException();
    }

    @Then("^Password should be (.+)$")
    public void password_should_be(String visibility) throws Throwable {
        throw new PendingException();
    }

    @Then("^Redirect to Forgot password page$")
    public void redirect_to_forgot_password_page() throws Throwable {
        throw new PendingException();
    }

    @Then("^Help section dialog box opens up$")
    public void help_section_dialog_box_opens_up() throws Throwable {
        throw new PendingException();
    }

    @And("^navigate to the FADR Login page$")
    public void navigate_to_the_fadr_login_page() throws Throwable {
        throw new PendingException();
    }

    @And("^User clicks Login button$")
    public void user_clicks_login_button() throws Throwable {
        throw new PendingException();
    }

    @And("^User clicks the logout button$")
    public void user_clicks_the_logout_button() throws Throwable {
        throw new PendingException();
    }
}
