@smoke

Feature: user can use search functionally

  Scenario Outline: user could search using product name
    When user enter product name as "<name>" in search par
    And click on search button
    Then success search result is displayed "<name>"
    Examples:
      | name  |
      | book |
      | laptop |
      | nike |

    Scenario Outline: user could search for product using sku
      Given user enter product sku as "<sku>" in search par
      And click on search button
      When user open product page
      Then success search result "<sku>" is displayed
    Examples:
      | sku  |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |



