Feature: To test the functionality of FI441 program

  Scenario: To test the add functionality of FI441 program
    When navigate through menu
    When we enter one position class
    Then press add button
    Then enter class description
    Then enter equalizing factor
    Then enter budget turns
    Then press submit button
    Then press EndofJob button
    Then return to menu 
    
  Scenario: To test the update functionality of FI441 program
    When navigate through menu
    When we enter one position class
    Then enter update button
    Then update budget turns
    Then press submit button
    Then press EndofJob button
    Then return to menu 
    
  Scenario: To test the delete functionality of FI441 program
    When navigate through menu
    When we enter one position class
    Then enter delete button
    Then we enter Y in delete confirm field
    Then press submit button
    Then press EndofJob button
    Then return to menu 
