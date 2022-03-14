package com.cs.arris.Pages;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class BlueToothConnectionFailedPage extends ParentClass implements Page
{
	TestUtils utils = new TestUtils();

	@AndroidFindBy (id = "com.arris.sbcBeta:id/title_text") 
	public MobileElement bluetoothConnectionFailed;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_description_text") 
	public MobileElement bluetoothConnectionMessage;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_error_code_text") 
	public MobileElement bluetoothConnectionErrorCode;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_generic_error_retry") 
	public MobileElement bluetoothConnectionFailedTryAgainButton;
	
	public BlueToothConnectionFailedPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickTryAgainbutton()
	{
		if(bluetoothConnectionFailedTryAgainButton.isDisplayed())	{
			click(bluetoothConnectionFailedTryAgainButton);
			utils.log().info("Clicked on Try Again Button");
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean isAt() {
		 if(bluetoothConnectionFailed.isDisplayed()){
	        	utils.log().info("BLUETOOTH CONNECTION FAILED Page is displayed");
	        	return true;
	      }else{
	        	utils.log().info("BLUETOOTH CONNECTION FAILED Page is not displayed");
	        	return false;}
	}
	
}

