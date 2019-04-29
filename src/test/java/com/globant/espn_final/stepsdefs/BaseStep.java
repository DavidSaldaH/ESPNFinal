package com.globant.espn_final.stepsdefs;

import com.globant.espn_final.pages.EspnHomePage;
import com.globant.espn_final.utilities.StepsUtil;
import cucumber.api.java.Before;

public class BaseStep extends StepsUtil {

    private StepsUtil sUtil;

    public BaseStep(StepsUtil sUtil) {
        this.sUtil = sUtil;
    }

    @Before
    public void before() {
        sUtil.espn = new EspnHomePage(sUtil.driver.getWebDriver());
    }
}
