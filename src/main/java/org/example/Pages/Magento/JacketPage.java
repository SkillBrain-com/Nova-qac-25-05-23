package org.example.Pages.Magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JacketPage {

    WebDriver driver;

    public JacketPage(WebDriver driver) {
        this.driver = driver;

    }
    By sizeBt = By.cssSelector("#option-label-size-143-item-168");
    By colour = By.cssSelector("#option-label-color-93-item-50");
    By addCard = By.cssSelector("#product-addtocart-button");
    By verifyLable = By.cssSelector(".counter-number");
    public void setAddCard(){
        driver.findElement(sizeBt).click();
        driver.findElement(colour).click();
        driver.findElement(addCard).click();
    }
    public void Verify (){
        Assert.assertTrue( driver.findElement(verifyLable).isDisplayed());

    }

}