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

public class TermsAndConditionsPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.arris.sbcBeta:id/btAgreeTermsAndConditions")
	public MobileElement understandAndAgreeButton;

	@AndroidFindBy(id = "com.arris.sbcBeta:id/t_and_c_title") // About
	public MobileElement termsAndConditionsTitle;

	
	public TermsAndConditionsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickUnderstandAndAgreeButton() {
		if (understandAndAgreeButton.isDisplayed()) {
			click(understandAndAgreeButton); 
			utils.log().info("Clicked on Understand And Agree Button");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (termsAndConditionsTitle.isDisplayed()) {
			utils.log().info("On Terms And Conditions Page");
			return true;
		} else {
			utils.log().info("Not on Terms And Conditions Page");
			return false;
		}

	}

}
