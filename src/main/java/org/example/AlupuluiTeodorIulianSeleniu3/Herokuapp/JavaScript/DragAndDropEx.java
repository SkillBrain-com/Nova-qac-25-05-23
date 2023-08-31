package org.example.AlupuluiTeodorIulianSeleniu3.Herokuapp.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);

        driver.get("https://testpages.herokuapp.com/styled/drag-drop-javascript.html");

        WebElement drag1 = driver.findElement(By.id("draggable1"));
        WebElement drop1 = driver.findElement(By.id("droppable1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", drop1);
        action.dragAndDrop(drag1, drop1).build().perform();
        WebElement drag2 = driver.findElement(By.id("draggable2"));
        WebElement drop2 = driver.findElement(By.id("droppable2"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", drop2);
        action.dragAndDrop(drag2, drop2).build().perform();

        driver.quit();
    }
}
