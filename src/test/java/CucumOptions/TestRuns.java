package CucumOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//feature file info and Test definition param

@RunWith(Cucumber.class)	
@CucumberOptions(
		features = "src\\test\\java\\features",
		glue = "stepDefinitions",
//this will rerun the failed test cases in cucumber		
    plugin = {"rerun:target/rerun.txt"})

public class TestRuns {
	
}