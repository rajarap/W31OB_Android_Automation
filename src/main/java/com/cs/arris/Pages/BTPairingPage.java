package com.cs.arris.Pages;

import java.util.List;
import org.openqa.selenium.support.PageFactory;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BTPairingPage extends ParentClass {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
	public MobileElement maxRouter;
	
//	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.SemExpandableListView/android.widget.FrameLayout[8]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")
//	public MobileElement broadSatellite1;
//	
//	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.SemExpandableListView/android.widget.FrameLayout[9]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")
//	public MobileElement broadSatellite2;
	
	//MobileElement broadCastName = (MobileElement) super.getDriver().findElementByXPath("");
	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SURFboard mAX‎']")
//	public MobileElement broadCastName;
	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Available devices, Header\"]/android.widget.TextView[@text='SURFboard mAX‎']")
//	public MobileElement broadCastName;
	
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/title' and @text='SURFboard mAX‎']")
//	public MobileElement broadCastName;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@text='On']") 
	public MobileElement bluetoothOn;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@text='Off']") 
	public MobileElement bluetoothOff;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]") 
	public MobileElement bluetoothBackIcon;
	
	@AndroidFindBy(id = "android:id/button1") 
	public MobileElement doneButton;
	
	
	
	public BTPairingPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}


	public boolean switchOnBluetooth() {
		if (bluetoothOff.isDisplayed()) {
			click(bluetoothOff); 
			utils.log().info("Bluetooth is switch on");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean switchOffBluetooth() {
		if (bluetoothOn.isDisplayed()) {
			click(bluetoothOn); 
			utils.log().info("Bluetooth is switch off");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickBlueToothBackIcon() {
		if (bluetoothBackIcon.isDisplayed()) {
			click(bluetoothBackIcon); 
			utils.log().info("Clicked on Bluetooth back Icon");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickMAXRouter() {
		if (maxRouter.isDisplayed()) {
			click(maxRouter); 
			utils.log().info("Clicked on broadcaster");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickDoneButton() {
		if (doneButton.isDisplayed()) {
			click(doneButton); 
			utils.log().info("Clicked on Done Button");
			return true;
		} else {
			return false;
		}
	}
	
//	public boolean clickBroadCastSatellite1() {
//		if (broadSatellite1.isDisplayed()) {
//			click(broadSatellite1); 
//			utils.log().info("Clicked on Satellite1 broadcaster");
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	public boolean clickBroadCastSatellite2() {
//		if (broadSatellite2.isDisplayed()) {
//			click(broadSatellite2); 
//			utils.log().info("Clicked on Satellite2 broadcaster");
//			return true;
//		} else {
//			return false;
//		}
//	}

}
