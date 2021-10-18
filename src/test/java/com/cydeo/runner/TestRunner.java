package com.cydeo.runner;
/*
-This class has only one purpose
-instructing how and what we feature we want to run
-where the step definitions are
- do we want to just generate missing step definitions
-do we want to get json, html, report
-do we want to filter the test run according to certain tag
 the info link :
     https://cucumber.io/docs/cucumber/api/#running-cucumber
*/
import io.cucumber.junit.Cucumber; // inside parameter > Cucumber.class  > comes from io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith; // the @RunWith comes from org.junit.runner


@RunWith(Cucumber.class)
@CucumberOptions(
                    features = "classpath:features",                    // or full path as->    "src/test/resources/features",
                                                                        // we copy the path of feature folder and add to here, and
                    glue ="com/cydeo/step_definitions",                 // for the "glue" we add the path of step_definitions
                    publish = true,                                     // it will give you public link of your local html report
                    plugin = {"pretty",
                                    "html:target/cucumber_report.html",
                                    "rerun:target/rerun_tests.txt",    // to generate an html report under target folder
                                    "me.jvt.cucumber.report.PrettyReports:target"},
                    dryRun = false                                      // if dryRun = true -> it just quickly check for missing step
                                                                        // if dryRun = false -> it runs the tests
                   ,tags= "@smoke or @salad"                           //if we want run multiple tags - >  @smoke and @wip                                        // it runs the Feature or Scenario with the given tag we gave to a
                )

public class TestRunner {

}
