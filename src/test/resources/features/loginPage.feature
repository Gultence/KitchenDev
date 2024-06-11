Feature:Login Page functionality


  User Story:Admin user should be able to login main dashboard with valid credentials

  Background:
    Given user goes the page
    When user click on button

  Scenario: Login scenario
    When user enters username
    When user enters password
    When user click on button
    Then user land on dashboard page

    Scenario: Login scenario without valid credentials

      When user enters invalid username
      When user enters invalid password
      When user click on button
      Then user sees error message

  Scenario: Forget password button functionality
      When user enters username
      When user clicks forget password button
      Then user land password reset page

  Scenario: Dealer login page functionality
      When User clicks go to dealer login button
      Then user land dealer login page

  Scenario: Password eye icon functionality
    When user enters password
    When user clicks eye icon
    Then user see typed password


