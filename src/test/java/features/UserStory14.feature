Feature: User Story 14

  Background: User story 14, Test Case 01, User should be able to view Dismissal Articles Page

    Given user navigate to basqar
    And   user loggin to basqar
    When User navigate to Dismissal Articles Page
    Then  the new input should be dismissal page

  Scenario: User story 14, Test Case 02, User should be able to create Dismissal Articles Page

    When   user add a dismissal name as "group4"
    Then  the new input should be created

  Scenario: User story 14, Test Case 03, User should be able to edit Dismissal Articles Page
    When User edit  dismissal articles name as "group4" to new name as "deneme"
    Then  the input should be updated


  Scenario: User story 14, Test Case 04, When searching by name,the results should be matched the search terms

    When user search  dismissal articles name as "deneme"


  Scenario: User story 14, Test Case 05, User should be able to delete Dismissal Articles Page

    When  user delete the  dismissal articles name as "deneme"
    Then  the input should be deleted