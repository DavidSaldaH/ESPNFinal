@ESPN
Feature: Register
  As a client wants to register.

  @Register
  Scenario Outline:Successful register
    Given I'm on the ESPN home page " http://www.espn.com/?src=com&_adblock=true"
    When I click on Registrarse button
    And I fill in Name with "<Name>"
    And I fill in LastName with "<LastName>"
    And I fill in Email with "<Email>"
    And Fill in Password with "<Password>"
    And I click on Registrate button
    And I verify on User icon
    Then I should see the Welcome "username" message

    Scenarios:
      | Name    | LastName | Email           | Password    |
      | pru3b11 | 123      | pru3b11@123.com | pru3b11@123 |