package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "features\\SummerDresses.feature",
                glue = {"stepsdefs"}
                ,plugin = {"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
                ,dryRun = false
                ,tags = {"@SmokeTest"}
                ,monochrome = true
                , strict = true
        )
public class TestRunner {
}
