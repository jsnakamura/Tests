@OrderSummary
Feature: Order summary

  Scenario: I verify check order summary
    When I open automationpratice website
    And I select a t-shirt and proceed to checkout
    And I verify details on shopping cart summary page
    And I sign in
    #And I insert a new email and proceed to create an account
    #And I fill create account fields and submit
    And I verify address and proceed
    And I accept terms and proceed
    And I choose payment method check and proceed
    Then I verify check order summary and corfirm

  Scenario: Choose payment method bankwire and proceed
    When I open automationpratice website
    And I select a t-shirt and proceed to checkout
    And I verify details on shopping cart summary page
    And I sign in
    #And I insert a new email and proceed to create an account
    #And I fill create account fields and submit
    And I verify address and proceed
    And I accept terms and proceed
    Then I choose payment method bankwire and proceed
