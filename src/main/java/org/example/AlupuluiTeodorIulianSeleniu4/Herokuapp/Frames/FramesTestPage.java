package org.example.AlupuluiTeodorIulianSeleniu4.Herokuapp.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTestPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");

        WebElement leftside = driver.findElement(By.xpath("/html/body/h1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", leftside);
        action.dragAndDropBy(leftside, 250, 250).build().perform();
        WebElement middleside = driver.findElement(By.xpath("/html/body/h1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", middleside);
        action.dragAndDropBy(middleside, 200, 200).build().perform();
        WebElement rightside = driver.findElement(By.xpath("/html/body/h1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", rightside);
        action.dragAndDropBy(rightside, 250, 250).build().perform();

        driver.quit();
    }
}
