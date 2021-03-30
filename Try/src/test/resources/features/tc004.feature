Feature: Register new user without password
  @RegressionTest
  Scenario: Validate that is not possible to submit a register without password
    Given I access the API to register user
    When I set the user "challenge@automation.com"
    Then I validate that the user is not created