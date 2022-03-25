package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AddSatelliteAddNewSatellitePage1 extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_placementTip")
	public MobileElement addSatelliteTitle;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_add_new_satelite")
	public MobileElement addSatelliteTitle2;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/description_new_setelite")
	public MobileElement description;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/btn_add_max_intall_satellite")
	public MobileElement nextButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/btn_addmax_cancel")
	public MobileElement cancelButton;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/back_button")
	public MobileElement backButton;

	public AddSatelliteAddNewSatellitePage1() {
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
			utils.log().info("On ADD SATELLITE Page");
			return true;
		} else {
			utils.log().info("Not on ADD SATELLITE Page");
			return false;
		}
	}
}
