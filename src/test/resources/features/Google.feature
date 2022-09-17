Feature:  Probar funcionalidad de Google

Scenario: Buscar algo en google
    Given I am on the Google search pages
    When I entera search criteria
    And click on search button
    Then the results match the criteria