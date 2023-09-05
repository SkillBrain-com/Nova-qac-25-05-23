package org.example.DemoQA.Buttons;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/buttons");

        WebElement click1 = driver.findElement(By.cssSelector("button#doubleClickBtn"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click1);
        driver.findElement(By.cssSelector("button#doubleClickBtn")).click();
        WebElement click2 = driver.findElement(By.cssSelector("button#rightClickBtn"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click2);
        driver.findElement(By.cssSelector("button#rightClickBtn")).click();
        WebElement click3 = driver.findElement(By.id("YfesD"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click3);
        driver.findElement(By.id("YfesD")).click();

        driver.quit();
    }
}
