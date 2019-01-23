Feature: To test the functionality of IN880CL program

  Background: User navigates through menu of program
  
    When we Navigate by menu
   
    
  Scenario: To Run Tag Variance Report for all districts
    When we Remove District
    Then Select Enter=Select button
    Then Select Enter to return to Menu
    Then Back to menu selection screen

  @selectdistrict15
  Scenario: To run Tag variance report for district 15 only
    Then Select Enter=Select button
    Then Select Enter to return to Menu
    Then Back to menu selection screen
