package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginUI{
	WebDriver driver = Hooks.driver;
	
	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_something_and_something(String email, String password) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println(email + ".." + password);
		throw new PendingException();
	}

	@When("^Remember Me button is (.+)$")
	public void remember_me_button_is(String button) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/div")).click();
		throw new PendingException();
	}

	@When("^Eye button is clicked (.+)$")
	public void eye_button_is_clicked(String times) throws Throwable {
		if(times == "unchecked") {
			System.out.println("Password masked");
			driver.findElement(By.xpath("/html/body/my-app/app-login/div/mat-card/form/mat-form-field[2]/div/div[1]/div[2]/mat-icon")).click();
			//Assert for masked password
		}
		else {
			System.out.println("Password unmasked");
			//Click the eye button and then assert for unmasked password
		}
		throw new PendingException();
	}

	@When("^Forgot password link is clicked$")
	public void forgot_password_link_is_clicked() throws Throwable {
		driver.findElement(By.xpath("Forgot your password")).click();
		throw new PendingException();
	}

	@When("^Contact EATON support representative link is clicked$")
	public void contact_eaton_support_representative_link_is_clicked() throws Throwable {
		driver.findElement(By.linkText(" Contact an Eaton Support Representative ")).click();
		throw new PendingException();
	}

	@Then("^Login fails with error message \"([^\"]*)\"$")
	public void login_fails_with_error_message_something(String errormessage) throws Throwable {
		String actual = driver.findElement(By.xpath("//*[@id=\"mat-error-3\"]")).getText();
		Assert.assertEquals(actual, errormessage);
		throw new PendingException();
	}

	@Then("^Verify if username field on login page is (.+)$")
	public void verify_if_username_field_on_login_page_is(String usernamefield) throws Throwable {
		System.out.println("Username field"+usernamefield);
		throw new PendingException();
	}

	@Then("^Password should be (.+)$")
	public void password_should_be(String visibility) throws Throwable {
		System.out.println("password visibility");
		throw new PendingException();
	}

	@Then("^Redirect to Forgot password page$")
	public void redirect_to_forgot_password_page() throws Throwable {
		driver.findElement(By.linkText("Forgot your password")).click();
		throw new PendingException();
	}

	@Then("^Help section dialog box opens up$")
	public void help_section_dialog_box_opens_up() throws Throwable {
		throw new PendingException();
	}

	@And("^User clicks Login button$")
	public void user_clicks_login_button() throws Throwable {
		System.out.println("Login Click");
		driver.findElement(By.xpath("/html/body/my-app/app-login/div/mat-card/form/div[1]/button/span")).click();
		throw new PendingException();
	}

	@And("^User clicks the logout button$")
	public void user_clicks_the_logout_button() throws Throwable {
		System.out.println("LOG OUT");
		throw new PendingException();
	}

}
