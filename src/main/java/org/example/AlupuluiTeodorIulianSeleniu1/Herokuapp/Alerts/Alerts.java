package org.example.AlupuluiTeodorIulianSeleniu1.Herokuapp.Alerts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        WebElement shalbox = driver.findElement(By.cssSelector("#alertexamples"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shalbox);
        driver.findElement(By.cssSelector("#alertexamples")).click();
        WebElement shcfbox = driver.findElement(By.xpath("//*[@id=\"confirmexample\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shcfbox);
        driver.findElement(By.xpath("//*[@id=\"confirmexample\"]")).click();
        WebElement shprmtbox = driver.findElement(By.xpath("//*[@id=\"promptexample\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shprmtbox);
        driver.findElement(By.xpath("//*[@id=\"promptexample\"]")).click();

        driver.quit();
    }
}
