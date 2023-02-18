Feature: Login Functionality

  @validLogin
  Scenario: Login with valid credentials
    Given user is on the log in page
    When user enters valid username
    And user enters valid password
    And user clicks the log in button
    Then user should be able to login

  @validLoginWithParams
  Scenario: Login with valid credentials
    Given user is on the log in page
    When user enters valid username "Employee61"
    And user enters valid password "Employee123"
    And user clicks the log in button
    Then user should be able to login

  @validLoginWithInvalidParamsSceOutline
  Scenario Outline: Login with valid credentials
    Given user is on the log in page
    When user enters valid username "<username>"
    And user enters valid password "<password>"
    And user clicks the log in button
    Then user should not be able to login
    Examples:
      | username         | password    |
      | Employee61       | wrongbarf   |
      | Employee612wrong | Employee123 |
      | Employee61wrong  | barfwrong   |
      #| Employee61wrong  | barfwrong   |

  @validLoginWithInvalidParams
  Scenario: Login with valid credentials
    Given user is on the log in page
    When user enters valid username "Employee612"
    And user enters valid password "Employee123"
    And user clicks the log in button
    Then user should not be able to login

  @validLoginWithInvalidParams
  Scenario: Login with valid credentials
    Given user is on the log in page
    When user enters valid username " "
    And user enters valid password "Employee123"
    And user clicks the log in button
    Then user should not be able to login

