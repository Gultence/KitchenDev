Feature:Login Page functionality

  User Story:Admin user should be able to login main dashboard with valid credentials

  Scenario: Login scenario
    Given user is on the login page
    When user enters username admin@democabinetry.example
    And user enters password Persist@2023
    And user clicks to login button
    Then user should see url contains quick-access

