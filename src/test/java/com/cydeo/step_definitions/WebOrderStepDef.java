package com.cydeo.step_definitions;

import com.cydeo.pages.WAllProductPage;
import com.cydeo.pages.WCommonArea;
import com.cydeo.pages.WOrderPage;
import com.cydeo.utility.BrowserUtil;
import com.sun.javafx.collections.MappingChange;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;


public class WebOrderStepDef {
    @When("we select {string} tab from sidebar")
    public void weSelectTabFromSidebar(String tabName) {

        System.out.println("tabName = " + tabName);
        WCommonArea commonArea = new WCommonArea();
        switch (tabName) {
            case "View all products" :
                commonArea.viewAllProductTab.click();
                break;
            case "View all orders" :
                commonArea.viewAllOrderTab.click();
                break;
            case "Order":
                commonArea.orderTab.click();
                break;
        }

    }

    @Then("we should see below options in Product dropdown list")
    public void weShouldSeeBelowOptionsInProductDropdownList(List<String> expectedOptions) {

        System.out.println("expectedOptions = " + expectedOptions);
        WOrderPage orderPage = new WOrderPage();

        //the method is called from WOrderPage
        List<String> actualOptions =  orderPage.getAllProductOptionsFromList();

        //asserting both values
        assertEquals( expectedOptions, actualOptions);

    }


    @Then("we should see table with below content")
    public void weShouldSeeTableWithBelowContent(List<Map<String, String>> productMapLst) {

        System.out.println("productMapLst = " + productMapLst);

        //how to get the first map
        Map<String, String> expectedFirstRowMap =  productMapLst.get(0);

        WAllProductPage allProductPage =  new WAllProductPage();

        System.out.println("allProductPage.getRowMapFromWebTable() = " + allProductPage.getRowMapFromWebTable());

        //get the actual row map
        Map<String, String> actualFirstRowMap =  allProductPage.getRowMapFromWebTable();

        //assert the first row match from datatable and webTable
        assertEquals( expectedFirstRowMap , actualFirstRowMap );



//=================================================================================================================
//        Set<String> headerSet = productMapLst.get(0).keySet();
//        System.out.println("headerSet = " + headerSet);
//
//        // get actual header :
//        List<String> actualHeaders = allProductPage.getAllHeaderText();
//        System.out.println("actualHeaders = " + actualHeaders);
//
//        // check the size is the same
//        assertEquals(headerSet.size() , actualHeaders.size() );
//
//        // list to set equality check will not work
//        // so we need to turn the set into list
//        List<String> expectedHeaders = new ArrayList<>( headerSet );
//
//        assertEquals(expectedHeaders, actualHeaders);

    }
}
