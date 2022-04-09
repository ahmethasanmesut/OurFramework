package com.hanume.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{

    @FindBy(id = "btnCookie")
    public WebElement cookie;

    @FindBy(xpath = "//button[@id='ddlFmw-awed']")
    public WebElement orderTab;

    @FindBy(xpath = "//li[contains(text(),'ProDinner Demo (ASP.net Core, EFCore)')]")
    public WebElement proDinner;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createBtn;

    @FindBy(css = "#createdinnersGridName-awed")
    public WebElement name;

    @FindBy(xpath = "//input[@id='createdinnersGridCountryIdSearch-awed']")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[.='OK'][@class='awe-btn awe-okbtn o-pbtn'])[2]")
    public WebElement okBtn;

    @FindBy(xpath = "//tbody/tr[@data-k='3']")
    public WebElement ukTable;



}
