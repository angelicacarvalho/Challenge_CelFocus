package Project;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        strict = true,
        glue = {"Project"},
        plugin = {"json:target/cucumber.json","pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        monochrome = true,
        dryRun = false
        )
public class TestRunner {
}