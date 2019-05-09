package com.globant.espn_final.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EspnHomePage extends BasePage {
    public EspnHomePage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(xpath = "//*[@id=\"sideLogin-left-rail\"]/button[2]")
    private WebElement entrarButton;

    @FindBy(id = "disneyid-iframe")
    private WebElement loginIframe;

    @FindBy(xpath = "//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[1]/div/label/span[2]/input")
    private WebElement emailInputLoginIframe;

    @FindBy(xpath = "//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[2]/div/label/span[2]/input")
    private WebElement passwordInputLoginIframe;

    @FindBy(xpath = "//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[3]/button")
    private WebElement conectateButtonLoginIframe;

    @FindBy(id = "global-user-trigger")
    private WebElement userIcon;

    @FindBy(xpath = "//*[@id=\"global-viewport\"]/div[3]/div[1]/ul[1]/li[1]")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//*[@id=\"global-header\"]/div[2]/ul/li[2]/div/div[1]/ul[1]/li[8]/a")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"global-header\"]/div[2]/ul/li[2]/div/div[1]/ul[1]/li[4]/a")
    private WebElement profileButon;

    /*Generals*/

    public void loginByDefault(String email, String password) {
        entrarButton.click();
        getWebDriver().switchTo().frame(loginIframe);
        emailInputLoginIframe.sendKeys(email);
        passwordInputLoginIframe.sendKeys(password);
        conectateButtonLoginIframe.click();
    }

    public void clickUserIcon() {
        getWait().until(ExpectedConditions.elementToBeClickable(userIcon));
        userIcon.click();
    }

    public void welcomeMessage() {
        System.out.println(welcomeMessage.getText());
    }

    /*Login*/

    public void clickEntrarButtonLogin() {
        entrarButton.click();
        getWebDriver().switchTo().frame(loginIframe);
    }

    public void usernmeInputLogin(String username) {
        emailInputLoginIframe.sendKeys(username);
    }

    public void passwordInutLogin(String password) {
        passwordInputLoginIframe.sendKeys(password);
    }

    public void clickConectateButtonLogin() {
        conectateButtonLoginIframe.click();
    }


    /*Register*/

    public void registrarButonRegister() {
        getWebDriver().findElement(By.xpath("//*[@id=\"sideLogin-left-rail\"]/button[1]")).click();
        getWebDriver().switchTo().frame("disneyid-iframe");
    }

    public void inputNameRegister(String name) {
        getWebDriver().findElement(By.xpath("//*[@id=\"did-ui-view\"]/div/section/section/form/section[1]/div[1]/div[1]/label/span[2]/input")).sendKeys(name);
    }

    public void inputLastnameRegister(String Lastname) {
        getWebDriver().findElement(By.xpath("//*[@id=\"did-ui-view\"]/div/section/section/form/section[1]/div[1]/div[2]/label/span[2]/input")).sendKeys(Lastname);
    }

    public void inputEmailRegister(String email) {
        getWebDriver().findElement(By.xpath("//*[@id=\"did-ui-view\"]/div/section/section/form/section[1]/div[2]/div/label/span[2]/input")).sendKeys(email);
    }

    public void inputPasswordRegister(String password) {
        getWebDriver().findElement(By.xpath("//*[@id=\"did-ui-view\"]/div/section/section/form/section[1]/div[4]/div[1]/label/span[2]/input")).sendKeys(password);
    }

    public void clickRegistrarteButtonRegister() {
        getWebDriver().findElement(By.xpath("//*[@id=\"did-ui-view\"]/div/section/section/form/section[6]/div/button")).click();
    }

    // Logout
    public void clickOnLogoutButton() {
        logoutButton.click();
    }

    //Deactivate

    public void clickOnProfileButton() {
        profileButon.click();
        getWebDriver().switchTo().frame("disneyid-iframe");
    }

    public void deleteAcount() {
        JavascriptExecutor je = (JavascriptExecutor) getWebDriver();
        WebElement dlt = getWebDriver().findElement(By.id("cancel-account"));
        je.executeScript("arguments[0].scrollIntoView(true);", dlt);
        dlt.click();
    }

    public void okButton() {
        getWebDriver().findElement(By.xpath("//*[@id=\"did-ui-view\"]/div/section/section/div[2]/button")).click();
    }

    public void deleteButtonConfirm() {
        getWebDriver().findElement(By.xpath("//*[@id=\"did-ui-view\"]/div/section/section/div[2]/button[1]")).click();
    }
}
