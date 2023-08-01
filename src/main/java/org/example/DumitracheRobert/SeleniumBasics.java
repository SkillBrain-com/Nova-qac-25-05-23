package org.example.DumitracheRobert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class SeleniumBasics {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys("RobertDumi");

        driver.findElement(By.cssSelector("#userEmail")).sendKeys("dumitracherobertmarian29@gmail.com");

        driver.findElement(By.cssSelector("#currentAddress")).sendKeys(" Jud. Ilfov, Com. Gruiu, Sat. Gruiu, Str. Gorunului, Nr.14 ");

        driver.findElement(By.id("permanentAddress")).sendKeys(" Jud. Ilfov, Com. Gruiu, Sat. Gruiu, Str. Gorunului, Nr.14 ");

        WebElement element = driver.findElement(By.cssSelector("button#submit"));

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);

        driver.findElement(By.cssSelector("button#submit")).click();
    }
}

