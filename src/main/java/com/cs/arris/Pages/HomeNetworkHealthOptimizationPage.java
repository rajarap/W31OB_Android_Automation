package com.cs.arris.Pages;

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

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeNetworkHealthOptimizationPage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public MobileElement backButton; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/txtToolBarTitle")
	public MobileElement networkOptimizationTitle; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/img_settingsIcon")
	public MobileElement networkOptimizationIcon; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/optimizationFeatureOffText")
	public MobileElement networkOptimizationTurnedOffText; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/recommendationTurnedOnHintTxt")
	public MobileElement networkOptimizationTurnedOnText; 
	
		
	//after network optimization

	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
	public MobileElement satelliteLabel; 
		
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]")
	public MobileElement satelliteDeviceStatus; 
			
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]")
	public MobileElement devicesLabel; 
	
		@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]")
	public MobileElement devicesStatus; 
	
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]")
	public MobileElement ispLabel; 
			
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]")
	public MobileElement ispDeviceStatus; 
	
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
	public MobileElement satelliteDeviceImage; 
	
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView")
	public MobileElement devicesImage; 
	
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")
	public MobileElement ispDeviceImage; 
	
	@AndroidFindBy (xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView")
	public MobileElement linkRateImage;
		
	@AndroidFindBy (id = "com.arris.sbcBeta:id/textView11")
	public MobileElement noRecommendations; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/no_recommendations_text")
	public MobileElement noRecommendationsText; 
	
	
	public HomeNetworkHealthOptimizationPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	 public FooterIconsPage getFooterIconsPageObject() {
		 FooterIconsPage footerIconsPage = new FooterIconsPage();
	     return footerIconsPage;
	  }
	 
	 public HomeNetworkHealthOptimizationSettingsPage getOptimizationSettinsPageObject() {
		 HomeNetworkHealthOptimizationSettingsPage optSettings = new HomeNetworkHealthOptimizationSettingsPage();
	     return optSettings;
	  }
	 
	 public HomeNetowrkSatellitePerformanceAndConnectionHealthPage getSatellitePerformancePageObject() {
		 HomeNetowrkSatellitePerformanceAndConnectionHealthPage satellitePerformance = new HomeNetowrkSatellitePerformanceAndConnectionHealthPage();
		 return satellitePerformance;
	 }
	  
	 public HomeNetowrkDevicesWifiClientConnectionHealthPage getWifiClientConnectionPageObject() {
		 HomeNetowrkDevicesWifiClientConnectionHealthPage wifiConnection = new HomeNetowrkDevicesWifiClientConnectionHealthPage();
	     return wifiConnection;
	  }
	 
	 public HomeNetowrkISPServicePerformanceAndConnectionHealthPage getISPClientConnectionPageObject() {
		 HomeNetowrkISPServicePerformanceAndConnectionHealthPage ispConnection = new HomeNetowrkISPServicePerformanceAndConnectionHealthPage();
	     return ispConnection;
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
		
		public boolean clickSatelliteImage() {
			if (satelliteDeviceImage.isDisplayed() && satelliteDeviceImage.isEnabled()) {
				click(satelliteDeviceImage);
				utils.log().info("Clicked on Satellite Image");
				return true;
			} else {
				utils.log().info("Satellite Image is either not displayed or is disabled");
				return false;
			}
		}
		
		public boolean clickDevicesImage() {
			if (devicesImage.isDisplayed() && devicesImage.isEnabled()) {
				click(devicesImage);
				utils.log().info("Clicked on Devices Image");
				return true;
			} else {
				utils.log().info("Devices Image is either not displayed or is disabled");
				return false;
			}
		}
		
		public boolean clickISPImage() {
			if (ispDeviceImage.isDisplayed() && ispDeviceImage.isEnabled()) {
				click(ispDeviceImage);
				utils.log().info("Clicked on ISP Image");
				return true;
			} else {
				utils.log().info("ISP Image is either not displayed or is disabled");
				return false;
			}
		}
		
		public boolean clickLinkRateImage() {
			if (linkRateImage.isDisplayed() && linkRateImage.isEnabled()) {
				click(linkRateImage);
				utils.log().info("Clicked on Link Rate Image");
				return true;
			} else {
				utils.log().info("Link Rate Image is either not displayed or is disabled");
				return false;
			}
		}
		
		public boolean clickOptimizationIcon() {
			if (networkOptimizationIcon.isDisplayed()) {
				click(networkOptimizationIcon);
				utils.log().info("Clicked on Optimization Icon");
				return true;
			} else {
				utils.log().info("Optimization Icon is not displayed");
				return false;
			}
		}
	 
	 public boolean verifyNetworkOptimizationPageUI() {
			
			utils.log().info("                                                          ");
			utils.log().info("**********************************************************");
			utils.log().info("Details of UI Elements on Network Health Optimization Page");
			utils.log().info("**********************************************************");
			try {
				try {
					if (networkOptimizationTitle.isDisplayed())
						utils.log().info(networkOptimizationTitle.getText() + " title text is displayed");
				} catch (Exception e1) {
					utils.log().info("Network Health Optimization title text is not displayed");
				}

				try {
					if (backButton.isDisplayed())
						utils.log().info("Back button is displayed");
				} catch (Exception e1) {
					utils.log().info("Back button is not displayed");
				}
				
				try {
					if (networkOptimizationIcon.isDisplayed())
						utils.log().info("Optimization button is displayed");
				} catch (Exception e1) {
					utils.log().info("Optimization button is not displayed");
				}
				
				try{
					if (networkOptimizationTurnedOffText.isDisplayed())
						utils.log().info(networkOptimizationTurnedOffText.getText() + " message is displayed");
				}catch(Exception e) {
					utils.log().info("Optimization is turned off message is not displayed");
				}
				
				try{
					if (networkOptimizationTurnedOnText.isDisplayed())
						utils.log().info(networkOptimizationTurnedOnText.getText() + " message is displayed");
				}catch(Exception e) {
					utils.log().info("Turn on optimization from settings to access network health & view recommendations message is not displayed");
				}

				return true;
			} catch (Exception e) {
				return false;
			}
		}
	 
	 
	 public boolean verifyNetworkAfterOptimization() {
			utils.log().info("                                                                  ");
			utils.log().info("******************************************************************");
			utils.log().info("Details of UI Elements with Network Optimization Recommendations ");
			utils.log().info("******************************************************************");
			try {
				try {
					if (satelliteLabel.isDisplayed() && satelliteDeviceStatus.isDisplayed())
						utils.log().info(satelliteLabel.getText() + " : " + satelliteDeviceStatus.getText());
				} catch (Exception e1) {
					utils.log().info("Satellite Health Recommendations is not displayed");
				}

				try {
					if (devicesLabel.isDisplayed() && devicesStatus.isDisplayed())
						utils.log().info(devicesLabel.getText() + " : " + devicesStatus.getText());
				} catch (Exception e1) {
					utils.log().info("Devices Health Recommendations is not displayed");
				}
				
				try {
					if (ispLabel.isDisplayed() && ispDeviceStatus.isDisplayed())
						utils.log().info(ispLabel.getText() + " : " + ispDeviceStatus.getText());
				} catch (Exception e1) {
					utils.log().info("ISP Health Recommendations is not displayed");
				}
				
				try{
					if (noRecommendations.isDisplayed())
						utils.log().info(noRecommendations.getText() + " message is displayed");
				}catch(Exception e) {
					utils.log().info("No Recommendations message is not displayed");
				}
				
				try{
					if (noRecommendationsText.isDisplayed())
						utils.log().info(noRecommendationsText.getText() + " message is displayed");
				}catch(Exception e) {
					utils.log().info("No Recommendations message is not displayed");
				}

				return true;
			} catch (Exception e) {
				return false;
			}
		}
	 
	
	@Override
	public boolean isAt() {
		if(networkOptimizationTitle.isDisplayed())
		{
			utils.log().info("On Network Health Optimization Page");
			return true;}
		else {
			utils.log().info("Not on Network Health Optimization Page");
		return false;}
	}
}
