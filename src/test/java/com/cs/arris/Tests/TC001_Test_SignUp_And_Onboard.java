package com.cs.arris.Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.function.Consumer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Exceptions.EC_0003_1014_Service_Not_Available;
import com.cs.arris.Exceptions.EC_0015_1805_OTP_Screen_Continue_Onboarding;
import com.cs.arris.Pages.AccessResourcesOnDevicePage;
import com.cs.arris.Pages.CodeVerifiedPage;
import com.cs.arris.Pages.CongratulationsPage;
import com.cs.arris.Pages.ConnectMaxRouterToInternetPage;
import com.cs.arris.Pages.ConnectMaxRouterToMobileDevicePage;
import com.cs.arris.Pages.ConnectionToWifiNeededPage;
import com.cs.arris.Pages.DeviceLocationPage;
import com.cs.arris.Pages.EnterValidOTPPage;
import com.cs.arris.Pages.ErrorCode_0000_1506_Warranty_Support_Page;
import com.cs.arris.Pages.GetStartedPage;
import com.cs.arris.Pages.GrantPermissionsPage;
import com.cs.arris.Pages.HomePage;
import com.cs.arris.Pages.InstallAdditionalSatellitePage;
import com.cs.arris.Pages.MaximumVerificationReachedPage;
import com.cs.arris.Pages.NameYourNetwokSSIDPage;
import com.cs.arris.Pages.NetworkOptimizationDialog;
import com.cs.arris.Pages.OptimizeYourNetworkPage;
import com.cs.arris.Pages.PlugInMaxRouterPage;
import com.cs.arris.Pages.SelectYourDevicePage;
import com.cs.arris.Pages.SelectYourDevicePage2;
import com.cs.arris.Pages.ServiceNotAvailablePage;
import com.cs.arris.Pages.SetUpYourWiFiManagementPage;
import com.cs.arris.Pages.SetupHomeNetworkPage;
import com.cs.arris.Pages.SiginPage;
import com.cs.arris.Pages.SignupPage;
import com.cs.arris.Pages.SystemFirmwareUpdatePage;
import com.cs.arris.Pages.TermsAndConditionsPage;
import com.cs.arris.Pages.UnPackYourBoxPage;
import com.cs.arris.Utilities.Direction;
import com.cs.arris.Utilities.EmailTest;
import com.cs.arris.Utilities.SevenTapEmail;
import com.cs.arris.Utilities.SevenTapGmail;
import com.cs.arris.Utilities.SevenTapLogs;
import com.cs.arris.Utilities.SwipeActions;
import com.cs.arris.Utilities.TapSevenTimes;
import com.cs.arris.Utilities.TestUtils;
import com.cs.arris.Utilities.ValidOTP;
import com.cs.arris.Workflows.TC50_SignUp_And_Onboard_Workflow;

public class TC001_Test_SignUp_And_Onboard extends ParentClass
{
	TestUtils utils = new TestUtils();
	String firstName;
	String lastName;
	String email;
	String passCode;
	String ssidName;
	String ssidpass;
	String udid;
	
	 @BeforeClass
	 public void beforeClass() throws Exception 
	 {
		 try 
	   	  	{
			  String dataFileName = "testdata/signup";
			  utils.log().info("Loading...Sign Up Test Data");
			  super.loadTestData(dataFileName);
			  
			  this.firstName = properties.getProperty("firstname");
			  utils.log().info("First Name : " + this.firstName);

			  this.lastName = properties.getProperty("lastname");
			  utils.log().info("Last Name : " + this.lastName);
			  
			  this.email = properties.getProperty("email");
			  utils.log().info("Email address : " + this.email);
			  
			  this.ssidName = super.generateRouterSSID();
			  utils.log().info("SSID Name : " + this.ssidName);
			  
			  this.ssidpass = properties.getProperty("ssidpwd");
			  utils.log().info("SSID Password : " + this.ssidpass);
			  	  
			  this.udid = properties.getProperty("udid");
			  utils.log().info("UDID : " + this.udid);
			  
			  utils.log().info("Retrieved...Sign Up Test Data");
			} catch(Exception e) {
			 e.printStackTrace();
		} 
     }
	
	  @BeforeMethod
	  public void beforeMethod(Method m) 
	  {
		   utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
	  }
	  
//	  @Test(priority = 1)
//	  public void Verify_SignUp_And_Onboard()
//	  {
//		  TC50_SignUp_And_Onboard_Workflow.getStartedPage(getStarted -> {
//			  getStarted.clickGetStartedButton();
//		  }).grantPermissionsPage(grantPermission -> {
//			  grantPermission.clickContinueButton();
//		  }).deviceLocationPage(deviceLocation -> {
//			  deviceLocation.clickAllow();
//		  }).accessResourcesOnDevicePage(accessResoucesOnDevice -> {
//			  super.pause(3);
//			  accessResoucesOnDevice.clickAllow();
//		  }).selectYourDevicePage(selectDevice -> {
//			  selectDevice.selectSurfboardMaxOption();
//			  selectDevice.clickNextButton();
//		  }).selectYourDevicePage2(selectDevice2 -> {
//			  selectDevice2.selectMaxProAX11000RadioButton();   
//			  selectDevice2.clickNextButton();
//			  super.pause(3);
//		  }).welcomeSigninPage(signin -> {
//			  signin.clickSignUpButton();
//		  }).welcomeSignupPage(signup -> {
//			  email = signup.getEmailAddress();
//			  signup.enterValidEmailAddress(email);
//			  signup.enterFirstName(firstName);
//			  signup.enterLastName(lastName);
//			  signup.clickAgreeTermsAndConditionsCheckBox();
//			  super.pause(10);
//			  
//			  if(new TermsAndConditionsPage().isAt()) {
////				  ((JavascriptExecutor) super.getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//				for(int i=1; i<=18; i++) {
//					super.swipeUp();
//				}
//				  super.pause(3);
//					if(new TermsAndConditionsPage().understandAndAgreeButton.isEnabled()) {
//						new TermsAndConditionsPage().clickUnderstandAndAgreeButton();
//					}
//				}
//			  super.pause(2);
//			  signup.clickSignupButton();
//			  super.pause(5);
//		  }).getOTPCode(getOTP -> {
//			  super.getDriver().runAppInBackground(Duration.ofSeconds(20));
//			  passCode = new EmailTest().getValidOTP(email);
//		      super.getDriver().activateApp("com.arris.sbcBeta");
//		}).enterOTPPage(otpverify -> {
//			  otpverify.enterValidPassCode(passCode);
//		 }).codeVerifiedPage(codeVerified -> {
//			  codeVerified.getCodeVerifiedText();
//			  codeVerified.clickNextButton();
//			  super.pause(3);
//			  try
//			  {
//				  if(codeVerified.continueOnBoardingButton.isDisplayed())
//				  {
//					  codeVerified.clickContinueOnboardingButton();
//				  }
//			  }catch(Exception e)
//			  {
//				  e.getMessage();
//			  }
//		  }).optimizeYourNetworkPage(optimize -> {
//			  optimize.clickSkipOptimizeButton();
//		  }).setUpHomeNetworkPage(homeNetwork -> {
//			  homeNetwork.clickNextButton();
//		  }).unPackYourBoxPage(unpackBox -> {
//			  unpackBox.clickNextButton();
//		  }).plugInYourMaxRouterPage(pluginRouter -> {
//			  pluginRouter.clickNextButton();
//			  super.pause(20);
//		  }).maxRouterConnectedToMobilePage(connectedRouterToMobile -> {
//			  connectedRouterToMobile.clickNextButton();
//			  super.pause(10);
//		  }).maxRouterConnectedToInternetPage(connecedRouterToInternet -> {
//			  connecedRouterToInternet.clickNextButton();
//			  super.pause(5);
//		  }).systemFirmwareUpdatePage(firmwareUpdate -> {
//			  firmwareUpdate.clickNextButton();
//			  super.pause(10);
//		  }).warrantyAndSupportPage(warrantyAndSupport -> {
//			  warrantyAndSupport.clickContinueButton();
//		  }).nameYourNetworkPage(nameYourNetwork -> {
//			  nameYourNetwork.enterSSIDName(this.ssidName);
//			  nameYourNetwork.enterSSIDPassword(this.ssidpass);
//			  nameYourNetwork.clickNextButton();
//			  super.pause(25);
//		  }).connectNeeded(connectionRequired -> { 
//			  super.pause(15);
//			  connectionRequired.turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
//			  super.pause(15);
//			  connectionRequired.clickContinue();
//			  super.pause(20);
//		  }).congratulations(congrats -> {
//			  congrats.clickContinueButton();
//			  super.pause(5);
//		  }).setupWifi(setupwifi ->{
//			  setupwifi.clickskipTutorialButton();
//		  }).installSatellite(insatellite -> {
//			  insatellite.clickInstallLaterButton();
//			  super.pause(5);
//		  }).networkOptimization(optimization -> {
//			  optimization.clickOkButton();
//			  super.pause(5);
//	  		}).homePage(homepage -> {
//			  homepage.getSSIDName();			  
//		  });
//	}
	  
//	  @Test(priority = 1)
//	  public void Verify_SignUp_And_Onboard()
//	  {
//			new GetStartedPage().clickGetStartedButton();
//			new GrantPermissionsPage().clickContinueButton();
//			new DeviceLocationPage().clickAllow();
//			new AccessResourcesOnDevicePage().clickAllow();
//			new SelectYourDevicePage().selectSurfboardMaxOption();
//			new SelectYourDevicePage().clickNextButton();
//			new SelectYourDevicePage2().selectMaxProAX11000RadioButton();
//			new SelectYourDevicePage2().clickNextButton();
//			new SiginPage().clickSignUpButton();
//			email = new SignupPage().getEmailAddress();
//			new SignupPage().enterValidEmailAddress(email);
//			new SignupPage().enterFirstName(firstName);
//			new SignupPage().enterLastName(lastName);
//			new SignupPage().clickAgreeTermsAndConditionsCheckBox();
//			super.pause(5);
//			if(new TermsAndConditionsPage().isAt()) {
//				for(int i=1; i<=18; i++) {
//					super.swipeUp();
//				}
//				  super.pause(3);
//					if(new TermsAndConditionsPage().understandAndAgreeButton.isEnabled()) {
//						new TermsAndConditionsPage().clickUnderstandAndAgreeButton();
//					}
//				}
//			  super.pause(2);
//			  new EmailTest().displayMessage();
//			  super.getDriver().runAppInBackground(Duration.ofSeconds(30));
//			  try {
//				passCode = new EmailTest().getValidOTP(email);
//			} catch (MalformedURLException e1) {}
//			  super.getDriver().activateApp("com.arris.sbcBeta");
//			  new SignupPage().clickSignupButton();
//			 	  
//			  new EnterValidOTPPage().enterValidPassCode(passCode);
//			  new CodeVerifiedPage().getCodeVerifiedText();
//			  new CodeVerifiedPage().clickNextButton();
//			  super.pause(3);
//			  try {
//				  if(new CodeVerifiedPage().continueOnBoardingButton.isDisplayed())
//					  new SevenTapLogs().tapSeven();
//				  	  new SevenTapLogs().clickYesButton();
//				      new SevenTapLogs().clickGmailIcon();
//				      new SevenTapLogs().enterEmailAddress();
//				      new SevenTapLogs().clickSendButton();
//				      new CodeVerifiedPage().clickContinueOnboardingButton();
//				      utils.log().info("EC-0015-1805 - The mobile device cannot connect to your Router");
//			  }catch(EC_0015_1805_OTP_Screen_Continue_Onboarding e) { 
//				  new EC_0015_1805_OTP_Screen_Continue_Onboarding("EC-0015-1805 - The mobile device cannot connect to your Router", e);
//			  }
//			  new OptimizeYourNetworkPage().clickSkipOptimizeButton();
//			  new SetupHomeNetworkPage().clickNextButton();
//			  new UnPackYourBoxPage().clickNextButton();
//			  new PlugInMaxRouterPage().clickNextButton();
//			  super.pause(20);
//			  new ConnectMaxRouterToMobileDevicePage().clickNextButton();
//			  super.pause(10);
//			  try {
//				  if(new ServiceNotAvailablePage().error_code_0003_1003.isDisplayed() || new ServiceNotAvailablePage().error_code_0003_1014.isDisplayed())
//					  new SevenTapLogs().tapSeven();
//			  	  	  new SevenTapLogs().clickYesButton();
//			  	  	  new SevenTapLogs().clickGmailIcon();
//			  	  	  new SevenTapLogs().enterEmailAddress();
//			  	  	  new SevenTapLogs().clickSendButton();
//			  	  	  new CodeVerifiedPage().clickContinueOnboardingButton();
//			  	  	  utils.log().info("EC-0003-1014/1003 - Service is currently not available.  We are exeperncing an issue connecting to our back office");
//			  	}catch(EC_0003_1014_Service_Not_Available e) { 
//					  new EC_0015_1805_OTP_Screen_Continue_Onboarding("EC-0003-1014/1003 - Service is currently not available.  We are exeperncing an issue connecting to our back office", e);
//				  }
//			  new ConnectMaxRouterToInternetPage().clickNextButton();
//			  super.pause(5);
//			  new SystemFirmwareUpdatePage().clickNextButton();
//			  super.pause(10);
//			  new ErrorCode_0000_1506_Warranty_Support_Page().clickContinueButton();	 
//			  new NameYourNetwokSSIDPage().enterSSIDName(this.ssidName);
//			  new NameYourNetwokSSIDPage().enterSSIDPassword(this.ssidpass);
//			  new NameYourNetwokSSIDPage().clickNextButton();
//			  super.pause(25);
//			  new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
//			  super.pause(15);
//			  new ConnectionToWifiNeededPage().clickContinue();
//			  super.pause(20);
//			  new CongratulationsPage().clickContinueButton();
//			  super.pause(5);
//			  new SetUpYourWiFiManagementPage().clickskipTutorialButton();
//			  new InstallAdditionalSatellitePage().clickInstallLaterButton();
//			  super.pause(5);
//			  new NetworkOptimizationDialog().clickOkButton();
//			  super.pause(5);
//			  new HomePage().getSSIDName();  
//	  }
	  
	  @Test(priority = 1)
	  public void Verify_SignUp_And_Onboard()
	  {
			new GetStartedPage().clickGetStartedButton();
			new GrantPermissionsPage().clickContinueButton();
			new DeviceLocationPage().clickAllow();
			new AccessResourcesOnDevicePage().clickAllow();
			new SelectYourDevicePage().selectSurfboardMaxOption();
			new SelectYourDevicePage().clickNextButton();
			new SelectYourDevicePage2().selectMaxProAX11000RadioButton();
			new SelectYourDevicePage2().clickNextButton();
			new SiginPage().enterEmailAddress(email);
//			new SiginPage().clickSignUpButton();
			new SiginPage().clickSigninButton();
			try {
				  if(new MaximumVerificationReachedPage().isAt()) {
					 new TapSevenTimes().tapSeven();
					  
			  		if(new SevenTapLogs().isAt()) 
			  			new SevenTapLogs().clickYesButton();
			  		
			  		if(new SevenTapGmail().isAt()) 
			  			new SevenTapGmail().clickGmailIcon();
			  		
			  		if(new SevenTapEmail().isAt()) {
			  			new SevenTapEmail().enterEmailAddress();
			  			new SevenTapEmail().clickSendButton();}
	  		
				      utils.log().info("EC-0015-1805 - The mobile device cannot connect to your Router");
				  }
			  }catch(EC_0015_1805_OTP_Screen_Continue_Onboarding e) { 
				  new EC_0015_1805_OTP_Screen_Continue_Onboarding("EC-0015-1805 - The mobile device cannot connect to your Router", e);
			  }
			  super.pause(20);
			  passCode = new ValidOTP().getValidOTP();	  
			  new EnterValidOTPPage().enterValidPassCode(passCode);
			  new CodeVerifiedPage().getCodeVerifiedText();
			  new CodeVerifiedPage().clickNextButton();
			  super.pause(3);
			  try {
				  if(new CodeVerifiedPage().continueOnBoardingButton.isDisplayed()) {
					  new TapSevenTimes().tapSeven();
					  
				  		if(new SevenTapLogs().isAt()) 
				  			new SevenTapLogs().clickYesButton();
				  		
				  		if(new SevenTapGmail().isAt()) 
				  			new SevenTapGmail().clickGmailIcon();
				  		
				  		if(new SevenTapEmail().isAt()) {
				  			new SevenTapEmail().enterEmailAddress();
				  			new SevenTapEmail().clickSendButton();}
				  		
			  			new CodeVerifiedPage().clickContinueOnboardingButton();}
				  		
				      utils.log().info("EC-0015-1805 - The mobile device cannot connect to your Router");
			  }catch(EC_0015_1805_OTP_Screen_Continue_Onboarding e) { 
				  new EC_0015_1805_OTP_Screen_Continue_Onboarding("EC-0015-1805 - The mobile device cannot connect to your Router", e);
			  }
			  
			  new OptimizeYourNetworkPage().clickSkipOptimizeButton();
			  new SetupHomeNetworkPage().clickNextButton();
			  new UnPackYourBoxPage().clickNextButton();
			  new PlugInMaxRouterPage().clickNextButton();
			  super.pause(20);
			  new ConnectMaxRouterToMobileDevicePage().clickNextButton();
			  super.pause(10);
			  try {
				  if(new ServiceNotAvailablePage().error_code_0003_1003.isDisplayed() || new ServiceNotAvailablePage().error_code_0003_1014.isDisplayed())
					  new TapSevenTimes().tapSeven();
				  
			  		if(new SevenTapLogs().isAt()) 
			  			new SevenTapLogs().clickYesButton();
			  		
			  		if(new SevenTapGmail().isAt()) 
			  			new SevenTapGmail().clickGmailIcon();
			  		
			  		if(new SevenTapEmail().isAt()) {
			  			new SevenTapEmail().enterEmailAddress();
			  			new SevenTapEmail().clickSendButton();}
			  		
			  	  	  utils.log().info("EC-0003-1014/1003 - Service is currently not available.  We are exeperncing an issue connecting to our back office");
			  	}catch(EC_0003_1014_Service_Not_Available e) { 
					  new EC_0015_1805_OTP_Screen_Continue_Onboarding("EC-0003-1014/1003 - Service is currently not available.  We are exeperncing an issue connecting to our back office", e);
				  }
			  
			  new ConnectMaxRouterToInternetPage().clickNextButton();
			  super.pause(5);
			  new SystemFirmwareUpdatePage().clickNextButton();
			  super.pause(10);
			  new ErrorCode_0000_1506_Warranty_Support_Page().clickContinueButton();	 
			  new NameYourNetwokSSIDPage().enterSSIDName(this.ssidName);
			  new NameYourNetwokSSIDPage().enterSSIDPassword(this.ssidpass);
			  new NameYourNetwokSSIDPage().clickNextButton();
			  super.pause(25);
			  new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
			  super.pause(15);
			  new ConnectionToWifiNeededPage().clickContinue();
			  super.pause(20);
			  new CongratulationsPage().clickContinueButton();
			  super.pause(5);
			  new SetUpYourWiFiManagementPage().clickskipTutorialButton();
			  new InstallAdditionalSatellitePage().clickInstallLaterButton();
			  super.pause(5);
			  new NetworkOptimizationDialog().clickOkButton();
			  super.pause(5);
			  new HomePage().getSSIDName();  
	  }
}

