@Login
Feature: Login

  @login-valid
  Scenario Outline: Login with valid email and valid password
    Given I am on the login page
    When I input "<email>" and "<password>" on email field
    And I click login button
    Then I am on the home page
    Examples:
      |email|password|
      |alex@email.com|123123123|
      |Diana@gmail.com|123Diana|
      |syifa@gmail.com|syifacantik|
      |ricky2        |ricky345 |

  @login-invalid
  Scenario Outline: Login with invalid data
    Given I am on the login page
    When I input "<email>" and "<password>" on email field
    And I click login button
    Then I am get "<errormessage>" error message
    Examples:
      |email            |password |errormessage |
      |carvey@gmail.com |car123vey|invaliddata  |
      |||messagekosong |
      ||5574r23333|messageemail  |
      |dana@mail.com||messagepassword |


