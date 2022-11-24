@smoke
Feature: Wishlist Feature
  Scenario: user can add item in Wishlist
    When user clicks on wishlist button of htc
    Then success message appears

  Scenario:
    When user clicks on wishlist button of htc
    And wait until Success Message disappear
    And click on my Wishlist button
    Then verify wishlist result
