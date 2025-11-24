Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters valid username and password
    Then user should be redirected to the homepage

  Scenario: Login fails with invalid credentials
    Given user is on the login page
    When user enters invalid username and password
    Then user should see an error message

