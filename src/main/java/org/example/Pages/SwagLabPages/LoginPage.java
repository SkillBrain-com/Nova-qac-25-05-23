package org.example.Pages.SwagLabPages;

import org.example.Utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends TestBase {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.cssSelector("#user-name");
    By password = By.cssSelector("#password");

    By loginButton = By.cssSelector("#login-button");


    public void loginPage(String userName, String password){

        driver.findElement(this.userName).sendKeys(userName);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(loginButton).click();

    }


}
