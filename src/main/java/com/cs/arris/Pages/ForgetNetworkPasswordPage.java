package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ForgetNetworkPasswordPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Arris-Guest']") 
	public MobileElement ssidTitle;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter password']") 
	public MobileElement arrisGuestPwd;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Connect']") 
	public MobileElement connectButton;

	
	public ForgetNetworkPasswordPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	
	public void enterArrisGuestPassword() {
		if (arrisGuestPwd.isDisplayed())
			arrisGuestPwd.sendKeys("ARRS!Gu3st");
	}
	
	public void clickConnectButton() {
		if (connectButton.isEnabled())
			click(connectButton);
	}


	@Override
	public boolean isAt() {
		if (ssidTitle.isDisplayed()) {
			utils.log().info("On " + ssidTitle.getText() + " Page");
			return true;
		} else {
			utils.log().info("Not on Arris-Guest Page");
			return false;
		}

	}

}
