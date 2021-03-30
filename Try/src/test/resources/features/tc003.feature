Feature: Delete user
  @RegressionTest
  Scenario: Validate that it is possible to delete a user
    Given I access the API to delete user
    When I set user id "2"
    Then I validate that user was deleted