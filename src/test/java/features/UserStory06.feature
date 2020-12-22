@Regression @Smoke
Feature: User Story 06


Scenario: : User story 06, Test Case 01, User should be able to view Document Types Page

    Given user navigate to basqar
    And   user loggin to basqar
    When User navigate to Document Types page
    Then  the new input should be document page
    And   user logged out

#  Scenario: User story 06, Test Case 02, User should be able to create Document Types Page
#
#    When  user add a document name as "zeynep"
#    And  user click to stage name "Contract"
#    Then  the new input should be created
##  Not:Bu bolumde stage nameden sonra save tusuna basilamiyor.Ottomation test yapilamiyor.Bu sebepten manuel create yapilmali Document Type sayfasindan
#
#  Scenario: User story 06, Test Case 04, User should be able to edit Document Types Page
#
#    When User edit  document name as "zeynep" to new name as "zeynepS"
#    Then  the input should be updated
#
#  Scenario: User story 06, Test Case 05, When searching by name,the results should be matched the search terms
#
#    When user search document name as "zeynepS"
#
#
#  Scenario: User story 06, Test Case 03, User should be able to delete Document Types Page
#
#    When  user delete the document name as "zeynepS"
#    Then  the input should be deleted