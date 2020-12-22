@Regression @Smoke
Feature: User should be able to use Grade Levels Page functionality

  Scenario: User stoty 05,test case 01,user should be able to create a Grade Level
    Given user navigate to basqar
    And user loggin to basqar

    When user navigate to Grade Levels page
    Then user create a grade level
      | name      | 01zui |
      | shortName | 1zui  |
      | order     | 0     |
      | nextGrade | bla   |
    Then  the new input should be created

  Scenario: User stoty 05,test case 02, user should be able to update an existant Grade Level

    Then user update the grade level named as "01zui" to "12zui"
    And the input should be updated

  Scenario: User stoty 05,test case 03,user should be able to delete an existant Grade Level

    Then user delete the grade level named as "12zui"
    And the input should be deleted
    And user logged out