Feature: To test the functionality of FI431 program

Background:
When  navigate through program menu


Scenario: To test the addd record functionality of FI431 program 
 When Enter abbreviation code and press Add button
 Then Enter Data in fields
 Then Press Enter to Add button
 Then press Endofjob button
 Then enter to return


 Scenario: To test the Update record functionality of FI431 program 
 
 When Enter Abbreviation code and press Update button
 Then Update data of fields
 Then Press Enter to Update button
 Then press Endofjob button
 Then enter to return

 Scenario: To test the Delete record functionality of FI431 program 
 
 When Enter Abbreviation code and press Delete button
 Then Enter Y in response code field
 Then Press Enter to Delete button
 Then press Endofjob button
 Then enter to return
 
