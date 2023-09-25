package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderConfirmation {

    WebDriver driver;

    public OrderConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    By orderConfirmation = By.id("confirmation-message");


    public void verifyOrderPlacement(){

        Assert.assertTrue(driver.findElement(orderConfirmation).isDisplayed());

    }
}
