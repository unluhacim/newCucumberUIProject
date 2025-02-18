package hooks;

import base.BaseTest;
import base.PageInitializer;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment.setup;

public class Hooks extends BaseTest {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Starting scenario: " + scenario.getName());
        BaseTest.setUp();
        // You can add any setup steps specific to a scenario here if needed
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Finished scenario: " + scenario.getName());
//        if (scenario.isFailed()) {
//            // Take screenshot on failure
//            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "screenshot.png");
//        }
        BaseTest.tearDown();
    }
}
