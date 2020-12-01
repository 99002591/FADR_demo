#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag 
Feature: Login with UI 
	I want to login
  As Admin

Background: 
	Given Open the browser 
	And navigate to the FADR Login page 
	
Scenario Outline: Login with incorrect credentails 
	When Enter "<email>" and "<password>" 
	And User clicks Login button 
	Then Login fails with error message "<error_message>" 
	
	Examples: 
		| email                          | password           | error_message                          | 
		| "admin@eaton.com"              | "valid password"   | "Invalid Email or Password"            | 
		| "fadr_support_admin@eaton.com" | "invalid password" | "Invalid Email or Password"            | 
		| "admin@eaton"                  | "valid password"   | "E-mail must be a valid email address" | 
		
Scenario Outline: Login with invalid format and blank credentials 
	When Enter "<email>" and "<password>" 
	And User clicks Login button 
	Then Login fails with error message "<error_message>" 
	
	Examples: 
		| email                          | password         | error_message          | 
		| "fadr_support_admin@eaton.com" |                  | "Password is required" | 
		|                                | "valid password" | "E-mail is required"   | 
		|                                |                  | "E-mail is required"   | 		
Scenario Outline: Remember Me button 
	When Enter "<email>" and "<password>" 
	When Remember Me button is <button> 
	And User clicks Login button 
	And User clicks the logout button 
	Then Verify if username field on login page is <username field> 
	
	Examples: 
		| button    | username field | email                        | password      | 
		| unchecked | not autofilled | fadr_support_admin@eaton.com | validpassword | 
		| checked   | autofilled     | fadr_support_admin@eaton.com | validpassword | 
		
Scenario Outline: Password masking and unmasking 
	When Enter "<email>" and "<password>" 
	When Eye button is clicked <times> 
	Then Password should be <visibility> 
	
	Examples: 
		| times | visibility | email                        | password           | 
		| once  | unmasked   | fadr_support_admin@eaton.com | somerandompassword | 
		| twice | masked     | fadr_support_admin@eaton.com | somerandompassword | 
		
Scenario: Forgot password 
	When Forgot password link is clicked 
	Then Redirect to Forgot password page 
	
Scenario: Contact EATON support 
	When Contact EATON support representative link is clicked 
	Then Help section dialog box opens up 
