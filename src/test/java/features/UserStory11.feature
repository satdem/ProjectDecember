@Regression @Smoke
Feature: Notation Keys functionality

  Scenario: User story 11, Test Case 01, User should be able to create new Notation Keys
    Given user navigate to basqar
    And   user loggin to basqar

    When User navigate to Notation Keys page
    Then User create a Notation Key name as "Turker" short name as "Tr" and multiplier as "13"
    Then  the new input should be created

  Scenario: User story 11, Test Case 02, User should be able to update an existant Notation Keys
    Given user click to Dashboard
    When User navigate to Notation Keys page
    Then  user update the Notation Keys named as "Turker" to "Turker1" and short name as "Tr1" and multiplier as "11"
    Then  the input should be updated


  Scenario: User story 11, Test Case 03, User should be able to delete an existant Notation Keys
    Given user click to Dashboard
    When User navigate to Notation Keys page
    Then  user delete the Notation Key named as "Turker1"
    Then  the input should be deleted
    And   user logged out

