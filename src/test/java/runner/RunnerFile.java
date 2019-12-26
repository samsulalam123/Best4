package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
plugin= {"pretty","html:target/cucumber-reports", "json:target/cucumber.json"},
	snippets=SnippetType.UNDERSCORE,
	features = "./src/test/resources/login.feature",
	glue= {"stepdef"},
	tags= {"@Login"},
	monochrome = true,
	strict = true,
	dryRun = false
	)


public class RunnerFile extends AbstractTestNGCucumberTests {

}
