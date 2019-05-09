package com.globant.espn_final.stepsdefs;

import com.globant.espn_final.drivers.MyDriver;
import com.globant.espn_final.pages.EspnHomePage;
import cucumber.api.java.After;
import stepsUtil.StepsUtil;
import cucumber.api.java.Before;

public class BaseStep extends StepsUtil {

    private StepsUtil sUtil;

    public BaseStep(StepsUtil sUtil) {
        this.sUtil = sUtil;
    }

    @Before
    public void before() {
        MyDriver driver = new MyDriver(System.getProperty("browser"));
        sUtil.driver = driver.getWebDriver();
        sUtil.espn = new EspnHomePage(sUtil.driver);
        sUtil.espn.getWebDriver().manage().window().maximize();
    }

    @After
    public void after() {
        sUtil.espn.dispose();
    }
}
