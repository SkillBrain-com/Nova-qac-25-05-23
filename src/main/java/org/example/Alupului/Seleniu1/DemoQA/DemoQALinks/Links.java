package org.example.Alupului.Seleniu1.DemoQA.DemoQALinks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/links");

        driver.findElement(By.linkText("Home")).click();


        driver.close();
    }
    }
