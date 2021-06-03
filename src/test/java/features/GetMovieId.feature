#Author: mhaskar16@gmail.com
Feature: Search movie ID with API operation using REST-Assured

Scenario: Verify GET operation with user key and query paramter

    Given I perform GET operation for "http://omdbapi.com/?t=Harry+potter&plot=full&apikey=61a7b7d0"
    
   	Then I should see the status as 200 and JSON result 
   	
   	And Result should return imdbIDs
