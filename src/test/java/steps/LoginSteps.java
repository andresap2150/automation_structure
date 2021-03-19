package steps;

import config.Context;
import config.ErrorMessgeConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.LoginMethods;
import org.aeonbits.owner.ConfigFactory;

public class LoginSteps {

    private LoginMethods loginMethods;

    @Given("^I am in the login page$")
    public void navigateLoginPage(){
        loginMethods = new LoginMethods();
        loginMethods.goLoginPage();
    }

    @When("I set the {string} and {string}")
    public void setCredentials(String username, String password) {
        loginMethods.setUsernameAndPassword(username,password);
    }

    @Then("i should see the {string}")
    public void expectation(String expectedMessage) {
        ErrorMessgeConfig config = ConfigFactory.create(ErrorMessgeConfig.class);
        String actualMSg=loginMethods.getErrorMessage();
        Context.softAssertions.assertThat(actualMSg).withFailMessage(config.messagesNotEquals()).isEqualTo(expectedMessage);
    }
}
