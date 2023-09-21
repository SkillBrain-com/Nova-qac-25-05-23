package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    By signinButton = By.cssSelector("#signin");
    By samsungCheckbox =By.cssSelector("input[value=\"Samsung\"]+span");
    By addToCart = By.cssSelector("div[data-sku=\"samsung-S20-device-info.png\"]>div.shelf-item__buy-btn");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSignIn(){
        driver.findElement(signinButton).click();
    }

public void addToCart(){
       driver.findElement(samsungCheckbox).click();
       driver.findElement(addToCart).click();
}
}
