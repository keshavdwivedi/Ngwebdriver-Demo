Feature: To test the functionality of program FI463

  Background: 
    Given we navigate through menu


  Scenario: To test add record functionality of FI463 program
    When enter year value
    Then click on Add record button
    Then enter aging date
    Then Press Enter to add button
    Then select End Job button
    Then return to Menu


  Scenario: To test Update record functionality of FI463 program
    When enter year value
    Then click on Update record button
    Then change aging date
    Then press Enter to update button
    Then select End Job button
    Then return to Menu
    

  Scenario: To test Delete record functionality of FI463 program
    When enter year value
    Then click on Delete record button
    Then enter response code for deletion as Y
    Then press Enter to Delete button
    Then select End Job button
    Then return to Menu
