Feature: To test the functionality of MA531 program

  Background: 
    Given navigate through the menu of the program

	
  Scenario: To test the Add record Functionality of MA531 program
   When Key in company "20", division "JMS", and program "INR08"
    Then press Add to continue to next screen
    Then Key in email Address
   Then press Continue Button
   Then press End of job Button
   Then Return to menu 

  Scenario: To test the Update record functionality of MA531 program
    When Key in company "20", division "JMS", and program "INR08"
    Then press Update to continue to next screen
    Then Key in second email Address
   Then press Continue Button
    Then press End of job Button
    Then Return to menu 
  
  Scenario: To test the Delete record functionality of MA531 program
    When Key in company "20", division "JMS", and program "INR08"
    Then press Delete to continue to next screen
    Then press Continue Button
    Then press End of job Button
    Then Return to menu 
