package authServer.stepDefinitions;

import authServer.stepImplementation.UserSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.*;


public class authFlow {

    @Steps
    UserSteps user;

    @Given("^the existing user wants to login via \"([^\"]*)\"$")
    public void theUserWantsToLoginToApplication(String clientApplication) {
        user.wantsToLoginToClient(clientApplication);
    }

    @And("^navigates to Login Page")
    public  void isRedirectedToLoginPage()
    {
        user.isRedirectedToLoginPage();
    }

    @When("^he provides correct credentials on Login Page")
    public void theUserProvidesCorrectCredentials() {
        user.providesCredentials("user", "password");
    }

    @When("^he provides wrong credentials on Login Page")
    public void theUserProvidesWrongCredentials() {
        user.providesCredentials("user", "wrong");
    }

    @Then("^he is authorized")
    public void theUserIsAuthorized() {
        user.isRedirectedToApplication();
        user.isAuthorised();
    }

    @Then("^Login Page is displayed with error")
    public void errorIsDisplayed() {
        user.isRedirectedToErrorPage();
    }
}
