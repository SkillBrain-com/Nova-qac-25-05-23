package org.example.Alupului.Seleniu1.DemoQA.DemoQAButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/buttons");

        WebElement click1 = driver.findElement(By.id("doubleClickBtn"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click1);
        driver.findElement(By.cssSelector("button#doubleClickBtn")).click();

        driver.close();
    }
}
