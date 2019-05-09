@Logout
Feature: logout

  Scenario:logout successfull
    Given I'm on espn home page " http://www.espn.com/?src=com&_adblock=true" already logged "pru3b100@1200.com" "pru3b100@1200"
    When Move cursor over icon user
    And Click on “Salir” link
    And Move cursor over user icon
    Then Validate welcome message