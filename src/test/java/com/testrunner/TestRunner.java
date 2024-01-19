package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\featurefile\\orangehrm.feature"
                  ,glue ="com.stepdef")

public class TestRunner {

}
