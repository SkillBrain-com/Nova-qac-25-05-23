package org.example.AlupuluiTeodorIulianSeleniu2.Herokuapp.MicroApps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/calculator");

        WebElement num1 = driver.findElement(By.cssSelector("#number1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", num1);
        driver.findElement(By.cssSelector("#number1")).sendKeys("10");
        WebElement num2 = driver.findElement(By.cssSelector("#number2"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", num2);
        driver.findElement(By.cssSelector("#number2")).sendKeys("20");
        WebElement sum = driver.findElement(By.cssSelector("#calculate"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", sum);
        driver.findElement(By.cssSelector("#calculate")).click();

        driver.quit();
    }
}
