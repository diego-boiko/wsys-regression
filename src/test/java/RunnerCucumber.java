import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@CucumberOptions(
        plugin = { "summary", "pretty", "html:target/cucumber.html" },
        // glue = {"/src/test/resources/feature/"},
        tags = "@Smoke",
        snippets = SnippetType.CAMELCASE)
@RunWith(Cucumber.class)

public class RunnerCucumber {

}