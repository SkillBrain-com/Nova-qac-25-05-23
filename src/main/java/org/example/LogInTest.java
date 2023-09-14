package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class LogInTest {
    WebDriver driver = new ChromeDriver();
    public void IncorectUserName(){
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/login");
        driver.findElement(By.cssSelector("#username")).sendKeys("Megalodon");
        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#flash>b")).isDisplayed());
        String text = driver.findElement(By.cssSelector("#flash>b")).getText();
        Assert.assertEquals(text,"Your username is invalid!");
        driver.findElement(By.cssSelector("button.btn-close")).click();
        driver.findElement(By.cssSelector("#username")).sendKeys("practice");
        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#flash>b")).isDisplayed());
        String text1 = driver.findElement(By.cssSelector("#flash>b")).getText();
        Assert.assertEquals(text1,"Your password is invalid!");

            driver.findElement(By.cssSelector("button.btn-close")).click();
            driver.findElement(By.cssSelector("#username")).sendKeys("practice");
            driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#flash>b")).isDisplayed());
        String text2 = driver.findElement(By.cssSelector("#flash>b")).getText();
        Assert.assertEquals(text2,"You logged into a secure area!");
        driver.quit();




    }

}
