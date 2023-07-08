package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features",
		glue= {"stepDefinitions"},
		plugin= {"pretty","html:target/report.html"}
		//dryRun=true,
		//monochrome=true
		)
public class cucumberRunner {
	

}
