$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/IMR05.feature");
formatter.feature({
  "name": "To test the functionality of IMR05 program",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test the stepwise process of program IMR05",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@selectdistrict20"
    },
    {
      "name": "@t"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navigate by program menu",
  "keyword": "When "
});
formatter.match({
  "location": "IMR05StepDefinition.navigate_by_program_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Item number",
  "keyword": "And "
});
formatter.match({
  "location": "IMR05StepDefinition.enter_Item_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Update button",
  "keyword": "Then "
});
formatter.match({
  "location": "IMR05StepDefinition.user_Update_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Item subclass",
  "keyword": "Then "
});
formatter.match({
  "location": "IMR05StepDefinition.enter_Item_subclass()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Press Enter\u003dupdate button",
  "keyword": "Then "
});
formatter.match({
  "location": "IMR05StepDefinition.press_Enter_update_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "press End button",
  "keyword": "Then "
});
formatter.match({
  "location": "IMR05StepDefinition.press_End_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("To test the stepwise process of program IMR05");
formatter.after({
  "status": "passed"
});
});