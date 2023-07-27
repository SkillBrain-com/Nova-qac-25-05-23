package org.example.Alupului.Seleniu1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");


        driver.findElement(By.id("userName")).sendKeys("Alupului");
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.id("currentAddress")).sendKeys("Bohotin");
        driver.findElement(By.id("permanentAddress")).sendKeys("Bohotin");
        //driver.findElement(By.cssSelector("button#submit")).click();
        WebElement element = driver.findElement(By.cssSelector("button#submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
        driver.findElement(By.cssSelector("button#submit")).click();

        driver.get("https://demoqa.com/checkbox");


        driver.close();

        driver.get("https://demoqa.com/radio-button");


        driver.close();


        driver.get("https://demoqa.com/webtables");


        driver.close();

        driver.get("https://demoqa.com/buttons");


        driver.close();

        driver.get("https://demoqa.com/links");


        driver.close();

        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");


        driver.close();


        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");


        driver.close();

        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");



        driver.close();
    }
}