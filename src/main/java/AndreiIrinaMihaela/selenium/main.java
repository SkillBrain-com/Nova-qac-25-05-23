package AndreiIrinaMihaela.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Andrei Mihaela Irina");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("irinamihaela28@yahoo.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("buna ziua");
        driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("buna ziua");

        WebElement element = driver.findElement(By.cssSelector("button#submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);

        driver.findElement(By.cssSelector("button#submit")).click();



    }
}
