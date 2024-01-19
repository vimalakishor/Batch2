

Feature: To check the OrangeHRM application
  
  Scenario: To verify the login functionality
    Given user launch the browser
    When User on the login page
    And  User enter the username as "Admin"
    And User enter the password as "admin123"
    When user click on the login button
    Then user should navigate to the dashboard page
    

 
  
