package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.google.GooglePage;

public class GoogleSteps {

    @Given("^Navigate to GooglePage$")
    public void navigateToGooglePage() {
        GooglePage.open();
    }

    @When("^Send keyword (.*) to the input field$")
    public void sendKeywordSelenideToTheInputField(String keyword) {
        GooglePage.searchInGoogle(keyword);
    }

    @Then("^top (\\d+) matches should be shown$")
    public void topMatchesShouldBeShown(int resultsCount) {
        GooglePage.checkMatchesShow(resultsCount);
    }

    @Then("^the first one should contain (.*)")
    public void theFirstOneShouldContainSelenideOrg(String expectedText) {
        GooglePage.getExpectText(expectedText);
    }
}
