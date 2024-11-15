package com.bl.automation.android.test.testcases;

import com.bl.automation.android.pages.AddToCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AddToCartTest extends AddToCart {
    @BeforeTest
    public void setup() throws MalformedURLException, InterruptedException {
        initilization();
    }

    @Test
    public void addToCart() throws InterruptedException {
        //clickPendentCategory();
        WebElement dimond = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"HOME_SCREEN_5_0_dynamic\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
        dimond.click();
        Thread.sleep(3000);
        WebElement ring = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"product_card_add_to_cart_0\"]/android.view.ViewGroup/android.view.View"));
        ring.click();
        Thread.sleep(2000);


    }

    @AfterTest
    public void quit() throws InterruptedException {
        closeDriver();
    }
}
