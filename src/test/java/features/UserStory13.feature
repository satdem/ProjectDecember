Feature: User story 13


  Scenario: User story 13, Test Case 01, User should be able to view Position Categories page
    Given user navigate to basqar
    And   user loggin to basqar

    When  user navigate to Position Categories page
    Then  the new input should be created


  Scenario: User story 13, Test Case 02, User  should be able to create Position Categories and
  view  successfully validating the message
    Given user click to Dashboard
    And   user navigate to Position Categories page
    When  user create the Position Category named as "Tester"
    Then  the new input should be created

  Scenario: User story 13, Test Case 03, User should  be able to edit Position Categories  and
  view  successfully validating the message
    Given user click to Dashboard
    And   user navigate to Position Categories page
    When  user update the Position Category named as "Tester" to "Developer11"
    Then  the input should be updated
    And   user logged out


  Scenario: User story 13, Test Case 04, When searching by  name , the results should be matched the search terms.
    Given user click to Dashboard
    And   user navigate to Position Categories page
    When  user search a Position Category "Developer11"


  Scenario: User story 13, Test Case 05, User should be able to delete  Position Categories and
  view  successfully validating the message
    Given user click to Dashboard
    And   user navigate to Position Categories page
    When  user delete a Position Category "Developer11"
    And   user logged out

