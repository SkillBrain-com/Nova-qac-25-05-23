package org.example.Utils;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Remote {

    public static RemoteWebDriver getRemoteWebDriver(){
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("start-maximized");
            options.addArguments("disable-infobars");

            return new RemoteWebDriver(new URL("http://localhost:4444"), options);
        }catch (MalformedURLException e){
            throw new RuntimeException(e);
        }
    }
}
