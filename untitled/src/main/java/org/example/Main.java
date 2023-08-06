package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/frames");

        WebElement iframe = driver.findElement(By.id("frame1"));

        driver.switchTo().frame(iframe);

        String headingText = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(headingText);

    }

}