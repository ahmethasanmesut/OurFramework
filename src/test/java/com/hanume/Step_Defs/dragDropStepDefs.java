package com.hanume.Step_Defs;

import com.hanume.Utilities.BrowserUtils;
import com.hanume.Utilities.Driver;
import com.hanume.pages.DragDropPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class dragDropStepDefs {
    DragDropPages dragDropPages = new DragDropPages();
    Actions actions = new Actions(Driver.get());

    @When("Handle with cookies")
    public void handleWithCookies() {
        Driver.get().manage().window().maximize();
        dragDropPages.cookie.click();

    }

    @When("user move item four and five under first box")
    public void userMoveItemFourAndFiveUnderFirstBox() {

        actions.dragAndDrop(dragDropPages.from4, dragDropPages.toFirstBox).build().perform();
        BrowserUtils.waitFor(2);

        actions.dragAndDrop(dragDropPages.from5,dragDropPages.toFirstBox).build().perform();


    }

    @And("move rest of the items under first box")
    public void moveRestOfTheItemsUnderFirstBox() {

      actions.dragAndDrop(dragDropPages.from6, dragDropPages.toFirstBox).build().perform();
      BrowserUtils.waitFor(2);

      actions.dragAndDrop(dragDropPages.from7, dragDropPages.toFirstBox).build().perform();

    }

    @Then("assert that all items move successfully under first box")
    public void assertThatAllItemsMoveSuccessfullyUnderFirstBox() {

    }


}