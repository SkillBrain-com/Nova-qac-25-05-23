package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ModalDialogs {

    WebDriver driver = new ChromeDriver();

    public void modalDialogs(){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/modal-dialogs");
        driver.findElement(By.id("showSmallModal")).click();
        String modal = driver.findElement(By.cssSelector("div.modal-body")).getText();
        System.out.println(modal);
        driver.findElement(By.id("closeSmallModal")).click();
        driver.findElement(By.id("showLargeModal")).click();
        String modal2 = driver.findElement(By.cssSelector("div.modal-body>p")).getText();
        System.out.println(modal2);
        driver.findElement(By.id("closeLargeModal")).click();
        driver.quit();
    }

}
