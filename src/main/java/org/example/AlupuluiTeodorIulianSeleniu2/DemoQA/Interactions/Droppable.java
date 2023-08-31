package org.example.AlupuluiTeodorIulianSeleniu2.DemoQA.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Droppable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/droppable");

        WebElement dragme = driver.findElement(By.id("draggable"));
        WebElement drophere = driver.findElement(By.id("droppable"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", drophere);
        action.dragAndDrop(dragme, drophere).build().perform();
        WebElement acceptable = driver.findElement(By.id("acceptable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", drop);
        action.dragAndDrop(acceptable, drop).build().perform();
        WebElement notacceptable = driver.findElement(By.id("notAcceptable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", drop1);
        action.dragAndDrop(notacceptable, drop1).build().perform();

        driver.quit();
    }
}