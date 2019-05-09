@Deactivate
Feature: Deactivate

  Scenario:Deactivate successful
    Given On espn page "http://www.espn.com/?src=com&_adblock=true" already logged "pru3b333@333.com" "pru3b333@333"
    When Click on user icon
    And Click() on “Perfil de ESPN” button
    When Click() on “Eliminar cuenta” Link
    And Click() on “Sí, eliminar esta cuenta.” button
    And Click() on “Ok” button
    And Put cursor over icon user
    Then I should see the default welcome message