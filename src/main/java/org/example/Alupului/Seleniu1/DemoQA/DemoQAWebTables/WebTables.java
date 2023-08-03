package org.example.Alupului.Seleniu1.DemoQA.DemoQAWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();

        driver.close();

    }
}
