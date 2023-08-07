package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testez4Linkuri {
    public static void main(String[] args) {
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ( );

        try {
            driver.get ("https://testpages.herokuapp.com/styled/index.html");


            java.util.List<WebElement> linkElements = driver.findElements (By.tagName ("a"));


            for (int i = 0; i < 4 && i < linkElements.size ( ); i++) {
                WebElement linkElement = linkElements.get (i);
                String linkText = linkElement.getText ( );
                String href = linkElement.getAttribute ("href");
                System.out.println ("Link Text: " + linkText);
                System.out.println ("Href: " + href);
            }
        } catch (Exception e) {
            e.printStackTrace ( );
        } finally {
            driver.quit ( );
        }
    }
}