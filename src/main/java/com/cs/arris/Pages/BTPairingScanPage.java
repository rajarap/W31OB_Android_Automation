package com.cs.arris.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BTPairingScanPage extends ParentClass {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
	public MobileElement maxRouter;
	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SURFboard mAX']") 
//	public MobileElement maxRouter1;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SURFboard mAX']") 
//	public MobileElement maxRouter2;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SURFboard mAX']") 
//	public MobileElement maxRouter3;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@text='On']") 
	public MobileElement bluetoothOn;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@text='Off']") 
	public MobileElement bluetoothOff;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]") 
	public MobileElement bluetoothBackIcon;
	
	@AndroidFindBy(id = "android:id/button1") 
	public MobileElement doneButton;
	
	@AndroidFindBy(id = "android:id/button2") 
	public MobileElement detailsButton;
	
	
	
	public BTPairingScanPage() {
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
	
//	public boolean clickMAXRouter() {
//		if (maxRouter.getText().equals("SURFboard mAX")) {
//			click(maxRouter); 
//			utils.log().info("Clicked on broadcaster");
//			return true;
//		} else {
//			return false;
//		}
//	}
	
//	public void clickMAXRouter() {
//		List<MobileElement> bleDevices = new ArrayList<MobileElement>();
////		int deviceCount =  super.getDriver().findElementsById("com.android.settings:id/tw_expandable_listview").size();
//		int deviceCount =  super.getDriver().findElementsByXPath("//android.widget.SemExpandableListView[@resource-id='com.android.settings:id/tw_expandable_listview']").size();
//		utils.log().info("Number of devices : " + deviceCount);
//		
//		for (int i = 3; i<=deviceCount; i++) {
//			bleDevices.add((MobileElement) super.getDriver().findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.SemExpandableListView/android.widget.FrameLayout["+i+"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView"));
//		}
//		
//		for(MobileElement e : bleDevices) {
//			utils.log().info("Devices : " + e.getText());
//
//		}
//		
//		if(deviceCount > 0) {
//			String deviceName = "SURFboard mAX";  
//			
//			for(MobileElement e : bleDevices) {
//				if(e.getText().equalsIgnoreCase(deviceName))
//					click(e);
//			}
//		}else {
//			utils.log().info("The are no devices to pair");
//		}
//	}
		

		
//		
//		
//		for(int i = 0; i <=5; i++) {
//			bleDevices.add((MobileElement) super.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout["+i+"]/android.widget.LinearLayout/android.widget.TextView"));
//		}
//
//		
//		utils.log().info("Number of devices : " + deviceCount);
//		
//		for (MobileElement e : bleDevices) {
//			utils.log().info("Devices are : " + e.getText());
//		}
//		
//		
//		if(deviceCount > 0) {
//			String deviceName = "SURFboard mAX";
//			
//			for(MobileElement e : bleDevices) {
//				if(e.getText().equalsIgnoreCase(deviceName))
//					click(e);
//			}
//		}else {
//			utils.log().info("The are no devices to pair");
//		}
//	}
		
////		
////		if (maxRouter.getText().equals("SURFboard mAX")) {
////			click(maxRouter); 
////			utils.log().info("Clicked on broadcaster");
//			return true;
//		} else {
//			return false;
//		}
//	}
	
//	public void clickMAXRouter2() {
//			super.getDriver().findElementsByXPath("//android.widget.TextView[@text='SURFboard mAX']").get(2).click();
//			utils.log().info("Clicked on broadcaster2");
//	}
//	
//	public void clickMAXRouter3() {
//		super.getDriver().findElementsByXPath("//android.widget.TextView[@text='SURFboard mAX']").get(3).click();
//		utils.log().info("Clicked on broadcaster3");
//	}
	
	public boolean clickDoneButton() {
		if (doneButton.isDisplayed()) {
			click(doneButton); 
			utils.log().info("Clicked on Done Button");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickDetailsButton() {
		if (detailsButton.isDisplayed()) {
			click(detailsButton); 
			utils.log().info("Clicked on Details Button");
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
