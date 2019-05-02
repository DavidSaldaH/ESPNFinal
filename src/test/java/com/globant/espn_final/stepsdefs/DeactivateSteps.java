package com.globant.espn_final.stepsdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepsUtil.StepsUtil;

public class DeactivateSteps extends StepsUtil {
    private StepsUtil sUtil;

    public DeactivateSteps(StepsUtil sUtil) {
        this.sUtil = sUtil;
    }

    @Given("^On espn page \"([^\"]*)\" already logged$")
    public void onEspnPageAlreadyLogged(String url) {
        sUtil.espn.goTo(url);
        sUtil.espn.loginByDefault();
    }

    @When("^Click on user icon$")
    public void clickOnUserIcon() {
        sUtil.espn.clickUserIcon();
    }

    @And("^Click\\(\\) on “Perfil de ESPN” button$")
    public void clickOnPerfilDeESPNButton() {
        sUtil.espn.clickOnProfileButton();
    }

    @Then("^Validate “Perfil de ESPN” modal$")
    public void validatePerfilDeESPNModal() {
        sUtil.espn.validateIframe();
    }

    @When("^Click\\(\\) on “Eliminar cuenta” Link$")
    public void clickOnEliminarCuentaLink() {
        sUtil.espn.deleteAcount();
    }

    @And("^Click\\(\\) on “Sí, eliminar esta cuenta\\.” button$")
    public void clickOnSíEliminarEstaCuentaButton() {
        sUtil.espn.deleteButtonConfirm();
    }

    @And("^Put cursor over icon user$")
    public void putCursorOverIconUser() {
        sUtil.espn.clickUserIcon();
    }

    @Then("^I should see the default welcome message$")
    public void iShouldSeeTheDefaultWelcomeMessage() {
        sUtil.espn.welcomeMessage();
    }
}