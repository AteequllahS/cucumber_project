package com.cydeo.step_definitions;

import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

//We can set up a hook class that contains
//methods that fun before each scenario and after each scenario
//or even we learn tags
// we can run certain code before and after each scenario that tagged with certain tag

public class Hooks {

    //this before comes from: ( io.cucumber.java )

    //by adding the tag inside @Before(  ) we can filter our tests
    @Before("@ui")
    public void setupDriver() {
        System.out.println("This is From @before inside Hook class");
        // set up implicit wait:
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }

    //this before comes from: ( io.cucumber.java )
    //screen shot and close browser method
    @After("@ui")
    public void tearDown(Scenario scenario) {

        System.out.println("This is from @After inside Hook class");

        //screenShot
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            // this is the line to attach screenshot to scenario
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        //after each method that closes driver
        BrowserUtil.waitFor(2);
        Driver.closeBrowser();
    }

}

