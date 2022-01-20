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

public class AddSatelliteUpToDatePage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_text")
	public MobileElement upToDateTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_description_text")
	public MobileElement description;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/btnContinue")
	public MobileElement nextButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/txtNeedHelp")
	public MobileElement helpButton;


	public AddSatelliteUpToDatePage() {
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
		if (upToDateTitle.isDisplayed()) {
			utils.log().info("On YOUR SATELLITE IS ALREADY UP TO DATE! Page");
			return true;
		} else {
			utils.log().info("Not on YOUR SATELLITE IS ALREADY UP TO DATE! Page");
			return false;
		}
	}
}
