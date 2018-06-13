Feature: Google search

  Scenario: user can search any keyword

    Given Navigate to GooglePage
    When Send keyword selenide to the input field
    Then top 9 matches should be shown
    Then the first one should contain selenide.org