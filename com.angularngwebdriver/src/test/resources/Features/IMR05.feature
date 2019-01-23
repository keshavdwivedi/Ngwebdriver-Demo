Feature: To test the functionality of IMR05 program

  @selectdistrict20 @t
  Scenario: To test the stepwise process of program IMR05
    When navigate by program menu
    And Enter Item number
    Then user Update button
    Then Enter Item subclass
    Then Press Enter=update button
    Then press End button
