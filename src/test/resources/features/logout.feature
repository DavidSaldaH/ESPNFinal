@ESPN
Feature: logout

  @Loguot
  Scenario Outline: logout successfull
    Given I'm on espn home page " http://www.espn.com/?src=com&_adblock=true" already logged
    When Move cursor over icon user
    And Click on “Salir” link
    And Move cursor over user icon
    Then Validate welcome message
    Examples:
      |  |