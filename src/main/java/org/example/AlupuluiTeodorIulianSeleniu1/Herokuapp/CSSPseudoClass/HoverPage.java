package org.example.AlupuluiTeodorIulianSeleniu1.Herokuapp.CSSPseudoClass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HoverPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/csspseudo/css-hover.html");

        WebElement hovpara = driver.findElement(By.id("hoverpara"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", hovpara);
        driver.findElement(By.id("hoverpara")).click();
        WebElement hovdiv = driver.findElement(By.id("hoverdivpara"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", hovdiv);
        driver.findElement(By.id("hoverpara")).click();

        driver.quit();
    }
}
