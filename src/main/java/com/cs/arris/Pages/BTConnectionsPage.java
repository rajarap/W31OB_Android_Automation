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

public class BTConnectionsPage extends ParentClass {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Bluetooth']") // About
	public MobileElement bluetooth;
	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]") 
	public MobileElement connectionsBackIcon;
	
	public BTConnectionsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}


	public boolean clickBluetooth() {
		if (bluetooth.isDisplayed()) {
			click(bluetooth); 
			utils.log().info("Clicked on Bluetooth");
			return true;
		} else {
			return false;
		}
	}
	

	public boolean clickConnectionsBackIcon() {
		if (connectionsBackIcon.isDisplayed()) {
			click(connectionsBackIcon); 
			utils.log().info("Clicked on Connections back Icon");
			return true;
		} else {
			return false;
		}
	}
}
