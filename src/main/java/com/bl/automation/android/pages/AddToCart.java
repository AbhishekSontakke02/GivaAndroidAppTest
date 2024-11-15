package com.bl.automation.android.pages;

import com.bl.automation.android.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends TestBase {


    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"HOME_SCREEN_5_0_dynamic\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    static WebElement pendentCategory;

    public static void clickPendentCategory(){
        pendentCategory.click();
    }
}
