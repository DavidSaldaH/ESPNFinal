package com.globant.espn_final.stepsdefs;

import com.globant.espn_final.drivers.MyDriver;
import com.globant.espn_final.pages.BasePage;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Parameters;

public class LoginSteps {

    BasePage base;
    MyDriver driver;

    @Before
    public void before() {
        driver = new MyDriver("chrome");
        base = new BasePage(driver.getWebDriver());
    }

    @After
    public void after(Scenario scenario) {
        base.dispose();
        if (scenario.isFailed()) {
            System.out.println("================ Test Fallo ===============");
        } else {
            System.out.println("================ Test Paso ================");
        }
    }

    @Given("^I'm on the ESPN home page on url \"([^\"]*)\"$")
    public void iMOnTheESPNHomePageOnUrl(String url) {
        base.prueba();
    }

    @When("^I click on Registrar button$")
    public void iClickOnRegistrarButton() {
        base.prueba();
    }

    @And("^I fill in Username with \"([^\"]*)\"$")
    public void iFillInUsernameWith(String arg0) {
        base.prueba();
        throw new PendingException();
    }

    @And("^I fill in Password with \"([^\"]*)\"$")
    public void iFillInPasswordWith(String arg0) {
        base.prueba();
        throw new PendingException();
    }

    @And("^I click on Conctate button$")
    public void iClickOnConctateButton() {
        base.prueba();

    }

    @And("^I click on User icon$")
    public void iClickOnUserIcon() {
        base.prueba();
    }

    @Then("^I should see Welcome \"([^\"]*)\" message$")
    public void iShouldSeeWelcomeMessage(String arg0) {
        base.prueba();
        throw new PendingException();
    }
}
