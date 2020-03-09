@Authentication
Feature: Insert email to create account

  Scenario: Insert email and proceed to create a new account
    When I open automationpratice website
    And I select a t-shirt and proceed to checkout
    And I verify details on shopping cart summary page
    Then I insert a new email and proceed to create an account
