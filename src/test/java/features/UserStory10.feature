@Regression @Smoke
Feature: Locations functionality

  Scenario: User story 10, Test Case 01, User should be able to create new Locations
    Given user navigate to basqar
    And   user loggin to basqar

    When User navigate to Locations page
    Then User add a Locations
    Then User create a Locations
      | name         | location11 |
      | shortName    | lo1        |
      | locationType | Classroom  |
      | capacity     | 20         |
    Then  the new input should be created

  Scenario: User story 10, Test Case 02, User should be able to update an existant Locations
    Given user click to Dashboard
    When User navigate to Locations page
    Then  user edit the Notation Keys named as "location11"
    Then  user update the Notation Keys
      | name         | location22 |
      | shortName    | lo2        |
      | locationType | Laboratory |
      | capacity     | 10         |
    Then  the input should be updated

  Scenario: User story 10, Test Case 03, User should be able to delete an existant Locations
    Given user click to Dashboard
    When User navigate to Locations page
    Then  user delete the location named as "location22"
    Then  the input should be deleted
    And   user logged out


