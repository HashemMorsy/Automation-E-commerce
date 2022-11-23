@smoke
Feature: users could choose the currency

  Scenario: users could choose the Euro currency
    When user Select Euro currency from the dropdown list on the top left of home page
    Then item change to Euro Symbol successfully
