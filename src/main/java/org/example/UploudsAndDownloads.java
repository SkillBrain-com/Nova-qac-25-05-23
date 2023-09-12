package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class UploudsAndDownloads {

    WebDriver driver = new ChromeDriver();
    public void Supa(){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");
        driver.findElement(By.id("downloadButton")).click();
        driver.findElement(By.cssSelector("input#uploadFile")).sendKeys("C:\\Users\\Valentin\\Desktop\\caine.jpg");
        Assert.assertTrue(driver.findElement(By.id("uploadedFilePath")).isDisplayed());
        driver.quit();
    }

}
