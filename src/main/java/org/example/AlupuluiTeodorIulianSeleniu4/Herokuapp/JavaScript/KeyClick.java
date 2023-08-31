package org.example.AlupuluiTeodorIulianSeleniu4.Herokuapp.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/key-click-display-test.html");

        WebElement clickme = driver.findElement(By.cssSelector("#button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", clickme);
        driver.findElement(By.cssSelector("#button")).click();

        driver.quit();
    }
}
