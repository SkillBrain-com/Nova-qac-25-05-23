package org.example.Alupului.Seleniu1.Herokuapp.Playground;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Playground {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");

        driver.findElement(By.xpath("div[@class='linkDiv']/ul[@id='ul1']/li[@id='li1']/id=''a26")).click();

        driver.close();
    }
}
