Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario Outline: Login with uncorrect mail and password
    Given I navigate to LoginPage
    And I enter the <userMail> and <passWord>
    And I click login button
    Then I should see alert danger
    Examples:
      | userMail         | passWord      |
      |                  |               |
      | test123@test.com |               |
      | test.test.com    | test123       |
      | test123@test.com | wrongpassword |

  Scenario: Login with correct mail and password
    Given I navigate to LoginPage
    And I enter the mail "TestAutomatyczny123@gmail.com" and password "test123"
    And I click login button
    Then I should see my userName