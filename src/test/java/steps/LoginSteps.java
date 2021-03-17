package steps;

import cucumber.api.java.en.Given;

public class LoginSteps {
    @Given("^I am in the login page$")
    public void navigateLoginPage(){
        throw new cucumber.api.PendingException();
    }

    @When("I set the {string} and {string}")
    public void setCredentials(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("i should see the {string}")
    public void expectation(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
