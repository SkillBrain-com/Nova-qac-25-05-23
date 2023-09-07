package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Forms {

    WebDriver driver = new ChromeDriver();
    Faker faker = new Faker();


    public void forms (){

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys(faker.name().firstName());
        driver.findElement(By.id("lastName")).sendKeys(faker.name().lastName());
        driver.findElement(By.id("userEmail")).sendKeys(faker.name().firstName() + "." + faker.name().lastName() + "@mailinator.com");
        driver.findElement(By.cssSelector("#gender-radio-1+label")).click();
        driver.findElement(By.id("userNumber")).sendKeys(faker.phoneNumber().phoneNumber());
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.xpath("(//div[contains(text(),\"6\")])[1]")).click();
        driver.findElement(By.cssSelector("#subjectsInput")).sendKeys(faker.lorem().characters(10));
        driver.findElement(By.cssSelector("#hobbies-checkbox-1+label")).click();
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\dumit\\OneDrive\\Desktop\\Banana.jpeg");
        driver.findElement(By.cssSelector("#currentAddress-wrapper>div>textArea")).sendKeys(faker.address().fullAddress());
        //driver.findElement(By.cssSelector("#state>div>div>div[aria-hidden=\"true\"]")).click();
       // driver.findElement(By.id("react-select-3-option-0")).click();
       // driver.findElement(By.id("react-select-4-option-0")).click();
        driver.quit();
    }


}
