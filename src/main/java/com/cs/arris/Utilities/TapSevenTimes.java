package com.cs.arris.Utilities;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.openqa.selenium.By;

import com.cs.arris.Base.ParentClass;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TapSevenTimes extends ParentClass{
	
	public TestUtils utils = new TestUtils();
	public TouchAction action = new TouchAction(getDriver());
	
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
}
