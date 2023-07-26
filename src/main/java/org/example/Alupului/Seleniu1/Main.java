package org.example.Alupului.Seleniu1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");


        driver.findElement(By.id("userName")).sendKeys("Alupului");
        driver.findElement(By.cssSelector("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.cssSelector("currentAddress")).sendKeys("Bohotin");
        driver.findElement(By.id("permanentAddress")).sendKeys("Bohotin");

        WebElement element = driver.findElement(By.cssSelector("button#submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.cssSelector("button#submit")).click();

        driver.close();

        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.className("rct-options"));
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();

        driver.close();

        driver.get("https://demoqa.com/radio-button");

        driver.findElement(By.id("userName")).sendKeys("Alupului Teodor-Iulian");
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.id("currentAddress")).sendKeys("Bohotin");
        driver.findElement(By.id("permanentAddress")).sendKeys("Bohotin");
        driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();

        driver.close();


        driver.get("https://demoqa.com/webtables");

        driver.findElement(By.id("userName")).sendKeys("Alupului Teodor-Iulian");
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.id("currentAddress")).sendKeys("Bohotin");
        driver.findElement(By.id("permanentAddress")).sendKeys("Bohotin");
        driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();

        driver.close();

        driver.get("https://demoqa.com/buttons");

        driver.findElement(By.id("userName")).sendKeys("Alupului Teodor-Iulian");
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.id("currentAddress")).sendKeys("Bohotin");
        driver.findElement(By.id("permanentAddress")).sendKeys("Bohotin");
        driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();

        driver.close();

        driver.get("https://demoqa.com/links");

        driver.findElement(By.id("userName")).sendKeys("Alupului Teodor-Iulian");
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.id("currentAddress")).sendKeys("Bohotin");
        driver.findElement(By.id("permanentAddress")).sendKeys("Bohotin");
        driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();

        driver.close();

        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");

        driver.findElement(By.id("para1")).getText();
        driver.findElement(By.id("para2")).getText();
        WebElement link1 = driver.findElement(By.linkText("https://eveltester.com"));
        System.out.println(link1.getText());
        WebElement link2 = driver.findElement(By.linkText("https://compendiumdev.co.ok"));
        System.out.println(link2.getText());

        driver.close();


        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");

        WebElement link3 = driver.findElement(By.linkText("index.html"));
        System.out.println(link3.getText());
        driver.findElement(By.id("h1")).getText();
        driver.findElement(By.id("h2")).getText();
        driver.findElement(By.cssSelector("button[id=\"Add Another Attribute\"]")).click();

        driver.close();

        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");

        driver.findElement(By.id("userName")).sendKeys("Alupului Teodor-Iulian");
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.id("currentAddress")).sendKeys("Bohotin");
        driver.findElement(By.id("permanentAddress")).sendKeys("Bohotin");
        driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();

        driver.close();

    }
}