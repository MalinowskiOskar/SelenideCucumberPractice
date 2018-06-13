Feature: RegistrationFeature
This feature deals with the registration functionality of the application

#  Scenario: Registration with correct parameters
#    Given user navigate to RegistrationPage
#    And user enter firstName Test surname Automatyczny
#    And user enter phoneNumber 1234567890, userName TestAutomatycznyPrzykladCucumber eMail TestAutomatycznyPrzykladCucumber@test.com
#    And user enter passWord Test1234 confirmpassWord Test1234
#    When user click marialStatus and Hobby
#    Then marialStatus and Hobby should be checked
#    When user click SubmitButton
#    Then user should see successmessege

  Scenario Outline: Registration with invalid parameters
    Given user navigate to RegistrationPage
    And user enter firstName <firstName> surname <lastName>
    And user enter phoneNumber <phoneNumber>, userName <userName> eMail <eMail>
    And user enter passWord <passWord> confirmpassWord <confirmpassWord>
    When user click marialStatus and Hobby
    Then marialStatus and Hobby should be checked
    When user click SubmitButton
    Then user should see error
    Examples:
      | firstName | lastName     | phoneNumber | userName                         | eMail                                     | passWord | confirmpassWord |
      |           |              |             |                                  |                                           |          |                 |
      | Test      | Automatyczny | 123         | TestAutomatycznyPrzykladCucumber | TestAutomatycznyPrzykladCucumber@test.com | Test1234 | Test1234        |
      | Test      | Automatyczny | 1234567890  | TestAutomatycznyPrzykladCucumber | TestMail                                  | Test1234 | Test1234        |
      | Test      | Automatyczny | 1234567890  | TestAutomatycznyPrzykladCucumber | TestAutomatycznyPrzykladCucumber@test.com | Test     | Test1234        |
      | Test      | Automatyczny | 1234567890  | TestAutomatycznyPrzykladCucumber | TestAutomatycznyPrzykladCucumber@test.com | Test1234 | TestTest        |
      | Test      | Automatyczny | 1234567890  | test@test.com                    | TestAutomatycznyPrzykladCucumber@test.com | Test1234 | Test1234        |
      | Test      | Automatyczny | 1234567890  | TestAutomatycznyPrzykladCucumber | test@test.com                             | Test1234 | Test1234        |


