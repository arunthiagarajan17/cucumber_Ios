package com.demo.base;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.Properties;

public class Context {

    public static IOSDriver driver;
    protected Properties properties;
    protected static Logger log;

    public Context() {
        try (FileInputStream ip = new FileInputStream(
                "config.properties")) {
            properties = new Properties();
            properties.load(ip);
        } catch (IOException e) {
            log.error(e.getMessage());
        }

    }

    @Before
    protected IOSDriver getDriver() {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "iOS");
            cap.setCapability("platformVersion", "15.5");
            cap.setCapability("deviceName", "iPhone 13");
            cap.setCapability("app", "/Users/arun.thiagarajan/Downloads/SignInApp/build/Release-iphonesimulator/SignInApp.app");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new IOSDriver(url, cap);
        } catch (MalformedURLException e) {
            log.error(e);
        }
        return driver;
    }

    //    To configure the log4j xml file
    private void logger() {
        log = Logger.getLogger(Context.class);
        PropertyConfigurator.configure("src/test/resources/log4j.xml");
    }

    @After
    protected void tearDown() {
        driver.quit();

    }
}
