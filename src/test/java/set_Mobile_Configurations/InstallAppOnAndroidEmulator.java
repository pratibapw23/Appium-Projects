package set_Mobile_Configurations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallAppOnAndroidEmulator {
	static AndroidDriver<WebElement> driver;
	
	static DesiredCapabilities capabilities=new DesiredCapabilities();
	public static void setCapabilities()
	{
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, 11);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		//String path=getActualPath();
		capabilities.setCapability(MobileCapabilityType.APP, "D:\\Training\\8x8 project\\Appium\\apks\\Appium_test_App.apk");
		
		try {
			 driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}	  
		
	}
	private static String getActualPath() {
		FileReader reader = null;
		try {
			reader = new FileReader("config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 Properties prop=new Properties();
		 try {
			prop.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		 String filepath=prop.getProperty(getActualPath());
		return filepath;
	}
	
	
}
