package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AddSatelliteAddNewSatellitePage2 extends ParentClass implements Page { 
	//To continue with satellite install, please connect to arrisw31-654 network. Please connect through the Wi-Fi settings of your mobile device if not connected already.
	//If this page come connect to Wifi
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_placementTip")
	public MobileElement addSatelliteTitle;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_add_new_satelite")
	public MobileElement addSatelliteTitle2;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/description_new_setelite")
	public MobileElement description;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.arris.sbcBeta:id/btn_add_max_intall_satellite"),
		@AndroidBy (xpath = "//android.widget.Button[@text='NEXT']"), 
		@AndroidBy (xpath = "//android.widget.Button[@resource-id='com.arris.sbcBeta:id/btn_add_max_intall_satellite']"),  
		@AndroidBy (xpath = "//android.widget.Button[@bounds='[61,1907][1019,2044]']")
	})
	public MobileElement nextButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/btn_addmax_cancel")
	public MobileElement cancelButton;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/back_button")
	public MobileElement backButton;

	public AddSatelliteAddNewSatellitePage2() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickNextButton() {
		if (nextButton.isDisplayed()) {
			click(nextButton);
			utils.log().info("Clicked on Next Button");
			return true;
		} else {
			utils.log().info("Next Button is not displayed");
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

	@Override
	public boolean isAt() {
		if (addSatelliteTitle.isDisplayed()) {
			utils.log().info("On ADD SATELLITE2 - Connect to SSID Page");
			return true;
		} else {
			utils.log().info("Not on ADD SATELLITE2  - Connect to SSID Page");
			return false;
		}
	}
}
