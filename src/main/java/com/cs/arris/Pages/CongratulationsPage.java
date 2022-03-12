package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CongratulationsPage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_congratulations") 
	public MobileElement continueButton; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_congratulations") 
	public MobileElement congratulationsText;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_f_connect_internet_desc") 
	public MobileElement connectRouterToWifiText;
	
	public CongratulationsPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	public void clickContinueButton()
	{
		click(continueButton);
		utils.log().info("Congratulations Page - Clicked on Continue Button");
	}
	
	@Override
	public boolean isAt() {
		super.pause();
		return true;
	}

}
