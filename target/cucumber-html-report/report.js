$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/OrderConfirmation.feature");
formatter.feature({
  "line": 2,
  "name": "Confirm the order",
  "description": "",
  "id": "confirm-the-order",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OrderConfirmation"
    }
  ]
});
formatter.before({
  "duration": 10133882900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I verify check order summary",
  "description": "",
  "id": "confirm-the-order;i-verify-check-order-summary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open automationpratice website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I select a t-shirt and proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify details on shopping cart summary page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I sign in",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#And I insert a new email and proceed to create an account"
    },
    {
      "line": 10,
      "value": "#And I fill create account fields and submit"
    }
  ],
  "line": 11,
  "name": "I verify address and proceed",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I accept terms and proceed",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I choose payment method check and proceed",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify check order summary and corfirm",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify order confirmation page an verify success message",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenAutomationPracticeSteps.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 5714324300,
  "status": "passed"
});
formatter.match({
  "location": "SelectAndCheckoutProductSteps.i_select_a_t_shirt_and_proceed_to_checkout()"
});
formatter.result({
  "duration": 7987657700,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSummarySteps.i_verify_details_on_shopping_cart_summary_page()"
});
formatter.result({
  "duration": 2044151400,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationSteps.i_sign_in()"
});
formatter.result({
  "duration": 1912173600,
  "status": "passed"
});
formatter.match({
  "location": "VerifyAdressSteps.i_verify_details_on_shopping_cart_summary_page()"
});
formatter.result({
  "duration": 1300445700,
  "status": "passed"
});
formatter.match({
  "location": "ShippingServiceSteps.i_verify_details_on_shopping_cart_summary_page()"
});
formatter.result({
  "duration": 1516975900,
  "status": "passed"
});
formatter.match({
  "location": "PaymentMethodSteps.I_choose_payment_method_check_and_proceed()"
});
formatter.result({
  "duration": 1180403500,
  "status": "passed"
});
formatter.match({
  "location": "OrderSummarySteps.I_verify_check_order_summary_and_corfirm()"
});
formatter.result({
  "duration": 2857975400,
  "status": "passed"
});
formatter.match({
  "location": "OrderConfirmationSteps.i_verify_order_summary_page_and_proceed()"
});
formatter.result({
  "duration": 75077500,
  "status": "passed"
});
formatter.after({
  "duration": 1079550300,
  "status": "passed"
});
});