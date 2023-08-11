package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class HTMLTable {

    public void htmlTable(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));

        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");

        WebElement name1 = driver.findElement(By.cssSelector("table#mytable>tbody>tr:nth-of-type(2)>td:nth-of-type(1)"));
        WebElement amount1 = driver.findElement(By.cssSelector("table#mytable>tbody>tr:nth-of-type(2)>td:nth-of-type(2)"));
        System.out.println("Name: " + name1.getText() + " with amount: " + amount1.getText());

        WebElement name2 = driver.findElement(By.cssSelector("table#mytable>tbody>tr:nth-of-type(3)>td:nth-of-type(1)"));
        WebElement amount2 = driver.findElement(By.cssSelector("table#mytable>tbody>tr:nth-of-type(3)>td:nth-of-type(2)"));
        System.out.println("Name: " + name2.getText() + " with amount: " + amount2.getText());

        driver.quit();


    }
}
