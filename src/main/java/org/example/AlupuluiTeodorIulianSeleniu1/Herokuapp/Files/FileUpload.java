package org.example.AlupuluiTeodorIulianSeleniu1.Herokuapp.Files;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");

        WebElement fc = driver.findElement(By.xpath("//*[@id=\"fileinput\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", fc);
        fc.sendKeys("C:\\Users\\Jhackhendhar\\Downloads");
        WebElement image = driver.findElement(By.cssSelector("#itsanimage"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", image);
        driver.findElement(By.cssSelector("#itsanimage")).click();
        WebElement file = driver.findElement(By.cssSelector("#itsafile"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", file);
        driver.findElement(By.cssSelector("#itsafile")).click();
        WebElement up = driver.findElement(By.cssSelector("body > div > div.centered > form > div:nth-child(4) > input"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", up);
        driver.findElement(By.cssSelector("body > div > div.centered > form > div:nth-child(4) > input")).click();

        driver.quit();
    }
}
