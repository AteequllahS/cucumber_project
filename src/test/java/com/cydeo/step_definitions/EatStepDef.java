package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatStepDef {

    @Given("Alice is hungry")
    public void alice_is_hungry() {
        System.out.println("This is @Given code alice_is_hungry");

    }

    @When("she eats {int} cucumbers")
    public void she_eats_cucumbers(Integer quantity) {
        System.out.println("This is @When code he_eats_cucumbers "+quantity);

    }

    @Then("she will be full")
    public void she_will_be_full() {
        System.out.println("This is @Then he_will_be_full");


    }

    @Given("Melisa is hungry")
    public void melisa_is_hungry() {
        System.out.println("@Given Melisa is hungry");

    }

    @Then("she faints")
    public void she_faints() {
        System.out.println("@Then she faints code");


    }

    @Given("there are <start> cucumbers")
    public void thereAreStartCucumbers() {
    }

    @When("I eat <eat> cucumbers")
    public void iEatEatCucumbers() {
    }

    @Given("there are {int} cucumbers")
    public void there_are_cucumbers(Integer startingCount) {

        System.out.println("startingCount = " + startingCount);

    }
    @When("I eat {int} cucumbers")
    public void i_eat_cucumbers(Integer ateCount) {
        System.out.println("ateCount = " + ateCount);

    }
    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(Integer leftCount) {
        System.out.println("leftCount = " + leftCount);


    }
}
