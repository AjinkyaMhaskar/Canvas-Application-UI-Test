#Author: mhaskar16@gmail.com
Feature: Region feature

	Scenario: Login to application
    Given I navigate to base URL
    And I enter correct username,password & click on LOGIN button 
    Then I should successfully login the application
        
  Scenario: Navigate to edit map page
    Given I click on manage icon
    And On the Manage page I navigate to Maps tab
    When I click on tatsumi map 
    Then I land on map page
    
  Scenario: Edit map
    Given I am on tatsumi map page
    And then click on edit map button
    And I click on Zoom to fit button
    Then I land on edit map page
    
  Scenario: Add Region
  	Given I click on region icon
  	And I click on canvas at x, y location and drag to p, q location
  	Then I select the region
  	Then I name the region
  	And Click on sumbit button
  	Then I save the map
  	
  Scenario: Edit map
    Given I am on tatsumi map page
    And then click on edit map button
    And I click on Zoom to fit button
    Then I land on edit map page
    
  Scenario: Move Region
  	When I click on select icon
  	Then I select the region
  	Then I move the region
  	Then I save the map
  	And Exit map editor
  	
  Scenario: Logout the application
   	Given I mouse hover the username icon on top right
    And I select logout option from the list
    Then I logout the application
