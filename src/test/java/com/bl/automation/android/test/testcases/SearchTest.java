package com.bl.automation.android.test.testcases;

import com.bl.automation.android.base.TestBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class SearchTest extends TestBase {
    @BeforeTest
    public void setup() throws MalformedURLException, InterruptedException {
        initilization();
    }

    @Test
    public void testSearch() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_input_HOME_SCREEN\"]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup"));
        Thread.sleep(2000);
        searchBox.click();
        Thread.sleep(3000);
        WebElement searchInbox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));
        searchInbox.sendKeys("Rings");
        Thread.sleep(3000);
        WebElement searchSuggestion1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]"));
        searchSuggestion1.click();


    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        closeDriver();

    }
}
