package org.example.AlupuluiTeodorIulianSeleniu2.Herokuapp.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFramesTestPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/iframes-test.html");

        WebElement mainframe = driver.findElement(By.cssSelector("#dynamic-iframe"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", mainframe);
        action.dragAndDropBy(mainframe, 250, 250).build().perform();

        driver.quit();
    }
}
