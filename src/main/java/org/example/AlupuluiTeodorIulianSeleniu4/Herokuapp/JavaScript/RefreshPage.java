package org.example.Herokuapp.JavaScript;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/refresh");

        WebElement refresh = driver.findElement(By.cssSelector("#embeddedrefreshdatevalue"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", refresh);
        driver.findElement(By.cssSelector("#embeddedrefreshdatevalue")).click();

        driver.quit();
    }
}
