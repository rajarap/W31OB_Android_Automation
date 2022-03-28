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

public class AttentionPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "android:id/topPanel") // About
	public MobileElement attentionTitle;

	@AndroidFindBy(id = "android:id/message") // About
	public MobileElement attentionMessage;

	@AndroidFindBy(id = "android:id/button1")
	public MobileElement okButton;
	
	public AttentionPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public boolean clickOKButton() {
		if (okButton.isDisplayed()) {
			click(okButton); 
			utils.log().info("Clicked OK Button");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (attentionTitle.isDisplayed()) {
			utils.log().info("On Attention Page");
			return true;
		} else {
			utils.log().info("Not on Attention Page");
			return false;
		}

	}

}
