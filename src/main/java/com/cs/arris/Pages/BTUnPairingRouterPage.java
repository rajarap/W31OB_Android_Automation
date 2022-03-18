package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BTUnPairingRouterPage extends ParentClass {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")
	public MobileElement unpairOption;
	
//	@AndroidFindBy(xpath = "//android.widget.Switch[@text='On']") 
//	public MobileElement bluetoothOn;
//	
//	@AndroidFindBy(xpath = "//android.widget.Switch[@text='Off']") 
//	public MobileElement bluetoothOff;
//	
//	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]") 
//	public MobileElement bluetoothBackIcon;
//	
//	@AndroidFindBy(id = "android:id/button1") 
//	public MobileElement doneButton;
//	
//	@AndroidFindBy(id = "android:id/button2") 
//	public MobileElement detailsButton;
	
	
	
	public BTUnPairingRouterPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}


	public boolean clickUnPairOption() {
		if (unpairOption.isDisplayed()) {
			click(unpairOption); 
			utils.log().info("Clicked on Unpair Option");
			return true;
		} else {
			return false;
		}
	}
}
