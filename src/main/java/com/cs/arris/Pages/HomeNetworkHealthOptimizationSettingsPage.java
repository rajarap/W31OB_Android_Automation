package com.cs.arris.Pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.Direction;
import com.cs.arris.Utilities.SwipeActions;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HomeNetworkHealthOptimizationSettingsPage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	TouchAction action = new TouchAction(super.getDriver());

	
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public MobileElement backButton; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/txtToolBarTitle")
	public MobileElement networkOptimizationSettingsTitle; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/textView6")
	public MobileElement optimizationLabel; 
	
	@AndroidFindBy (xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/nwhealth_enable_disable']")
	public MobileElement networkOptimizationToggleButton; 
	
	@AndroidFindBy (xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/nwhealth_enable_disable' and @checked='false']")
	public MobileElement networkOptimizationToggleButtonDisabled; 
	
	@AndroidFindBy (xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/nwhealth_enable_disable' and @checked='true']")
	public MobileElement networkOptimizationToggleButtonEnabled; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/nwOptimzationDescText")
	public MobileElement networkOptimizationTurnOnText; 
	
	
	// After enabling network optimization settings
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/recommendationSensitivityTitle")
	public MobileElement recommendedSensitivitiy; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/recommendationSensitivityDescText")
	public MobileElement controlSensitivityText; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/sensitivityLowTxt")
	public MobileElement lowSensitivityLabel; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/sensitivityMediumTxt")
	public MobileElement mediumSensitivityLabel; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/sensitivityHighTxt")
	public MobileElement highSensitivityLabel; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/sensitivitySeekBar")
	public MobileElement sliderImage; 
	
//	@AndroidFindBy (id = "com.arris.sbcBeta:id/nwOptimzationDescText")
//	public MobileElement lowSensitivitySliderPosition; 
//	
//	@AndroidFindBy (id = "com.arris.sbcBeta:id/nwOptimzationDescText")
//	public MobileElement mediumSensitivitySliderPosition; 
//	
//	@AndroidFindBy (id = "com.arris.sbcBeta:id/nwOptimzationDescText")
//	public MobileElement HighSensitivitySliderPosition; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/notifyTitleText")
	public MobileElement notifiedLabel; 
	
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
	public MobileElement connectedDevicesSignalLabel; 
	
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
	public MobileElement satelliteSignalLabel; 
	
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
	public MobileElement satelliteLinkSignalLabel; 
	
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
	public MobileElement ispLinkSpeedRateLabel; 
	
	
	//On disabling network optimization settings toggle button
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/error_header_dialog")
	public MobileElement turnOffNetworkOptimizationTitle; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/error_description")
	public MobileElement confirmationMessage; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/error_cancel_dialog")
	public MobileElement turnOffButton; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/ok_dialog")
	public MobileElement cancelButton; 
	

	
	public HomeNetworkHealthOptimizationSettingsPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	 public FooterIconsPage getFooterIconsPageObject() {
		 FooterIconsPage footerIconsPage = new FooterIconsPage();
	     return footerIconsPage;
	  }
	 
	 public HomeNetworkHealthOptimizationConnectedDevicesPage getConnectedDevicesPageObject() {
		 HomeNetworkHealthOptimizationConnectedDevicesPage connectedDevice = new HomeNetworkHealthOptimizationConnectedDevicesPage();
	     return connectedDevice;
	  }
	 
	 public HomeNetworkHealthOptimizationSatelliteSignalPage getSatelliteSignalPageObject() {
		 HomeNetworkHealthOptimizationSatelliteSignalPage satelliteSignal = new HomeNetworkHealthOptimizationSatelliteSignalPage();
	     return satelliteSignal;
	  }
	 
	 public HomeNetworkHealthOptimizationSatelliteLinkRatePage getSatelliteLinkRatePageObject() {
		 HomeNetworkHealthOptimizationSatelliteLinkRatePage satelliteLink = new HomeNetworkHealthOptimizationSatelliteLinkRatePage();
	     return satelliteLink;
	  }
	 
	 public HomeNetworkHealthOptimizationISPSpeedRatePage getISPSpeedRatePageObject() {
		 HomeNetworkHealthOptimizationISPSpeedRatePage ispRate = new HomeNetworkHealthOptimizationISPSpeedRatePage();
	     return ispRate;
	  }
	 
		public boolean clickTurnOffButton() {
			if (turnOffButton.isDisplayed()) {
				click(turnOffButton);
				utils.log().info("Clicked on Yes Turn it Off Button");
				return true;
			} else {
				utils.log().info("Yes Turn it Off Button is not displayed");
				return false;
			}
		}
		
		public boolean clickCancelButton() {
			if (cancelButton.isDisplayed()) {
				click(cancelButton);
				utils.log().info("Clicked on Cancel Button");
				return true;
			} else {
				utils.log().info("Cancel Button is not displayed");
				return false;
			}
		}
	 
	 
		public boolean clickBackButton() {
			if (backButton.isDisplayed()) {
				click(backButton);
				utils.log().info("Clicked on Back Button");
				return true;
			} else {
				utils.log().info("Back Button is not displayed");
				return false;
			}
		}
		
		public boolean clickConnectedDeviceSignalButton() {
			if (connectedDevicesSignalLabel.isDisplayed()) {
				click(connectedDevicesSignalLabel);
				utils.log().info("Clicked on Connected Device Signal button");
				return true;
			} else {
				utils.log().info("Connected Device Signal button is not displayed");
				return false;
			}
		}
		
		public boolean clickSatelliteSignalButton() {
			if (satelliteSignalLabel.isDisplayed()) {
				click(satelliteSignalLabel);
				utils.log().info("Clicked on Satellite Signal button");
				return true;
			} else {
				utils.log().info("Satellite Signal button is not displayed");
				return false;
			}
		}
		
		public boolean clickSatelliteLinkRateButton() {
			super.swipeUp();
			if (satelliteLinkSignalLabel.isDisplayed()) {
				click(satelliteLinkSignalLabel);
				utils.log().info("Clicked on Satellite Link Signal button");
				return true;
			} else {
				utils.log().info("Satellite Link Signal button is not displayed");
				return false;
			}
		}
		
		public boolean clickISPSpeedRateButton() {
			super.swipeUp();
			if (ispLinkSpeedRateLabel.isDisplayed()) {
				click(ispLinkSpeedRateLabel);
				utils.log().info("Clicked on ISP Speed Rate button");
				return true;
			} else {
				utils.log().info("ISP Speed Rate button is not displayed");
				return false;
			}
		}
		
		public boolean enableHealthOptimization() {
			try {
				if(networkOptimizationToggleButtonDisabled.isDisplayed())
					click(networkOptimizationToggleButtonDisabled);
				utils.log().info("Network Optimization is enabled");
				return true;
			} catch(Exception e) {
				utils.log().info("Network Optimization is already enabled");
				return true;
			}
		}

		public boolean disableHealthOptimization() {
			try {
				if(networkOptimizationToggleButtonEnabled.isDisplayed())
					click(networkOptimizationToggleButtonEnabled);

				try {
					if(turnOffNetworkOptimizationTitle.isDisplayed() && turnOffButton.isDisplayed())
						click(turnOffButton);
				}catch(Exception e) {utils.log().info("Confirmation dialog to turn off network optimization is not displayed");}

				utils.log().info("Network Optimization is disabled");
				return true;
			} catch(Exception e) {
				utils.log().info("Network Optimization is already disabled");
				return true;
			}
		}
		
		public void tapLow()
		{
			int endX = 81;
			int endY = 1041;
			PointOption p = new PointOption();
			p.withCoordinates(endX, endY);
			action.tap(p).perform();
			utils.log().info("Tapped on Low Sensitivity");
		}
		
		public void tapMedium()
		{
			int endX = 506;
			int endY = 1041;
			PointOption p = new PointOption();
			p.withCoordinates(endX, endY);
			action.tap(p).perform();
			utils.log().info("Tapped on Menium Sensitivity");
		}
	 
		
		public void tapHigh()
		{
			int endX = 981;
			int endY = 1041;
			PointOption p = new PointOption();
			p.withCoordinates(endX, endY);
			action.tap(p).perform();
			utils.log().info("Tapped on High Sensitivity");
		}
	 
	 
	 public boolean verifyNetworkOptimizationSettingsPageUI() {
			
			utils.log().info("                                                                   ");
			utils.log().info("*******************************************************************");
			utils.log().info("Details of UI Elements on Network Health Optimization Settings Page");
			utils.log().info("*******************************************************************");
			try {
				try {
					if (networkOptimizationSettingsTitle.isDisplayed())
						utils.log().info(networkOptimizationSettingsTitle.getText() + " title text is displayed");
				} catch (Exception e1) {
					utils.log().info("Network Health Optimization Settings title text is not displayed");
				}

				try {
					if (backButton.isDisplayed())
						utils.log().info("Back button is displayed");
				} catch (Exception e1) {
					utils.log().info("Back button is not displayed");
				}
				
				try {
					if (networkOptimizationToggleButton.isDisplayed())
						utils.log().info("Optimization Toggle button is displayed");
				} catch (Exception e1) {
					utils.log().info("Optimization Toggle button is not displayed");
				}
				
				try{
					if (optimizationLabel.isDisplayed())
						utils.log().info(optimizationLabel.getText() + " label is displayed");
				}catch(Exception e) {
					utils.log().info("Optimization label is not displayed");
				}
				
				try{
					if (networkOptimizationTurnOnText.isDisplayed())
						utils.log().info(networkOptimizationTurnOnText.getText() + " message is displayed");
				}catch(Exception e) {
					utils.log().info("Turn on optimization to access network health & view recommendations message is not displayed");
				}

				return true;
			} catch (Exception e) {
				return false;
			}
		}
	 
	 public boolean verifyNetworkOptimizationSettingsEnabledPageUI() {
			
			utils.log().info("                                                                           ");
			utils.log().info("***************************************************************************");
			utils.log().info("Details of UI Elements on Network Health Optimization Settings Enabled Page");
			utils.log().info("***************************************************************************");
			try {
				try {
					if (recommendedSensitivitiy.isDisplayed())
						utils.log().info(recommendedSensitivitiy.getText() + " text is displayed");
				} catch (Exception e1) {
					utils.log().info("Recommendation sensitivity text is not displayed");
				}

				try {
					if (controlSensitivityText.isDisplayed())
						utils.log().info(controlSensitivityText.getText() + " text is displayed");
				} catch (Exception e1) {
					utils.log().info("Control the recommendation frequency by adjusting the sensitivity is not displayed");
				}
				
				try {
					if (lowSensitivityLabel.isDisplayed())
						utils.log().info(lowSensitivityLabel.getText() + " text is displayed");
				} catch (Exception e1) {
					utils.log().info("Low text is not displayed");
				}
				
				try {
					if (mediumSensitivityLabel.isDisplayed())
						utils.log().info(mediumSensitivityLabel.getText() + " text is displayed");
				} catch (Exception e1) {
					utils.log().info("Medium(Optional) is not displayed");
				}
				
				try {
					if (highSensitivityLabel.isDisplayed())
						utils.log().info(highSensitivityLabel.getText() + " text is displayed");
				} catch (Exception e1) {
					utils.log().info("High is not displayed");
				}
				
				try {
					if (sliderImage.isDisplayed())
						utils.log().info("Slider Image is displayed");
				} catch (Exception e1) {
					utils.log().info("Slider Image is not displayed");
				}
				
				try {
					if (notifiedLabel.isDisplayed())
						utils.log().info(notifiedLabel.getText() + " text is displayed");
				} catch (Exception e1) {
					utils.log().info("You will be notified as soon as your  text is not displayed");
				}
				
				try{
					if (connectedDevicesSignalLabel.isDisplayed())
						utils.log().info(connectedDevicesSignalLabel.getText() + " label is displayed");
				}catch(Exception e) {
					utils.log().info("Connected Device signal notification is not displayed");
				}
				
				try{
					if (satelliteSignalLabel.isDisplayed())
						utils.log().info(satelliteSignalLabel.getText() + " message is displayed");
				}catch(Exception e) {
					utils.log().info("Satellite Signal Strength notification is not displayed");
				}
				
				try{
					if (satelliteLinkSignalLabel.isDisplayed())
						utils.log().info(satelliteLinkSignalLabel.getText() + " message is displayed");
				}catch(Exception e) {
					utils.log().info("Satellite Link Rate notification is not displayed");
				}
				
				super.swipeUp();
				
				try{
					if (ispLinkSpeedRateLabel.isDisplayed())
						utils.log().info(ispLinkSpeedRateLabel.getText() + " message is displayed");
				}catch(Exception e) {
					utils.log().info("ISP Speed Rate notification is not displayed");
				}

				return true;
			} catch (Exception e) {
				return false;
			}
		}
	 
	
	@Override
	public boolean isAt() {
		if(networkOptimizationSettingsTitle.isDisplayed())
		{
			utils.log().info("On Network Health Optimization Settings Page");
			return true;
		}else {
			utils.log().info("Not on Network Health Optimization Settings Page");
		return false;}
	}
}
