package com.cs.arris.Utilities;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class SevenTapEmail extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	public TouchAction action = new TouchAction(getDriver());
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Compose\"]")
	public MobileElement ComposeTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Send\"]")
	public MobileElement sendButton;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public MobileElement navigateBackButton;

	@AndroidFindBy(xpath = "//XCUIElementTypeButton[@name=\"ComposeRecipientAddButton\"]")
	public MobileElement addEmailAddressButton;
	
	@AndroidFindBy(xpath = "//com.google.android.gm[@resource-id='com.google.android.gm:id/to']")
	public MobileElement existingEmailAddressButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"To\"]")
	public MobileElement toFieldTextBox;
	
	
	public boolean clickSendButton() {
		if (sendButton.isDisplayed()) {
			click(sendButton); 
			utils.log().info("Clicked Send Button");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterEmailAddress() {
		if (toFieldTextBox.isDisplayed()) {
			clear(toFieldTextBox);
			sendKeys(toFieldTextBox, super.getProps().getProperty("emailid"));
			utils.log().info("Entered email address in To field");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (ComposeTitle.isDisplayed()) {
			utils.log().info("On Email Compose Page");
			return true;
		} else {
			utils.log().info("Not on Email Compose Page");
			return false;
		}
	}

}
