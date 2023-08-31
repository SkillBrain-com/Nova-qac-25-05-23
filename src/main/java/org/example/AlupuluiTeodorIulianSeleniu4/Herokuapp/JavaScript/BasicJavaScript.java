package org.example.AlupuluiTeodorIulianSeleniu4.Herokuapp.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicJavaScript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");

        WebElement category = driver.findElement(By.id("combo1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", category);
        driver.findElement(By.id("combo1")).click();
        WebElement language = driver.findElement(By.id("combo2"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", language);
        driver.findElement(By.id("combo2")).click();
        WebElement codeinit = driver.findElement(By.xpath("/html/body/div/div[3]/form/input[1]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", codeinit);
        driver.findElement(By.xpath("/html/body/div/div[3]/form/input[1]")).click();
        WebElement gobacktoform = driver.findElement(By.cssSelector("#back_to_form"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", gobacktoform);
        driver.findElement(By.cssSelector("#back_to_form")).click();

        driver.quit();
    }
}
