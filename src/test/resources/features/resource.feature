@Resources
Feature: Resource
  User able to edit
#@bug
 # Scenario: Edit to resource link
  #  Given user goes app page
   # When user on the resource page
    #Then user click on the link
@editLabel
  Scenario:
    Given User login and click the resources
    When User click label button and made changes
    Then User see popup message