package com.cs.arris.Pages;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MaximumVerificationReachedPage  extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/tv_error_frag_title']") 
	public MobileElement maximumVerificationAttemptsExceededTitle;
		
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_error_frag_description") 
	public MobileElement pleaseWaitMessage;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='0000-1016']") 
	public MobileElement error_code_0000_1016;

	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_error_frag_retry") 
	public MobileElement tryAgainButton;	
	
	
	
	@Override
	public boolean isAt() {
		if (maximumVerificationAttemptsExceededTitle.isDisplayed()) {
			utils.log().info("On MAXIMUM VERIFICATION ATTEMPTS EXCEEDED Page");
			return true;
		} else {
			utils.log().info("Not on MAXIMUM VERIFICATION ATTEMPTS EXCEEDED Page");
			return false;
		}
	}
	
}
