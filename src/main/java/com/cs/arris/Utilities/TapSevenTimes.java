package com.cs.arris.Utilities;

import com.cs.arris.Base.ParentClass;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TapSevenTimes extends ParentClass{
	
	public TestUtils utils = new TestUtils();
	public TouchAction action = new TouchAction(super.getDriver());
	
	public void tapSeven() {
		int x = 630;
		int y = 1200;
		PointOption p = new PointOption();
		p.withCoordinates(x, y);
		utils.log().info("Tapping 7 times");
		for(int i=0; i <= 7; i++) {
			action.tap(p).release().perform();
		}
	}
	
	public void tapTen() {
		int x = 630;
		int y = 1200;
		PointOption p = new PointOption();
		p.withCoordinates(x, y);
		//utils.log().info("Tapping 7 times");
		for(int i=0; i <= 10; i++) {
			action.tap(p).release().perform();
		}
	}
}
