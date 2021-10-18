
  Feature: Eating too many cucumbers may not be good for you
    eating too much of anything may not be good for you.

  Scenario: Eating a few is no problem
    Given Alice is hungry
    When she eats 3 cucumbers
    Then she will be full


    Scenario: Eating a few is no problem
      Given Melisa is hungry
      When she eats 10 cucumbers
      Then she faints

    @salad
    Scenario Outline: eating
      Given there are <start> cucumbers
      When I eat <eat> cucumbers
      Then I should have <left> cucumbers

      Examples:
        | start | eat | left |
        |    12 |   5 |    7 |
        |    20 |  12 |   10 |
        |    33 |   5 |   15 |
        |    44 |  12 |   32 |