#Author: mhaskar16@gmail.com
Feature: Delete Node & Region feature

	Scenario: Login to application
    Given I navigate to base URL
    And I enter correct username,password & click on LOGIN button 
    Then I should successfully login the application
        
  Scenario: Navigate to edit map page
    Given I click on manage icon
    And On the Manage page I navigate to Maps tab
    When I click on tatsumi map 
    Then I land on map page

  Scenario: Delete Region
    And then click on edit map button
    And I click on Zoom to fit button
    Then I land on edit map page
  	When I click on select icon
  	Then I select the region
    Then I delete the region
    Then I save the map
    And Exit map editor
    
  Scenario: Delete Node and Edge
  	When I click on tatsumi map 
    Then I land on map page
    And then click on edit map button
    And I click on Zoom to fit button
    Then I land on edit map page
    When I click on select icon
    And I select the added node one
    Then I delete the node 
    And I select the added node two
    Then I delete the node 
    Then I save the map
    And Exit map editor

  Scenario: Logout the application
   	Given I mouse hover the username icon on top right
    And I select logout option from the list
    Then I logout the application