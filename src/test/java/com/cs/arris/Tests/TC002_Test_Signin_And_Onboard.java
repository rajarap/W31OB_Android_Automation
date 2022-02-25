package com.cs.arris.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Pages.SiginPage;
import com.cs.arris.Utilities.TestUtils;
import com.cs.arris.Workflows.TC51_Signin_And_Onboard_Workflow;


public class TC002_Test_Signin_And_Onboard extends ParentClass
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

			} catch(Exception e) {
			 e.printStackTrace();
		} 
     }
	
	
	  @BeforeMethod
	  public void beforeMethod(Method m) {
		  utils.log().info("\n" + "\n" + "****** starting test : " + m.getName() + " ******" + "\n");
	  }
	  
	  @Test(priority = 1)
	  public void Verify_Signin_And_Onboard()
	  {
		  TC51_Signin_And_Onboard_Workflow.getStartedPage(getStarted -> {
			  getStarted.clickGetStartedButton();
		  }).grantPermissionsPage(grantPermission -> {
			  grantPermission.clickContinueButton();
		  }).deviceLocationPage(deviceLocation -> {
			  deviceLocation.clickAllow();
		  }).accessResourcesOnDevicePage(accessResoucesOnDevice -> {
			  super.pause(3);
			  accessResoucesOnDevice.clickAllow();
		  }).selectYourDevicePage(selectDevice -> {
			  selectDevice.selectSurfboardMaxOption();
			  selectDevice.clickNextButton();
		  }).selectYourDevicePage2(selectDevice2 -> {
			  selectDevice2.selectMaxProAX11000RadioButton();
			  selectDevice2.clickNextButton();
			  super.pause(3);
		  }).welcomeSigninPage(signin -> {
			  signin.enterEmailAddress(email);
			  signin.clickSigninButton();
			  super.pause(20);
		  }).getOTPCode(getOTP -> {
			  passCode = getOTP.getValidOTP();
	  		}).enterOTPPage(otpverify -> {
			  otpverify.enterValidPassCode(passCode);
	  		 }).codeVerifiedPage(codeVerified -> {
				  codeVerified.getCodeVerifiedText();
				  codeVerified.clickNextButton();
				  super.pause(35);
				  try{
					  if(codeVerified.continueOnBoardingButton.isDisplayed()){
						  codeVerified.clickContinueOnboardingButton();}
				  }catch(Exception e){
					  e.getMessage();}
		  }).optimizeYourNetworkPage(optimize -> {
			  optimize.clickSkipOptimizeButton();
		  }).setUpHomeNetworkPage(homeNetwork -> {
			  homeNetwork.clickNextButton();
		  }).unPackYourBoxPage(unpackBox -> {
			  unpackBox.clickNextButton();
		  }).plugInYourMaxRouterPage(pluginRouter -> {
			  pluginRouter.clickNextButton();
			  super.pause(40);
		  }).maxRouterConnectedToMobilePage(connectedRouterToMobile -> { //successfully connected (max router connected to your mobile)
			  connectedRouterToMobile.clickNextButton();
			  super.pause(15);
			//add 0002-1304 - Internet Connection Not available on Router
		  }).maxRouterConnectedToInternetPage(connecedRouterToInternet -> {  //successfully connected to internet
			  connecedRouterToInternet.clickNextButton();
			  super.pause(40);
		  }).systemFirmwareUpdatePage(firmwareUpdate -> { //system is already up to date
			  firmwareUpdate.clickNextButton();  //registering the device
			  super.pause(30);
		  }).warrantyAndSupportPage(warrantyAndSupport -> { //something went wrong.. warranty and registration failed as the server is not reachable
			  warrantyAndSupport.clickContinueButton();
		  }).nameYourNetworkPage(nameYourNetwork -> {
			  nameYourNetwork.enterSSIDName(this.ssidName);
			  nameYourNetwork.enterSSIDPassword(this.ssidpass);
			  super.getDriver().hideKeyboard();
			  nameYourNetwork.clickNextButton();
			  super.pause(25);
		  }).connectNeeded(connectionRequired -> { //connect SSID network to wifi
			  super.pause(15);
			  connectionRequired.turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
			  super.pause(15);
			  connectionRequired.clickContinue();
			  super.pause(20);
		  }).congratulations(congrats -> {
			  congrats.clickContinueButton();
			  super.pause(5);
		  }).setupWifi(setupwifi ->{
			  setupwifi.clickskipTutorialButton();
			  super.pause(5);
		  }).installSatellite(insatellite -> {
			  insatellite.clickInstallLaterButton();
			  super.pause(5);
		  }).networkOptimization(optimization -> {
			  optimization.clickOkButton();
			  super.pause(25);
	  	  }).homePage(homepage -> {		//Network optimization dialog2 is included inside homepage
	  		  homepage.clickOkButton();
		  });
	  }
}
