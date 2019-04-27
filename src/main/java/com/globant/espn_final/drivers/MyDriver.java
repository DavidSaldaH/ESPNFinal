package com.globant.espn_final.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

    private WebDriver webDriver;

    public MyDriver(String browser) {
        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver.exe");
                webDriver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Proyectos\\TAE\\GlobalElements\\chromedriver72.exe");
                webDriver = new ChromeDriver();
                break;
        }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
