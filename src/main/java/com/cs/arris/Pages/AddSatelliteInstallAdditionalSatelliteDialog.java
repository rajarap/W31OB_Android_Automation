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

public class AddSatelliteInstallAdditionalSatelliteDialog extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/dialog_title")
	public MobileElement installAdditionalSatelliteTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/dialog_description")
	public MobileElement description;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/img_dialog_close")
	public MobileElement closeIcon;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/dialog_install_now")
	public MobileElement installNowButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/dialog_install_later")
	public MobileElement cancelButton;

	public AddSatelliteInstallAdditionalSatelliteDialog() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickInstallSatelliteButton() {
		if (installNowButton.isDisplayed()) {
			click(installNowButton);
			utils.log().info("Clicked on Install Now Button");
			return true;
		} else {
			utils.log().info("Install Now Button is not displayed");
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

	public boolean clickCloseIcon() {
		if (closeIcon.isDisplayed()) {
			click(closeIcon);
			utils.log().info("Clicked on Close Icon");
			return true;
		} else {
			utils.log().info("Close Icon is not displayed");
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (installAdditionalSatelliteTitle.isDisplayed()) {
			utils.log().info("On INSTALL ADDITIONAL SATELLITE Dialog");
			return true;
		} else {
			utils.log().info("Not on INSTALL ADDITIONAL SATELLITE Dialog");
			return false;
		}
	}
}
