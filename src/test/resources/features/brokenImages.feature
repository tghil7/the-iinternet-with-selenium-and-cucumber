Feature: Navigate to the broken images.

  Scenario: Find the broken images
    Given I navigate to the url https://the-internet.herokuapp.com
    When I click on the link "Broken Images"
    Then 3  broken images are displayed on the screen


