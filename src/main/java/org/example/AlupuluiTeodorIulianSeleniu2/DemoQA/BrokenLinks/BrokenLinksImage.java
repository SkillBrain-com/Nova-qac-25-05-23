package org.example.AlupuluiTeodorIulianSeleniu2.DemoQA.BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksImage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/broken");

        WebElement validimg = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > img:nth-child(2)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", validimg);
        driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > img:nth-child(2)")).click();
        WebElement brokenimg = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > img:nth-child(6)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", brokenimg);
        driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > img:nth-child(6)")).click();
        WebElement validlink = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > a:nth-child(10)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", validlink);
        driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > a:nth-child(10)")).click();
        WebElement brokenlink = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > a:nth-child(14)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", brokenlink);
        driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > a:nth-child(14)")).click();

        driver.quit();
    }
}
