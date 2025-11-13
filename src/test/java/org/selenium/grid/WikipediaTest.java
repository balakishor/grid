package org.selenium.grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class WikipediaTest {
    @Test
    public void openWikipedia() throws Exception {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new EdgeOptions());
        driver.get("https://www.wikipedia.org");
        System.out.println("Wikipedia Title: " + driver.getTitle());
        driver.quit();
    }
}
