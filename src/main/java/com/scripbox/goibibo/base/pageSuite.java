package com.scripbox.goibibo.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.scripbox.goibibo.library.globalPaths;

import org.apache.log4j.Logger;

/*The purpose of this class is to define the chrome driver path, pass on the browser runtime options and to create the
chromdriver instance.
Maintaining this as a seperate class enables the tester to later define new browser options later on
or define a new browser configuration like Firefox, IE, safari at a single location.*/


public class pageSuite {

    protected static WebDriver webDriver;
    private static Logger log;
    public static String url;


    public static void setUp() {
        globalPaths path = new globalPaths();
        log = Logger.getLogger("rootLogger");
        /*  log.info("Launching Chrome Browser");*/
        System.setProperty("webdriver.chrome.driver", path.getChromeDriver());
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--log-level=3");
        // this.webDriver = new ChromeDriver(chromeOptions);
        webDriver = new ChromeDriver();
    }

}
