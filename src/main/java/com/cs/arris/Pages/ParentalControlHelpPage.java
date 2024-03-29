package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

public class ParentalControlHelpPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.ImageView[@resource-id='com.arris.sbcBeta:id/ivDialogClose]"),
			@AndroidBy(xpath = "//android.widget.ImageView[@bounds='[915,146][1046,241]']"),
			@AndroidBy(id = "com.arris.sbcBeta:id/ivDialogClose") })
	public MobileElement closeButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Parental Control Overview']")
	public MobileElement helptitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Overview']")
	public MobileElement overView;

	@AndroidFindBy(xpath = "//android.widget.TextView[@bounds='[157,968][1023,1823]']")
	public MobileElement parentalHelpText;

	public ParentalControlHelpPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickCloseButton() {
		if(closeButton.isDisplayed()) {
			new SwipeActions().swipeScreen(Direction.UP);
			click(closeButton);
			utils.log().info("Clicked on Close Button");
			return true;
		} else {
			utils.log().info("Close button is not displayed");
			return false;
		}
	}

	public boolean verifyUIOnParentalControlOverviewHelpPage() {
		try {
			if (helptitle.isDisplayed())
				utils.log().info(helptitle.getText() + " title is displayed ");
			else
				utils.log().info("Parental Control Overview title is not displayed");

			if (overView.isDisplayed())
				utils.log().info("OverView Text is displayed ");
			else
				utils.log().info("OverView Text is not displayed");

			if (parentalHelpText.isDisplayed())
				utils.log().info("Parental Help Text is displayed");
			else
				utils.log().info("Parental Help Text is not displayed");

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (helptitle.isDisplayed()) {
			utils.log().info("On Parental Control Profile Help Page");
			return true;
		} else {
			utils.log().info("Not on Parental Control Profile Help Page");
			return false;
		}
	}

}
