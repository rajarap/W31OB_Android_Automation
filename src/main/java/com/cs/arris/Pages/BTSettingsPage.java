package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BTSettingsPage extends ParentClass {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Connections']") // About
	public MobileElement connections;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Bluetooth']") // About
	public MobileElement bluetooth;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.SemExpandableListView/android.widget.FrameLayout[7]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")
	public MobileElement broadCastName;
	
	//MobileElement broadCastName = (MobileElement) super.getDriver().findElementByXPath("");
	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SURFboard mAX‎']")
//	public MobileElement broadCastName;
	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Available devices, Header\"]/android.widget.TextView[@text='SURFboard mAX‎']")
//	public MobileElement broadCastName;
	
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/title' and @text='SURFboard mAX‎']")
//	public MobileElement broadCastName;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@text='Bluetooth, On']") 
	public MobileElement bluetoothOn;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@text='Bluetooth, Off']") 
	public MobileElement bluetoothOff;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]") 
	public MobileElement bluetoothBackIcon;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]") 
	public MobileElement connectionsBackIcon;
	
	public BTSettingsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickConnections() {
		if (connections.isDisplayed()) {
			click(connections); 
			utils.log().info("Clicked on Connections");
			return true;
		} else {
			return false;
		}
	}

	public boolean clickBluetooth() {
		if (bluetooth.isDisplayed()) {
			click(bluetooth); 
			utils.log().info("Clicked on Bluetooth");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickBroadCasterName() {
		if (broadCastName.isDisplayed()) {
			click(broadCastName); 
			utils.log().info("Clicked on " + broadCastName.getText());
			return true;
		} else {
			utils.log().info("Broadcast Name not available");
			return false;
		}
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
	
	public boolean clickConnectionsBackIcon() {
		if (connectionsBackIcon.isDisplayed()) {
			click(connectionsBackIcon); 
			utils.log().info("Clicked on Connections back Icon");
			return true;
		} else {
			return false;
		}
	}
	
	public void pairingMAXRouter()
	{
		super.pause(10);

       try 
       {
    	   utils.log().info("Opening Android Setting Page");
    	   super.getDriver().activateApp("com.android.settings");
    	   clickConnections();
    	   super.pause(3);
    	   clickBluetooth();
    	   switchOffBluetooth();
    	   super.pause(5);
    	   switchOnBluetooth();
    	   super.pause(10);
    	   clickBroadCasterName();
    	   
       } catch (Exception e) {
         e.printStackTrace();
       }  
	}
	

}
