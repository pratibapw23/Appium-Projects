package set_Mobile_Configurations;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestRun {	
	static DesiredCapabilities capabilities=new DesiredCapabilities();
	public static void main(String[] args) {
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		capabilities.setCapability(MobileCapabilityType.APP, "D:\\Training\\8x8 project\\Appium\\apks\\ApiDemos-debug.apk");
		
			URL url = null;
			try {
				url = new URL("http://0.0.0.0:4723/wd/hub");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,capabilities);
			driver.quit();
	}

}
