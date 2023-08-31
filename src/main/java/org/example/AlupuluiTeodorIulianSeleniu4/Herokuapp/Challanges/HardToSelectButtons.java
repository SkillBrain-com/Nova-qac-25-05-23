package org.example.AlupuluiTeodorIulianSeleniu4.Herokuapp.Challanges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardToSelectButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/challenges/hard-selectors.html");

        WebElement selbyid= driver.findElement(By.cssSelector("#select\\.me\\.by\\.id"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selbyid);
        driver.findElement(By.cssSelector("#select\\.me\\.by\\.id")).click();

        driver.quit();
    }
}
