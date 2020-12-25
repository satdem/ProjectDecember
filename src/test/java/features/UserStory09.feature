@Regression
Feature: User Story 09, User should be able to use Budget Projects Page functionality.(Budget-Setup)

  Scenario: User story 09, Test Case 01, User should be able to view Budget Projects page
    Given   user navigate to basqar
    When    user loggin to basqar
    Then    user navigate to Budget Projects page


  Scenario: User story 09, Test Case 02, User should be able to Budget Project
  and view  successfully validating the message

    Given   user click to Dashboard
    And     user navigate to Budget Projects page
    When    user create an Budget Project name as "BP001" and account code as "3.3"
    Then    the new input should be created


  Scenario: User story 09, Test Case 03, User should not be able to add without Code

    Given   user click to Dashboard
    And     user navigate to Budget Projects page
    When    user create an Budget Project name as "BP002"
    Then    Save button should not be enabled


  Scenario: User story 09, Test Case 04, User should be able to delete
  Budget Project and view successfully validating the message

    Given   user click to Dashboard
    And     user navigate to Budget Projects page
    When    user delete the table data name as "BP001"
    Then    the input should be deleted
    And     user logged out




