Feature: Add user with job
  @RegressionTest
  Scenario: Add a new user with job
    Given I use user creation service
    When I set name "Toy"
    And I set job "singer"
    Then I validate my response is correct