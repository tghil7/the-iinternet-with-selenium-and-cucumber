Feature: Testing basic authentication.

  Scenario: Enter username and password through Selenium
    Given the user navigates to  the web address for the Internet website
    When the user clicks the link "Basic Auth"
    And the user enters the username and password
    Then the user is greeted with the message "Congratulations! You must have the proper credentials."