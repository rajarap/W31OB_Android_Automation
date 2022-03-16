package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class BlueToothConnectionFailedTroubleShootPage extends ParentClass implements Page
{
	TestUtils utils = new TestUtils();

	@AndroidFindBy (id = "com.arris.sbcBeta:id/title_text") 
	public MobileElement bluetoothConnectionFailedTroubleShootTitle;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_description_text") 
	public MobileElement bluetoothConnectionMessage;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_error_code_text") 
	public MobileElement bluetoothConnectionErrorCode;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_generic_troubleshoot") 
	public MobileElement bluetoothConnectionFailedTroubleShootButton;
	
	public BlueToothConnectionFailedTroubleShootPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickTroubleShootButton()
	{
		if(bluetoothConnectionFailedTroubleShootButton.isDisplayed())	{
			click(bluetoothConnectionFailedTroubleShootButton);
			utils.log().info("Clicked on Try Again Button");
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean isAt() {
		 if(bluetoothConnectionFailedTroubleShootTitle.isDisplayed()){
	        	utils.log().info("BLUETOOTH CONNECTION FAILED TROUBLESHOOT Page is displayed");
	        	return true;
	      }else{
	        	utils.log().info("BLUETOOTH CONNECTION FAILED TROUBLESHOOT Page is not displayed");
	        	return false;}
	}
	
}

