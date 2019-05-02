@ESPN
Feature: Deactivate

  @Deactivate
  Scenario Outline: Deactivate successful
    Given On espn page "http://www.espn.com/?src=com&_adblock=true" already logged
    When Click on user icon
    And Click() on “Perfil de ESPN” button
    Then Validate “Perfil de ESPN” modal
    When Click() on “Eliminar cuenta” Link
    And Click() on “Sí, eliminar esta cuenta.” button
    And Put cursor over icon user
    Then I should see the default welcome message
    Examples: