Feature: Add/Remove element navigation

  Scenario: Add/Remove Element
    Given the user navigates to the url https://the-internet.herokuapp.com/
    When user clicks on link Add/Remove Elements
    And a new page opens with Add Element button that the user clicks
    And  user sees the "Delete" button on the screen that he clicks
    Then the "Delete" button disappears