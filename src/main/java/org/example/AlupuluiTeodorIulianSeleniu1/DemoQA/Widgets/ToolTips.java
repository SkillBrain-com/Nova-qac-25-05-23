package org.example.DemoQA.Widgets;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTips {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/tool-tips");

        WebElement hover = driver.findElement(By.id("toolTipButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", hover);
        driver.findElement(By.id("toolTipButton")).click();
        WebElement hovertxtfield = driver.findElement(By.id("toolTipTextField"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", hovertxtfield);
        driver.findElement(By.id("toolTipTextField")).click();

        driver.quit();
    }
}
