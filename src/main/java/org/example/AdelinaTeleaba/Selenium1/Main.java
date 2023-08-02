package org.example.AdelinaTeleaba.Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        driver .findElement(By.id("userName")).sendKeys("Adelina Teleaba");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("cazan.adelina@ymail.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Ceva adresa");
        driver.findElement(By.id("permanentAddress")).sendKeys("adresa permanenta");
        driver.findElement(By.cssSelector("#button#submit")).click();
    }
}
