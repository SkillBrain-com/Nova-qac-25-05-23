package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class LoginTest {
    WebDriver driver = new ChromeDriver();
    Faker faker = new Faker();
    public void logintest(){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("#userName")).sendKeys(faker.name().fullName());
        driver.quit();
    }
}
