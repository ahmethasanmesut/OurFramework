package com.hanume.Step_Defs;

import com.github.javafaker.Faker;
import com.hanume.Utilities.BrowserUtils;
import com.hanume.Utilities.ConfigurationReader;
import com.hanume.Utilities.Driver;
import com.hanume.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class OrderStepDef {

    OrderPage orderPage = new OrderPage();
    Faker faker = new Faker(Locale.ENGLISH);
    Random rn = new Random();
    String day;


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
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
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
        orderPage.chef.click();
        BrowserUtils.waitFor(2);
        int size = orderPage.chefNames.size();
        System.out.println("size = " + size);
        int randomNumber = rn.nextInt(size)+1;
        orderPage.chefNames.get(randomNumber).click();
        orderPage.address.click();
        String address = faker.address().city();
        orderPage.address.sendKeys(address);
        orderPage.start.click();
        orderPage.dateBtn.click();
        orderPage.may.click();
        WebElement element = orderPage.selectDate();
        day = element.getText();
        element.click();
        orderPage.time.sendKeys("12:25",Keys.ENTER);
        BrowserUtils.waitFor(3);
        Actions actions = new Actions(Driver.get());
        actions.doubleClick(orderPage.duration).doubleClick(orderPage.duration).perform();
        BrowserUtils.waitFor(2);
        orderPage.meals.click();
        BrowserUtils.waitFor(2);
       orderPage.potato.click();
       orderPage.pancake.click();
       orderPage.ok2Btn.click();

    }

    @Then("assert date is successfully completed")
    public void assertDateIsSuccessfullyCompleted() {
        BrowserUtils.waitFor(3);
        String actualDate = orderPage.actDate.getText();
        String[] array = actualDate.split(" ");
        System.out.println("array[0] = " + array[0]);
        String expectedDay = day;
        String[] arrDay = array[0].split("/");
        String actualDay = arrDay[1];
        Assert.assertEquals(expectedDay,actualDay);
    }

}
