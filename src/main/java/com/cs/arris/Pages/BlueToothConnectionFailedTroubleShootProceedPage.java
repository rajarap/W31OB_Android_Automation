package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class BlueToothConnectionFailedTroubleShootProceedPage extends ParentClass implements Page
{
	TestUtils utils = new TestUtils();

	@AndroidFindBy (id = "com.arris.sbcBeta:id/head") 
	public MobileElement troubleShootTitle;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_generic_error_retry_ts") 
	public MobileElement proceedButton;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/troubleShootButton") 
	public MobileElement customerSupportButton;

	
	public BlueToothConnectionFailedTroubleShootProceedPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickProceedbutton()
	{
		if(proceedButton.isDisplayed())	{
			click(proceedButton);
			utils.log().info("Clicked on Proceed Button");
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean isAt() {
		 if(troubleShootTitle.isDisplayed()){
	        	utils.log().info("On Troubleshoot Page");
	        	return true;
	      }else{
	        	utils.log().info("Not on Troubleshoot Page");
	        	return false;}
	}
	
}

