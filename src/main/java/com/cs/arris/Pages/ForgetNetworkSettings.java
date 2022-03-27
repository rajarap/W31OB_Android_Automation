package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ForgetNetworkSettings extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=Settings']") 
	public MobileElement settingsTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=Connections']") 
	public MobileElement connectionsMenuItem;

	
	public ForgetNetworkSettings() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public void openSettings() {
		super.getDriver().activateApp("com.android.settings.Settings");
	}
	
	public void clickConnections() {
		if (connectionsMenuItem.isDisplayed())
			click(connectionsMenuItem);
	}

	@Override
	public boolean isAt() {
		if (settingsTitle.isDisplayed()) {
			utils.log().info("On Android Settings Page");
			return true;
		} else {
			utils.log().info("Not on Android Settings Page");
			return false;
		}

	}

}
