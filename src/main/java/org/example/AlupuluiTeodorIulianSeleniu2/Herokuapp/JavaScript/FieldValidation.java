package org.example.AlupuluiTeodorIulianSeleniu2.Herokuapp.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FieldValidation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/basic-javascript-validation-test.html");

        driver.findElement(By.cssSelector("#lteq30")).sendKeys("alupului");
        WebElement submitvalue = driver.findElement(By.cssSelector("body > div > div.centered > form > input.styled-click-button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submitvalue);
        driver.findElement(By.cssSelector("body > div > div.centered > form > input.styled-click-button")).click();

        driver.quit();
    }
}
