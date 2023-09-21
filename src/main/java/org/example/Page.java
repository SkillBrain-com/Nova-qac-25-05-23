package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page{


WebDriver driver;
    By button = By.cssSelector("#signin");

    public Page(WebDriver driver) {
        this.driver = driver;
    }



    public void click(){
        driver.findElement(button).click();
    }
}
