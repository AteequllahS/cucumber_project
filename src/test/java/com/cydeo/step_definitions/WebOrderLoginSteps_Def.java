package com.cydeo.step_definitions;

import com.cydeo.pages.WCommonArea;
import com.cydeo.pages.WLoginPage;
import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class WebOrderLoginSteps_Def{

    //to let all methods have access to this
    WLoginPage loginPage;
    WCommonArea commonArea;

    @Given("we are at web order login page")
    public void we_are_at_web_order_login_page() {
        loginPage = new WLoginPage();
        loginPage.goTo();
        assertEquals("Web Orders Login",Driver.getDriver().getTitle());

    }

    @When("we provide valid credentials")
    public void we_provide_valid_credentials() {

        loginPage.login("Tester", "test");
        BrowserUtil.waitFor(1);

    }

    @Then("we should see all order page")
    public void we_should_see_all_order_page() {

        BrowserUtil.waitFor(2);
        assertTrue(Driver.getDriver().getTitle().equals("Web Orders"));

        commonArea=new WCommonArea();
        commonArea.logoutLink.click();
        BrowserUtil.waitFor(1);

    }
    @When("we provide invalid credentials")
    public void weProvideInvalidCredentials() {

        BrowserUtil.waitFor(1);
        loginPage.login("Tester01", "InvalidPassword");
        loginPage.loginButton.click();

    }

    @Then("we should  still be on login page")
    public void weShouldStillBeOnLoginPage() {
        BrowserUtil.waitFor(1);
        assertTrue(Driver.getDriver().getTitle().equals("Web Orders Login"));

    }


    @And("login error message should be present")
    public void loginErrorMessageShouldBePresent() {
        assertTrue(loginPage.errorMsg.isDisplayed());
        BrowserUtil.waitFor(1);
    }

    @When("user provide username {string} and password {string}")
    public void userProvideUsernameAndPassword(String username, String password) {

        loginPage.goTo();
        BrowserUtil.waitFor(1);
        loginPage.login(username, password);
        BrowserUtil.waitFor(1);
    }
}
