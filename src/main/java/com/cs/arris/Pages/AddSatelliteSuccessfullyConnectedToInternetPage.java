package com.cs.arris.Pages;


import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AddSatelliteSuccessfullyConnectedToInternetPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_f_connect_internet_title")
	public MobileElement successfullyConnectedToInternetTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_f_connect_internet_desc")
	public MobileElement description;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/btn_connect_internet_retry")
	public MobileElement nextButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/txtNeedHelp")
	public MobileElement helpButton;


	public AddSatelliteSuccessfullyConnectedToInternetPage() {
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
		if (successfullyConnectedToInternetTitle.isDisplayed()) {
			utils.log().info("On SUCESSFULLY CONNECTED TO THE INTERNET Page");
			return true;
		} else {
			utils.log().info("Not on SUCESSFULLY CONNECTED TO THE INTERNET Page");
			return false;
		}
	}
}
