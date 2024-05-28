@searchAnn
Feature:Announcement
  User Story: User able to click on search box and type

  @Ann
  Scenario: User able to type in search box
    Given user goes the announcement page
    When user click on search box
    And user type text in search box
    Then user see the text on the page