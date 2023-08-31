package org.example.AlupuluiTeodorIulianSeleniu4.DemoQA.RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");

        WebElement radioYesButton = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(2) > label"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", radioYesButton);
        driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(2) > label")).click();
        WebElement radioImpressButton = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3) > label"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", radioImpressButton);
        driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3) > label")).click();
        WebElement radioNoButton = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div.custom-control.disabled.custom-radio.custom-control-inline > label"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", radioNoButton);
        driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div.custom-control.disabled.custom-radio.custom-control-inline > label")).click();

        driver.quit();
    }
}


