package com.cs.arris.Pages;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.Direction;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BTSwipePage extends ParentClass {
	public TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Bluetooth']") // About
	public MobileElement bluetooth;
	
		
	public BTSwipePage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

		public void swipeDownOnce(Direction dir) {
		    Dimension size;
			size = getDriver().manage().window().getSize();
			TouchAction action = new TouchAction(getDriver());

		    int startX = 0;
		    int endX = 0;
		    int startY = 0;
		    int endY = 0;

		    switch (dir) {
		        case DOWN:
		            startY = (int) (size.height * 0.70);
		            endY = (int) (size.height * 0.30);
		            startX = (size.width / 2);
		            action.press(PointOption.point(530, 10)).waitAction( WaitOptions.waitOptions(Duration.ofMillis(1300)))
                    .moveTo(PointOption.point(530, 1741)).release().perform();

		            break;
		    }
	}
	
	public void swipeDownTwice(Direction dir) {
	    Dimension size;
		size = getDriver().manage().window().getSize();
		TouchAction action = new TouchAction(getDriver());

	    int startX = 0;
	    int endX = 0;
	    int startY = 0;
	    int endY = 0;

	    switch (dir) {
	    	case DOWN:
	            startY = (int) (size.height * 0.70);
	            endY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            action.press(PointOption.point(530, 350)).waitAction( WaitOptions.waitOptions(Duration.ofMillis(1300)))
                .moveTo(PointOption.point(540, 1830)).release().perform();

	            break;
	    }
	}
	
	public void swipeUpOnce(Direction dir) {
	    Dimension size;
		size = getDriver().manage().window().getSize();
		TouchAction action = new TouchAction(getDriver());

	    int startX = 0;
	    int endX = 0;
	    int startY = 0;
	    int endY = 0;

	    switch (dir) {
	        case UP:
	            startY = (int) (size.height * 0.70);
	            endY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            action.press(PointOption.point(538, 2160)).waitAction( WaitOptions.waitOptions(Duration.ofMillis(1300)))
                .moveTo(PointOption.point(538, 459)).release().perform();

	            break;
	    }
}

//public void swipeUpTwice(Direction dir) {
//    Dimension size;
//	size = getDriver().manage().window().getSize();
//	TouchAction action = new TouchAction(getDriver());
//
//    int startX = 0;
//    int endX = 0;
//    int startY = 0;
//    int endY = 0;
//
//    switch (dir) {
//    	case UP:
//            startY = (int) (size.height * 0.70);
//            endY = (int) (size.height * 0.30);
//            startX = (size.width / 2);
//            action.press(PointOption.point(530, 350)).waitAction( WaitOptions.waitOptions(Duration.ofMillis(1300)))
//            .moveTo(PointOption.point(540, 1830)).release().perform();
//
//            break;
//    }
//}

	public boolean clickBluetooth() {
		if (bluetooth.isDisplayed()) {
			click(bluetooth); 
			utils.log().info("Clicked on Bluetooth");
			return true;
		} else {
			return false;
		}
	}
}
