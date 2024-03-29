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

public class AddDeviceEstablishingConnectionPage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/text_establish")
	public MobileElement establishConnectionTitle; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/ic_back_icon")
	public MobileElement backIcon; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/need_help")
	public MobileElement helpIcon; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/establish_text_small") 
	public MobileElement description1; 
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/tv_waiting_time_is_required") 
	public MobileElement description2; 
		
	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_online")
	public MobileElement onlineButton;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/btn_i_am_not_online")
	public MobileElement notOnlineButton;
	

	public AddDeviceEstablishingConnectionPage()
	{
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

		public boolean clickOnlineButton() {
			if (onlineButton.isDisplayed()) {
				click(onlineButton);
				super.pause(3);
				utils.log().info("Clicked on Online Button");
				return true;
			} else {
				utils.log().info("Online Button is not displayed");
				return false;
			}
		}
		
		public boolean clickNotOnlineButton() {
			if (notOnlineButton.isDisplayed()) {
				click(notOnlineButton);
				utils.log().info("Clicked on Not Online Button");
				return true;
			} else {
				utils.log().info("Not Online Button is not displayed");
				return false;
			}
		}
		
		public boolean verifyEstablishingConnectionUI() {
			try {
				if (establishConnectionTitle.isDisplayed())
					utils.log().info(establishConnectionTitle.getText() + " text is displayed");
				else
					utils.log().info("ESTABLISHING CONNECTION Text is not displayed");

				if (backIcon.isDisplayed())
					utils.log().info("Back button is displayed");
				else
					utils.log().info("Back button is not displayed");

				if (helpIcon.isDisplayed())
					utils.log().info("Help icon is displayed");
				else
					utils.log().info("Help icon is not displayed");

				if (description1.isDisplayed())
					utils.log().info(description1.getText() + " text is displayed");
				else
					utils.log().info("Wait for 5–10 minutes Text is not displayed");

				if (description2.isDisplayed())
					utils.log().info(description2.getText() + " text is displayed");
				else
					utils.log().info("The waiting time is required  Text is not displayed");

				if (onlineButton.isDisplayed())
					utils.log().info(onlineButton.getText() + " button is displayed");
				else
					utils.log().info("I'M ONLINE button is not displayed");

				if (notOnlineButton.isDisplayed())
					utils.log().info(notOnlineButton.getText() + " button is displayed");
				else
					utils.log().info("I'M NOT ONLINE button is not displayed");

				return true;
			} catch (Exception e) {
				return false;
			}
		}

		@Override
		public boolean isAt() {
			if (establishConnectionTitle.isDisplayed()) {
				utils.log().info("On Add Device - ESTABLISHING CONNECTION Page");
				return true;
			} else {
				utils.log().info("Not on Add Device - ESTABLISHING CONNECTION Page");
				return false;
			}
		}
	}
