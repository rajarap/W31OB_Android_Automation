package com.cs.arris.Utilities;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class SevenTapEmail extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Compose\"]")
	public MobileElement composeTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Send\"]")
	public MobileElement sendButton;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public MobileElement navigateBackButton;

	@AndroidFindBy(xpath = "//XCUIElementTypeButton[@name=\"ComposeRecipientAddButton\"]")
	public MobileElement addEmailAddressButton;
	
	@AndroidFindBy(xpath = "//com.google.android.gm[@resource-id='com.google.android.gm:id/to']")
	public MobileElement existingEmailAddressButton;
	
//	@AndroidFindBy(id = "com.google.android.gm:id/to")
//	public MobileElement toFieldTextBox;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.google.android.gm:id/to"),
		@AndroidBy (xpath = "//android.widget.MultiAutoCompleteTextView[@resource-id='com.google.android.gm:id/to']"),
		@AndroidBy (xpath = "//android.widget.MultiAutoCompleteTextView[@bounds='[189,358][1080,505]']")
	})
	public MobileElement toFieldTextBox;
	
		
	public void clickSendButton() {
		utils.log().info("Clicking on Send Button");
		if (super.getDriver().findElementByXPath("//android.widget.TextView[@content-desc=\"Send\"]").isDisplayed()) {
			click(super.getDriver().findElementByXPath("//android.widget.TextView[@content-desc=\"Send\"]")); 
			utils.log().info("Clicked Send Button");
		} else {
			utils.log().info("Unable to find Send Button");
		}
	}
	
	public void enterEmailAddress() {
		super.setConfigProperties();
		if(super.getDriver().findElementById("com.google.android.gm:id/to").isDisplayed()) {
			clear(super.getDriver().findElementById("com.google.android.gm:id/to"));
			sendKeys(super.getDriver().findElementById("com.google.android.gm:id/to"), super.getProps().getProperty("emailid"));
			utils.log().info("Entered email address in To field");
		} else {
			utils.log().info("Unable to find To field");
		}
	}

	@Override
	public boolean isAt() {
		if (composeTitle.isDisplayed()) {
			utils.log().info("On Email Compose Page");
			return true;
		} else {
			utils.log().info("Not on Email Compose Page");
			return false;
		}
	}

}
