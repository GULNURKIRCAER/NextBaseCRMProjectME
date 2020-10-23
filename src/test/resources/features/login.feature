@login
Feature: User should be able to add others' posts to favorite

  Background:
    Given the user is on the login page

  Scenario: Login as a helpdesk
    When the user enters the helpdesk information
    Then the user should be able to login
    Then User should be able to click a post to favorite by clicking on the Star icon.
    Then User should be able to click on Activity Stream Search box
    And User should be able to click on Favorites filter on the left of Filter module.
    Then Verify the favorite post added by User now display on Activity Stream Filtered Page

  Scenario:  Login as a marketing manager
    When the user enters the marketing manager information
    Then the user should be able to login
    Then User should be able to click a post to favorite by clicking on the Star icon.
    Then User should be able to click on Activity Stream Search box
    And User should be able to click on Favorites filter on the left of Filter module.
    Then Verify the favorite post added by User now display on Activity Stream Filtered Page

  Scenario: Login as a hr manager
    When the user enters the hr manager information
    Then the user should be able to login
    Then User should be able to click a post to favorite by clicking on the Star icon.
    Then User should be able to click on Activity Stream Search box
    And User should be able to click on Favorites filter on the left of Filter module.
    Then Verify the favorite post added by User now display on Activity Stream Filtered Page



