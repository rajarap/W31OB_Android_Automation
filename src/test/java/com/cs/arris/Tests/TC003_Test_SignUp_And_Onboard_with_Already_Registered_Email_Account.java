package com.cs.arris.Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
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

public class TC003_Test_SignUp_And_Onboard_with_Already_Registered_Email_Account extends ParentClass
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
	  
 
	  @Test(priority = 1)
	  public void Verify_SignIn_And_Onboard_With_Already_Registered_Email_Account()
	  {
		  try {
			new GetStartedPage().clickGetStartedButton();
			new GrantPermissionsPage().clickContinueButton();
			new DeviceLocationPage().clickAllow();
			new AccessResourcesOnDevicePage().clickAllow();
			new SelectYourDevicePage().selectSurfboardMaxOption();
			new SelectYourDevicePage().clickNextButton();
			new SelectYourDevicePage2().selectMaxProAX11000RadioButton();
			new SelectYourDevicePage2().clickNextButton();
			new SiginPage().enterEmailAddress(email);
			new SiginPage().clickSigninButton();
			  super.pause(20);
			  passCode = new ValidOTP().getValidOTP();	  
			  new EnterValidOTPPage().enterValidPassCode(passCode);
			  new CodeVerifiedPage().getCodeVerifiedText();
			  new CodeVerifiedPage().clickNextButton();
			  super.pause(3);
			  new OptimizeYourNetworkPage().clickSkipOptimizeButton();
			  new SetupHomeNetworkPage().clickNextButton();
			  new UnPackYourBoxPage().clickNextButton();
			  new PlugInMaxRouterPage().clickNextButton();
			  super.pause(20);
			  new ConnectMaxRouterToMobileDevicePage().clickNextButton();
			  super.pause(10);	  
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
	  }catch(Exception e) {
				  new TapSevenTimes().tapSeven();
				  super.pause(3);
			  	  new SevenTapLogs().clickYesButton();
			  	  super.pause(3);
			  	  new SevenTapGmail().clickGmailIcon();
			  	  super.pause(3);
		  		  new SevenTapEmail().enterEmailAddress();
		  		 super.pause(3);
		  		  new SevenTapEmail().clickSendButton();}
	  }
}

