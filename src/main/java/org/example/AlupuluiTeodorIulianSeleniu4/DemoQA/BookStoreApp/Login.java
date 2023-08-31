package org.example.AlupuluiTeodorIulianSeleniu4.DemoQA.BookStoreApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/login");

        //driver.findElement(By.id("userName")).sendKeys("Alupului");
        //driver.findElement(By.id("password")).sendKeys("111111");
        //WebElement login1 = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", login1);
        //driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

        WebElement newuser = driver.findElement(By.id("newUser"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", newuser);
        driver.findElement(By.id("newUser")).click();
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Alupului");
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Teodor-Iulian");
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Alupului");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("111111");
        WebElement recaptcha = driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", recaptcha);
        driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border")).click();

        WebElement register = driver.findElement(By.xpath("//*[@id=\"register\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", register);
        driver.findElement(By.xpath("//*[@id=\"register\"]")).click();
        WebElement backtolog = driver.findElement(By.id("gotologin"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", backtolog);
        driver.findElement(By.id("gotologin")).click();
        driver.findElement(By.id("userName")).sendKeys("Alupului");
        driver.findElement(By.id("password")).sendKeys("111111");
        WebElement login2 = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", login2);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

        driver.quit();
    }
}
