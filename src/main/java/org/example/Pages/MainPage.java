package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    By signinButton = By.cssSelector("#signin");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSignIn(){
        driver.findElement(signinButton).click();
    }


}
