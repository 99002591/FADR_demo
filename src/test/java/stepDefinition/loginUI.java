package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginUI{
	WebDriver driver = Hooks.driver;
	
	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_email_and_password(String email, String password){
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	/*
	 * Not implemented
	 */
	@When("^Remember Me button is (.+)$")
	public void clicking_remember_me_button(String button) {
		driver.findElement(By.xpath("//div[@class=\"mat-checkbox-inner-container\"]")).click();
	}

	@When("^Eye button is clicked (.+)$")
	public void clicking_eye_button(String times) {
		if(times.equals("once")) {
			driver.findElement(By.xpath("//mat-icon[@class='matIcon mat-icon notranslate material-icons mat-icon-no-color']")).click();
		}
		else if(times.equals("twice")) {
			driver.findElement(By.xpath("//mat-icon[@class='matIcon mat-icon notranslate material-icons mat-icon-no-color']")).click();
			driver.findElement(By.xpath("//mat-icon[@class='matIcon mat-icon notranslate material-icons mat-icon-no-color']")).click();
		}
	}

	@When("^Forgot password link is clicked$")
	public void forgot_password_link_is_clicked() {
		driver.findElement(By.xpath("//a[@class='forgot-password']")).click();
	}

	@When("^Contact EATON support representative link is clicked$")
	public void contact_eaton_support_representative_link_is_clicked() {
		driver.findElement(By.xpath("//a[@class='contact-eaton']")).click();
	}
	
	@Then("^Login fails with error message \"([^\"]*)\"$")
	public void login_fails_with_error_message(String errormessage) throws InterruptedException {
		Thread.sleep(5000);
		String actual = driver.findElement(By.xpath("//*[@class=\"mat-error ng-star-inserted\"]")).getText();
		Assert.assertEquals(actual, errormessage);
	}

	/*
	 * Not implemented
	 */
	@Then("^Verify if username field on login page is (.+)$")
	public void autofill_username_field(String usernamefield) {
		System.out.println("Username field"+usernamefield);
	}
	
	
	@Then("^Password should be (.+)$")
	public void password_masking(String visibility) {
		if(visibility.equals("unmasked")) {
			String actual = driver.findElement(By.xpath("//mat-icon[@class='matIcon mat-icon notranslate material-icons mat-icon-no-color']")).getText();
			String expected = "visibility";
			Assert.assertEquals(actual, expected);
		}
		else if(visibility.equals("masked")) {
			String actual = driver.findElement(By.xpath("//mat-icon[@class='matIcon mat-icon notranslate material-icons mat-icon-no-color']")).getText();
			String expected = "visibility_off";
			Assert.assertEquals(actual, expected);
		}
	}

	@Then("^Redirect to Forgot password page$")
	public void redirect_to_forgot_password_page() {
		String actual = driver.findElement(By.xpath("//*[@class=\"mat-card-title\"]")).getText();
		String expected = "Forgot Password";
		Assert.assertEquals(actual, expected);
	}

	@Then("^Help section dialog box opens up$")
	public void help_section_dialog_box_opens_up() {
		String actual = driver.findElement(By.xpath("//h6[contains(text(),'General Questions')]")).getText();
		String expected = "General Questions";
		Assert.assertEquals(actual, expected);
	}

	@And("^User clicks Login button$")
	public void user_clicks_login_button() {
		driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
	}

	/*
	 * Not Implemented
	 */
	@And("^User clicks the logout button$")
	public void user_clicks_the_logout_button() {
		System.out.println("LOG OUT");
	}
}
