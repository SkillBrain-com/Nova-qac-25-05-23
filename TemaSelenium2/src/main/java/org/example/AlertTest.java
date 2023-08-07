package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    public static void main(String[] args) {
        firstAlertTest();
    }

    public static void firstAlertTest(){
        ChromeDriver driver = null;
        try {
            BrowseManage manager= new BrowseManage();
            driver = manager.getChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
            WebElement thirdButton = driver.findElement(By.id("promptexample"));
            for (int i = 0; i <= 1; i++) {
                System.out.println("itineratia " + i);
                thirdButton.click();
                System.out.println("Este deschis dupa apasarea butonului " + isAlertOpened(driver));
                Alert alert = driver.switchTo().alert();
                if (i == 0) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                String buttonbox = driver.findElement(By.id("promptexplanation")).getText();
                System.out.println(buttonbox);
                String textbox = driver.findElement(By.id("promptreturn")).getText();
                System.out.println(textbox);
                System.out.println("Alerta este deschisa dupa ce a fost inchisa " + isAlertOpened(driver));
                System.out.println("-------------");
            }
        } finally {
            System.out.println("inchidem programul");
            if (driver != null) {
                driver.quit();
            }
        }
    }
        public static boolean isAlertOpened (ChromeDriver driver) {
            try {
                driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }
}



