package com.cs.arris.Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

public class HomeNetworkHealthOptimizationSkipPage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();

	@AndroidFindBy (id = "com.arris.sbcBeta:id/txt_tutorial_skip")
	public MobileElement skipText; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tutorialText")
	public MobileElement tutorialText; 
	
	
	public HomeNetworkHealthOptimizationSkipPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	
	 
		public boolean clickSkipText() {
			if (skipText.isDisplayed()) {
				click(skipText);
				utils.log().info("Clicked on Skip Tutorial Text");
				return true;
			} else {
				utils.log().info("Skip Tutorial Text is not displayed");
				return false;
			}
		}
		
		 
	
	@Override
	public boolean isAt() {
		if(tutorialText.isDisplayed())
		{
			utils.log().info("On You can find the control to turn on/off network health optimization here Page");
			return true;}
		else {
			utils.log().info("Not on You can find the control to turn on/off network health optimization here Page");
		return false;}
	}
}
