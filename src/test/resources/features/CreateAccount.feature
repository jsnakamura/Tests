@CreateAccount
Feature: Fill account fields and submit

  Scenario: Fill create account fields and submit
    When I open automationpratice website
    And I select a t-shirt and proceed to checkout
    And I verify details on shopping cart summary page
    And I insert a new email and proceed to create an account
    Then I fill create account fields and submit
