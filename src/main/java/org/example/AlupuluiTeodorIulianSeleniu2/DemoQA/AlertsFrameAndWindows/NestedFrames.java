package org.example.AlupuluiTeodorIulianSeleniu2.DemoQA.AlertsFrameAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
