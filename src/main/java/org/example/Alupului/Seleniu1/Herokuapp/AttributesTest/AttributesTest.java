package org.example.Alupului.Seleniu1.Herokuapp.AttributesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributesTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");

        driver.findElement(By.xpath("//div[@class='centered']/button[@class='styled-click-button']/onclick='setNewAttrib'")).click();


        driver.close();
    }
}
