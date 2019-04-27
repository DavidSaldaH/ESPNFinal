@Login
Feature: login
  As a regitered user
  I want to login.

  @Login1
  Scenario Outline:Succesful login
    Given I'm on the ESPN home page on url "www.ESPN.com"
    When I click on Registrar button
    And I fill in Username with "<Username>"
    And I fill in Password with "<Password>"
    And I click on Conctate button
    And I click on User icon
    Then I should see Welcome "username" message

    Scenarios:
      | Username | Password |
      | user123  | user@123 |