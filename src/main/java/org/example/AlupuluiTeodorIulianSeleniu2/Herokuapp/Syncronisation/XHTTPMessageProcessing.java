package org.example.AlupuluiTeodorIulianSeleniu2.Herokuapp.Syncronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XHTTPMessageProcessing {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/sync/xhttp-messages.html");

        WebElement countmesage = driver.findElement(By.cssSelector("#messagesdisplay"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", countmesage);
        driver.findElement(By.cssSelector("#messagesdisplay")).click();

        driver.quit();
    }
}
