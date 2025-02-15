package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "hooks"}, // Include hooks package
        dryRun=false,    //false: real run  true:compiling and tell missing steps
        tags="@regression",
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/failed.txt",
        }  // JSON report

)
public class TestRunner {
}
