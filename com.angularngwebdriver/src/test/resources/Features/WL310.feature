Feature: To test the functionality of WL310 program

  @selectdistrict20 
  Scenario: To test the stepwise process of program
    When We navigate by menu
    Then Enter item and Press Enter=continue
    Then Select Item number
    Then Press Search button
    Then press Previous key twice
    Then Press End of Job button
     Then returned to menu screen
   