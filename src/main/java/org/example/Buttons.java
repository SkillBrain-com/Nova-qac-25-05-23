package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Buttons {
    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);
    public void buttons(){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[3]")).click();
        WebElement doubleclick = driver.findElement(By.cssSelector("#doubleClickBtn"));
        actions.doubleClick(doubleclick).perform();
        WebElement rightclick = driver.findElement(By.cssSelector("#rightClickBtn"));
        actions.contextClick(rightclick).perform();
        driver.quit();

    }
}