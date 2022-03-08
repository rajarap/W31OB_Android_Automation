package com.cs.arris.Utilities;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class SevenTapLogs extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	public TouchAction action = new TouchAction(getDriver());
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SBC Test']")
	public MobileElement sbcTestTitle;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/messageTextView")
	public MobileElement messageTextView;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
	public MobileElement yesButton;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='NO']")
	public MobileElement noButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement gmailIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Send\"]")
	public MobileElement sendButton;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public MobileElement navigateBackButton;

	@AndroidFindBy(xpath = "//XCUIElementTypeButton[@name=\"ComposeRecipientAddButton\"]")
	public MobileElement addEmailAddressButton;
	
	@AndroidFindBy(xpath = "//com.google.android.gm[@resource-id='com.google.android.gm:id/to' and  @text='<#mobdevsupport@commscope.com>']")
	public MobileElement existingEmailAddressButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"To\"]")
	public MobileElement toFieldTextBox;
	
	
	public boolean clickCancelButton() {
		if (navigateBackButton.isDisplayed()) {
			click(navigateBackButton); 
			utils.log().info("Clicked Navigate Back Button");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickSendButton() {
		if (sendButton.isDisplayed()) {
			click(sendButton); 
			utils.log().info("Clicked Send Button");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickGmailIcon() {
		if (gmailIcon.isDisplayed()) {
			click(gmailIcon); 
			utils.log().info("Clicked Gmail Icon");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickYesButton() {
		if (yesButton.isDisplayed()) {
			utils.log().info("Clicking on Yes Button to send 7 Tap logs");
			click(yesButton); 
			utils.log().info("Clicked Yes Button to send 7 Tap logs");
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
		if (sbcTestTitle.isDisplayed()) {
			utils.log().info("On Seven Tap SBC Test Page");
			return true;
		} else {
			utils.log().info("Not on Seven Tap SBC Test Page");
			return false;
		}
	}

}
