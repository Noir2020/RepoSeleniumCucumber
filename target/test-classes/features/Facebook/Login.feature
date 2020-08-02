@regression @login
Feature: Login feature

  # to put common prerequisites for all scenario
  # Background statements will run before every scenario run
#  Background:
#    Given I am on facebook landing page

  Scenario: Verify user get error for invalid credentials
    When I enter 'test@abcd.com' as username
    And I enter 'abcd@1234' as password
    And I click on login button
    Then I get invalid credentials error message

  Scenario: Verify user get error for invalid credentials - 2
    When I enter 'invalid@email.com' as username
    And I enter 'wrongPassword' as password
    And I click on login button
    Then I get invalid credentials error message

  @end2end @login1 @button
  Scenario Outline: Verify user get error for <email>
    When I enter '<email>' as username
    And I enter '<password>' as password
    And I click on login button
    Then I get invalid credentials error message

    Examples:
      |email             |password       |
      |test@gmail.com    |abcd@1234      |
      |invalid@email.com |wrongPassword  |

    # how to perform Data Driven testing in Cucumber - Scenario Outline with Examples

  @button @enable
  Scenario: Verify login and Sign Up buttons are enabled
    Then I verify login button is enabled
    And I verify SignUp button is enabled