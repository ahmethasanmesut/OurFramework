package com.hanume.pages;

import com.hanume.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

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

    @FindBy(xpath = "//input[@name='ChefId']/..")
    public WebElement chef;

    @FindBy(xpath = "//li[@data-lvl='1']")
    public List<WebElement> chefNames;

    @FindBy(xpath = "//input[@id='createdinnersGridAddress-awed']")
    public WebElement address;

    @FindBy(xpath = "//input[@name='Start']")
    public WebElement start;

    @FindBy(xpath = "//button[@id='createdinnersGridStartcm-awed']")
    public WebElement dateBtn;

    @FindBy(xpath = "//li[.='May']")
    public WebElement may;

    @FindBy(xpath = "//input[@placeholder='please select']")
    public WebElement time;

    @FindBy(css = "#createdinnersGridDuration-awed")
    public WebElement duration;

    @FindBy(xpath = "//button[@aria-label='delete']")
    public WebElement deleteBtn;

   public void selectDate(){
       Random rnd = new Random();
       int randomDate = rnd.nextInt(31)+1;
       Driver.get().findElement(By.xpath("//table//td[.='"+randomDate+"']")).click();
  }



}
