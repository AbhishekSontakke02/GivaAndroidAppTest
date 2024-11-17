package com.bl.automation.android.test.testcases;

import com.bl.automation.android.base.TestBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class LoginPage extends TestBase {
    public AndroidDriver driver;

    public LoginPage() throws InterruptedException, MalformedURLException {
    }

    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {
       initilization();
    }
    @Test
    public void testLogin() throws Exception {
        Thread.sleep(5000);
    }


    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        closeDriver();

    }
}
