@Logout
Feature: logout

  Scenario:logout successfull
    Given I'm on espn home page " http://www.espn.com/?src=com&_adblock=true" already logged "pru6b346@333.com" "pru5b333@333"
    When Click on user icon
    And Click on “Salir” link
    And I verify on User icon
    Then Validate welcome message