package org.selenium.grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeOptions;

import java.net.URL;

public class MultiBrowserTest {
    public static void main(String[] args) throws Exception {
        // Chrome
        WebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
        chrome.get("https://www.google.com");
        System.out.println("Chrome Title: " + chrome.getTitle());
        chrome.quit();

        // Firefox
        WebDriver firefox = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new FirefoxOptions());
        firefox.get("https://www.bing.com");
        System.out.println("Firefox Title: " + firefox.getTitle());
        firefox.quit();

        // Edge
        WebDriver edge = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new EdgeOptions());
        edge.get("https://www.wikipedia.org");
        System.out.println("Edge Title: " + edge.getTitle());
        edge.quit();
    }
}
