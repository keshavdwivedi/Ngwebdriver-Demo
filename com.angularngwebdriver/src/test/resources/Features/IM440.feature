Feature: To test the functionality of IM440 program

  Background: 
    Given Navigate through program menu
    
  Scenario: To test add record functionality of IM440 program
    When Enter company number and vendor number and class
    Then Press Add Record Button
    When We enter Min and Max values of Thickness and Length
    Then Press Enter button 
    Then Press End of job button
    Then return back to menu
  
  Scenario: To test Update record functionality of IM440 program
    When Enter company number and vendor number and class
    Then Press Update Record button
    When we change the Min and max values of Thickness and length
    Then Press Enter button 
    Then Press End of job button
    Then return back to menu
    
  Scenario: To test Delete record functionality of IM440 program
    When Enter company number and vendor number and class
    Then Press Delete Record button
    Then Enter Y in Response code field
    Then Press Enter button to delete
    Then Press End of job button
    Then return back to menu
