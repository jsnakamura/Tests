@AdressValidation
Feature: Verify Address and proceed

  Scenario: I verify delivery and billing address and proceed
    When I open automationpratice website
    And I select a t-shirt and proceed to checkout
    And I verify details on shopping cart summary page
    And I sign in
    #And I insert a new email and proceed to create an account
    #And I fill create account fields and submit
    Then I verify address and proceed
