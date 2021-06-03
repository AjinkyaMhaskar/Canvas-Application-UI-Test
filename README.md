# Rapyuta Robotics - UI Application Test
## Selenium WebDriver, BDD(Cucumber), REST Assured
## Tools:
- Eclipse
- Maven
- TestNG
- Selenium WebDriver
- Cucumber
- Rest Assured

## Maven dependencies: 
- Selenium WebDriver
- Cucumber
- TestNG
- Extent report
- Rest Assured

#### Application URLs:
>http://inst-jrmyavxrlvlrqyfxpqsqtpqm-duejxv.ep-r.io/login

## Features:
- Crisp & Clear Maven folder structures.
- CucumberOptions with detailed explanation of using "tags", "glue"
- Screenshots on failure feature in CucumberRunner class
- TestNG Annotations/hooks like "Before, "BeforeSuite", "AfterClass", "AfterMethod", "AfterSuit" etc.
- Descriptive pom.xml and testng.xml
- Method to read data from configuration properties file.
- Clear cucumber code which can be reused. 

## BDD Style Development:
- Test Runner Main Class - PetClinicUITest\src\test\java\runner
- Feature file - PetClinicUITest\src\test\java\features
- Step Defination - PetClinicUITest\src\test\java\gluecode
- Common Functions - PetClinicUITest\src\test\java\commonFunctions
- Read Configuration File - PetClinicUITest\src\test\java\dataProviders
- Failure Screen-shots - PetClinicUITest\target\screenshots
- Extent report - PetClinicUITest\target\html\CustomExtentReport.html

## Explanation:
Test script receive its data from the property file "Configuration.properties". tear-down method is used after every script failure, Screen shots are recorder for every method under "rr-sdet-assignment\target\screenshots". Once the test execution finish, Admin should navigate to "rr-sdet-assignment\target\htmlCustomExtentReport.html" to review test results in custom extent report.

### Scenarios Covered
- Login to application with credentials
- Edit the map
- Add nodes
- Delete nodes
- Add edges
- Delete edges
- Add region
- Edit region: Move or Change coordinates
- Log out
- Search movies by title for ‘Harry Potter’ and list the IDs of all results.

### To Run: 
```
Navigate to "rr-sdet-assignment\src\test\java\runner\TestRunner.java", Right-click and Run As "1 TestNG Test"
```
