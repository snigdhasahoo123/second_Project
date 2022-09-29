Feature: LoginPage
Scenario: Validating the Login functionality with valid username and password
Given User is on the Login Page
When User clicks the Login button after entering valid username and password
Then User should see the LMS Home page.