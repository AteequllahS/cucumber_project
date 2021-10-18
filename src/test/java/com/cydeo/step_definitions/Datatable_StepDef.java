package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Datatable_StepDef {


    //@Given("I have a {word}")
    // in cucumber, we can use the {word} for matching words and no need to put words inside quotations ""
    //in Feature file.
    @Given("I have a {string}") // String is mostly used
    public void i_have_a(String animal) {
        System.out.println("Given I have a " + animal);

    }

    @When("I call their names")
    public void i_call_their_names() {
        System.out.println("When I call their names");

    }

    @Then("They come to me.")
    public void they_come_to_me() {
        System.out.println("Then they come to me");

    }

    /*
    //copied all from after feature run on console.
    @Given("I have following animals")
    public void i_have_following_animals(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
     */
    @Given("I have following animals")
    public void i_have_following_animals(List<String> animalList) {

        System.out.println("Animal List = "+animalList);
    }

    @When("I call their names with below names")
    public void iCallTheirNamesWithBelowNames(List<String> nameList) {

        System.out.println("nameList = " + nameList);
    }

    @Then("They come to me with below noise")
    public void theyComeToMeWithBelowNoise(Map<String, String> animalNoise) {
        System.out.println("animalNoise = " + animalNoise);

    }

    @When("we provide below credentials")
    public void weProvideBelowCredentials(Map<String, String> credentialMap) {

        String userNameFromTable = credentialMap.get("username");
        String passwordFromTable = credentialMap.get("password");

        WLoginPage loginPage = new WLoginPage();
        loginPage.login(userNameFromTable, passwordFromTable);
    }

    @Given("this is the product reference")
    public void thisIsTheProductReference(List<Map<String, Object>> productMapList) {

        Map<String, Object> thirdRowMap = productMapList.get(2);
        System.out.println("thirdRow = " + thirdRowMap);
        System.out.println("thirdRowMap.get(\"discount\") = " + thirdRowMap.get("Discount"));
        System.out.println("productMapList.get(1).get(\"Price\") = " + productMapList.get(1).get("Price"));

        System.out.println("productMapList = " + productMapList);

        for(Map<String, Object> eachRowMap  :productMapList ){
            System.out.println("eachRowMap = " + eachRowMap);
        }
    }

    @And("I have another product reference without header")
    public void headlessTable(List<List<String>> productInfoList) {
/**     | MyMoney     | 100   | 0.08     |
        | FamilyAlbum | 80    | 0.15     |
        | ScreenSaver | 20    | 0.1      |
 */
        System.out.println("productInfoList = " + productInfoList);

        // get me entire 3rd row
        List<String> thirdRow =  productInfoList.get(2);
        System.out.println("thirdRow = " + thirdRow);

        //get the price value of 3rd row
        System.out.println("thirdRow.get(1) = " + thirdRow.get(1));

        //get the discount column of 1st row
        System.out.println("First row 3rd column value = " + productInfoList.get(0).get(2));
    }
}


