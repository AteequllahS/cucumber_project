
#we can add tag @name to a feature at feature level
# we can add more than one tag too

@calculator @non_ui
Feature: Calculator feature
    As a user,
    I should be able
    to use the calculator, so that I can do arithmetic operations

  @addition
  Scenario: Add 2 numbers
    Given calculator app is open
    When I add 2 with 2
    Then I should get result 4 displayed

    # if steps dont change, we can copy and paste same Scenario: as many as we want
  @smoke
  Scenario: Add 2 numbers
      Given calculator app is open
      When I add 5 with 4
      Then I should get result 9 displayed

  Scenario: Add 2 numbers
    Given calculator app is open
    When I add 1 with 3
    Then I should get result 4 displayed