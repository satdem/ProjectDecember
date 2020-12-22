@Regression @Smoke
Feature: User story 3


  Scenario: User story 03, Test Case 01, User should be able to create a new Fee Type
    Given user navigate to basqar
    And   user loggin to basqar

    When  user navigate to Fees page
    And   user add a fee "Food payment11 " "1312"   "500"
    Then  the new input should be created




  Scenario: User story 03, Test Case 02, User should be able to update an existant Fee Type
    Given user click to Dashboard
    And  user navigate to Fees page
    When  user update the fee named as "Food payment11" to "Tuition Fee11"
    Then  the input should be updated




  Scenario: User story 03, Test Case 03, User should be able to delete an existant Fees Type
    Given user click to Dashboard
    And  user navigate to Fees page
    When  user delete the fees named as "Tuition Fee11"
    Then  the input should be deleted
    And   user logged out

