package com.scripbox.goibibo.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*The purpose of this class is to parse the values from the global config file.
I have created this file so that the person working on this project is free to define his own global parameters.
Also for the purpose of this test, i have only created 5 parameters. If needed user can also extend these later on.*/

public class globalPaths {
    String inputFile;
    String chromeDriver;
    String browser;
    String reporter;
    String screenShotLocation, errorScreenShotLocation, otherScreenShotLocation;

    public globalPaths() {


    String globalConfigPath = "/src/main/resources/globalConfig.properties";
    Properties globalProps = new Properties();
    InputStream globalConfigs;
        try {
        globalConfigs = new FileInputStream(new File("").getAbsolutePath() + globalConfigPath);
        // load a properties file
        globalProps.load(globalConfigs);
    } catch (
    IOException ex) {
        ex.printStackTrace();
    }
    inputFile = new File("").getAbsolutePath() + globalProps.getProperty("input");
    chromeDriver = new File("").getAbsolutePath() + globalProps.getProperty("chromeDriver");
    reporter = new File("").getAbsolutePath() + globalProps.getProperty("reporter");
    screenShotLocation = new File("").getAbsolutePath() + globalProps.getProperty("screenShotLocation");
    errorScreenShotLocation = new File("").getAbsolutePath() + globalProps.getProperty("errorScreenShotLocation");
    browser = globalProps.getProperty("browser");
}

    public String getInput() {
        return this.inputFile;
    }

    public String getChromeDriver() {
        return this.chromeDriver;
    }

    public String getReporter() {
        return this.reporter;
    }

    public String getScreenShotLocation() {
        return this.screenShotLocation;
    }

    public String getErrorScreenShotLocation() {
        return this.errorScreenShotLocation;
    }

    public String getBrowser() {
        return this.browser;
    }



}
