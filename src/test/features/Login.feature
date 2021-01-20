Feature: Login feature

  Scenario: Verify the Login Section
    Given  I navigate to the provided URL
    When I am on the Login Page
    And  I enter the UserName as "mngr303351"
    And  I enter the Password as "yrYqudy"
    And  I click the Login Button
    Then I Should be able to login into the Application Successfully
