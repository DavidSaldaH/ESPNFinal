package com.globant.espn_final.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public BasePage(WebDriver pDriver) {
        PageFactory.initElements(pDriver, this);
        webDriver = pDriver;
        wait = new WebDriverWait(webDriver, 10);
    }

    public void dispose() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public void goTo(String url) {
        webDriver.get(url);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
