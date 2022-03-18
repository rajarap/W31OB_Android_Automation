package com.cs.arris.Pages;

import org.openqa.selenium.support.PageFactory;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Utilities.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BTUnPairingPage extends ParentClass {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"‎SURFboard mAX‎, Device settings\"])[1]")
	public MobileElement unpairIcon;
	

	
	public BTUnPairingPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}


	public boolean clickUnPairIcon() {
		if (unpairIcon.isDisplayed()) {
			click(unpairIcon); 
			utils.log().info("Clicked on Unpair Icon");
			return true;
		} else {
			return false;
		}
	}
}
