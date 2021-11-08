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

public class ParentalControlUserProfileAddRulePage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/imgCloseIcon") 
	public MobileElement closeIcon;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/txtHeader") 
	public MobileElement speedTestHistoryTitle;
	
	public ParentalControlUserProfileAddRulePage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	public void clickCloseIcon()
	{
		click(closeIcon);
		utils.log().info("Blank Speed Test History Page - Clicked on Close Icon");
	}
	
	@Override
	public boolean isAt() {
		if(speedTestHistoryTitle.isDisplayed())
		{
			utils.log().info("On Blank Speed Test History Page");
			return true;}
		else {
			utils.log().info("Not on Blank Speed Test History Page");
		return false;}
	}
	
}

