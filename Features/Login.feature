Feature: Login 
 
  Scenario: Verify Login 
    Given User should launch Browser
    And Click on SignIn Button
    When User Enter the username 
    And Click on continue button
    When User Enter the Password
    And Click on Submit Button
    Then User should login Successfully
    
    
   