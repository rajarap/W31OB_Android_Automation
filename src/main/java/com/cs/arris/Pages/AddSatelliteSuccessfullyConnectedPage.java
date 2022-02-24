package com.cs.arris.Pages;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddSatelliteSuccessfullyConnectedPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_text")
	public MobileElement successfullyConnectedTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_description_text")
	public MobileElement description;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/btn_bluetooth_pairing_success_Continue")
	public MobileElement nextButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/need_help")
	public MobileElement helpButton;


	public AddSatelliteSuccessfullyConnectedPage() {
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


	@Override
	public boolean isAt() {
		if (successfullyConnectedTitle.isDisplayed()) {
			utils.log().info("On SUCCESSFULLY CONNECTED Page");
			return true;
		} else {
			utils.log().info("Not on SUCCESSFULLY CONNECTED Page");
			return false;
		}
	}
}
