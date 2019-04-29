package com.globant.espn_final.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

    private WebDriver webDriver;

    public WebDriver buildDriver(String browser) {
        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver.exe");
                webDriver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\Proyectos\\TAE\\EspnFinal\\ESPNFinal\\resources\\drivers\\chromedriver72.exe");
                webDriver = new ChromeDriver();
                break;
        }
        return webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
