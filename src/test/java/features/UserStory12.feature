Feature: User should be able to use Attestations Page functionality

  Scenario:User stoty 12,test case 01, user should be able to view Attestations page

    Given user navigate to basqar
    When  user loggin to basqar
    Then user navigate to Attestations page

  Scenario:User stoty 12,test case 02, user  should be able to create an Attestation and view  successfully validating the message
    #When user navigate to Attestations page

    Then user create a new Attestations as "att01"
    And  the new input should be created

  Scenario:User stoty 12,test case 03, user should  be able to edit Attestation and view  successfully validating the message

    When user update the Attestations named as "att01" to "att02"
    And the input should be updated

  Scenario:User stoty 12,test case 04, user should be able to delete  Attestation and view  successfully validating the message
    When user delete the grade Attestations as "att02"
    And the input should be deleted

  Scenario:User stoty 12,test case 05, when searching by  name , the results should be matched the search terms.
    Given user navigate to basqar
    When  user loggin to basqar
    Then user navigate to Attestations page
    And user create a new Attestations as "ssss"
    When user search Attestations name "ssss"
    Then user check the found result by "ssss"
    And user logged out