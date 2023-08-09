package org.example.Mentor;

import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    BrowserFactory browserFactory = new BrowserFactory();

    @BeforeMethod
    public void launchBrowser(){
        String browser = "chrome";
        String URL = "https://katalon-demo-cura.herokuapp.com/";

        DriverFactory.getInstance().setDriver(browserFactory.createBrowser(browser));
        DriverFactory.getInstance().getDriver().manage().window().setSize(new Dimension(1920,1080));

        DriverFactory.getInstance().getDriver().get(URL);
    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.getInstance().closeBrowser();
    }
}
