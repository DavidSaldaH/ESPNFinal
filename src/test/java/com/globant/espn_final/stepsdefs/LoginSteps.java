package com.globant.espn_final.stepsdefs;

import com.globant.espn_final.pages.EspnHomePage;
import com.globant.espn_final.utilities.StepsUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends StepsUtil {
    private StepsUtil sUtil;

    public LoginSteps(StepsUtil sUtil) {
        this.sUtil = sUtil;
    }

    @Given("^I'm on the ESPN home page on url \"([^\"]*)\"$")
    public void iMOnTheESPNHomePageOnUrl(String url) {
        espn.goTo(url);
    }

    @When("^I click on Entrar button$")
    public void iClickOnRegistrarButton() {
        espn.clickEntrarButtonLogin();
    }

    @And("^I fill in Username with \"([^\"]*)\"$")
    public void iFillInUsernameWith(String username) {
        espn.usernmeInputLogin(username);
    }

    @And("^I fill in Password with \"([^\"]*)\"$")
    public void iFillInPasswordWith(String password) {
        espn.passwordInutLogin(password);
    }

    @And("^I click on Conctate button$")
    public void iClickOnConctateButton() {
        espn.clickConectateButtonLogin();
    }

    @And("^I click on User icon$")
    public void iClickOnUserIcon() {
        espn.clickUserIcon();
    }

    @Then("^I should see Welcome \"([^\"]*)\" message$")
    public void iShouldSeeWelcomeMessage(String arg0) {
        espn.welcomeMessage();
    }
}
