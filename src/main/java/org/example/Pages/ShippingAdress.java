package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingAdress {

    WebDriver driver;

    public ShippingAdress(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("firstNameInput");

    By lastName = By.id("lastNameInput");

    By adress = By.id("addressLine1Input");

    By stateOrProvince = By.id("provinceInput");

    By postalCode = By.id("postCodeInput");

    By submit = By.id("checkout-shipping-continue");

    public void fillInAdress(String firstNameInput, String lastNameInput, String adressInput, String stateOrProvinceInput, String postalCodeInput){

        driver.findElement(firstName).sendKeys(firstNameInput);
        driver.findElement(lastName).sendKeys(lastNameInput);
        driver.findElement(adress).sendKeys(adressInput);
        driver.findElement(stateOrProvince).sendKeys(stateOrProvinceInput);
        driver.findElement(postalCode).sendKeys(postalCodeInput);
        driver.findElement(submit).click();
    }
}
