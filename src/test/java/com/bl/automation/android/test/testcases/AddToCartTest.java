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

public class AddToCartTest extends TestBase {
    @BeforeTest
    public void setup() throws MalformedURLException, InterruptedException {
        initilization();
    }

    @Test
    public void addToCart() throws InterruptedException {
        // Get the screen dimensions
        int screenHeight = driver.manage().window().getSize().height;
        int screenWidth = driver.manage().window().getSize().width;

        // Define start and end points for the scroll gesture (scroll up)
        int startX = screenWidth / 2; // Center of the screen horizontally
        int startY = (int) (screenHeight * 0.15); // 10% down from the top of the screen
        int endY = (int) (screenHeight * 0.85);    // 95% down from the top of the screen
        Thread.sleep(3000);
        // Perform the scroll-up gesture
        new TouchAction<>(driver)
                .press(PointOption.point(startX, endY)) // Start near the bottom of the screen
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))) // Wait for 1 second
                .moveTo(PointOption.point(startX, startY)) // Move to near the top of the screen
                .release()
                .perform();
        new TouchAction<>(driver)
                .press(PointOption.point(startX, endY)) // Start near the bottom of the screen
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))) // Wait for 1 second
                .moveTo(PointOption.point(startX, startY)) // Move to near the top of the screen
                .release()
                .perform();

        WebElement addToCartButton = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"product_card_add_to_cart_0\"]"));
        addToCartButton.click();
       Thread.sleep(3000);
       WebElement cartButton = driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"search_cart_button_HOME_SCREEN\"])[2]/android.view.ViewGroup"));
       cartButton.click();


    }

    @AfterTest
    public void quit() throws InterruptedException {
        closeDriver();
    }
}
