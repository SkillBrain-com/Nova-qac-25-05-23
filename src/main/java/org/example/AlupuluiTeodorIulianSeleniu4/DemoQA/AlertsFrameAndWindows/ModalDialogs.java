package org.example.AlupuluiTeodorIulianSeleniu4.DemoQA.AlertsFrameAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalDialogs {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/modal-dialogs");


        WebElement smallmod = driver.findElement(By.id("showSmallModal"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", smallmod);
        driver.findElement(By.id("showSmallModal")).click();
        WebElement closebtn1 = driver.findElement(By.id("closeSmallModal"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", closebtn1);
        driver.findElement(By.id("closeSmallModal")).click();
        WebElement largemod = driver.findElement(By.xpath("//*[@id=\"showLargeModal\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", largemod);
        driver.findElement(By.xpath("//*[@id=\"showLargeModal\"]")).click();

        driver.quit();
    }
}
