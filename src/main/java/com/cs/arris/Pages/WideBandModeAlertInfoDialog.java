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

public class WideBandModeAlertInfoDialog extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/error_header_dialog") 
	public MobileElement titleText;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/error_description")
	public MobileElement message;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/ok_dialog")
	public MobileElement okButton;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/cancel_dialog")
	public MobileElement closeButton;
	
	public WideBandModeAlertInfoDialog() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickCloseButton() {
		if (closeButton.isDisplayed()) {
			click(closeButton); 
			utils.log().info("Clicked No Button");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickOkButton() {
		if (okButton.isDisplayed()) {
			click(okButton); 
			utils.log().info("Clicked on OK Button");
			return true;
		} else {
			return false;
		}
	}


	@Override
	public boolean isAt() {
		if (titleText.isDisplayed()) {
			utils.log().info("On Send Debug Logs Page");
			return true;
		} else {
			utils.log().info("Not on Send Debug Logs Page");
			return false;
		}

	}

}
