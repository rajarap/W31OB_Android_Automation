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

public class BTPairingPanelPage extends ParentClass implements Page{
	public TestUtils utils = new TestUtils();
	

	@AndroidFindBy(id = "android:id/alertTitle") 
	public MobileElement btPairingRequest;

	@AndroidFindBy(id = "android:id/button1") 
	public MobileElement okButton;

	@AndroidFindBy(xpath = "android:id/button2")
	public MobileElement cancelButton;
	
	public BTPairingPanelPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickOKButton() {
		if (okButton.isDisplayed()) {
			click(okButton); 
			super.pause(3);
			utils.log().info("Clicked on OK button");
			return true;
		} else {
			return false;
		}
	}

	public boolean clickCancelButton() {
		if (cancelButton.isDisplayed()) {
			click(cancelButton); 
			utils.log().info("Clicked on Cancel Bluetooth");
			return true;
		} else {
			return false;
		}
	}
	

	@Override
	public boolean isAt() {
		if (btPairingRequest.isDisplayed()) {
			utils.log().info("On Bluetooth pairing request Panel");
			return true;
		} else {
			utils.log().info("Not on Bluetooth pairing request Panel");
			return false;
		}
	}

}
