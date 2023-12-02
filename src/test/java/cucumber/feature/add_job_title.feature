Feature: add job title

  Scenario: check job title functionality
    Given logged in as admin
    When user click admin
    And user click job
    And user pick Job titles
    Then user click add

