#Author: winston@poplarhomes.com
#Github: winstonpoplar
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Profile
Feature: Profile Tab UI
  
  As a Prospect Renter, I want to be able login to the Poplar Homes Renter Dashboard,
  so that I can see my Profile Details.

  @ProspectRenter
  Scenario: Prospect Renter logs in to Poplar Homes Web App
    Given User is logged in the Poplar Homes Renter Dashboard
    When User is in the Profile Tab
    Then User should see General Details sub-tab
    And User should see Group Details sub-tab
    And User should see Employment Details sub-tab
    And User should see Documents sub-tab
    And User should see Credit Check sub-tab
    And User should also see the Complete Now Banner


