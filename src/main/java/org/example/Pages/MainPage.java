package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPage {

    WebDriver driver;

    By signinButton = By.cssSelector("#signin");
    By samsungCheckbox = By.cssSelector("input[value=\"Samsung\"]+span");
    By addToCart = By.cssSelector("div[data-sku=\"samsung-S20-device-info.png\"]>div.shelf-item__buy-btn");
    By cartButton = By.cssSelector("span.bag.bag--float-cart-closed");
    By cart = By.cssSelector("div.float-cart__shelf-container>div.shelf-item>div.shelf-item__details>p.title");
    By checkout = By.cssSelector("div.buy-btn");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSignIn() {
        driver.findElement(signinButton).click();
    }

    public void addToCart() {
        driver.findElement(samsungCheckbox).click();
        driver.findElement(addToCart).click();
    }

    public void verifyAddToCart() {
        Assert.assertTrue(driver.findElement(cart).isDisplayed());
    }

    public void checkout()  {
        driver.findElement(checkout).click();
    }


}

