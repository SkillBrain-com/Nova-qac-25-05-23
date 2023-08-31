package org.example.AlupuluiTeodorIulianSeleniu2.Herokuapp.Challanges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAutoGrowButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");

        WebElement growbutton = driver.findElement(By.cssSelector("#growbutton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", growbutton);
        driver.findElement(By.cssSelector("#growbutton")).click();

        driver.quit();
    }
}
