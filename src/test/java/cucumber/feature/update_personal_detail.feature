Feature: update personal detail

  Scenario: check update personal detail functionality
    Given users already log in
    When user click my Info
    And user change name
    And user change nickname
    And user change Employee id
    And fill other id
    And fill driver license
    And pick license expiry date
    And input SSN number
    And input SIN number
    And pick nationality
    And pick marital status
    And pick date of birth
    And choose gender
    Then click save



