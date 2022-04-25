package com.hanume.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragDropPages extends BasePage{

@FindBy(xpath = "//div[contains(text(),'item 4')]")
    public WebElement from4;

    @FindBy(xpath = "//div[contains(text(),'item 5')]")
    public WebElement from5;

    @FindBy(xpath = "//div[@id='board1']/div[1]")
    public WebElement toFirstBox;

    @FindBy(xpath = "//div[contains(text(),'item 6')]")
    public WebElement from6;

    @FindBy(xpath = "//div[contains(text(),'item 7')]")
    public WebElement from7;

    @FindBy(xpath = " //h2[text()='Grid CRUD']")
    public WebElement rastgele;




}
