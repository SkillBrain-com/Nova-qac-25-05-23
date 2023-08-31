package org.example.AlupuluiTeodorIulianSeleniu1.DemoQA.AlertsFrameAndWindows;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/frames");

        WebElement frame1 = driver.findElement(By.cssSelector("#frame2Wrapper"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", frame1);
        driver.findElement(By.cssSelector("#frame2Wrapper")).click();
        WebElement frame2 = driver.findElement(By.cssSelector("#frame2Wrapper"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", frame2);
        driver.findElement(By.cssSelector("#frame2Wrapper")).click();

        driver.quit();
    }
}
