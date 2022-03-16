package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class InternetConnectionNotAvailable extends ParentClass implements Page
{
	TestUtils utils = new TestUtils();

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
	
	@Override
	public boolean isAt() {
		 if(internetConnectionNotAvailableTitle.isDisplayed()){
	        	utils.log().info("On INTERNET CONNECTION NOT AVAILABLE Page");
	        	return true;
	      }else{
	        	utils.log().info("Not on INTERNET CONNECTION NOT AVAILABLE Page");
	        	return false;}
	}
	
}

