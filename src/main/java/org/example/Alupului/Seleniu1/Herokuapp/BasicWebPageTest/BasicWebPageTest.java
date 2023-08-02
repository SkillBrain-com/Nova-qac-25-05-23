package org.example.Alupului.Seleniu1.Herokuapp.BasicWebPageTest;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebPageTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");


        driver.close();
    }
    }
