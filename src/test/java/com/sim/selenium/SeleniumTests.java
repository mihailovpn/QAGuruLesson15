package com.sim.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTests {
    //test
    @Test
    public void SeleniumTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        assertEquals(
                "Selenium automates browsers. That's it!",
                driver.getTitle());
    }
}
