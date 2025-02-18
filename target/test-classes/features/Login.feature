Feature: Login Functionality
/* Run the test from TestRunner do not use feature file */

  @regression
  Scenario: Valid Login
    Given User enters valid username "standard_user" and password "secret_sauce"
    When User clicks the login button
    Then User should be redirected to the home page


  @regression
  Scenario: Invalid Login
    Given User enters invalid username "invalid_user" and password "invalid_password"
    When User clicks the login button
    Then User should see an error message "Epic sadface: Username and password do not match any user in this service"

