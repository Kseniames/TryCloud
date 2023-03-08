package com.trycloud.step_definitions;

import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US07_StepDefs {

US07_StepDefs us07_stepDefs = new US07_StepDefs();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get("url");
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

    }
    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {

    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {

    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

    }

}
