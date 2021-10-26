package set_Mobile_Configurations;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

public class Dial_A_Number {
	static AndroidDriver<WebElement> driver;
	static DesiredCapabilities capabilities=new DesiredCapabilities();
	URL url=null;
  @Test
  public void DialNumber() throws InterruptedException {
	   driver=new AndroidDriver<WebElement>(url,capabilities);
		Thread.sleep(2000);
		driver.findElementById("com.android.dialer:id/fab").click();
		Thread.sleep(2000);
		//8142358654
		driver.findElementById("com.android.dialer:id/eight").click();
		driver.findElementById("com.android.dialer:id/one").click();
		driver.findElementById("com.android.dialer:id/four").click();
		driver.findElementById("com.android.dialer:id/two").click();
		driver.findElementById("com.android.dialer:id/three").click();
		driver.findElementById("com.android.dialer:id/five").click();
		driver.findElementById("com.android.dialer:id/eight").click();
		driver.findElementById("com.android.dialer:id/six").click();
		driver.findElementById("com.android.dialer:id/five").click();
		driver.findElementById("com.android.dialer:id/four").click();
		Thread.sleep(4000);
		driver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click();
		Thread.sleep(3000);
		
		
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		capabilities.setCapability("appPackage", "com.android.dialer");
		capabilities.setCapability("appActivity", "com.android.dialer.app.DialtactsActivity");
		
		try {
			url = new URL("http://0.0.0.0:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
