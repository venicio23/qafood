package com.test.screen;

import io.appium.java_client.android.AndroidDriver;

import java.util.NoSuchElementException;

import static com.test.Hooks.getDriver;

public class Utils {

    public void scrollToTextAndroid(String txt) {
        try {
            ((AndroidDriver)getDriver()).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + txt + "\").instance(0))");
        } catch (Exception e) {
            throw new NoSuchElementException("Não encontrado" + e);
        }
    }

}
