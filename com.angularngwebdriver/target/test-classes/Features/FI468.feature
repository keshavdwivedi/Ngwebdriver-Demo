Feature: To test the functionality of FI468 program

  Background: 
    Given We navigate by program menu


  Scenario: To test the add record functionality of FI468 program
    When we Enter Country code
    Then press Add Button
    When enter country name
    Then press entertoadd Button
    Then press end job button
    Then return Back to menu


  Scenario: To test the edit record functionality of FI468 program
    When we Enter Country code
    Then press Update Button
    Then change federal tax code value
    Then press entertoupdate Button
    Then press end job button
    Then return Back to menu

  Scenario: To test the delete record functionality of FI468 program
    When we Enter Country code
    Then press Delete Button
    Then enter Y in deletion response code field
    Then press enterdelete button
    Then press end job button
    Then return Back to menu
