package org.example.DemoQA.BookStoreApp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/profile");

        WebElement log = driver.findElement(By.linkText("<a href=\"/login\" style=\"font-weight: bold;\">login</a>"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", log);
        driver.findElement(By.linkText("<a href=\"/login\" style=\"font-weight: bold;\">login</a>")).click();
        WebElement reg = driver.findElement(By.linkText("<a href=\"/register\" style=\"font-weight: bold;\">register</a>"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", reg);
        driver.findElement(By.linkText("<a href=\"/register\" style=\"font-weight: bold;\">register</a>")).click();

        driver.quit();
    }
}
