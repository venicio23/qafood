package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = {"@login"},
        glue = {"com.test"}
)

public class RunTest {

    @AfterClass
    public static void closeApp() {
        Hooks.quitDriver();
    }

}
