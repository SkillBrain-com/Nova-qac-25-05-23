package org.example.AlupuluiTeodorIulianSeleniu4.Herokuapp.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/refresh");

        WebElement refresh = driver.findElement(By.cssSelector("#embeddedrefreshdatevalue"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", refresh);
        driver.findElement(By.cssSelector("#embeddedrefreshdatevalue")).click();

        driver.quit();
    }
}