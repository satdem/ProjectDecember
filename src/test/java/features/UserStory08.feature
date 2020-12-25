@Regression
Feature: User Story 08, User should be able to use Item Categories Page functionality. (Inventory-Setup)

  Scenario: User story 08, Test Case 01, User should be able to view Item Categories Page
    Given   user navigate to basqar
    When    user loggin to basqar
    Then    user navigate to Item Category page


  Scenario: User story 08, Test Case 02, User  should be able to create new Item Categorie
  and view  successfully validating the message

    Given   user click to Dashboard
    And     user navigate to Item Category page
    When    user create an Item Category name as "IC Name" and user types as "User"
    Then    the new input should be created


  Scenario: User story 08, Test Case 05, When searching by name,
  the results should be matched the search terms.

    Given   user click to Dashboard
    And     user navigate to Item Category page
    When    user search Item Category name as "IC Name"
    Then    search by name as "IC Name" should be listed


  Scenario: User story 08, Test Case 04, User should be able to edit Item Categorie
  and view  successfully validating the message

    Given   user click to Dashboard
    And     user navigate to Item Category page
    When    user edit the table data named as "IC Name"
    Then    search by name as "IC Name" should be listed
    And     user close the dialogbox


  Scenario: User story 08, Test Case 03, User should be able to delete Item Categorie
  and view successfully validating the message

    Given   user click to Dashboard
    And     user navigate to Item Category page
    When    user delete the table data name as "IC Name"
    Then    the input should be deleted
    And     user logged out




