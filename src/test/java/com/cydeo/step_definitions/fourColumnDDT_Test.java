package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class fourColumnDDT_Test {


    @Given("the info of customers and pull their info")
    public void the_info_of_customers_and_pull_their_info() {

        System.out.println("The following info was pulled from the UI\n");
    }
    @When("I give the following Table")
    public void i_give_the_following_table(List<Map<String,String>> dataTable) {

        System.out.println(dataTable);
        System.out.println("dataTable.get(2) = " + dataTable.get(2));
        Map<String,String> thirdRow = dataTable.get(2);
        System.out.println("thirdRow.get(3) = " + thirdRow.get("city"));

    }
    @Then("I all the info must match as expected")
    public void i_all_the_info_must_match_as_expected() {


        System.out.println("Data matched the Expected result");
    }

}
