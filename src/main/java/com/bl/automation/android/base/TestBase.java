package com.bl.automation.android.base;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {


    public static AndroidDriver driver;
    public static DesiredCapabilities capabilities;
    public static void initilization() throws MalformedURLException, InterruptedException {

            capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("platformVersion","14");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("appPackage","co.giva.jewellery");
            capabilities.setCapability("appActivity","co.giva.jewellery.MainActivityDefault");

            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
            Thread.sleep(4000);
            WebElement phone_number=driver.findElement(By.id("com.google.android.gms:id/phone_number_list_item"));
            phone_number.click();
            driver.navigate().back();
            WebElement allowNotification = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"));
            allowNotification.click();
        }

    public static void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        }
    }


