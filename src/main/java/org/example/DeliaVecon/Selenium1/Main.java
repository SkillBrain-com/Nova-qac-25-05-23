package org.example.DeliaVecon.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("DeliaVe");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("deliave@gmail.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys(" clj ");
        driver.findElement(By.id("permanentAddress")).sendKeys("Adresapermanenta");
        WebElement element = driver.findElement(By.cssSelector("button#submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.cssSelector("button#submit")).click();
    }
}
