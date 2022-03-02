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

public class DebugLogsDialog extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/titleTextView") 
	public MobileElement titleText;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/messageTextView")
	public MobileElement message;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/ok_button")
	public MobileElement okButton;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/cancel_button")
	public MobileElement cancelButton;
	
	public DebugLogsDialog() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickCloseButton() {
		if (cancelButton.isDisplayed()) {
			click(cancelButton); 
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
