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

public class HomeNetowrkSatellitePerformanceAndConnectionHealthPage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/toolbar")
	public MobileElement backButton; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/txtToolBarTitle")
	public MobileElement satellitePerformanceConnectionHealthTitle;
	
	
	public HomeNetowrkSatellitePerformanceAndConnectionHealthPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	public void clickBackButton() {
		try {
			new SwipeActions().swipeScreen(Direction.UP);
			click(backButton);
			utils.log().info("Clicked on Back Button");
		} catch (Exception e) {
			utils.log().info("Back button is not displayed");
		}
	}

	
	@Override
	public boolean isAt() {
		if(satellitePerformanceConnectionHealthTitle.isDisplayed())
		{
			utils.log().info("On Satellite Performance and Connection Health Page");
			return true;
		}else {
			utils.log().info("Not on Satellite Performance and Connection Health Page");
		return false;}
		
	}

}
