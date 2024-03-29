package com.cs.arris.Pages;


import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.TestUtils;
import com.cs.arris.Utilities.EmailTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EnterValidOTPPage   extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
//	public OTP otp;
	public String passCode;
	
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/need_help") 
	public MobileElement helpIcon;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/title_text") 
	public MobileElement enterVerificationCodeMessage;

	@AndroidFindBy (id = "com.arris.sbcBeta:id/description_text") 
	public MobileElement checkEmailAccounteMessage;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/user_email_id']") 
	public MobileElement emailAddress;
	
	@AndroidFindBy (xpath = "//android.widget.EditText[@resource-id='com.arris.sbcBeta:id/etConfirmPasscode']")
	public MobileElement otpCodeTextBox;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/tvResendPasscode']")
	public MobileElement resendPassCode;
	
	@AndroidFindBy (id = "com.arris.sbcBeta:id/ic_back_icon") 
	public MobileElement otpVerificationBackButton;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/confirm_password_error']")
	public MobileElement invalidPassCodeMessage;
	
	public EnterValidOTPPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	public String getEmailAddress()
	{
		return emailAddress.getText();
	}
	
	public void enterValidPassCode(String email)
	{
		utils.log().info("Obtaining OTP...");
		passCode = new EmailTest().getValidOTP(email); 
		utils.log().info("Entering valid OTP..." + passCode);
		super.sendKeys(otpCodeTextBox, passCode);
	}
	
//	public void enterValidPassCode(String passcode)
//	{
//		utils.log().info("Entering valid OTP..." + passcode);
//		super.sendKeys(otpCode, passcode);
//	}
	
	public void enterInValidPassCode(String passcode)
	{
		utils.log().info("Entering invalid OTP..." + passcode);
		super.sendKeys(otpCodeTextBox, passcode);
	}
	
	public void clearOtpTextBox()
	{
		clear(otpCodeTextBox);
	}
	
	public boolean verifyInvalidPassCodeMessage()
	{
		if(invalidPassCodeMessage.isDisplayed())
		{
			utils.log().info("Invalid passcode message is displayed");
			return true;
		}
		else
		{
			utils.log().info("Invalid passcode message is not displayed");
			return false;
		}
	}
	
	public void clickResendLink()
	{
		super.click(resendPassCode);
		utils.log().info("Clicked Resend OTP Link");
	}
	
	public void clearPassCodeText()
	{
		otpCodeTextBox.clear();
	}
	
	@Override
	public boolean isAt() {
		if(otpCodeTextBox.isDisplayed())
		{
			utils.log().info("At Enter OTP Page");
			return true;
		}
		else
		{
			utils.log().info("Enter OTP Page is not displayed");
			return false;
		}
	}
}
