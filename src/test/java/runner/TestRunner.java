package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/tfl.feature"},
        glue = "step-definitions.Tfl",
        snippets = CAMELCASE,
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"},
        monochrome = true,tags = "@test1")

public class TestRunner {
}

