package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(
        features = "src/test/resources/Feature/loginUI.feature",
        glue= "stepDefinition",
        plugin =  "html:target/Report-html",
        tags = "@Incorrect",
        monochrome = true )

public class TestRunner {

}
