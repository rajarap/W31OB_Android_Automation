package com.cs.arris.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.Direction;
import com.cs.arris.Utilities.SwipeActions;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NetworkReserveLANIPDialog extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/lan_ip_cancel_dialog")
	public MobileElement closeIcon;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/lan_ip_header_dialog")
	public MobileElement reservelanIPTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/lan_ip_message_1")
	public MobileElement reservelanIPMessage1;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/lan_ip_message_dialog")
	public MobileElement reservelanIPMessage2;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/enter_alias_tv")
	public MobileElement enterRuleNameLabel;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/alias_address_dialog")
	public MobileElement ruleNameTextBox;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/enter_ip_tv")
	public MobileElement enterIPAddressLabel;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/lan_ip_edit_view")
	public MobileElement enterIPAddressTextBox;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/lan_ip_prefix")
	public MobileElement enterIPAddressPrefixTextBox;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/ip_address_dialog")
	public MobileElement enterIPAddressSuffixTextBox;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/mac_address_view")
	public MobileElement selectDeviceLabel;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/connect_device_id")
	public MobileElement selectDeviceListBox;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/lan_ip_save_dialog")
	public MobileElement saveButton;

	public NetworkReserveLANIPDialog() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public HomePage getHomePageObject() {
		HomePage homePage = new HomePage();
		return homePage;
	}

	public FooterIconsPage getFooterIconsPageObject() {
		FooterIconsPage footerIconsPage = new FooterIconsPage();
		return footerIconsPage;
	}

	public boolean clickSaveButton() {
		if (saveButton.isDisplayed()) {
			click(saveButton);
			utils.log().info("Clicked on Save Button");
			return true;
		} else {
			utils.log().info("Save Button is not displayed");
			return false;
		}
	}

	public boolean clickCloseIconn() {
		if (closeIcon.isDisplayed()) {
			click(closeIcon);
			utils.log().info("Clicked on Close button");
			return true;
		} else {
			utils.log().info("Close button is not displayed");
			return false;
		}
	}

	public boolean enterRuleName() 
	{
		if(ruleNameTextBox.isDisplayed()) {
		super.generateRuleName();
		super.sendKeys(ruleNameTextBox, super.ruleName);
		utils.log().info("Enter Rule Name : " + super.ruleName);
		return true;
		} else {
			utils.log().info("Rule Name is not entered");
			return false;
		}
	}

	public boolean enterIPAddress() {
		if (enterIPAddressSuffixTextBox.isDisplayed()) {
			super.generateRandomIPNumber();
			super.sendKeys(enterIPAddressSuffixTextBox, String.valueOf(super.ipNumber));
			utils.log().info("Entered IP Address : " + enterIPAddressSuffixTextBox.getText());
			return true;
		} else {
			utils.log().info("IP Address is not enterned");
			return false;
		}
	}

	public boolean selectADevice(int index) {
		if (selectDeviceListBox.isDisplayed()) {
			click(selectDeviceListBox);
			click(super.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup["+index+"]"));
			return true;
		} else {
			utils.log().info("No Option to select from list box");
			return false;
		}
	}

	public boolean verifyUIOnReserveLANIP() {
		utils.log().info("                                                 ");
		utils.log().info("*************************************************");
		utils.log().info("Verifying UI Elements on Reserve A LAN IP Dialog ");
		utils.log().info("*************************************************");
		try {
			if (reservelanIPTitle.isDisplayed())
				utils.log().info(reservelanIPTitle.getText() + " title text is displayed ");
			else
				utils.log().info("RESERVE A LAN IP title text is not displayed");

			if (closeIcon.isDisplayed())
				utils.log().info("Close Icon is displayed");
			else
				utils.log().info("Close Icon is not displayed");

			if (reservelanIPMessage1.isDisplayed())
				utils.log().info("Please enter a valid IP for a selected device is displayed");
			else
				utils.log().info("Please enter a valid IP for a selected device. is not displayed");

			if (reservelanIPMessage2.isDisplayed())
				utils.log().info("Please enter IP between 2 and 254 is displayed");
			else
				utils.log().info("PPlease enter IP between 2 and 254 is not displayed");

			if (enterRuleNameLabel.isDisplayed())
				utils.log().info(enterRuleNameLabel.getText() + " label is displayed");
			else
				utils.log().info("Please enter Rule Name Label is not displayed");

			if (ruleNameTextBox.isDisplayed())
				utils.log().info("Text box to enter Rule Name is displayed");
			else
				utils.log().info("Text box to enter Rule Name is not displayed");

			if (enterIPAddressLabel.isDisplayed())
				utils.log().info(enterIPAddressLabel.getText() + " label is displayed");
			else
				utils.log().info("Enter IP Address Label is not displayed");

			if (enterIPAddressTextBox.isDisplayed())
				utils.log().info("Text box to enter IP address is displayed");
			else
				utils.log().info("Text box to enter IP Address is not displayed");
			
			if (enterIPAddressPrefixTextBox.isDisplayed())
				utils.log().info("Prefix IP Address : " + enterIPAddressPrefixTextBox.getText());
			else
				utils.log().info("Prefix IP Address is not displayed");

			if (selectDeviceLabel.isDisplayed())
				utils.log().info(selectDeviceLabel.getText() + " label is displayed");
			else
				utils.log().info("Select your Device Label is not displayed");

			if (selectDeviceListBox.isDisplayed())
				utils.log().info("List box to select the device is displayed");
			else
				utils.log().info("List box to select the device is not displayed");

			if (saveButton.isDisplayed())
				utils.log().info(saveButton.getText() + " Save Button is displayed");
			else
				utils.log().info("Save Button is not displayed");

		return true;
	} catch (Exception e) {
		return false;
	}
}

	@Override
	public boolean isAt() {
		if (reservelanIPTitle.isDisplayed()) {
			utils.log().info("On Reserve LAN IP Reservation Page");
			return true;
		} else {
			utils.log().info("Not on Reserve LAN IP Reservation Page");
			return false;
		}
	}
}
