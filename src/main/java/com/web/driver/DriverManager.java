package com.web.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
    private DriverManager(){}

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver.set(driver);
    }

    public static void unload() {
        driver.remove();
    }
}
