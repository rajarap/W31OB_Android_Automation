package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.Direction;
import com.cs.arris.Utilities.SwipeActions;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeNetowrkTurnOffNetworkOptimizationDialog extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/cancel_dialog")
	public MobileElement closeButton; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/error_cancel_dialog")
	public MobileElement turnOffButton; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/ok_dialog")
	public MobileElement cancelButton; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/error_header_dialog")
	public MobileElement turnOffOptimizationTitle;
	
	
	public HomeNetowrkTurnOffNetworkOptimizationDialog()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	public void clickTurnOffButton() {
		try {
			click(turnOffButton);
			utils.log().info("Clicked on YES, TURN OFF Button");
		} catch (Exception e) {
			utils.log().info("YES, TURN OFF button is not displayed");
		}
	}

	
	@Override
	public boolean isAt() {
		if(turnOffOptimizationTitle.isDisplayed())
		{
			utils.log().info("On TURN OFF NETWORK OPTIMIZATION Page");
			return true;
		}else {
			utils.log().info("Not on TURN OFF NETWORK OPTIMIZATION Page");
		return false;}
		
	}

}
