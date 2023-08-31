package org.example.AlupuluiTeodorIulianSeleniu3.Herokuapp.MicroApps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptCountdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/javascript-countdown-test.html");

        WebElement selecttime = driver.findElement(By.cssSelector("#timer-seconds"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selecttime);
        driver.findElement(By.cssSelector("#timer-seconds")).sendKeys("100");
        WebElement starttimer = driver.findElement(By.cssSelector("#start-timer"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", starttimer);
        driver.findElement(By.cssSelector("#start-timer")).click();
        WebElement stoptimer = driver.findElement(By.cssSelector("#stop-timer"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", stoptimer);
        driver.findElement(By.cssSelector("#stop-timer")).click();
        WebElement cleartimer = driver.findElement(By.cssSelector("#clear-timer"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cleartimer);
        driver.findElement(By.cssSelector("#clear-timer")).click();
        WebElement resettimer = driver.findElement(By.cssSelector("#reset-timer"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", resettimer);
        driver.findElement(By.cssSelector("#reset-timer")).click();

        driver.quit();
    }
}
