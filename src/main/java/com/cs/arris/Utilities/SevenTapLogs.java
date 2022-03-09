package com.cs.arris.Utilities;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class SevenTapLogs extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	public TouchAction action;
	
//	@AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
//	public MobileElement sbcTestTitle;
	
//	@AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView")
//	public MobileElement messageTextView;
	
//	@AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.Button[1]")
//	public MobileElement yesButton;
	
//	@AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.Button[2]")
//	public MobileElement noButton;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.arris.sbcBeta:id/titleTextView"),
		@AndroidBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView"),
		@AndroidBy (xpath = "//android.widget.Button[@text='SBC Test']"),
		@AndroidBy (xpath = "//android.widget.Button[@bounds='[459,949][621,1013]']")
	})
	public MobileElement sbcTestTitle;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.arris.sbcBeta:id/ok_button"),
		@AndroidBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.Button[1]"),
		@AndroidBy (xpath = "//android.widget.Button[@text='YES']"),
		@AndroidBy (xpath = "//android.widget.Button[@bounds='[260,1218][533,1246]']")
	})
	public MobileElement yesButton;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.arris.sbcBeta:id/cancel_button"),
		@AndroidBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.Button[2]"),
		@AndroidBy (xpath = "//android.widget.Button[@text='NO']"),
		@AndroidBy (xpath = "//android.widget.Button[@bounds='[546,1218][819,1246]']")
	})
	public MobileElement noButton;
	
		
	public void clickYesButton() {
		int x = 393;
		int y = 1260;
		PointOption p = new PointOption();
		p.withCoordinates(x, y);
		utils.log().info("Clicked on Yes Button");
		action = new TouchAction(super.getDriver());
		action.tap(p).release().perform();
	}
	
	public void clickNoButton() {
		int x = 663;
		int y = 1253;
		PointOption p = new PointOption();
		p.withCoordinates(x, y);
		utils.log().info("Clicked on No Button");
		action = new TouchAction(super.getDriver());
		action.tap(p).release().perform();
	}
	

//	public void clickYesButton() {
//		if (yesButton.isDisplayed()) {
//			utils.log().info("Clicking on Yes Button to send 7 Tap logs");
//			click(yesButton); 
//			utils.log().info("Clicked Yes Button to send 7 Tap logs");
//		} else {
//			utils.log().info("Unable to find Yes Button to send 7 Tap logs");
//		}
//	}
	

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
