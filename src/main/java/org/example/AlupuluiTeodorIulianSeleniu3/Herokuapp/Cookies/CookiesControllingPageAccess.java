package org.example.AlupuluiTeodorIulianSeleniu3.Herokuapp.Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesControllingPageAccess {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/cookies/adminlogin.html");

        driver.findElement(By.xpath("/html/body/div/div[3]/section/form/div/input[1]")).sendKeys("Alupuljui");
        driver.findElement(By.xpath("/html/body/div/div[3]/section/form/div/input[2]")).sendKeys("11111");
        WebElement log = driver.findElement(By.id("login"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", log);
        driver.findElement(By.id("login")).click();
        WebElement checkbox = driver.findElement(By.cssSelector("body > div > div.centered > section > form > div > label:nth-child(12) > input[type=checkbox]"));
        if(!checkbox.isSelected())
            checkbox.click();

        driver.quit();
    }
}
