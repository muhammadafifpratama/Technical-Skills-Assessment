Feature: Login and logout

  Scenario: check the Login and logout functionality
    Given halaman login
    When input username
    And input password
    And click login button
    Then user in on dashboard page
    When user click profile
    And user click logout
    Then user out on login page

  Scenario: login with the wrong password
    Given halaman login
    When input username
    And input wrong password
    And click login button
    Then user receives error
