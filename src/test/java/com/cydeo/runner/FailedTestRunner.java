package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// the link on cucumber report types :   https://cucumber.io/docs/cucumber/reporting/?sbsearch=reporting
//this test runner has only one purpose -> to run failed scenario that stored inside  rerun.txt
@RunWith(Cucumber.class)
@CucumberOptions(
                    features = "@target/rerun_tests.txt",
                    glue = "com/cydeo/step_definitions",
                    tags = "@ui"                            // if wa only want to rerun scenarios with @ui tag
)




public class FailedTestRunner {
}
