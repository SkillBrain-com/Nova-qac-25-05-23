package org.example.Pages.SwagLabPages;

import org.example.Utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SwagLabProducts extends TestBase {

    WebDriver driver;

    public SwagLabProducts(WebDriver driver) {
        this.driver = driver;
    }

    By products = By.cssSelector("span.title");

    By addToCartButton = By.cssSelector("#add-to-cart-sauce-labs-bike-light");

    By addToCartContainer = By.cssSelector("#shopping_cart_container>a");

    public void verifyProducts(){

        Assert.assertTrue(driver.findElement(products).isDisplayed());
    }

    public void setAddToCartButton(){

        driver.findElement(addToCartButton).click();

        driver.findElement(addToCartContainer).click();

    }
}
