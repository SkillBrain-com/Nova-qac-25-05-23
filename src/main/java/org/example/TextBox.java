package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TextBox {

    public void textBox(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        Faker faker = new Faker();

        String fullName = faker.name().fullName();
        String email = faker.name().firstName() + faker.name().lastName()+"@mailinator.com";
        String currentAddress = faker.address().fullAddress();
        String permanentAddress = faker.address().fullAddress();

        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys(fullName);


        driver.findElement(By.id("userEmail")).sendKeys(email);

        driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
        driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);

        driver.findElement(By.id("submit")).click();

        String actualName = driver.findElement(By.id("name")).getText();
        String actualEmail = driver.findElement(By.id("email")).getText();
        String actualCurrentAddress = driver.findElement(By.cssSelector("p#currentAddress")).getText();
        String actualPermanentAddress = driver.findElement(By.cssSelector("p#permanentAddress")).getText();


        Assert.assertEquals(actualName,"Name:"+ fullName);
        Assert.assertEquals(actualEmail, "Email:" + email);
        Assert.assertEquals(actualCurrentAddress, "Current Address :" + currentAddress);
        Assert.assertEquals(actualPermanentAddress, "Permananet Address :" + permanentAddress);



        driver.quit();

    }
}
