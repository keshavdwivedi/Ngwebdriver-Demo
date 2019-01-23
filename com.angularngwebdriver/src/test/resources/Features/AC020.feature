Feature: To test the functionality of AC020 program

  Background: 

    Given we navigate by menu
   

  Scenario: To test add code functionality of AC020 program
    When enter district number
    Then enter additional charge code
    Then press UpdatechargeCode button
    Then press Exit button
    Then Returned to menu screen	

  Scenario: To test delete code functionality of AC020 program
    When enter district number
    Then press UpdatechargeCode button
    Then remove additional charge code
    Then press UpdatechargeCode button
    Then press Exit button
    Then Returned to menu screen	
