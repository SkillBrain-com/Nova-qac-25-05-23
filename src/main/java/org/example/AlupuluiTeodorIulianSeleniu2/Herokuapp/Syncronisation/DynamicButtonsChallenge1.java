package org.example.AlupuluiTeodorIulianSeleniu2.Herokuapp.Syncronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicButtonsChallenge1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");

        WebElement start = driver.findElement(By.cssSelector("#button00"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", start);
        driver.findElement(By.cssSelector("#button00")).click();
        WebElement b1 = driver.findElement(By.cssSelector("#button01"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b1);
        driver.findElement(By.cssSelector("#button01")).click();
        WebElement b2 = driver.findElement(By.cssSelector("#button02"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b2);
        driver.findElement(By.cssSelector("#button02")).click();
        WebElement b3 = driver.findElement(By.cssSelector("#button03"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b3);
        driver.findElement(By.cssSelector("#button03")).click();

        driver.quit();
    }
}
