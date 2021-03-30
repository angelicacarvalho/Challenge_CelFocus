Feature: Delete user
  @RegressionTest
  Scenario: Validate that it is possible to delete a user
    Given I access the API
    When I set user id "2"
    Then I validate that user was deleted