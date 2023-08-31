package org.example.AlupuluiTeodorIulianSeleniu2.Herokuapp.FormsAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html5FormElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/html5-form-test.html");

        driver.findElement(By.id("colour-picker")).click();
        driver.findElement(By.id("date-time-picker")).sendKeys("17/05/1990,05:01");
        driver.findElement(By.id("email-field")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.id("month-field")).sendKeys("May 2017");
        driver.findElement(By.id("number-field")).sendKeys("13");
        WebElement reset = driver.findElement(By.cssSelector("#HTMLFormElements > div:nth-child(7) > input:nth-child(1)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", reset);
        driver.findElement(By.cssSelector("#HTMLFormElements > div:nth-child(7) > input:nth-child(1)")).click();
        WebElement submit = driver.findElement(By.cssSelector("#HTMLFormElements > div:nth-child(7) > input:nth-child(2)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        driver.findElement(By.cssSelector("#HTMLFormElements > div:nth-child(7) > input:nth-child(2)")).click();

        driver.quit();
    }
}
