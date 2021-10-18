@calculator @non_ui
Feature: Calculator feature with data
  As a user, I should be able
  to use the calculator, so that I can do arithmetic operations

  # better way after commenting the previous way
 # @wip
  Scenario Outline: Add 2 numbers multiple examples

    Given calculator app is open
    When I add <num1> with <num2>
    Then I should get result <expectedResult> displayed
    Examples:
      | num1 | num2 | expectedResult |
      | 3    | 4    | 7              |
      | 4    | 7    | 11             |
      | 11   | 6    | 17             |
      | 13   | 8    | 21             |
      | 25   | 25   | 50             |
      | 351  | 4    | 355            |



##we can't have same Scenario names
#  Scenario: Add 2 numbers example 1
#    Given calculator app is open
#    When I add 2 with 2
#    Then I should get result 4 displayed
#
#    # if steps dont change, we can copy and paste same Scenario: as many as we want
#
#  Scenario: Add 2 numbers example 2
#    Given calculator app is open
#    When I add 3 with 3
#    Then I should get result 6 displayed
#
#  Scenario: Add 2 numbers example 3
#    Given calculator app is open
#    When I add 21 with 20
#    Then I should get result 41 displayed