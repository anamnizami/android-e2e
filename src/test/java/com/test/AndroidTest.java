package com.test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.testng.Assert;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.net.URL;

class AndroidTest {
    private static final Logger logger = Logger.getLogger(AndroidTest.class.getName());
    @Test
     void AndroidLaunchTest () throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
//        options.setDeviceName("Neiuoi");
        options.setCapability("newCommandTimeout", 30000);
        options.setApp(System.getProperty("user.dir")+"/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"),options);
        Thread.sleep(10000);

        try {


//            String elementText = element.getText();

            // Log the text to the terminal
//            System.out.println("Element Text: " + driver.findElement(By.xpath("com.qualitrain.fitness:id/start_sign_in_button")).getText());
            logger.warning(driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"store item text\"])[1]")).getText());

            Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"store item text\"])[1]")).getText(),"Sauce Labs Backpack");
        } finally {
            driver.quit();
        }

    }

    @Test
    void AT () {
        logger.warning("hello hello hello hello");
            assert 1 == 1;
    }
}

