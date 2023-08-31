package org.example.AlupuluiTeodorIulianSeleniu4.Herokuapp.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");

        WebElement click5sec = driver.findElement(By.cssSelector("#delaygotobasic"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", click5sec);
        driver.findElement(By.cssSelector("#delaygotobasic")).click();
        WebElement click2sec = driver.findElement(By.cssSelector("#delaygotobounce"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", click2sec);
        driver.findElement(By.cssSelector("#delaygotobounce")).click();

        driver.quit();
    }
}
