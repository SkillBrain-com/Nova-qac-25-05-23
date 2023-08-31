package org.example.AlupuluiTeodorIulianSeleniu4.Herokuapp.MicroApps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CanvasScribbleTestPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions builder = new Actions(driver);
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/gui-scribble.html");

        WebElement canvas = driver.findElement(By.cssSelector("#canvas"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", canvas);
        builder.moveToElement(canvas).perform();
        builder.clickAndHold(canvas).perform();
        builder.moveByOffset(150, 50).perform();
        builder.moveToElement(canvas).perform();
        builder.clickAndHold(canvas).perform();
        builder.moveByOffset(100, 50).perform();
        builder.moveToElement(canvas).perform();
        driver.findElement(By.cssSelector("#canvas")).click();

        driver.quit();
    }
}
