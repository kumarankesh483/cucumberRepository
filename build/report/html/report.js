$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/rahulAcademy.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase of the product",
  "description": "",
  "id": "purchase-of-the-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "login and buy product",
  "description": "",
  "id": "purchase-of-the-product;login-and-buy-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter the \"vegetable\" name and click on the search button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "item should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_landing_page()"
});
formatter.result({
  "duration": 12272092407,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vegetable",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_name_and_click_on_the_search_button(String)"
});
formatter.result({
  "duration": 10103691,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.item_should_be_displayed()"
});
formatter.result({
  "duration": 69514,
  "status": "passed"
});
});