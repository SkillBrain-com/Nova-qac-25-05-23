package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class DynamicAttributes {

    public void dynamicAttributes(){
        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1920,1080));

        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");

        WebElement paragraph = driver.findElement(By.id("jsattributes"));
        System.out.println(paragraph.getText());

        driver.quit();
    }
}
