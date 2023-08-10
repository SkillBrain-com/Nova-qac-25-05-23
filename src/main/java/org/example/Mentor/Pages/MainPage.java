package org.example.Mentor.Pages;

import org.example.Mentor.DriverFactory;
import org.example.Mentor.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;

public class MainPage extends TestBase {

    By hamburgerMenu = By.id("menu-toggle");
    By loginButton = By.cssSelector("ul.sidebar-nav>li:nth-child(4)");

    public void clickHamburgerMenu(){
        DriverFactory.getInstance().getDriver().findElement(hamburgerMenu).click();
    }

    public void clickLoginButton(){
        DriverFactory.getInstance().getDriver().findElement(loginButton).click();
    }

    public void navigateToLoginPage(){
        DriverFactory.getInstance().getDriver().findElement(hamburgerMenu).click();
        DriverFactory.getInstance().getDriver().findElement(loginButton).click();
    }
}
