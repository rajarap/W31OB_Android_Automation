package com.cs.arris.Utilities;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class SevenTapGmail extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	public TouchAction action;
	
	@AndroidFindBy(id = "android:id/sem_title_default")
	public MobileElement sendEmail;
	
	@AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement gmailIcon;
	
//	public void clickGmailIcon() {
//		if (gmailIcon.isDisplayed()) {
//			click(gmailIcon); 
//			utils.log().info("Clicked Gmail Icon");
//		} else {
//			utils.log().info("Unable to find Gmail Icon");
//		}
//	}
	
	public void clickGmailIcon() {
		int x = 165;
		int y = 1630;
		
		PointOption p = new PointOption();
		p.withCoordinates(x, y);
		utils.log().info("Clicked on Gmail Icon");
		action = new TouchAction(super.getDriver());
		action.tap(p).release().perform();

	}
	
	@Override
	public boolean isAt() {
		if (sendEmail.isDisplayed()) {
			utils.log().info("On Send Email Page");
			return true;
		} else {
			utils.log().info("Not on Send Email Page");
			return false;
		}
	}

}
