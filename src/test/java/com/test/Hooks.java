package com.test;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static AppiumDriver<?> driver;

    public static String platform="";

    public static AppiumDriver<?> validateDriver() throws MalformedURLException {

        platform = System.getProperty("plataforma");
        System.out.println("Sua plataforma é: " + platform);

        if (platform.equals("android")) {

            DesiredCapabilities cap = new DesiredCapabilities();
            File app = new File("apps/qafood.apk");
            cap.setCapability("app", app.getAbsolutePath());
            cap.setCapability("platformName", "Android");
            cap.setCapability("deviceName", "emulator-5554");
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }else if (platform.equals("ios")) {

            DesiredCapabilities cap = new DesiredCapabilities();
            File app = new File("");
            cap.setCapability("app", app.getAbsolutePath());
            cap.setCapability("platformName", "Android");
            cap.setCapability("deviceName", "emulator-5554");
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        }else {
            System.out.println("Plataforma não encontrada, utilize android ou ios");
        }

        return driver;
    }

    public static AppiumDriver<?> getDriver(){
        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
        }
    }

    @Before
    public void startProject() throws MalformedURLException {
        if(getDriver() != null){
            getDriver().launchApp();
        }else {
            validateDriver();
        }

    }
}
