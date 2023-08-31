package org.example.AlupuluiTeodorIulianSeleniu2.DemoQA.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMenu {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");

        WebElement selectval = driver.findElement(By.cssSelector("#withOptGroup > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectval);
        driver.findElement(By.cssSelector("#withOptGroup > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder")).click();
        WebElement select1 = driver.findElement(By.id("selectOne"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", select1);
        driver.findElement(By.id("selectOne")).click();
        WebElement oldstylemenu = driver.findElement(By.id("oldSelectMenu"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", oldstylemenu);
        driver.findElement(By.id("oldSelectMenu")).click();
        WebElement multiselect = driver.findElement(By.cssSelector("#selectMenuContainer > div:nth-child(7) > div > div > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiselect);
        driver.findElement(By.cssSelector("#selectMenuContainer > div:nth-child(7) > div > div > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder")).click();
        WebElement standardmultiselect = driver.findElement(By.id("cars"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", standardmultiselect);
        driver.findElement(By.id("cars")).click();


    }
}
