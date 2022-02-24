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

public class NetworkWANIPConfigurationHelpPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/ivDialogClose")
	public MobileElement closeButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/webView") 
	public MobileElement wanIPConfigurationTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@bounds='[52,731][1029,968]']")
	public MobileElement controlAndConfigure;
		
	public NetworkWANIPConfigurationHelpPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickCloseButton() {
		if (closeButton.isDisplayed()) {
			new SwipeActions().swipeScreen(Direction.UP);
			new SwipeActions().swipeScreen(Direction.UP);
			click(closeButton);
			utils.log().info("Clicked on Close Button");
			return true;
		} else {
			utils.log().info("Close button is not displayed");
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (wanIPConfigurationTitle.isDisplayed()) {
			utils.log().info("On WAN IP Configuration Help Page");
			return true;
		} else {
			utils.log().info("Not on WAN IP Configuration Help Page");
			return false;
		}
	}
}
