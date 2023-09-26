package org.example.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public RemoteWebDriver remoteDriver;

    @BeforeMethod
    public void testBase(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/");
    }

    @BeforeMethod(groups = {"grid"})
    public void remoteTestBase(){
        remoteDriver = Remote.getRemoteWebDriver();
        remoteDriver.get("https://bstackdemo.com/");
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod(groups = {"grid"})
    public void remoteTearDown(){
        remoteDriver.quit();
    }

}
