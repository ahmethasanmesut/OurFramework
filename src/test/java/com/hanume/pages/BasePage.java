package com.hanume.pages;

import com.hanume.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
      public void getLink(String link){
        Driver.get().findElement(By.xpath("//a[.='"+link+"']"));
      }

    @FindBy(id = "btnCookie")
    public WebElement cookie;

}
