package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RemoteAccessUnavailableTroubleShootPage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/top_footer") 
	public MobileElement troubleshootTitle1;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/trouble_shoot_error_header") 
	public MobileElement troubleshootTitle2;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/trouble_shoot_proceed") 
	public MobileElement okButton;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/trouble_shoot_on_board") 
	public MobileElement continueOnboardingButton;

	
	public RemoteAccessUnavailableTroubleShootPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	public void clickOKButton()
	{
		if(okButton.isDisplayed()) {
			click(okButton);
			utils.log().info("Clicked on OK button to reboot the mAX router ");
		}
	}
	
	public void clickContinueOnboardingButton()
	{
		if(continueOnboardingButton.isDisplayed()) {
			click(continueOnboardingButton);
			utils.log().info("Clicked on Continue Onboarding button to continue with main AP onboarding");
		} 
	}


	@Override
	public boolean isAt() {
		if(troubleshootTitle2.isDisplayed()) {
			utils.log().info("On Remote access to your network is currently unavailable page");
			return true;
		} else {
			utils.log().info("Not on Remote access to your network is currently unavailable page");
			return false;
		}
	}
	
}
