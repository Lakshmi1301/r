Feature: Verifying Adactin Hotel Entire



Scenario: verifying on the valid credentials
Given User is on Adactin Hotel Page
When  User Enters the username and password
And   User Clicks the Login button
Then  User should  Verify the Successfull Message


Scenario: verifying on the invalid credentials
Given User is on Adactin Hotel Page
When  User should give the valid username and password
And   User Clicks the Login



Scenario: verifying on the invalid credentials
Given User is on Adactin Hotel Page
When  User  should give the invalid username and password
And   User Clicks the LogIn



Scenario: verifying on the invalid credentials
Given User is on Adactin Hotel Page
When  User Enters the username and password
And   User Clicks the Loginbtn

