package org.example.AlupuluiTeodorIulianSeleniu4.DemoQA.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/webtables");

        WebElement add = driver.findElement(By.cssSelector("#addNewRecordButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", add);
        driver.findElement(By.cssSelector("#addNewRecordButton")).click();
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Alupului");
        driver.findElement(By.id("lastName")).sendKeys("Teodor");
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.id("age")).sendKeys("33");
        driver.findElement(By.id("salary")).sendKeys("5000");
        driver.findElement(By.id("department")).sendKeys("QA Enginner");
        WebElement confirmbutton = driver.findElement(By.cssSelector("#submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", confirmbutton);
        driver.findElement(By.cssSelector("#submit")).click();
        WebElement srchbtn = driver.findElement(By.id("searchBox"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", srchbtn);
        driver.findElement(By.id("searchBox")).click();

        driver.quit();
    }
}
