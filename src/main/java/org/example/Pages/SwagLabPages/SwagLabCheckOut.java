package org.example.Pages.SwagLabPages;

import org.example.Utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabCheckOut extends TestBase {

    WebDriver driver;

    public SwagLabCheckOut(WebDriver driver) {
        this.driver = driver;
    }

    By finishButton = By.cssSelector("#finish");

    public void setFinishButton(){

        driver.findElement(finishButton).click();

    }


}
