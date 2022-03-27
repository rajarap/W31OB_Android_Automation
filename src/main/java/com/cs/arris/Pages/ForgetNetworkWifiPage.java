package com.cs.arris.Pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class ForgetNetworkWifiPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	@SuppressWarnings("rawtypes")
	TouchAction action = new TouchAction(super.getDriver());
	LongPressOptions longPressOptions;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Wi-Fi']") 
	public MobileElement wifiTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Arris-Guest']") 
	public MobileElement arrisGuest;

	
	public ForgetNetworkWifiPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public void openSettings() {
		super.getDriver().activateApp("com.android.settings/.Settings");
	}
	
	
//	public void scrollAndClick(String wifissid) {
//		
//		super.getDriver().find("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+wifissid+"\").instance(0))");
//	}
	
	public void clickAndForgetArrisGuestSSID() {
		if (arrisGuest.isDisplayed()) {
		    longPressOptions = new LongPressOptions();
		    longPressOptions.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(arrisGuest));
		    action.longPress(longPressOptions).release().perform();
			}else {
				super.swipeUp();
				if (arrisGuest.isDisplayed()) {
				    longPressOptions = new LongPressOptions();
				    longPressOptions.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(arrisGuest));
				    action.longPress(longPressOptions).release().perform();
				}
			}
	}


	@Override
	public boolean isAt() {
		if (wifiTitle.isDisplayed()) {
			utils.log().info("On Connections Page");
			return true;
		} else {
			utils.log().info("Not on Connections Page");
			return false;
		}

	}

}
