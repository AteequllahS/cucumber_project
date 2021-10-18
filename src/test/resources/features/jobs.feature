# the link for Gherkin Reference:
  # https://cucumber.io/docs/gherkin/reference/?sbsearch=Gherkin%20Reference

Feature: Getting jobs
  As a student, I should be able to get job after learning all good tools

  # a space after these keywords can fail the test e.g (Feature   : Getting a job ). it will fail
  Scenario: student prepare for a job
    Given students attend all the classes
    When student learn all the topic
    Then student should be ready for the job

  Scenario: student go to market
    Given student is prepared
    When student upload their resume
    Then student will be in the market

    # we can add as many And as we want if have more conditions.we can add under any of them
  Scenario: student apply for the job
    Given you are prepared for a job
    And you are in the market
    When you apply for 100 jobs a day
    Then you will eventually get the job

