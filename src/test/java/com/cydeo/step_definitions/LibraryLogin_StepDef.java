package com.cydeo.step_definitions;

import com.cydeo.pages.LibLoginPage;
import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryLogin_StepDef {

    LibLoginPage loginPage = new LibLoginPage();


    @Given("user is at library login page")
    public void userIsAtLibraryLoginPage() {
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

    }

    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String email, String password) {

        loginPage.login(email, password);

    }

    @Then("user should be at dashboard page")
    public void userShouldBeAtDashboardPage() {

        BrowserUtil.waitFor(2);
        assertTrue(Driver.getDriver().getTitle().equals("Library"));
    }



}
