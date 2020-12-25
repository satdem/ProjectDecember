@Regression
Feature: User Story 07, User should be able to use Notifications Page functionality (Messaging)

  @Smoke
  Scenario: User story 07, Test Case 01, User should be able to view Notifications Page
    Given   user navigate to basqar
    When    user loggin to basqar
    Then    user navigate to Notification page



  Scenario: User story 07, Test Case 02, User should be able to create new Notification
  and view successfully validating the message

    Given   user click to Dashboard
    And     user navigate to Notification page
    When    user create an notification as follows
      | name        | NotificationName         |
      | type        | Student Payment Time     |
      | description | Notification Description |

    Then    the new input should be created


  Scenario: User story 07, Test Case 05, When searching by name, the results
  should be matched the search terms.
    Given   user click to Dashboard
    And     user navigate to Notification page
    When    user search "NotificationName"
    Then    search by name as "NotificationName" should be listed


  Scenario: User story 07, Test Case 04, User should be able to edit Notification
  and view successfully validating the message
    Given   user click to Dashboard
    And     user navigate to Notification page
    When    user edit the table data named as "NotificationName"
    Then    the data should be edited


  Scenario: User story 07, Test Case 03, User should be able to delete Notification
  and view successfully validating the message
    Given   user click to Dashboard
    And     user navigate to Notification page
    When    user delete the table data name as "NotificationName"
    Then    the input should be deleted
    And     user logged out




