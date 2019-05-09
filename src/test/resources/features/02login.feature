@Login
Feature: login
  As a regitered user
  I want to login.

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
      | pru3b100@1200.com | pru3b100@1200 |