package com.cs.arris.Pages;


import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AddSatelliteCongratulationsPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_text")
	public MobileElement congratulationsTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/description_text")
	public MobileElement description;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/btn_next_to_home")
	public MobileElement continueButton;


	public AddSatelliteCongratulationsPage() {
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
		if (congratulationsTitle.isDisplayed()) {
			utils.log().info("On CONGRATULATIONS Page");
			return true;
		} else {
			utils.log().info("Not on CONGRATULATIONS Page");
			return false;
		}
	}
}
