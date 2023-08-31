package org.example.AlupuluiTeodorIulianSeleniu3.Herokuapp.Playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class Playground {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");

        WebElement paragraph1 = driver.findElement(By.id("p1"));
        System.out.println(paragraph1.getText());
        WebElement paragraph2 = driver.findElement(By.cssSelector("#p2"));
        System.out.println(paragraph2.getText());
        WebElement paragraph3 = driver.findElement(By.xpath("//p[@id=\"p3\"]"));
        System.out.println(paragraph3.getText());
        WebElement paragraph4 = driver.findElement(By.cssSelector("p[name= \"pName4\"]"));
        System.out.println(paragraph4.getText());
        WebElement paragraph5 = driver.findElement(By.xpath("//p[@id=\"p5\"]"));
        System.out.println(paragraph5.getText());
        WebElement paragraph6 = driver.findElement(By.name("pName6"));
        System.out.println(paragraph6.getText());
        WebElement paragraph7 = driver.findElement(By.cssSelector("div#div2>p"));
        System.out.println(paragraph7.getText());
        ArrayList<WebElement> elemente = new ArrayList<>();
        elemente.add(driver.findElement(By.name("normal")));
        System.out.println(elemente.get(6));

        driver.quit();
    }
}
