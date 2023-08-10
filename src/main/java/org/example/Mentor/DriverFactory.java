package org.example.Mentor;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static final DriverFactory instance = new DriverFactory();

    public WebDriver getDriver(){
        return driver.get();
    }

    public static DriverFactory getInstance(){
        return instance;
    }

    public void closeBrowser(){
        driver.get().quit();
        driver.remove();
    }

    public void setDriver(WebDriver driverParams){
        driver.set(driverParams);
    }


}
