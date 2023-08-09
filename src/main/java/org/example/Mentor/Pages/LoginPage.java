package org.example.Mentor.Pages;

import org.example.Mentor.DriverFactory;
import org.example.Mentor.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends TestBase {

    By userNameField = By.id("txt-username");
    By passwordField = By.id("txt-password");
    By loginButton = By.id("btn-login");
    By loginFailedMessage = By.cssSelector("p.lead.text-danger");

    public void login(String username, String password){
        DriverFactory.getInstance().getDriver().findElement(userNameField).sendKeys(username);
        DriverFactory.getInstance().getDriver().findElement(passwordField).sendKeys(password);
        DriverFactory.getInstance().getDriver().findElement(loginButton).click();
    }

    public void verifyBadLogin(){
        Assert.assertNull(DriverFactory.getInstance().getDriver().findElement(loginFailedMessage));
    }
}
