Feature: Product Subscription
  @RegressionTest
  Scenario: Calculate the price of a full special support plan for 6 months
    Given I open Chrome and launch the application
    When I select type "Special"
    And I select support plan "Full"
    And I write monthly duration of "6"
    And I click in calculate price button
    Then I validate price is "2249.10 $"
    And I close Chrome