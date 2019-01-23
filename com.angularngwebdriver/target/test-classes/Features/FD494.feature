Feature: To test the functionality of program FD494

  Scenario: To test the stepwise program process
    When  Navigate through the menu
    When Enter division name
    And Press Add Item Button
    Then Enter multiple Alternate division name
    Then Press Add Button
    Then Press Previous button
    Then Press Update button
    Then Press EndofJob button
    Then return to main menu
