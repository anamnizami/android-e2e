package com.test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

class AndroidTest {
    @Test
     void AndroidLaunchTest () throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("Nexus 6");
        options.setCapability("newCommandTimeout", 10000);
        options.setApp(System.getProperty("user.dir")+"/apps/galaxy-QualitrainRelease-3.13.10644.283.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"),options);
        Thread.sleep(10000);

        try {


//            String elementText = element.getText();

            // Log the text to the terminal
            System.out.println("Element Text: " + driver.findElement(AppiumBy.id("com.qualitrain.fitness:id/start_sign_in_button")).getText());
            Assert.assertEquals(driver.findElement(AppiumBy.id("com.qualitrain.fitness:id/start_sign_in_button")).getText(),"Log In");
        } finally {
            driver.quit();
        }

    }
}
