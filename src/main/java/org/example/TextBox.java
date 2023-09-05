package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test


public class TextBox {
    WebDriver driver = new ChromeDriver();
    Faker faker = new Faker();

    public void testbox() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("#userName")).sendKeys(faker.name().fullName());
        driver.findElement(By.cssSelector("#userEmail")).sendKeys(faker.name().firstName() + "@mailiniator.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys(faker.address().fullAddress());
        driver.findElement(By.cssSelector("#permanentAddress")).sendKeys(faker.address().fullAddress());
        WebElement element = driver.findElement(By.cssSelector("#submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.cssSelector("#submit")).click();
        driver.quit();

    }

}
