Feature: update contact detail

  Scenario: check update contact detail functionality
    Given users already log in
    When user click my Info
    Then click Contact Details
    And fill Street 1
    And fill Street 2
    And fill City
    And fill State/Province
    And fill Zip/Postal Code
    And pick country
    And fill home telephone
    And fill Mobile telephone
    And fill Work telephone
    And fill Work Email
    And fill Other Email
    Then click Save

