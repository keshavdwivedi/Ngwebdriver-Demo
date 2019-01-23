package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src//test//resources//Features"},glue= {"imr05steps","fi468steps","im440steps","ma530steps","ma531steps","fi463steps","fi431steps","fi441steps","fi423clsteps","fd494steps","fi960clssteps","fi953clssteps","in880clsteps","basepackage","wl310steps","ac020steps","fi944clssteps"} ,plugin={"html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt"},tags="@t")

@Test
public class MainRunner extends AbstractTestNGCucumberTests {
	
}

