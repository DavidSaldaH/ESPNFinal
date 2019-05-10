@Deactivate
Feature: Deactivate

  Scenario:Deactivate successful
    Given I'm on espn home page " http://www.espn.com/?src=com&_adblock=true" already logged "pru6b346@333.com" "pru5b333@333"
    When Click on user icon
    And Click() on “Perfil de ESPN” button
    When Click() on “Eliminar cuenta” Link
    And Click() on “Sí, eliminar esta cuenta.” button
    And I'm verify on User icon
    Then I should see the default welcome message