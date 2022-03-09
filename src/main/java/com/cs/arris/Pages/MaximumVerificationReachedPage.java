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
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_error_frag_code") 
	public MobileElement error_code_0000_1016;

	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_error_frag_retry") 
	public MobileElement tryAgainButton;	
	
	public void clickTryAgainButton() {
		if (tryAgainButton.isDisplayed()) {
		click(tryAgainButton); 
		utils.log().info("Clicked Try Again Button");
	} else {
		utils.log().info("Try Again button is not displayed");
	}
	}

	
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
