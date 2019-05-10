package com.globant.espn_final.stepsdefs;

import cucumber.api.PendingException;
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

    @And("^Click\\(\\) on “Perfil de ESPN” button$")
    public void clickOnPerfilDeESPNButton() {
        sUtil.espn.clickOnProfileButton();
    }

    @When("^Click\\(\\) on “Eliminar cuenta” Link$")
    public void clickOnEliminarCuentaLink() {
        sUtil.espn.deleteAcount();
    }

    @And("^Click\\(\\) on “Sí, eliminar esta cuenta\\.” button$")
    public void clickOnSíEliminarEstaCuentaButton() {
        sUtil.espn.deleteButtonConfirm();
    }

    /*
    @And("^Click\\(\\) on “Ok” button$")
    public void clickOnOkButton() {
        sUtil.espn.okButton();
    }*/

    @And("^I'm verify on User icon$")
    public void iMVerifyOnUserIcon() {
        sUtil.espn.okButton();
        sUtil.espn.clickUserIcon();
    }

    @Then("^I should see the default welcome message$")
    public void iShouldSeeTheDefaultWelcomeMessage() {
        sUtil.espn.welcomeMessage();
    }
}
