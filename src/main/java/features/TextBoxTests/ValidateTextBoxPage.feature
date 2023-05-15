#Author: HienPT

@TextBoxTests
Feature: Test all things in Text Box Page
  
  @HappyCase
  Scenario: TC1 Submit successfully
    Given User is in TextBox screen    
    When Input all valid data to all fields
    And Click in Submit    
    Then All value are display in text
    

  @ValidationCase
  Scenario: Email format wrong without A
    Given User is in TextBox screen
    When Input email without @
    And Input valid data to other fields
    And Click in Submit 
    Then Red border is displayed, input data is nót saved

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
