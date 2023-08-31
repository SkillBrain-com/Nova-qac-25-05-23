package org.example.AlupuluiTeodorIulianSeleniu4.Herokuapp.Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Attributes {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");

        WebElement paragraphadd = driver.findElement(By.cssSelector("body > div > div:nth-child(13) > button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", paragraphadd);
        driver.findElement(By.cssSelector("body > div > div:nth-child(13) > button")).click();

        driver.quit();
    }
}
