package runner_package;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\feature", glue = { "stepdefination" }, monochrome = true, plugin = {
		"pretty", "html:target/HtmlReports/reports.html" })
public class Runner_class {

}
