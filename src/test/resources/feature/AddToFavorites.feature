Feature: Logged in user should be able to search  for Martin Garrix and add to my favorites and then deleteDasha


  Background: Login into account with correct credentials
    Given User navigates to Mixcloud website
    When User clicks on the login button on page
    And User enters an email: manchukd24@gmail.com
    And User enters a password: 180791Dasha
    When User clicks on the log in button
    Then User should be successfully logged in


  Scenario: Add Martin Garrix in my favorites artist
    Given User clicks search field
    When User enters Martin Garrix in the Search field
    And Following to Martin Garrix page
    And User add song Show
    And User enter my Profile
    And User delete song Show

