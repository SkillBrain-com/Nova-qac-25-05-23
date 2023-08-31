package org.example.AlupuluiTeodorIulianSeleniu2.DemoQA.UploadAndDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndDownload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/upload-download");

        WebElement download1 = driver.findElement(By.id("downloadButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", download1);
        driver.findElement(By.id("downloadButton")).click();
        WebElement upload1 = driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", upload1);
        upload1.sendKeys("C:\\Users\\Jhackhendhar\\Downloads");

        driver.quit();
    }
}
