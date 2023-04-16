package testandro;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class testandroauto {

    public static void main(String[] args) {

        try {
            AppiumDriver appiumDriver;
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
            desiredCapabilities.setCapability("appPackage", "com.splendapps.splendo");
            desiredCapabilities.setCapability("appActivity", "com.splendapps.splendo.MainActivity");

            URL appiumServer = new URL("http://localhost:4723/wd/hub");

            appiumDriver = new AppiumDriver(appiumServer, desiredCapabilities);

            //Tap add icon button

            appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Add Task']")).click();

            //input task name

            appiumDriver.findElement(By.xpath("//android.widget.EditText[@text='Enter Task Here']")).sendKeys("Jalan Jalan Lagi");

           //set due date

            appiumDriver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.splendapps.splendo:id/btnSetD']")).click();

            appiumDriver.findElement(By.xpath("//android.view.View[@content-desc='28 April 2023']")).click();

            appiumDriver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")).click();

            //set time

            appiumDriver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.splendapps.splendo:id/btnSetT']")).click();

            appiumDriver.findElement(By.id("android:id/button1")).click();

            //set repeat//

            appiumDriver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.splendapps.splendo:id/spinnerRepeat']")).click();

            appiumDriver.findElement(By.xpath("//android.widget.TextView[@text='Once a Week']")).click();

            //set add to list

            appiumDriver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.splendapps.splendo:id/spinnerLists']")).click();

            appiumDriver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();

            //submit

            appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.splendapps.splendo:id/fabSaveTask']")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
