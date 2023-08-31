package org.example.AlupuluiTeodorIulianSeleniu1.DemoQA.AlertsFrameAndWindows;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/nestedframes");

        WebElement frame = driver.findElement(By.xpath("/html/body/iframe"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", frame);
        driver.findElement(By.xpath("/html/body/iframe")).click();

        driver.quit();
    }
}
