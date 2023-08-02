package org.example.Alupului.Seleniu1.DemoQA.DemoQACheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CheckBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.id("tree-node-home"));
        WebElement checkbox = driver.findElement(By.cssSelector("label[for='tree-node-home']"));
        if(!checkbox.isSelected())
            checkbox.click();
        WebElement expanding = driver.findElement(By.cssSelector("div[@aria-label='Expand all']//div"));
            expanding.click();

        driver.close();
    }
}
