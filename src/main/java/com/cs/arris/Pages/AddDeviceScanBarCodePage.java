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

public class AddDeviceScanBarCodePage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_text")
	public MobileElement scanBarCodeTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/ic_back_icon")
	public MobileElement backIcon;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/img_toolbar_remote_lca")
	public MobileElement cloudIcon;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/need_help")
	public MobileElement helpIcon;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_top_description")
	public MobileElement scanDescriptionText;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_bottom_one_description")
	public MobileElement description1;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/btnScan")
	public MobileElement scanButton;

	public AddDeviceScanBarCodePage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	public AddDeviceAccessCameraDialog getAccessCameraDialogObject() {
		AddDeviceAccessCameraDialog accessCamera = new AddDeviceAccessCameraDialog();
		return accessCamera;
	}

	boolean clickBackButton() {
		if (backIcon.isDisplayed()) {
			click(backIcon);
			utils.log().info("Clicked on Back Button");
			return true;
		} else {
			utils.log().info("Back Button is not displayed");
			return false;
		}
	}

	public boolean clickHelpButton() {
		if (helpIcon.isDisplayed()) {
			click(helpIcon);
			return true;
		} else {
			utils.log().info("Help button is not displayed");
			return false;
		}
	}

	public boolean clickScanButton() {
		if (scanButton.isDisplayed()) {
			click(scanButton);
			super.pause(3);
			utils.log().info("Clicked on SCAN Button");
			return true;
		} else {
			utils.log().info("SCAN Button is not displayed");
			return false;
		}
	}

	public boolean verifyEstablishingConnectionUI() {
		try {
			if (scanBarCodeTitle.isDisplayed())
				utils.log().info(scanBarCodeTitle.getText() + " text is displayed");
			else
				utils.log().info("SCAN BAR CODE TO CONTINUE Text is not displayed");

			if (backIcon.isDisplayed())
				utils.log().info("Back button is displayed");
			else
				utils.log().info("Back button is not displayed");

			if (helpIcon.isDisplayed())
				utils.log().info("Help icon is displayed");
			else
				utils.log().info("Help icon is not displayed");

			if (scanDescriptionText.isDisplayed())
				utils.log().info(scanDescriptionText.getText() + " text is displayed");
			else
				utils.log().info("Scan the Bar Code Text is not displayed");

			if (description1.isDisplayed())
				utils.log().info(description1.getText() + " text is displayed");
			else
				utils.log().info("Scanning is automatic. Text is not displayed");

			if (scanButton.isDisplayed())
				utils.log().info(scanButton.getText() + " button is displayed");
			else
				utils.log().info("SCAN button is not displayed");

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (scanBarCodeTitle.isDisplayed()) {
			utils.log().info("On Add Device - SCAN BAR CODE TO CONTINUE Page");
			return true;
		} else {
			utils.log().info("Not on Add Device - SCAN BAR CODE TO CONTINUE Page");
			return false;
		}
	}
}
