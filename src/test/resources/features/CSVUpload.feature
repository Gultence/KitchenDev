Feature: Dealer
  User Story: User able to upload CSV file
    Background:
      Given user on the dealer
@smoke
  Scenario: User able to use csv button
    #Given user on the dealer
    When user click on csv button
    And user click demo dealer file
    And user click on choose file
    And user click on upload
    #Then user see handle popup
@smoke
  Scenario: User able to select from Display Column
    When user click on display column and select all

    Then user un-select all column

