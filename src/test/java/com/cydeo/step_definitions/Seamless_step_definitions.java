package com.cydeo.step_definitions;

import com.cydeo.pages.SeamlessPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Seamless_step_definitions {
    SeamlessPage seamlessPage = new SeamlessPage();

    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigReader.getProperty("seamless.url"));

    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        seamlessPage.txt_username.sendKeys(ConfigReader.getProperty("seamlesslyUsername"));

        BrowserUtils.sleep(1);
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        seamlessPage.txt_password.sendKeys(ConfigReader.getProperty("seamlesslyPassword"));
        BrowserUtils.sleep(1);
    }

    @When("user clicks the log in button")
    public void user_clicks_the_log_in_button() {
        seamlessPage.loginButton.click();
        BrowserUtils.sleep(1);

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
    BrowserUtils.verify_title_contains("Dashboard");

    }
}
