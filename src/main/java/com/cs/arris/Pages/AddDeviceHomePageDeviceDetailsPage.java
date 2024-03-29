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

public class AddDeviceHomePageDeviceDetailsPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/txtToolBarTitle")
	public MobileElement deviceDetailsTitle;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/close")
	public MobileElement closeButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_details")
	public MobileElement deviceDetailsText;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_product")
	public MobileElement productNumber;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_product_details")
	public MobileElement productDetails;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_service")
	public MobileElement serviceProviderText;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_service_details")
	public MobileElement serviceProviderName;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_hardware_spec")
	public MobileElement hardwareSpecText;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_hardware_spec_details")
	public MobileElement hardwareSpecDetails;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_ethernet_ports")
	public MobileElement ethernetPortText;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/tv_ethernet_ports_details")
	public MobileElement ethernetPortDetails;

	public AddDeviceHomePageDeviceDetailsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	 public boolean clickCloseButton() {
		 if (closeButton.isDisplayed()) {
			click(closeButton);
			utils.log().info("Clicked on Close Button");
			return true;
		} else {
			utils.log().info("Close button is not displayed");
			return false;
		}
	}

	public boolean verifyDeviceDetailsUI() {
		try {
			if (deviceDetailsTitle.isDisplayed())
				utils.log().info(deviceDetailsTitle.getText() + " text is displayed");
			else
				utils.log().info("Device Details Text is not displayed");

			if (deviceDetailsText.isDisplayed())
				utils.log().info(deviceDetailsText.getText() + " text is displayed");
			else
				utils.log().info("Devide Details Text is not displayed");

			if (closeButton.isDisplayed())
				utils.log().info("Cloe button is displayed");
			else
				utils.log().info("Close button is not displayed");

			if (productNumber.isDisplayed())
				utils.log().info(productNumber.getText() + " text is displayed");
			else
				utils.log().info("Product Model No. text is not displayed");

			if (productDetails.isDisplayed())
				utils.log().info(productDetails.getText() + " text is displayed");
			else
				utils.log().info("Product Details is not displayed");

			if (serviceProviderText.isDisplayed())
				utils.log().info(serviceProviderText.getText() + " text is displayed");
			else
				utils.log().info("Service Provider text is not displayed");

			if (serviceProviderName.isDisplayed())
				utils.log().info(serviceProviderName.getText() + " text is displayed");
			else
				utils.log().info("Service Provider Name text is not displayed");

			if (hardwareSpecText.isDisplayed())
				utils.log().info(hardwareSpecText.getText() + " text is displayed");
			else
				utils.log().info("Hardware Spec text is not displayed");

			if (hardwareSpecDetails.isDisplayed())
				utils.log().info(hardwareSpecDetails.getText() + " text is displayed");
			else
				utils.log().info("Hardware Spec Name is not displayed");

			if (ethernetPortText.isDisplayed())
				utils.log().info(ethernetPortText.getText() + " text is displayed");
			else
				utils.log().info("Ethernet Port text is not displayed");

			if (ethernetPortDetails.isDisplayed())
				utils.log().info(ethernetPortDetails.getText() + " text is displayed");
			else
				utils.log().info("Ethernet Port Number is not displayed");

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (deviceDetailsTitle.isDisplayed()) {
			utils.log().info("On Add Device - Device Details Page");
			return true;
		} else {
			utils.log().info("Not on Add Device - Device Details Page");
			return false;
		}
	}
}
