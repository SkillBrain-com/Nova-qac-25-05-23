package org.example.Mentor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {


    public WebDriver createBrowser(String browser){
        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");

            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            //TODO: implement firefox browser
        } else if (browser.equalsIgnoreCase("internetExplorer")) {
            //TODO: implement internet explorer driver
        }

        return driver;
    }
}
