package com.cs.arris.Pages;


import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ConnectionToWifiNeededPage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	public String ssid;
	public String pwd;
	public String udid;
	
//	@AndroidFindAll({
//		@AndroidBy (xpath = "//android.widget.Button[@resource-id='com.arris.sbcBeta:id/btnRetry']"),  //CONTINUE
//		@AndroidBy (xpath = "//android.widget.Button[@bounds='[122,1953][958,2042]']"),
//		@AndroidBy (id = "com.arris.sbcBeta:id/btnRetry") 
//	})
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/btnRetry") 
	public MobileElement continueButton; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_congratulations") 
	//@AndroidFindBy (xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/tv_congratulations']") // text = CONNECTION NEEDED
	public MobileElement connectToWifiText;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_f_connect_internet_desc") 
	//@AndroidFindBy (xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/tv_f_connect_internet_desc']") // text = To continue with the install please connect to (arrisw311) through your Mobile Device Wi-Fi settings.
	public MobileElement connectRouterToWifiText;
	
	public ConnectionToWifiNeededPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	public void turnOnRouterWifi(String ssid, String pwd, String udid)
	{
		this.ssid = ssid;
		this.pwd = pwd;
		this.udid = udid;
		utils.log().info("Running App in the Background");
	   super.getDriver().runAppInBackground(Duration.ofSeconds(10));
       try 
       {
    	   utils.log().info("Connecting to " + this.ssid + " network");
    	   ProcessBuilder pb1 = new ProcessBuilder("/Users/rm2652/Library/Android/sdk/platform-tools/adb", "-s", this.udid, "shell", "am", "start", "-n", "com.steinwurf.adbjoinwifi/.MainActivity", "-e", "ssid", this.ssid, "-e", "password_type", "WPA", "-e", "password", this.pwd);
           Process pc1 = pb1.start();
           super.pause(10);
           ProcessBuilder pb2 = new ProcessBuilder("/Users/rm2652/Library/Android/sdk/platform-tools/adb", "-s", this.udid, "shell", "input", "keyevent", "3");
           Process pc2 = pb2.start();
       } catch (Exception e) {e.printStackTrace(); }  
       
       super.pause(5);
       utils.log().info("Activating App running in Background");
       super.pause(5);
       super.getDriver().activateApp("com.arris.sbcBeta");
	}
	
	public void connectToLocalWifi(String ssid, String pwd, String udid)
	{
		super.pause(3);
		this.ssid = ssid;
		this.pwd = pwd;
		this.udid = udid;
		utils.log().info("Running App in the Background");
	   super.getDriver().runAppInBackground(Duration.ofSeconds(10));
       try 
       {
    	   utils.log().info("Connecting to " + this.ssid + " network");
    	   ProcessBuilder pb1 = new ProcessBuilder("/Users/rm2652/Library/Android/sdk/platform-tools/adb", "-s", this.udid, "shell", "am", "start", "-n", "com.steinwurf.adbjoinwifi/.MainActivity", "-e", "ssid", this.ssid, "-e", "password_type", "WPA", "-e", "password", this.pwd);
           Process pc1 = pb1.start();
           super.pause(3);
           ProcessBuilder pb2 = new ProcessBuilder("/Users/rm2652/Library/Android/sdk/platform-tools/adb", "-s", this.udid, "shell", "input", "keyevent", "3");
           Process pc2 = pb2.start();
       } catch (Exception e) 
       {
         e.printStackTrace();
       }  
       super.pause(3);
       utils.log().info("Activating App running in Background");
       super.pause(3);
       super.getDriver().activateApp("com.arris.sbcBeta");
	}
	
//	public void restartAndroidDevice()
//	{
//		utils.log().info("Restarting Android Device");
//       try 
//       {
//    	   ProcessBuilder pb1 = new ProcessBuilder("/Users/rm2652/Library/Android/sdk/platform-tools/adb", "reboot");
//           Process pc1 = pb1.start();
//       } catch (Exception e) {e.printStackTrace();}  
//
//	}
	
	public void clickContinue()
	{
		click(continueButton);
		utils.log().info("Connection Needed Page - Clicked on Continue Button");
	}
	
	@Override
	public boolean isAt() {
		if (continueButton.isDisplayed()) {
			utils.log().info("On Connection Needed Page");
			return true;
		} else {
			utils.log().info("Not on Connection Needed Page");
			return false;
		}
	}

}
