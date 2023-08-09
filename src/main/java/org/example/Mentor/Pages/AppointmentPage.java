package org.example.Mentor.Pages;

import org.example.Mentor.DriverFactory;
import org.example.Mentor.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AppointmentPage extends TestBase {

    By makeAppointmentButton = By.id("btn-book-appointment");

    public void verifyAppointmentPage(){
        Assert.assertNotNull(DriverFactory.getInstance().getDriver().findElement(makeAppointmentButton));
    }
}
