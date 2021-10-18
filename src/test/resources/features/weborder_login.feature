
Feature: web order app login
  as a user, I should be able to login to web order app

  #this is where repeating beginning code can to, this is how we comment in feature file
   #this is a shared step for all. if we have repeating steps we can move it to Background:
  Background:

    # this is a shared step for the below cases
    Given we are at web order login page

  Scenario: User login successfully
   # Given we are at web order login page
    When we provide valid credentials
    Then we should see all order page

  Scenario: User login fail
   # Given we are at web order login page

    When we provide invalid credentials
    Then we should  still be on login page
    And login error message should be present

  # to create test classes for each scenario: move mouse on each scenario> more actions> create all steps
  # press Ctrl and move mouse on each line to and click > it takes you to that method


@ui @bla
  Scenario: user login with specific credentials

    # whatever is enclosed inside quotation, "" will be sent as parameter value
    # step definition will look like this
    #@when("user provide username{string} and password {string}")
    When user provide username "Tester" and password "test"
    Then we should see all order page

  @ui @bla
  Scenario: User login with wrong credentials

    When user provide username "BLA" and password "BLA"
    Then we should  still be on login page
    And login error message should be present
