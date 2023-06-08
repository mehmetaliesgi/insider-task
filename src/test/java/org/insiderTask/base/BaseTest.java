package org.insiderTask.base;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class BaseTest {
    static WebDriver webDriver = null;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--dns-prefetch-disable");
        options.addArguments("start-maximized");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        options.addArguments("disable-popup-blocking");
        options.addArguments("--disable-gpu");
        setWebDriver(new ChromeDriver(options));
        getWebdriver().navigate().to("https://useinsider.com/");
    }

    public static WebDriver getWebdriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    public void tearDown() { getWebdriver().quit(); }
}
