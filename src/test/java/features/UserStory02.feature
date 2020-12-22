@Regression @Smoke
Feature: User story 2


  Scenario: User story 02, Test Case 01, User should be able to create new Nationalites
    Given user navigate to basqar
    And   user loggin to basqar

    When  user navigate to Nationalities page
    And   user add a nationality "Nationality001"
    Then  the new input should be created

  Scenario: User story 02, Test Case 04, User should not be able to create a Nationality that is exists with similar name
    Given user click to Dashboard
    And   user navigate to Nationalities page
    When  user add a nationality "Nationality001"
    Then  the new input should not be created

  Scenario: User story 02, Test Case 02, User should be able to update an existant Nationality
    Given user click to Dashboard
    And   user navigate to Nationalities page
    When  user update the natianality named as "Nationality001" to "Nationality002"
    Then  the input should be updated

  Scenario: User story 02, Test Case 03, User should be able to delete an existant Nationality
    Given user click to Dashboard
    And   user navigate to Nationalities page
    When  user delete the nationality named as "Nationality002"
    Then  the input should be deleted
    And   user logged out