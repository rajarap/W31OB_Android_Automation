package com.cs.arris.Pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
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

public class ParentalControlUserProfileAddRuleDatePickerDialog extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	String hh;
	String mm;
	String med;

	@AndroidBy(id = "android:id/timePickerLayout")
	public MobileElement datePicker;

	@AndroidFindBy(id = "android:id/button1")
	public MobileElement okButton;

	@AndroidFindBy(id = "android:id/button2")
	public MobileElement cancelButton;
	
	@AndroidFindBy(xpath = "//android.widget.NumberPicker[1]/android.widget.EditText[@resource-id ='android:id/numberpicker_input']")
	public MobileElement hour;
	
	@AndroidFindBy(xpath = "//android.widget.NumberPicker[2]/android.widget.EditText[@resource-id ='android:id/numberpicker_input']")
	public MobileElement min;
	
	@AndroidFindBy(xpath = "//android.widget.NumberPicker/android.widget.EditText[@resource-id ='android:id/numberpicker_input']")
	public MobileElement median;

	public ParentalControlUserProfileAddRuleDatePickerDialog() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public void clickOkButton() {
		try {
			click(okButton);
			utils.log().info("Clicked on OK Button");
		} catch (Exception e) {
			utils.log().info("OK button is not displayed");
		}
	}
	
	public void clickCancelButton() {
		try {
			click(cancelButton);
			utils.log().info("Clicked on Cancel Button");
		} catch (Exception e) {
			utils.log().info("Cancel button is not displayed");
		}
	}

	public void verifyUIOnUserProfilePage() {
		try {
			if (okButton.isDisplayed())
				utils.log().info(okButton.getText() + " title is displayed ");
		} catch (Exception e) {
			utils.log().info("Ok button is not displayed");
		}

		try {
			if (cancelButton.isDisplayed())
				utils.log().info(cancelButton.getText() + " text is displayed ");
		} catch (Exception e) {
			utils.log().info("Cancel button is not displayed");
		}
	}

	public void pickTime()
	{
		LocalTime localTime = java.time.LocalTime.now();
		//utils.log().info("Local Time is" + localTime);  //19:12:55.514827
		
		DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
    	String dateStr = dateFormat.format(new Date()).toString();
    	utils.log().info("Current Time is" + dateStr);  //07.16 PM
    	String strPattern = "^0+";
    	String dateString = dateStr.replaceAll(strPattern, ""); //7.16 PM
    	
    	String[] str = dateString.split(" "); // 7.16      PM
    	med = str[1];
    	if(str[0].length() == 4)
    	{
    		hh = str[0].substring(0, 1);
    		mm = str[0].substring(2);
    	}
    	else
    	{
    		hh = str[0].substring(0, 2);
    		mm = str[0].substring(3);
    	}
	}
	
	public void pickHour()
	{
		this.pickTime();
		Integer hrInt = Integer.valueOf(hh);
		Integer hr = hrInt++;
		if(hr >= 12)
		{
			hr = hr -= 11;
			if(med.equals("PM"))
				med = "AM";
			if(med.equals("AM"))
				med = "PM";
			
			String hrs = Integer.toString(hr);
	    	hour.sendKeys(hrs);
		}else
		{
			String hrs = Integer.toString(hr);
	    	hour.sendKeys(hrs);
		}
	}
	
	public void pickMinute()
	{
		this.pickTime();
		Integer minInt = Integer.valueOf(mm);
		Integer mint = minInt += 5;
		if(mint >= 60)
		{
			mint = mint -= 55;
			String mins = Integer.toString(mint);
	    	min.sendKeys(mins);
		}else
		{
			String mins = Integer.toString(mint);
	    	min.sendKeys(mins);
		}
	}
	
	public void pickMedian()
	{
    	median.sendKeys(med);
	}
	
	
	
	@Override
	public boolean isAt() {
		if (okButton.isDisplayed()) {
			utils.log().info("On Date Picker Dialog");
			return true;
		} else {
			utils.log().info("Not on Date Picker Dialog");
			return false;
		}
	}
}