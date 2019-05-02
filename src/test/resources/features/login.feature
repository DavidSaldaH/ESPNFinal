@Login
Feature: login
  As a regitered user
  I want to login.

  @Login
  Scenario Outline:Successful login
    Given I'm on the ESPN home page on url " http://www.espn.com/?src=com&_adblock=true"
    When I click on Entrar button
    And I fill in Username with "<Username>"
    And I fill in Password with "<Password>"
    And I click on Conctate button
    And I click on User icon
    Then I should see Welcome "username" message

    Scenarios:
      | Username        | Password    |
      | pru3b11@123.com | pru3b11@123 |