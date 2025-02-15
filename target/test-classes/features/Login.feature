Feature: Login Functionality


  @regression
  Scenario: Valid Login
    Given User is on the login page
    When User enters valid username "standard_user" and password "secret_sauce"
    And User clicks the login button
    Then User should be redirected to the home page


  @regression
  Scenario: Invalid Login
    Given User is on the login page
    When User enters invalid username "invalid_user" and password "invalid_password"
    And User clicks the login button
    Then User should see an error message "Epic sadface: Username and password do not match any user in this service"

