@Regression @Smoke
Feature: Citizenships functionality

  Scenario: User story 01, Test Case 01, User should be able to create new Citizenships
    Given user navigate to basqar
    And   user loggin to basqar

    When User navigate to Citizenships page
    Then User create a Citizenship name as "Turkey1" short name as "Tr"
    Then  the new input should be created


  Scenario: User story 01, Test Case 02, User should be able to update new Citizenships
    Given user click to Dashboard
    And Navigate to Citizenships page
    Then User update  Citizenship name as "Turkey1" to "TurkeyCountry" short name as "TC"
    Then  the input should be updated

  Scenario: User story 01, Test Case 03, User should be able to delete new Citizenships
    Given user click to Dashboard
    And User Navigate to Citizenships page
    Then User delete the "TurkeyCountry"
    Then  the input should be deleted
    And   user logged out

