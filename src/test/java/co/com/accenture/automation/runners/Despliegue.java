package co.com.accenture.automation.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(value = CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Despliegue.feature",
        glue = "co.com.accenture.automation.stepdefinitions.DespliegueStepDefinitions",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        plugin = {"json:reportJson/cucumber.json"})
public class Despliegue {

}
