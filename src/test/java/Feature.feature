Feature: Regression suite for Login Functionality
  Scenario: User should be able to log in successfully
    When user enters credentials
    And user clicks Login Button
    Then user shuld be