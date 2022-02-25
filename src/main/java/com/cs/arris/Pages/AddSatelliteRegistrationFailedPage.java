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

public class AddSatelliteRegistrationFailedPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_error_frag_title")
	public MobileElement registrationFailedTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_error_frag_description")
	public MobileElement description;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/troubleShootButton_generic")
	public MobileElement continueButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_error_frag_code")
	public MobileElement errorCode;  //0000-2207

	public AddSatelliteRegistrationFailedPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickContinueButton() {
		if (continueButton.isDisplayed()) {
			click(continueButton);
			utils.log().info("Clicked on Continue Button");
			return true;
		} else {
			utils.log().info("Continue Button is not displayed");
			return false;
		}
	}


	@Override
	public boolean isAt() {
		if (registrationFailedTitle.isDisplayed()) {
			utils.log().info("On REGISTRATION OF YOUR DEVICE FAILED Page");
			return true;
		} else {
			utils.log().info("Not on REGISTRATION OF YOUR DEVICE FAILED Page");
			return false;
		}
	}
}
