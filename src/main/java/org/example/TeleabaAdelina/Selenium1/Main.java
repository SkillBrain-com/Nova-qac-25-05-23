package org.example.TeleabaAdelina.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys("Adelina Teleaba");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("cazan.adelina@ymail.com");
        driver.findElement(By.cssSelector("currentAddress")).sendKeys("Ceva Adresa");
        driver.findElement(By.id("permanentAddress")).sendKeys("Adresa Permanenta");
        driver.findElement(By.cssSelector("button#submit")).click();


    }
}
