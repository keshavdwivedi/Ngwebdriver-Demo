Feature: To test the functionality of FI423CL program

 
  Scenario: To test the Add functionality of FI423CL program
    When navigate through the menu
    When we enter scrap point code and Press Add button
    Then We enter product shape code
    Then We enter Width and Length of Scrap point
    Then We enter comments and press Enter key
    Then press End of job button
    Then return to menu screen
  
  Scenario: To test the Update functionality of FI423cl program
    When navigate through the menu
    When we enter scrap point code and press Update button
    Then change the width and length of scrap point
    Then Press Update Scrap point Code button
    Then press End of job button
    Then return to menu screen
   
  Scenario: To test the Delete functionality of FI423cl program
    When navigate through the menu
    When we enter scrap point code and press delete button
    Then we enter Y response in Delete field
    Then we press Delete scrap point code button
    Then press End of job button
    Then return to menu screen
