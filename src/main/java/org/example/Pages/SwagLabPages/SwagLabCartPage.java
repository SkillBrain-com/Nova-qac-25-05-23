package org.example.Pages.SwagLabPages;

import org.example.Utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabCartPage extends TestBase {

    WebDriver driver;

    public SwagLabCartPage(WebDriver driver) {
        this.driver = driver;
    }

    By checkout = By.cssSelector("#checkout");

    By firstName = By.cssSelector("#first-name");

    By lastName = By.cssSelector("#last-name");

    By postalCode = By.cssSelector("#postal-code");

    By continueButton = By.cssSelector("#continue");

    public void setCheckout(){

        driver.findElement(checkout).click();
    }

    public void setCredentials(){

        driver.findElement(firstName).sendKeys("Nume");

        driver.findElement(lastName).sendKeys("Asta");

        driver.findElement(postalCode).sendKeys("2200");

        driver.findElement(continueButton).click();
    }


}
