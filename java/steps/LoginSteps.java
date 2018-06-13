package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.automationpractice.LoginPage;
import pages.automationpractice.UserFormPage;

public class LoginSteps{

    @Given("^I navigate to LoginPage$")
    public void iNavigateToLoginPage() {
        LoginPage.open();
    }

    @And("^I enter the mail \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterTheMailAndPassword(String email, String password) {
        LoginPage.Login(email,password);
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        LoginPage.signin();
    }

    @Then("^I should see my userName$")
    public void iShouldSeeMyUserName() {
        UserFormPage.checkUserNameAtDashboard("Test Testowski");
    }

    @And("^I enter the ([^\"]*) and ([^\"]*)$")
    public void iEnterTheUserMailAndPassWord(String email,String password) {
        LoginPage.Login(email,password);
    }

    @Then("^I should see alert danger$")
    public void iShouldSeeAlertDanger() {
        LoginPage.checkErrorMessage();
    }

}
