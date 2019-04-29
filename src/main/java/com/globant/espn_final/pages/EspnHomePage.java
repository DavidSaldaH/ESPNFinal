package com.globant.espn_final.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EspnHomePage extends BasePage {
    public EspnHomePage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(xpath = "//*[@id=\"sideLogin-left-rail\"]/button[2]")
    private WebElement entrarButton;

    /*@FindBy(xpath = "//*[@id=\"disneyid-iframe\"]")
    private WebElement loginIframe;*/

    int loginIframe = 5;

    @FindBy(xpath = "//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[1]/div/label/span[2]/input")
    private WebElement emailInputLoginIframe;

    @FindBy(xpath = "//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[2]/div/label/span[2]/input")
    private WebElement passwordInputLoginIframe;

    @FindBy(xpath = "//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[3]/button")
    private WebElement conectateButtonLoginIframe;

    @FindBy(xpath = "//*[@id=\"global-header\"]/div[2]/ul/li[2]")
    private WebElement userIcon;

    public void prueba() {
        entrarButton.click();
        getWebDriver().switchTo().frame(loginIframe);
        System.out.println(getWebDriver().getTitle());
        emailInputLoginIframe.sendKeys("asd@123.com");
        passwordInputLoginIframe.sendKeys("asd@123");
        conectateButtonLoginIframe.click();
    }

}
