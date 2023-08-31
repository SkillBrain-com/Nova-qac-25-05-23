package org.example.AlupuluiTeodorIulianSeleniu4.DemoQA.BookStoreApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStoreAPI {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/swagger/");



        driver.quit();
    }
}
