package org.example.AlupuluiTeodorIulianSeleniu2.DemoQA.DynamicProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DymanicProperties {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/dynamic-properties");

        driver.findElement(By.id("IUdwX")).getText();
        WebElement enable = driver.findElement(By.cssSelector("button#enableAfter"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", enable);
        driver.findElement(By.cssSelector("button#enableAfter")).click();
        WebElement color = driver.findElement(By.cssSelector("button#colorChange"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", color);
        driver.findElement(By.cssSelector("button#colorChange")).click();
        WebElement visible = driver.findElement(By.cssSelector("buttom#visibleAfter"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", visible);
        driver.findElement(By.cssSelector("buttom#visibleAfter")).click();

        driver.quit();
    }
}
