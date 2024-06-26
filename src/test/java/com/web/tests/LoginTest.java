package com.web.tests;

import com.web.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginTest extends BaseTest {

    private LoginTest(){}
    @Test
    public void test1() {
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation 1", Keys.ENTER);
    }
}
