Feature: To test the functionality of FI960CLS program

  Background: 
    When We Navigate by menu

  @selectdistrict35
  Scenario: To run the report for district 35
    Then press enter button
    Then return back to main menu screen
    
  Scenario: To run the report for district 99
    Then press enter button
    Then return back to main menu screen
