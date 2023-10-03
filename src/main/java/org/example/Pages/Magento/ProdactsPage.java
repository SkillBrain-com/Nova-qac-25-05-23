package org.example.Pages.Magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdactsPage {
    WebDriver driver;

    public ProdactsPage(WebDriver driver) {
        this.driver = driver;
    }
    By firstProdact = By.xpath("//li[@class=\"item product product-item\"][1]");
    public void setFirstProdact(){

        driver.findElement(firstProdact).click();
    }
}
