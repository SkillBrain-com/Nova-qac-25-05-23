package org.example.Alupului.Seleniu1.DemoQA.RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/radio-button");

       driver.findElement(By.id("yedRadio")).click();
       WebElement radioelement = driver.findElement(By.id("yesRadio"));
       boolean selectState = radioelement.isDisplayed();
       if(!selectState) {
           radioelement.click();
       }

       }
    }

