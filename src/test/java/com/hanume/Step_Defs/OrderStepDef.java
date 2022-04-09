package com.hanume.Step_Defs;

import com.github.javafaker.Faker;
import com.hanume.Utilities.BrowserUtils;
import com.hanume.Utilities.ConfigurationReader;
import com.hanume.Utilities.Driver;
import com.hanume.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Locale;

public class OrderStepDef {

    OrderPage orderPage = new OrderPage();
    Faker faker = new Faker(Locale.ENGLISH);

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
        orderPage.createBtn.click();
        BrowserUtils.waitFor(4);
        String dish = faker.food().dish();
        orderPage.name.sendKeys(dish + Keys.TAB + Keys.ENTER);
        BrowserUtils.waitFor(5);
        orderPage.searchBox.sendKeys("United Kingdom"+Keys.ENTER);
        BrowserUtils.waitFor(1);
        orderPage.ukTable.click();
        BrowserUtils.waitFor(1);
        orderPage.okBtn.click();


    }
}
