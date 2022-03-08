package com.cs.arris.Utilities;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class SevenTapGmail extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	public TouchAction action = new TouchAction(getDriver());
	
	@AndroidFindBy(id = "android:id/sem_title_default")
	public MobileElement sendEmail;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement gmailIcon;
	
	public boolean clickGmailIcon() {
		if (gmailIcon.isDisplayed()) {
			click(gmailIcon); 
			utils.log().info("Clicked Gmail Icon");
			return true;
		} else {
			return false;
		}
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
