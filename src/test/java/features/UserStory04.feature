@Regression @Smoke
Feature: Discount Functionalty

  Scenario: User story 04, Test Case 01, User should be able to create new Discount
    Given user navigate to basqar
    And   user loggin to basqar

    When User navigate to Discount page
    Then User create a Discount description as "des37"  integration code as "n97"
    Then  the new input should be created


  Scenario: User story 04, Test Case 02, User should be able to update new Discount
    Given user click to Dashboard
    And Navigate to Discount page
    Then User update  Discount name as "des37" to name as "Tur7"  integration code as "n98"
    Then  the input should be updated

  Scenario: User story 04, Test Case 03, User should be able to delete new Discount
    Given user click to Dashboard
    And User Navigate to Discount page
    Then User delete the discount "Tur7"
    Then  the input should be deleted
    And   user logged out