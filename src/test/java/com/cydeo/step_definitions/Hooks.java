package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setupMethod1() {
       //  Driver.getDriver().get(ConfigReader.getProperty("env"));

    }




    @After
    public void tearDownMethod(Scenario scenario) {

        if(scenario.isFailed()){


          byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);


            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

    }

    @After
    public void tearDown(){
        BrowserUtils.sleep(1);
        Driver.closeDriver();

    }

}
