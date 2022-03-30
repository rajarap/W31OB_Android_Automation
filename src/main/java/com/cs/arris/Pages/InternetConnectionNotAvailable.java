package com.cs.arris.Pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class InternetConnectionNotAvailable extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	public String ssid;
	public String pwd;
	public String udid;

	@AndroidFindBy (id = "com.arris.sbc:id/tv_error_frag_title") 
	public MobileElement internetConnectionNotAvailableTitle;
	
	@AndroidFindBy (id = "com.arris.sbc:id/tv_error_frag_description") 
	public MobileElement internetConnectionNotAvailableMessage;
	
	@AndroidFindBy (id = "com.arris.sbc:id/tv_error_frag_code") 
	public MobileElement internetConnectionNotAvailableErrorCode;
	
	@AndroidFindBy (id = "com.arris.sbc:id/btn_error_frag_retry") 
	public MobileElement internetConnectionTryAgainButton;
	
	public InternetConnectionNotAvailable()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickTryAgainbutton()
	{
		if(internetConnectionTryAgainButton.isDisplayed())	{
			click(internetConnectionTryAgainButton);
			utils.log().info("Clicked on Try Again Button");
			return true;
		}else {
			return false;
		}
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
	
	@Override
	public boolean isAt() {
		 if(internetConnectionNotAvailableTitle.isDisplayed()){
	        	//utils.log().info("On INTERNET CONNECTION NOT AVAILABLE Page");
	        	return true;
	      }else{
	        	//utils.log().info("Not on INTERNET CONNECTION NOT AVAILABLE Page");
	        	return false;}
	}
	
}

