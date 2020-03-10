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
  "duration": 9635531600,
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
  "comments": [
    {
      "line": 8,
      "value": "#And I sign in"
    }
  ],
  "line": 9,
  "name": "I insert a new email and proceed to create an account",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I fill create account fields and submit",
  "keyword": "And "
});
formatter.step({
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
  "duration": 7872734100,
  "status": "passed"
});
formatter.match({
  "location": "SelectAndCheckoutProductSteps.i_select_a_t_shirt_and_proceed_to_checkout()"
});
formatter.result({
  "duration": 10413424000,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSummarySteps.i_verify_details_on_shopping_cart_summary_page()"
});
formatter.result({
  "duration": 1888257600,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationSteps.i_insert_a_new_email_and_proceed_to_create_an_account()"
});
formatter.result({
  "duration": 268381000,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSteps.I_fill_create_account_fields_and_submit()"
});
formatter.result({
  "duration": 5998086900,
  "status": "passed"
});
formatter.match({
  "location": "VerifyAdressSteps.i_verify_details_on_shopping_cart_summary_page()"
});
formatter.result({
  "duration": 1419589200,
  "status": "passed"
});
formatter.match({
  "location": "ShippingServiceSteps.i_verify_details_on_shopping_cart_summary_page()"
});
formatter.result({
  "duration": 1311994200,
  "status": "passed"
});
formatter.match({
  "location": "PaymentMethodSteps.I_choose_payment_method_check_and_proceed()"
});
formatter.result({
  "duration": 1141058700,
  "status": "passed"
});
formatter.match({
  "location": "OrderSummarySteps.I_verify_check_order_summary_and_corfirm()"
});
formatter.result({
  "duration": 2808041800,
  "status": "passed"
});
formatter.match({
  "location": "OrderConfirmationSteps.i_verify_order_summary_page_and_proceed()"
});
formatter.result({
  "duration": 84736600,
  "status": "passed"
});
formatter.after({
  "duration": 1098794000,
  "status": "passed"
});
});