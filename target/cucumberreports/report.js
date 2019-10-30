$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/dealerInspire.feature");
formatter.feature({
  "name": "Dealer Inspire login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Dealer Inspire login with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dealerInspire"
    }
  ]
});
formatter.step({
  "name": "User is on at https://conversations.dealerinspire.com",
  "keyword": "Given "
});
formatter.match({
  "location": "DealerInspire_Steps.user_is_on_at_https_conversations_dealerinspire_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User attempts a login with invalid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "DealerInspire_Steps.user_attempts_a_login_with_invalid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify warning message displays as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "DealerInspire_Steps.verify_warning_message_displays_as_expected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User attempts to reset the password with an invalid username",
  "keyword": "When "
});
formatter.match({
  "location": "DealerInspire_Steps.user_attempts_to_reset_the_password_with_an_invalid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify warning message displays as expected and verify text color",
  "keyword": "Then "
});
formatter.match({
  "location": "DealerInspire_Steps.verify_warning_message_displays_as_expected_and_verify_text_color()"
});
formatter.result({
  "status": "passed"
});
});