package org.example.PopMichael.Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys("Pop Michael");
        driver.findElement(By.id("userEmail")).sendKeys("pop@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("cluj");
        driver.findElement(By.id("permanentAddress")).sendKeys("clujnapoca");
        driver.findElement(By.id("submit")).click();


        driver.quit();
    }
}
