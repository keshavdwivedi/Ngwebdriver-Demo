Feature: To test the functionality of MA530 program

  Background: 
    Given navigate through menu of program

  Scenario: To test the Add record functionality of MA530 program for specific district
    When Key in company number "20", order district "20" and program ID "AP001CL1"
    Then Select Add to continue button
    Then Key in email address
    Then press continue button
    Then press end of job button
    Then return To menu

  Scenario: To test the Update record functionality of MA530 program for specific district
    When Key in company number "20", order district "20" and program ID "AP001CL1"
    Then Select Update to continue button
    Then Key in Second email address
    Then press continue button
    Then press end of job button
    Then return To menu

  Scenario: To test the Delete record functionality of MA530 program for specific district
    When Key in company number "20", order district "20" and program ID "AP001CL1"
    Then Select Delete to continue button
    Then press continue button
    Then press end of job button
    Then return To menu

  Scenario: – To test Add user email address for all districts, then delete record for M530 program
    When Key in company number "20" and program ID "INR06"
    Then Select Add to continue button
    Then Key in email address
    Then press continue button
    Then Select Delete to continue button
    Then press continue button
    Then press end of job button
    Then return To menu
