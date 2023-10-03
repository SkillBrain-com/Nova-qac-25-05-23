package org.example.Pages.SwagLabPages;

import org.example.Utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SwagLabCheckOutComplete extends TestBase {

    WebDriver driver;

    public SwagLabCheckOutComplete(WebDriver driver) {
        this.driver = driver;
    }

    By backHome = By.cssSelector("#back-to-products");


    public void setBackHome(){

        Assert.assertTrue(driver.findElement(backHome).isDisplayed());

    }
}
