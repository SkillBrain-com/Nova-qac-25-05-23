package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FavoritePage {

    WebDriver driver;

    public FavoritePage(WebDriver driver) {
        this.driver = driver;
    }

    By addToFavorite = By.xpath("//div[@class=\"shelf-item\"]");

    public void setAddToFavorit(){

        Assert.assertTrue(driver.findElement(addToFavorite).isDisplayed());
    }

}
