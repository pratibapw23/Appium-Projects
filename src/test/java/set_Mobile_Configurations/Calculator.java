package set_Mobile_Configurations;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	static DesiredCapabilities capabilities=new DesiredCapabilities();
		static URL url=null;

	public static void main(String[] args) throws InterruptedException {
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		try {
			url = new URL("http://0.0.0.0:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,capabilities);
		Thread.sleep(2000);
		driver.findElementById("com.google.android.calculator:id/digit_7").click();
		Thread.sleep(2000);
		driver.findElementById("com.google.android.calculator:id/op_add").click();
		Thread.sleep(2000);
		driver.findElementById("com.google.android.calculator:id/digit_6").click();
		Thread.sleep(2000);
		driver.findElementById("com.google.android.calculator:id/eq").click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
