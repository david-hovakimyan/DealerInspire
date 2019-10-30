Feature: Dealer Inspire login feature

  @dealerInspire
  Scenario: Dealer Inspire login with invalid credentials
    Given User is on at https://conversations.dealerinspire.com
    When User attempts a login with invalid credentials
    Then Verify warning message displays as expected
    When User attempts to reset the password with an invalid username
    Then Verify warning message displays as expected and verify text color

