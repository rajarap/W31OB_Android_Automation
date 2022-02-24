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

public class AddSatellitePlaceYourSatellitePage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_placementTip")
	public MobileElement placemenTipsTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_text")
	public MobileElement placeYourSatelliteTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/description_text")
	public MobileElement description;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/skip_optimization")
	public MobileElement skipButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/helpme_button")
	public MobileElement continueButton;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/back_button")
	public MobileElement backButton;

	public AddSatellitePlaceYourSatellitePage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickSkipButton() {
		if (skipButton.isDisplayed()) {
			click(skipButton);
			utils.log().info("Clicked on Skip Button");
			return true;
		} else {
			utils.log().info("Skip Button is not displayed");
			return false;
		}
	}


	@Override
	public boolean isAt() {
		if (placeYourSatelliteTitle.isDisplayed()) {
			utils.log().info("On WE'D LIKE TO HELP YOU PLACE YOUR SATELLITE Page");
			return true;
		} else {
			utils.log().info("Not on WE'D LIKE TO HELP YOU PLACE YOUR SATELLITE Page");
			return false;
		}
	}
}
