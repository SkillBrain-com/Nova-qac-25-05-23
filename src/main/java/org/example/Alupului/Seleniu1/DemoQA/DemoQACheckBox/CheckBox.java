package org.example.Alupului.Seleniu1.DemoQA.DemoQACheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.id("tree-node-home")).click();
        WebElement checkbox1 = driver.findElement(By.cssSelector("label[for='checkbox']"));
        boolean isSelected = checkbox1.isEnabled();
        if (isSelected) {
            checkbox1.click();
        }
        driver.findElement(By.id("tree-node-desktop")).click();
        driver.findElement(By.id("tree-node-documents")).click();
        driver.findElement(By.id("tree-node-downloads")).click();

        driver.close();
    }
}
