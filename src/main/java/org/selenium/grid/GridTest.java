package org.selenium.grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.URL;

public class GridTest {
    public static void main(String[] args) {
        try {
            // ✅ Automatically set up browser drivers (no manual path needed)
            WebDriverManager.chromedriver().setup();

            // ✅ Selenium Grid Hub URL
            String hubUrl = "http://localhost:4444/wd/hub";

            // ✅ Chrome options
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            // ✅ Create remote driver that connects to Grid
            WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);

            // ✅ Open a test website
            driver.get("https://www.google.com");

            // ✅ Print the page title
            System.out.println("Title: " + driver.getTitle());

            // ✅ Close the browser
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
