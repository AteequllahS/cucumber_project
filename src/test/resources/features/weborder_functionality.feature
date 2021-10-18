@ui
Feature: Weborder app should  work as expected

  @screen
  Scenario: user should see all product from the list according to available products
    Given we are at web order login page
    And we provide valid credentials
    When we select "Order" tab from sidebar
    Then we should see below options in Product dropdown list

      | MyMoney     |
      | FamilyAlbum |
      | ScreenSaver |

