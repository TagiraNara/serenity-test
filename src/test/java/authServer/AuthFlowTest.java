package authServer;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/authServer/",
        glue={"authServer/stepDefinitions"},
        tags={"@success","@client1"})
public class AuthFlowTest {

}
