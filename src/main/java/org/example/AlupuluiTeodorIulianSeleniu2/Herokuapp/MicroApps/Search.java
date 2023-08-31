package org.example.AlupuluiTeodorIulianSeleniu2.Herokuapp.MicroApps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/search");

        WebElement typetext = driver.findElement(By.cssSelector("body > div > form > p:nth-child(1) > input[type=text]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", typetext);
        driver.findElement(By.cssSelector("body > div > form > p:nth-child(1) > input[type=text]")).sendKeys("Selenium-RC");
        WebElement search = driver.findElement(By.cssSelector("body > div > form > input[type=submit]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", search);
        driver.findElement(By.cssSelector("body > div > form > input[type=submit]")).click();

        driver.quit();
    }
}
