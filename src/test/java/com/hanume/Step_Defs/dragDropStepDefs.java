package com.hanume.Step_Defs;

import com.hanume.Utilities.BrowserUtils;
import com.hanume.Utilities.Driver;
import com.hanume.pages.DragDropPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

public class dragDropStepDefs {
    DragDropPages dragDropPages = new DragDropPages();
    Actions actions = new Actions(Driver.get());
    JavascriptExecutor js = ((JavascriptExecutor) Driver.get());

    @When("Handle with cookies")
    public void handleWithCookies() {
        Driver.get().manage().window().maximize();
        dragDropPages.cookie.click();

    }

    @When("user move all items inside first box")
    public void userMoveAllItemsInsideFirstBox() {
        BrowserUtils.waitFor(3);
        js.executeScript("window.scrollBy(0,750)","");
        BrowserUtils.waitFor(3);
        js.executeScript("window.scrollBy(0,750)","");
        BrowserUtils.waitFor(3);
        js.executeScript("window.scrollBy(0,750)","");
        BrowserUtils.waitFor(3);
        js.executeScript("window.scrollBy(0,1500)","");

         BrowserUtils.waitFor(2);

        actions.clickAndHold(dragDropPages.from4)
                .moveToElement(dragDropPages.toFirstBoxFour).release().perform();
        // actions.dragAndDrop(dragDropPages.from4, dragDropPages.toFirstBox).perform();
        BrowserUtils.waitFor(2);
        //actions.clickAndHold(dragDropPages.from5)
         //       .moveToElement(dragDropPages.toFirstBox).build().perform();
      //  actions.dragAndDrop(dragDropPages.from5,dragDropPages.toFirstBox).perform();
        //BrowserUtils.waitFor(2);

   //     actions.clickAndHold(dragDropPages.from6)
       //         .moveToElement(dragDropPages.toFirstBox).build().perform();
         //actions.dragAndDrop(dragDropPages.from6, dragDropPages.toFirstBox).perform();
        //BrowserUtils.waitFor(2);
        //actions.clickAndHold(dragDropPages.from7)
          //      .moveToElement(dragDropPages.toFirstBox).build().perform();
         //actions.dragAndDrop(dragDropPages.from7, dragDropPages.toFirstBox).perform();
    }

    @Then("assert that all items move successfully under first box")
    public void assertThatAllItemsMoveSuccessfullyUnderFirstBox() {

    }


}
