package com.globant.espn_final.stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepsUtil.StepsUtil;

public class LogoutSteps extends StepsUtil {
    private StepsUtil sUtil;

    public LogoutSteps(StepsUtil sUtil) {
        this.sUtil = sUtil;
    }

    @Given("^I'm on espn home page \"([^\"]*)\" already logged$")
    public void iMOnEspnHomePageAlreadyLogged(String url) {
        sUtil.espn.goTo(url);
        sUtil.espn.loginByDefault();
    }

    @When("^Move cursor over icon user$")
    public void moveCursorOverIconUser() {
        sUtil.espn.clickUserIcon();
    }

    @And("^Click on “Salir” link$")
    public void clickOnSalirLink() {
        sUtil.espn.clickOnLogoutButton();
    }

    @And("^Move cursor over user icon$")
    public void moveCursorOverUserIcon() {
        sUtil.espn.clickUserIcon();
    }

    @Then("^Validate welcome message$")
    public void validateWelcomeMessage() {

    }
}
