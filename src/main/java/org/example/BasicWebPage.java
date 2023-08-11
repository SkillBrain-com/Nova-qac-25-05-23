package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BasicWebPage {

    public void basicWebPageTests(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));

        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");

        WebElement title = driver.findElement(By.cssSelector("h1"));
        System.out.println(title.getText());

        WebElement paragraph = driver.findElement(By.cssSelector("div.explanation>p"));
        System.out.println(paragraph.getText());

        WebElement paragraph2 = driver.findElement(By.id("para1"));
        System.out.println(paragraph2.getText());

        WebElement paragraph3 = driver.findElement(By.id("para2"));
        System.out.println(paragraph3.getText());

        driver.quit();


    }
}
