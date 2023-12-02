Feature: apply leave

  Scenario: check apply leave functionality
    Given user log in
    When user click apply leave
    And pick Leave Type
    And pick From Date
    And pick To Date
    And write comment
    Then click Apply



