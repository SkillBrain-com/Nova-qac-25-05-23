package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SigninPage {

    WebDriver driver;

    public SigninPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameField = By.cssSelector("#react-select-2-input");
    By usernameDiv = By.cssSelector("#username");
    By passwordField = By.cssSelector("#react-select-3-input");
    By passwordDiv = By.cssSelector("#password");
    By loginButton = By.cssSelector("#login-btn");
    By errorMessage = By.cssSelector("h3.api-error");


    public void login(String userName, String password){
        driver.findElement(usernameDiv).click();
        driver.findElement(usernameField).sendKeys(userName);
        driver.findElement(usernameField).sendKeys(Keys.RETURN);

        driver.findElement(passwordDiv).click();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(passwordField).sendKeys(Keys.RETURN);
        driver.findElement(loginButton).click();
    }

    public void verifyErrorMessage(){
        Assert.assertTrue(driver.findElement(errorMessage).isDisplayed());
    }
}
