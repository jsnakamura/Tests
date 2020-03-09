Feature: Shopping Cart summary page verification

  Scenario: Verify shopping cart summary page
    When I open automationpratice website
    And I select a t-shirt and proceed to checkout
    Then I verify details on shopping cart summary page
