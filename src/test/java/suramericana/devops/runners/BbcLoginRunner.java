package suramericana.devops.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//This notation allows to see step definitions in camelcase
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/features/bbc_authentication.feature",
        glue="suramericana.devops.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = {"@AcceptanceTest"}
       )

public class BbcLoginRunner {
	// Example run tests with tags
	//-Dtags="AcceptanceTests, otherTests"
}
