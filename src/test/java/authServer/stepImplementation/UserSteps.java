package authServer.stepImplementation;

import net.thucydides.core.annotations.Step;


public class UserSteps {

    @Step("User is on login page")
    public void isRedirectedToLoginPage() {
        System.out.println("Login Page is loaded");
    }

    @Step("User provides the credentials")
    public void providesCredentials(String user, String password) {
        System.out.println(String.format("Username: %s . Password: %s", user, password));
        }

    @Step("User wants to login to application")
    public void wantsToLoginToClient(String client) {
        System.out.println(String.format("User wants to login to %s", client));
    }

    @Step("User is redirected to the application")
    public void isRedirectedToApplication() {
        System.out.println("User is redirected to application");
    }

    @Step("User is redirected to the Error page")
    public void isRedirectedToErrorPage() {
        System.out.println("User is redirected to the Error page");
    }

    @Step("User is authorized")
    public void isAuthorised() {

        System.out.println("User is authorized");
    }

}

