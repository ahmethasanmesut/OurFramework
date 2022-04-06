package com.hanume.Step_Defs;

import com.hanume.Utilities.ConfigurationReader;
import com.hanume.Utilities.Driver;
import com.hanume.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class OrderStepDef {

    OrderPage orderPage = new OrderPage();

    @Given("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("User move to dropdown")
    public void user_move_to_dropdown() throws InterruptedException {
        Driver.get().manage().window().maximize();
        orderPage.cookie.click();
        Thread.sleep(3000);
        orderPage.orderTab.click();
    }
    @When("click on ProDinner Demo")
    public void click_on_pro_dinner_demo() {
        orderPage.proDinner.click();
    }
    @When("click create button")
    public void click_create_button() {

    }
}
