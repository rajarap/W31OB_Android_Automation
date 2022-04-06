package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AttentionPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindAll({
		@AndroidBy (id = "android:id/alertTitle"),
		@AndroidBy (xpath = "//android.widget.TextView[@text='Attention']"), 
		@AndroidBy (xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle']"), 
		@AndroidBy (xpath = "//android.widget.TextView[@bounds='[64,1257][1016,1328]']"),
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
	})
	public MobileElement attentionTitle;

	@AndroidFindAll({
		@AndroidBy (id = "android:id/button1"),
		@AndroidBy (xpath = "//android.widget.Button[@text='OK']"), 
		@AndroidBy (xpath = "//android.widget.Button[@resource-id='android:id/button1']"), 
		@AndroidBy (xpath = "//android.widget.Button[@bounds='[64,1991][1016,2086]']"),
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button")
	})
	public MobileElement okButton;
	
	public AttentionPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	public boolean clickOKButton() {
		if (okButton.isDisplayed()) {
			click(okButton);
			utils.log().info("Clicked OK Button on Attention Dialog");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (attentionTitle.isDisplayed()) {
			utils.log().info("On Attention Page");
			return true;
		} else {
			utils.log().info("Not on Attention Page");
			return false;
		}

	}

}
