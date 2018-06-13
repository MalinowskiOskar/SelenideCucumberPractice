package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.demoqa.RegistrationPage;

public class RegistrationSteps {

    @Given("^user navigate to RegistrationPage$")
    public void userNavigateToRegistrationPage() {
        RegistrationPage.open();
    }

    @And("^user enter ([^\"]*) and ([^\"]*)$")
    public void userEnterFirstNameAndLastName(String name,String surname) {
        RegistrationPage.fillFirstNameLastName(name,surname);
    }

    @When("^user click marialStatus and Hobby$")
    public void userClickMarialStatusAndHobby() {
        RegistrationPage.selectMarialAndHobby();
    }

    @Then("^marialStatus and Hobby should be checked$")
    public void marialstatusAndHobbyShouldBeChecked() {
        RegistrationPage.checkthatMarialStatusAndHobbyisChecked();
    }

    @And("^user enter ([^\"]*) ,([^\"]*) and ([^\"]*)$")
    public void userEnterPhoneNumberUserNameAndEMail(String phone,String username,String email) {
        RegistrationPage.fillPhoneUserNameEmail(phone,username,email);
    }

    @When("^user click SubmitButton$")
    public void userClickSubmitButton() {
        RegistrationPage.submit();
    }

    @Then("^user should see successmessege$")
    public void userShouldSeeSuccessmessege() {
        RegistrationPage.successMessegeShouldBeVisible();
    }

    @And("^user enter <passWord> and <confirmpassWord>$")
    public void userEnterPassWordAndConfirmpassWord(String pass,String cpass) {
        RegistrationPage.fillPasswordConfirmPassword(pass, cpass);

    }

    @And("^user enter firstName ([^\"]*) surname ([^\"]*)$")
    public void userEnterFirstNameFirstNameSurnameLastName(String name,String surname) {
        RegistrationPage.fillFirstNameLastName(name,surname);
    }

    @And("^user enter phoneNumber ([^\"]*), userName ([^\"]*) eMail ([^\"]*)$")
    public void userEnterPhoneNumberPhoneNumberUserNameUserNameEMailEMail(String phone,String username,String email) {
        RegistrationPage.fillPhoneUserNameEmail(phone,username,email);
    }

    @And("^user enter passWord ([^\"]*) confirmpassWord ([^\"]*)$")
    public void userEnterPassWordPassWordConfirmpassWordConfirmpassWord(String pass,String cpass) {
        RegistrationPage.fillPasswordConfirmPassword(pass, cpass);
    }

    @Then("^user should see error$")
    public void userShouldSeeError() {
        RegistrationPage.errorShouldBeVisible();
    }
}
