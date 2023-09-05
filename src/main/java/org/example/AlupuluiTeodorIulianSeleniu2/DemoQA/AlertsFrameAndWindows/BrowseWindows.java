package org.example.AlupuluiTeodorIulianSeleniu2.DemoQA.AlertsFrameAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");

        WebElement nwtab = driver.findElement(By.id("tabButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", nwtab);
        driver.findElement(By.id("tabButton")).click();
        WebElement nwwindpag = driver.findElement(By.id("windowButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", nwwindpag);
        driver.findElement(By.id("windowButton")).click();
        WebElement nwwindmes = driver.findElement(By.id("messageWindowButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", nwwindmes);
        driver.findElement(By.id("messageWindowButton")).click();

        driver.quit();
    }
}