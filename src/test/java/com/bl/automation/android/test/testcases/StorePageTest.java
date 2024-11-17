package com.bl.automation.android.test.testcases;

import com.bl.automation.android.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class StorePageTest extends TestBase {
    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {
        initilization();
    }
    @Test
    public void testStoreLocator() throws Exception {
        Thread.sleep(3000);
        WebElement storeIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
        storeIcon.click();
        WebElement locationPermissionAllow = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
        locationPermissionAllow.click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();

        Actions actions = new Actions(driver);
        actions.sendKeys("Mumbai").perform();
    }


    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        closeDriver();

    }
}
