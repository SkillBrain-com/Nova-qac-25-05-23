package org.example.AlupuluiTeodorIulianSeleniu3.DemoQA.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProgressBar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/progress-bar");

        WebElement progressbar = driver.findElement(By.id("progressBar"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", progressbar);
        driver.findElement(By.id("progressBar")).click();
        WebElement start = driver.findElement(By.id("startStopButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", start);
        driver.findElement(By.id("startStopButton")).click();
        WebElement stop = driver.findElement(By.id("startStopButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", stop);
        driver.findElement(By.id("startStopButton")).click();

        driver.quit();
    }
}
