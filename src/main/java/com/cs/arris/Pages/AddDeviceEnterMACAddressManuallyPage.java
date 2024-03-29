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

public class AddDeviceEnterMACAddressManuallyPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/title_text")
	public MobileElement enterManuallyTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/ic_back_icon")
	public MobileElement backIcon;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/need_help")
	public MobileElement helpIcon;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_top_description")
	public MobileElement description;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/textView5")
	public MobileElement enterSerialNoLabel;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/etSnNumber")
	public MobileElement enterSerialNoTextBox;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/serial_no_error")
	public MobileElement serialNoMustNotBeBlankLabel;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_enter_mac_address")
	public MobileElement macAddressLabel;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/etMacAddress")
	public MobileElement enterMACAddressTextBox;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/mac_address_error")
	public MobileElement macAddressMustNotBeBlankLabel;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_next")
	public MobileElement nextButton;

	public AddDeviceEnterMACAddressManuallyPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickBackButton() {
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

	public boolean enterSerialNumber() {
		if (enterSerialNoTextBox.isDisplayed()) {
			clear(enterSerialNoTextBox);
			sendKeys(enterSerialNoTextBox, "12345678901234567890");
			utils.log().info("Entered Serial Number Manually");
			return true;
		} else {
			utils.log().info("Serial Number Text Box is not displayed");
			return false;
		}
	}

	public boolean enterMACAddress() {
		if (enterMACAddressTextBox.isDisplayed()) {
			clear(enterMACAddressTextBox);
			sendKeys(enterMACAddressTextBox, "123456789012");
			utils.log().info("Entered MAC address Manually ");
			return true;
		} else {
			utils.log().info("MAC Address Text Box is not displayed");
			return false;
		}
	}

	public boolean clickNextButton() {
		if (nextButton.isDisplayed()) {
			click(nextButton);
			super.pause(20);
			utils.log().info("Clicked Next Button on Enter S/N and MAC Address Manually");
			return true;
		} else {
			utils.log().info("Next Button is not displayed");
			return false;
		}
	}

	public boolean verifyEnterSerialNumberAndMACAddressUI() {
		try {
			if (enterManuallyTitle.isDisplayed())
				utils.log().info(enterManuallyTitle.getText() + " text is displayed");
			else
				utils.log().info("ENTER S/N AND HFC MAC ADDRESS MANUALLY IN UPPERCASE Text is not displayed");

			if (backIcon.isDisplayed())
				utils.log().info("Back button is displayed");
			else
				utils.log().info("Back button is not displayed");

			if (helpIcon.isDisplayed())
				utils.log().info("Help icon is displayed");
			else
				utils.log().info("Help icon is not displayed");

			if (description.isDisplayed())
				utils.log().info(description.getText() + " text is displayed");
			else
				utils.log().info("Enter the details located on the bottom of the device Text is not displayed");

			if (enterSerialNoLabel.isDisplayed())
				utils.log().info(enterSerialNoLabel.getText() + " text is displayed");
			else
				utils.log().info("Enter S/N Label is not displayed");

			if (enterSerialNoTextBox.isDisplayed())
				utils.log().info("Enter Serial Number Text Box is displayed");
			else
				utils.log().info("Enter Serial Number Text Box is not displayed");

			if (serialNoMustNotBeBlankLabel.isDisplayed())
				utils.log().info(serialNoMustNotBeBlankLabel.getText() + " text is displayed");
			else
				utils.log().info("Serial No. is required (must not be blank) text is not displayed");

			if (macAddressLabel.isDisplayed())
				utils.log().info(macAddressLabel.getText() + " text is displayed");
			else
				utils.log().info("Enter MTA MAC Address Label is not displayed");

			if (enterMACAddressTextBox.isDisplayed())
				utils.log().info("Enter MAC Address Text Box is displayed");
			else
				utils.log().info("Enter MAC Address Text Box is not displayed");

			if (macAddressMustNotBeBlankLabel.isDisplayed())
				utils.log().info(macAddressMustNotBeBlankLabel.getText() + " text is displayed");
			else
				utils.log().info("MAC Address is required (must not be blank) text is not displayed");

			if (nextButton.isDisplayed())
				utils.log().info(nextButton.getText() + " button is displayed");
			else
				utils.log().info("NEXT button is not displayed");

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (enterManuallyTitle.isDisplayed()) {
			utils.log().info("On Add Device - ENTER S/N AND HFC MAC ADDRESS MANUALLY IN UPPERCASE Page");
			return true;
		} else {
			utils.log().info("Not on Add Device - ENTER S/N AND HFC MAC ADDRESS MANUALLY IN UPPERCASE Page");
			return false;
		}
	}
}
