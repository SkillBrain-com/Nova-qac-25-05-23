package org.example.MarianaPaic.Selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys("Ana Ion");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("alabala@yahoo.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Undeva");
        driver.findElement(By.id("permanentAddress")).sendKeys("Altundeva");
        driver.findElement(By.cssSelector("button#submit")).click();



    }
}
