Feature: Login Functionality

  @validLogin
  Scenario: Login with valid credentials
    Given user is on the log in page
    When user enters valid username
    And user enters valid password
    And user clicks the log in button
    Then user should be able to login
