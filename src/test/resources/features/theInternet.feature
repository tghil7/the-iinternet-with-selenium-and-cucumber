Feature: Test the Internet Web application

  Scenario: Navigate to A/B Testing page
    Given the user navigates to  https://the-internet.herokuapp.com/
    When user clicks on link A/B Testing
    Then a new page opens about A/B Test Control description.

