package org.example.AlupuluiTeodorIulianSeleniu2.DemoQA.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/selectable");

        WebElement list = driver.findElement(By.id("demo-tab-list"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", list);
        driver.findElement(By.id("demo-tab-list")).click();
        WebElement grid = driver.findElement(By.id("demo-tab-grid"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", grid);
        driver.findElement(By.id("demo-tab-grid")).click();

        driver.quit();
    }
}
