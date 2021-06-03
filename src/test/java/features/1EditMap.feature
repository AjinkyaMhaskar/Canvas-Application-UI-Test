#Author: mhaskar16@gmail.com
Feature: Edit Map feature

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
    
  Scenario: Add Node
  	Given I click on node icon
  	And I click on canvas at x, y location at location one to create a node
  	And I click on canvas at x, y location at location two to create a node
  
  Scenario: Add Edge	
  	Given I click on Edge Icon
  	And I select the added node one
  	And I select the added node two 
  	Then I save the map
  		
  Scenario: Logout the application
   	Given I mouse hover the username icon on top right
    And I select logout option from the list
    Then I logout the application