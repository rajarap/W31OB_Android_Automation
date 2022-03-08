package com.cs.arris.Pages;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ServiceNotAvailablePage  extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/tv_error_frag_title']") 
	public MobileElement serviceNotAvailableText;
		
	@AndroidFindBy (xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/tv_error_frag_description']") 
	public MobileElement issueConnectingToBackOfficeMessage;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='0003-1003']") //0003-1003
	public MobileElement error_code_0003_1003;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/title_text") 
	public MobileElement serviceNotAvailableTitleText;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_description_text") 
	public MobileElement issueConnectingToBackOfficeText;
	
	@AndroidFindBy (xpath = "com.arris.sbcBeta:id/tv_error_code_text") //0003-1014
	public MobileElement error_code_0003_1014;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_error_frag_retry") 
	public MobileElement tryAgainButton;	
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_generic_error_retry") 
	public MobileElement tryAgainBtn;	
	
	
	@Override
	public boolean isAt() {
		if (serviceNotAvailableText.isDisplayed() || serviceNotAvailableTitleText.isDisplayed()) {
			utils.log().info("On Service is Currently not available Page");
			return true;
		} else {
			utils.log().info("Not on Service is Currently not available Page");
			return false;
		}
	}
	
}
