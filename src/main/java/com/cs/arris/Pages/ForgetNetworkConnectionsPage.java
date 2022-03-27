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

public class ForgetNetworkConnectionsPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Connections']") 
	public MobileElement connectionsTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Wi-Fi']") 
	public MobileElement wifiMenuItem;

	
	public ForgetNetworkConnectionsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public void openSettings() {
		super.getDriver().activateApp("com.android.settings/.Settings");
	}
	
	public void clickWifi() {
		if (wifiMenuItem.isDisplayed())
			click(wifiMenuItem);
	}


	@Override
	public boolean isAt() {
		if (connectionsTitle.isDisplayed()) {
			utils.log().info("On Connections Page");
			return true;
		} else {
			utils.log().info("Not on Connections Page");
			return false;
		}

	}

}
