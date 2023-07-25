package org.example.Mentor.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static org.openqa.selenium.By.cssSelector;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys("Mentor SkillBrain");
        driver.findElement(cssSelector("#userEmail")).sendKeys("mentor@skillbrain.com");
        driver.findElement(cssSelector("#currentAddress")).sendKeys("Ceva adresa");
        driver.findElement(By.id("permanentAddress")).sendKeys("adresa permanenta");



        WebElement element = driver.findElement(By.cssSelector("button#submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.cssSelector("button#submit")).click();

    }
}
