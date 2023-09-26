package org.example.Herokuapp.BasicWebPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");

        WebElement title = driver.findElement(By.cssSelector("h1"));
        System.out.println(title.getText());
        WebElement paragraph = driver.findElement(By.cssSelector("div.explanation"));
        System.out.println(paragraph.getText());
        WebElement paragraph1 = driver.findElement(By.id("para1"));
        System.out.println(paragraph1.getText());
        WebElement paragraph2 = driver.findElement(By.id("para2"));
        System.out.println(paragraph2.getText());

        driver.quit();
    }
}

