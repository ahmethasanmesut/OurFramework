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

}
