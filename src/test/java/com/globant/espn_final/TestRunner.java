package com.globant.espn_final;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.globant.espn_final.stepsdefs"},
        tags = {"@Register, @Login, @Logout,@Deactivate"},
        format = {
                "pretty"
        })

public class TestRunner {

    private TestNGCucumberRunner testNGCucumberRunner;

    @Parameters({"browser"})
    @BeforeClass(alwaysRun = true)
    public void beforeClass(String browser) {
        System.setProperty("browser", browser);
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }
}

