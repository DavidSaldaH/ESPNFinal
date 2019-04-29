package com.globant.espn_final.stepsdefs;

import stepsUtil.StepsUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps extends StepsUtil {
    private StepsUtil sUtil;

    public RegisterSteps(StepsUtil sUtil) {
        this.sUtil = sUtil;
    }

    @Given("^I'm on the ESPN home page \"([^\"]*)\"$")
    public void iMOnTheESPNHomePage(String url) {
        sUtil.espn.goTo(url);
    }

    @When("^I click on Registrarse button$")
    public void iClickOnRegistrarseButton() {
        sUtil.espn.registrarButonRegister();
    }

    @And("^I fill in Name with \"([^\"]*)\"$")
    public void iFillInNameWith(String name) {
        sUtil.espn.inputNameRegister(name);
    }

    @And("^I fill in LastName with \"([^\"]*)\"$")
    public void iFillInLastNameWith(String lastName) {
        sUtil.espn.inputLastnameRegister(lastName);
    }

    @And("^I fill in Email with \"([^\"]*)\"$")
    public void iFillInEmailWith(String email) {
        sUtil.espn.inputEmailRegister(email);
    }

    @And("^Fill in Password with \"([^\"]*)\"$")
    public void fillInPasswordWith(String password) {
        sUtil.espn.inputPasswordRegister(password);
    }

    @And("^I click on Registrate button$")
    public void iClickOnRegistrateButton() {
        sUtil.espn.clickRegistrarteButtonRegister();
    }

    @And("^I verify on User icon$")
    public void iVerifyOnUserIcon() {
        sUtil.espn.clickUserIcon();
    }

    @Then("^I should see the Welcome \"([^\"]*)\" message$")
    public void iShouldSeeTheWelcomeMessage(String name) {
        System.out.println(name);
    }
}
