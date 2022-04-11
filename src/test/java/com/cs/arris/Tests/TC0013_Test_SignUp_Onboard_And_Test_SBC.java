package com.cs.arris.Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ISuite;
import org.testng.ITestContext;
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
import com.cs.arris.Pages.AddDeviceAccessCameraDialog;
import com.cs.arris.Pages.AddDeviceActivateYourDeviceWithServiceProviderPage;
import com.cs.arris.Pages.AddDeviceChooseInternetServiceProviderPage;
import com.cs.arris.Pages.AddDeviceCongratulationsPage;
import com.cs.arris.Pages.AddDeviceEnterMACAddressManuallyPage;
import com.cs.arris.Pages.AddDeviceEstablishingConnectionPage;
import com.cs.arris.Pages.AddDeviceHomePage;
import com.cs.arris.Pages.AddDeviceLetsStartWithDeviceConnectionPage;
import com.cs.arris.Pages.AddDeviceRegistrationFailedPage;
import com.cs.arris.Pages.AddDeviceScanBarCodePage;
import com.cs.arris.Pages.AddDeviceSelectDevice1Page;
import com.cs.arris.Pages.AddDeviceSelectDevice2Page;
import com.cs.arris.Pages.AddDeviceStepsForActivationPage;
import com.cs.arris.Pages.AddDeviceSuccessPage;
import com.cs.arris.Pages.AddSatelliteAddNewSatellitePage1;
import com.cs.arris.Pages.AddSatelliteAddNewSatellitePage2;
import com.cs.arris.Pages.AddSatelliteCongratulationsPage;
import com.cs.arris.Pages.AddSatelliteInstallAdditionalSatelliteDialog;
import com.cs.arris.Pages.AddSatellitePlaceYourSatellitePage;
import com.cs.arris.Pages.AddSatellitePlugInYourSatellitePage;
import com.cs.arris.Pages.AddSatelliteRegistrationFailedPage;
import com.cs.arris.Pages.AddSatelliteSuccessfullyConnectedPage;
import com.cs.arris.Pages.AddSatelliteSuccessfullyConnectedToInternetPage;
import com.cs.arris.Pages.AddSatelliteUnpackYourSatellitePage;
import com.cs.arris.Pages.AddSatelliteUpToDatePage;
import com.cs.arris.Pages.AppRatingDialog;
import com.cs.arris.Pages.AttentionPage;
import com.cs.arris.Pages.BTConnectionsPage;
import com.cs.arris.Pages.BTPairingPage;
import com.cs.arris.Pages.BTPairingPanelPage;
import com.cs.arris.Pages.BTSettingsPage;
import com.cs.arris.Pages.BTSwipePage;
import com.cs.arris.Pages.BTUnPairingPage;
import com.cs.arris.Pages.BTUnPairingRouterPage;
import com.cs.arris.Pages.BandSteeringModeAlertInfoDialog;
import com.cs.arris.Pages.BlueToothConnectionFailedPage;
import com.cs.arris.Pages.BlueToothConnectionFailedTroubleShootPage;
import com.cs.arris.Pages.BlueToothConnectionFailedTroubleShootProceedPage;
import com.cs.arris.Pages.BlueToothPage;
import com.cs.arris.Pages.CodeVerifiedPage;
import com.cs.arris.Pages.CongratulationsPage;
import com.cs.arris.Pages.ConnectMaxRouterToInternetPage;
import com.cs.arris.Pages.ConnectMaxRouterToMobileDevicePage;
import com.cs.arris.Pages.ConnectionToWifiNeededPage;
import com.cs.arris.Pages.DeviceLocationPage;
import com.cs.arris.Pages.DeviceSignalStrengthLeaderBoardPage;
import com.cs.arris.Pages.DevicesPage;
import com.cs.arris.Pages.EnterValidOTPPage;
import com.cs.arris.Pages.ErrorCode_0000_1506_Warranty_Support_Page;
import com.cs.arris.Pages.GetStartedPage;
import com.cs.arris.Pages.GrantPermissionsPage;
import com.cs.arris.Pages.HomeNetowrkTurnOffNetworkOptimizationDialog;
import com.cs.arris.Pages.HomePage;
import com.cs.arris.Pages.HomeSpeedTestHistoryPage;
import com.cs.arris.Pages.InstallAdditionalSatellitePage;
import com.cs.arris.Pages.InternetConnectionNotAvailable;
import com.cs.arris.Pages.MainDeviceAllTabPage;
import com.cs.arris.Pages.MaximumVerificationReachedPage;
import com.cs.arris.Pages.MultipleDevicesFoundPage;
import com.cs.arris.Pages.NameYourNetwokSSIDPage;
import com.cs.arris.Pages.NetworkOptimizationDialog;
import com.cs.arris.Pages.NetworkOptimizationDialog2;
import com.cs.arris.Pages.NetworkPage;
import com.cs.arris.Pages.OptimizeYourNetworkPage;
import com.cs.arris.Pages.ParentalControlWithProfilesPage;
import com.cs.arris.Pages.PlugInMaxRouterPage;
import com.cs.arris.Pages.ResendOTPDialog;
import com.cs.arris.Pages.SelectYourDevicePage;
import com.cs.arris.Pages.SelectYourDevicePage2;
import com.cs.arris.Pages.ServiceNotAvailablePage;
import com.cs.arris.Pages.SetUpYourWiFiManagementPage;
import com.cs.arris.Pages.SetupHomeNetworkPage;
import com.cs.arris.Pages.SiginPage;
import com.cs.arris.Pages.SignupPage;
import com.cs.arris.Pages.SpeedTestPage;
import com.cs.arris.Pages.SystemFirmwareUpdatePage;
import com.cs.arris.Pages.TermsAndConditionsPage;
import com.cs.arris.Pages.UnPackYourBoxPage;
import com.cs.arris.Pages.WideBandModeAlertInfoDialog;
import com.cs.arris.Utilities.Direction;
import com.cs.arris.Utilities.EmailTest;
import com.cs.arris.Utilities.KillAndRelaunchApp;
import com.cs.arris.Utilities.ResetMAXRouter;
import com.cs.arris.Utilities.SerialComPortCommunicator;
import com.cs.arris.Utilities.SevenTapEmail;
import com.cs.arris.Utilities.SevenTapGmail;
import com.cs.arris.Utilities.SevenTapLogs;
import com.cs.arris.Utilities.SwipeActions;
import com.cs.arris.Utilities.TapSevenTimes;
import com.cs.arris.Utilities.TestUtils;
import com.cs.arris.Utilities.ValidOTP;
import com.cs.arris.Workflows.TC50_SignUp_And_Onboard_Workflow;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TC0013_Test_SignUp_Onboard_And_Test_SBC extends ParentClass
{
	TestUtils utils = new TestUtils();
	String firstName;
	String lastName;
	String email;
	String passCode;
	String ssidName;
	String ssidpass;
	String udid;
	String logsEmail;
	String localWifi;
	String localWifiPwd;
	

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
			    
			  this.ssidName = super.generateRouterSSID();
			  utils.log().info("SSID Name : " + this.ssidName);
			  
			  this.ssidpass = properties.getProperty("ssidpwd");
			  utils.log().info("SSID Password : " + this.ssidpass);
			  
			  this.localWifi = properties.getProperty("localWifi");
			  this.localWifiPwd = properties.getProperty("localWifiPwd");
			  	  
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
		  public void Verify_SignUp_And_Onboard()
		  {
			  try {
				  super.pause(10);
			      new GetStartedPage().clickGetStartedButton();
				  new GrantPermissionsPage().clickContinueButton();
			  	  new DeviceLocationPage().clickAllow();
				  super.pause(2);
				  new AccessResourcesOnDevicePage().clickAllow();
				  new SelectYourDevicePage().selectSurfboardMaxOption();
				  new SelectYourDevicePage().clickNextButton();
				  new SelectYourDevicePage2().selectMaxProAX11000RadioButton();
				  new SelectYourDevicePage2().clickNextButton();
				  new SiginPage().clickSignUpButton();
				  email = new SignupPage().getEmailAddress(); 
				  new SignupPage().enterValidEmailAddress(email+"@mail7.io");
				  new SignupPage().enterFirstName(firstName);
				  new SignupPage().enterLastName(lastName);
				  new SignupPage().clickAgreeTermsAndConditionsCheckBox();
				  super.pause(5);
				  
				  if(new TermsAndConditionsPage().isAt()) 
				  {
					for(int i=1; i<=17; i++) {
						super.swipeUp();
					}

						if(new TermsAndConditionsPage().understandAndAgreeButton.isEnabled()) {
							new TermsAndConditionsPage().clickUnderstandAndAgreeButton();
							super.pause(3);
							new SignupPage().clickSignupButton();
							new EnterValidOTPPage().enterInValidPassCode("123456");
							 Assert.assertTrue(new EnterValidOTPPage().verifyInvalidPassCodeMessage());
							 new EnterValidOTPPage().clickResendLink();
							 new ResendOTPDialog().clickOKButton();
							 super.pause(15);
							 new EnterValidOTPPage().clearOtpTextBox();
							new EnterValidOTPPage().enterValidPassCode(email);
							super.pause(3);
							new CodeVerifiedPage().getCodeVerifiedText();
							new CodeVerifiedPage().clickNextButton();
						}
					}
				  new OptimizeYourNetworkPage().clickSkipOptimizeButton();
				  new SetupHomeNetworkPage().clickNextButton();
				  new UnPackYourBoxPage().clickNextButton();
				  
					try {
						if (new PlugInMaxRouterPage().isAt()) {
							new PlugInMaxRouterPage().clickNextButton();
						}

						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								super.pause(120);
							}
						} catch (Exception e5) {
						}

						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								super.pause(120);
							}
						} catch (Exception e7) {
						}

						try {
							if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
								new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
								new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
								super.pause(120);
							}
						} catch (Exception e8) {
						}
					} catch (Exception e9) {
						super.pause(120);
						new TapSevenTimes().tapSeven();
						super.pause(5);
						new SevenTapLogs().clickYesButton();
						super.pause(5);
						new SevenTapGmail().clickGmailIcon();
						super.pause(5);
						new SevenTapEmail().enterEmailAddress();
						super.pause(5);
						new SevenTapEmail().clickSendButton();
						super.pause(5);
						Assert.fail("Main AP Onboarding - Unable to connect Max Router to your Mobile Device due to blue tooth connection failure1");
						new KillAndRelaunchApp().killApp();
					}

					try {
						super.waitForVisibility(new ConnectMaxRouterToMobileDevicePage().nextButton);
						if (new ConnectMaxRouterToMobileDevicePage().isAt()) {
							new ConnectMaxRouterToMobileDevicePage().clickNextButton();
						}

						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								utils.log().info("Waiting for 120 seconds for device to establish bluetooth connection with the router");
							}
						} catch (Exception e5) {
						}

						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								utils.log().info("Waiting for 120 seconds for device to establish bluetooth connection with the router");
							}
						} catch (Exception e7) {
						}

						try {
							if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
								new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
								new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
								utils.log().info("Waiting for 120 seconds for device to establish bluetooth connection with the router");
							}
						} catch (Exception e8) {
						}
					} catch (Exception e9) {
						super.pause(120);
						new TapSevenTimes().tapSeven();
						super.pause(5);
						new SevenTapLogs().clickYesButton();
						super.pause(5);
						new SevenTapGmail().clickGmailIcon();
						super.pause(5);
						new SevenTapEmail().enterEmailAddress();
						super.pause(5);
						new SevenTapEmail().clickSendButton();
						super.pause(5);
						Assert.fail(
								"Main AP Onboarding - Unable to connect Max Router to your Mobile Device due to blue tooth connection failure2");
						new KillAndRelaunchApp().killApp();
					}
					
					try {
						super.waitForVisibility(new ConnectMaxRouterToInternetPage().nextButton);
						if (new ConnectMaxRouterToInternetPage().isAt()) {
							new ConnectMaxRouterToInternetPage().clickNextButton();
						}

						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								utils.log().info("Waiting for 120 seconds for device to establish bluetooth connection with the router");
								super.pause(120);
							}
						} catch (Exception e5) {
						}

						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								utils.log().info("Waiting for 120 seconds for device to establish bluetooth connection with the router");
								super.pause(120);
							}
						} catch (Exception e7) {
						}

						try {
							if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
								new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
								new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
								utils.log().info("Waiting for 120 seconds for device to establish bluetooth connection with the router");
								super.pause(120);
							}
						} catch (Exception e8) {
						}
					} catch (Exception e9) {
						super.pause(120);
						new TapSevenTimes().tapSeven();
						super.pause(5);
						new SevenTapLogs().clickYesButton();
						super.pause(5);
						new SevenTapGmail().clickGmailIcon();
						super.pause(5);
						new SevenTapEmail().enterEmailAddress();
						super.pause(5);
						new SevenTapEmail().clickSendButton();
						super.pause(5);
						Assert.fail("Main AP Onboarding - Unable to connect you Max Router to the Internet");
						new KillAndRelaunchApp().killApp();
					}

				  super.waitForVisibility(new SystemFirmwareUpdatePage().nextButton);
				  new SystemFirmwareUpdatePage().clickNextButton();
				  new ErrorCode_0000_1506_Warranty_Support_Page().clickContinueButton();	 
				  new NameYourNetwokSSIDPage().enterSSIDName(this.ssidName);
				  new NameYourNetwokSSIDPage().enterSSIDPassword(this.ssidpass);
				  new NameYourNetwokSSIDPage().clickNextButton();
				  utils.log().info("Waiting for 35 seconds for device to connect with the router SSID");
				  super.pause(35);
				  new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
				  super.pause(15);
				  try {
					  if(new ConnectionToWifiNeededPage().isAt()) {
						  new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
						  new ConnectionToWifiNeededPage().clickContinue();
						  utils.log().info("Waiting for 35 seconds for device to connect with the router SSID");
						  super.pause(35);
						  }
				  }catch(Exception e) {
					  
				  }
				  new CongratulationsPage().clickContinueButton();
				  new SetUpYourWiFiManagementPage().clickskipTutorialButton();
				  new InstallAdditionalSatellitePage().clickInstallLaterButton();
				  new NetworkOptimizationDialog().clickOkButton();
				  super.pause(30);
				  try {
					  if(new NetworkOptimizationDialog2().okButton.isDisplayed()) 
						  new NetworkOptimizationDialog2().clickOkButton();
					  }catch(Exception e) {}
				  utils.log().info("Waiting for 60 seconds for the Wifi connection to stabilize on the homepage");
				  super.pause(30);
				  
				  
				  try {
					  if(new HomePage().banner.isDisplayed()){
						  new HomePage().ConnectToMaxRouter(this.ssidName, this.ssidpass, this.udid);
					  }else {utils.log().info("Remote access to your network is currently available");}
					 }catch(Exception e) {}
				  
				  new HomePage().getSSIDName();  
				  
			  }catch(Exception e) {
				  super.pause(120);
				  new TapSevenTimes().tapSeven();
				  super.pause(5);
				  new SevenTapLogs().clickYesButton();
				  super.pause(5);
				  new SevenTapGmail().clickGmailIcon();
				  super.pause(5);
				  new SevenTapEmail().enterEmailAddress();
				  super.pause(5);
				  new SevenTapEmail().clickSendButton();
				  super.pause(5);
				  Assert.fail("Main AP Onboarding - Unable to onboard your Main Max Router ");
				  new KillAndRelaunchApp().killApp();
			  }
		  }
		
		@Test(priority = 2, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
		public void Verify_Add_Device_Menu() {
			utils.log().info("                                             ");
			utils.log().info("*********************************************");
			utils.log().info("Test: Hamburger Menu - Add and Remove Device ");
			utils.log().info("*********************************************");
			
			SoftAssert softhome2 = new SoftAssert();
			
	//		new HomePage().getFooterIconsPageObject().clickHomeButton();
			try {
				if (new HomePage().isAt())
					softhome2.assertTrue(new HomePage().clickNavigationButton());
				
				if(new HomePage().getHamburgerMenuPageObject().isAt()) {
					softhome2.assertTrue(new HomePage().getHamburgerMenuPageObject().verifyUIOnHamburgerMenuPage());
					softhome2.assertTrue(new HomePage().getHamburgerMenuPageObject().clickAddDeviceButton());
				}

				if (new AddDeviceSelectDevice1Page().isAt()) {
					softhome2.assertTrue(new AddDeviceSelectDevice1Page().selectISPCableRadioButton());
					softhome2.assertTrue(new AddDeviceSelectDevice1Page().clickNextButton());
				}

				if (new AddDeviceSelectDevice2Page().isAt()) {
					softhome2.assertTrue(new AddDeviceSelectDevice2Page().selectT25RadioButton());
					softhome2.assertTrue(new AddDeviceSelectDevice2Page().clickNextButton());
					super.pause(5);
				}

				if (new AddDeviceStepsForActivationPage().isAt())
					softhome2.assertTrue(new AddDeviceStepsForActivationPage().clickStartButton());
				super.pause(5);

				if (new AddDeviceLetsStartWithDeviceConnectionPage().isAt())
					softhome2.assertTrue(new AddDeviceLetsStartWithDeviceConnectionPage().clickNextButton());
				super.pause(5);

				if (new AddDeviceChooseInternetServiceProviderPage().isAt())
					softhome2.assertTrue(new AddDeviceChooseInternetServiceProviderPage().clickNextButton());
				super.pause(5);

				if (new AddDeviceActivateYourDeviceWithServiceProviderPage().isAt())
					softhome2.assertTrue(new AddDeviceActivateYourDeviceWithServiceProviderPage().clickSkipButton());
				super.pause(5);

				if (new AddDeviceEstablishingConnectionPage().isAt())
					softhome2.assertTrue(new AddDeviceEstablishingConnectionPage().clickOnlineButton());
				super.pause(5);

				if (new AddDeviceSuccessPage().isAt())
					softhome2.assertTrue(new AddDeviceSuccessPage().clickNextButton());
				super.pause(5);

				if (new AddDeviceScanBarCodePage().isAt())
					softhome2.assertTrue(new AddDeviceScanBarCodePage().clickScanButton());
				super.pause(5);

				if (new AddDeviceAccessCameraDialog().isAt())
					softhome2.assertTrue(new AddDeviceAccessCameraDialog().clickEnterManuallyButton());
				super.pause(5);

				if (new AddDeviceEnterMACAddressManuallyPage().isAt()) {
					softhome2.assertTrue(new AddDeviceEnterMACAddressManuallyPage().enterSerialNumber());
					softhome2.assertTrue(new AddDeviceEnterMACAddressManuallyPage().enterMACAddress());
					softhome2.assertTrue(new AddDeviceEnterMACAddressManuallyPage().clickNextButton());
					super.pause(15);
				}
				
				try {
					if(new AddDeviceRegistrationFailedPage().continueButton.isDisplayed())
						new AddDeviceRegistrationFailedPage().clickContinueButton();
					super.pause(3);
				}catch(Exception e) {}

				if (new AddDeviceCongratulationsPage().isAt())
					softhome2.assertTrue(new AddDeviceCongratulationsPage().clickContinueButton());
				super.pause(5);
				
			} catch (Exception e) {
				new TapSevenTimes().tapSeven();
				super.pause(3);
				new SevenTapLogs().clickYesButton();
				super.pause(3);
				new SevenTapGmail().clickGmailIcon();
				super.pause(3);
				new SevenTapEmail().enterEmailAddress();
				super.pause(3);
				new SevenTapEmail().clickSendButton();
				new KillAndRelaunchApp().killApp();
				super.pause(3);
				new KillAndRelaunchApp().relaunchApp();
				super.pause(15);
			}
			
			softhome2.assertAll();
		}
		
//		@Test(priority = 2, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Add_Device_Menu" })
//		public void Verify_Cable_Modem_Tab() {
//			SoftAssert softhome0 = new SoftAssert();
//			if(new AddDeviceHomePage().isAt())
//				softhome0.assertTrue(new AddDeviceHomePage().verifyUIOnHomePage());
//			
//			softhome0.assertAll();
//		}
//		
//		@Test(priority = 3, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Add_Device_Menu" })
//		public void Verify_Max_Router_Tab() {
//			SoftAssert softhome3 = new SoftAssert();
//			softhome3.assertTrue(new AddDeviceHomePage().clickMaxRouterTab());
//			softhome3.assertTrue(new AddDeviceHomePage().getHomePageObject().verifyUIOnHomePage());
//			softhome3.assertTrue(new AddDeviceHomePage().clickCableModemTab());
//			
//			softhome3.assertAll();
//		}
		
		
		
		
		@Test(priority = 4, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Add_Device_Menu" })
		public void Verify_Device_Details_Page() {
			SoftAssert softhome4 = new SoftAssert();
			softhome4.assertTrue(new AddDeviceHomePage().clickDeviceDetailsText());
			if(new AddDeviceHomePage().getDeviceDetailsPageObject().isAt()) {
				softhome4.assertTrue(new AddDeviceHomePage().getDeviceDetailsPageObject().verifyDeviceDetailsUI());
				softhome4.assertTrue(new AddDeviceHomePage().getDeviceDetailsPageObject().clickCloseButton());
			}
			
			softhome4.assertAll();
		}
		
		@Test(priority = 5, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Add_Device_Menu" })
		public void Verify_Specifications_Page() {
			SoftAssert softhome5 = new SoftAssert();
			softhome5.assertTrue(new AddDeviceHomePage().clickSpecificationsImage());
			super.pause(5);
			if(new AddDeviceHomePage().getDeviceSpecificationsPageObject().isAt())
				softhome5.assertTrue(new AddDeviceHomePage().getDeviceSpecificationsPageObject().clickBackButton());
			
			softhome5.assertAll();
		}
		
		@Test(priority = 6, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Add_Device_Menu" })
		public void Verify_Add_Additional_Device() {
			SoftAssert softhome6 = new SoftAssert();
			if(new AddDeviceHomePage().isAt())
				softhome6.assertTrue(new AddDeviceHomePage().clickNavigationButton());
				
			if(new AddDeviceHomePage().getHamburgerMenuObject().isAt())
				softhome6.assertTrue(new AddDeviceHomePage().getHamburgerMenuObject().clickAddDeviceButton());
				
			if(new AddDeviceHomePage().getMaxTwoDevicesDialogObject().isAt())
				softhome6.assertTrue(new AddDeviceHomePage().getMaxTwoDevicesDialogObject().clickOkButton());
			
			softhome6.assertAll();
		}
		
		@Test(priority = 7, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Add_Device_Menu" })
		public void Verify_Notifications_Page() {
			SoftAssert softhome7 = new SoftAssert();
			if(new AddDeviceHomePage().isAt())
				softhome7.assertTrue(new AddDeviceHomePage().clickNotificationsIcon());
			
			if(new AddDeviceHomePage().getNotificationsPageObject().isAt())
				softhome7.assertTrue(new AddDeviceHomePage().getNotificationsPageObject().clickBackButton());
			
			softhome7.assertAll();
		}
		
		@Test(priority = 8, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Add_Device_Menu"  })
		public void Verify_User_Guide_Page() {
			SoftAssert softhome8 = new SoftAssert();
			if(new AddDeviceHomePage().isAt())
				softhome8.assertTrue(new AddDeviceHomePage().getAddDeviceFooterIconsPageObject().clickUserGuideButton());
			super.pause(5);

			if(new AddDeviceHomePage().getUserGuidePageObject().isAt())
				super.swipeUp();
				softhome8.assertTrue(new AddDeviceHomePage().getUserGuidePageObject().clickBackButton());
			
			softhome8.assertAll();
		}
		
		@Test(priority = 9, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Add_Device_Menu" })
		public void Verify_FAQ_Page() {
			SoftAssert softhome9 = new SoftAssert();
			if(new AddDeviceHomePage().isAt())
				softhome9.assertTrue(new AddDeviceHomePage().getAddDeviceFooterIconsPageObject().clickFAQButton());
			super.pause(3);
			
			if(new AddDeviceHomePage().getFAQPageObject().isAt())
				super.swipeUp();
				softhome9.assertTrue(new AddDeviceHomePage().getUserGuidePageObject().clickBackButton());
			
			softhome9.assertAll();
		}
		
		@Test(priority = 10, dependsOnMethods = { "Verify_SignUp_And_Onboard"})
		public void Verify_Remove_Device_Page() {
			SoftAssert softhome10 = new SoftAssert();
			try {
				if (new AddDeviceHomePage().isAt())
					softhome10.assertTrue(new AddDeviceHomePage().clickNavigationButton());

				if (new AddDeviceHomePage().getHamburgerMenuObject().isAt())
					softhome10.assertTrue(new AddDeviceHomePage().getHamburgerMenuObject().clickRemoveDeviceeButton());

				if (new AddDeviceHomePage().getRemoveDevicePageObject().isAt()) {
					softhome10.assertTrue(new AddDeviceHomePage().getRemoveDevicePageObject().selectDeviceToRemove());
					softhome10.assertTrue(new AddDeviceHomePage().getRemoveDevicePageObject().clickNextButton());
					super.pause(3);
				}
			} catch (Exception e) {
				new TapSevenTimes().tapSeven();
				super.pause(3);
				new SevenTapLogs().clickYesButton();
				super.pause(3);
				new SevenTapGmail().clickGmailIcon();
				super.pause(3);
				new SevenTapEmail().enterEmailAddress();
				super.pause(3);
				new SevenTapEmail().clickSendButton();
			}

			softhome10.assertAll();
		}
		
		
			
		//TC008_Login_And_Test_Hamburger_Menu_And_Settings_About_Help_Page
				@Test(priority = 11, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Hamburger_Menu_Settings_UI_Page() {
					utils.log().info("                                                             ");
					utils.log().info("*************************************************************");
					utils.log().info("Test: Hamburger Menu - Settings, About and Help Menu Options ");
					utils.log().info("*************************************************************");
					SoftAssert softburger3 = new SoftAssert();
					new HomePage().getFooterIconsPageObject().clickHomeButton();
					softburger3.assertTrue(new HomePage().clickNavigationButton());
					softburger3.assertTrue(new HomePage().getHamburgerMenuPageObject().clickSettingsButton());
					if(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().isAt())
						softburger3.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().verifyUIOnSettingsPage());
						//softburger3.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickBackButton());
					softburger3.assertAll();
				}
				
				@Test(priority = 12, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Hamburger_Menu_Settings_Sign_Out() {
					SoftAssert softburger4 = new SoftAssert();
					String userEmail = new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().getUserEmailAddress();
					softburger4.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickSignOutButton());
					new SiginPage().emailAddress.getText();
					try {
						if(userEmail.equals(new SiginPage().emailAddress.getText())) {
							softburger4.assertTrue(new SiginPage().clickSigninButton());
							super.pause(5);	}
					}catch(Exception e) {}
					softburger4.assertAll();
				}
				
//				@Test(priority = 13, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
//				public void Verify_Hamburger_Menu_Settings_Help_Page() {
//					SoftAssert softburger5 = new SoftAssert();
////					softburger5.assertTrue(new HomePage().clickNavigationButton());
////					if(new HomePage().getHamburgerMenuPageObject().isAt()) {
//					softburger5.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickHelpIcon());
//					softburger5.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().getSettingsHelpPageObject().clickCloseButton());
//					softburger5.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickBackButton());
//					
//					softburger5.assertAll();
//				}
				

				@Test(priority = 14, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Hamburger_Menu_About_UI_Page() {
					SoftAssert softburger6 = new SoftAssert();
					softburger6.assertTrue(new HomePage().clickNavigationButton());
					if(new HomePage().getHamburgerMenuPageObject().isAt()) 
						softburger6.assertTrue(new HomePage().getHamburgerMenuPageObject().clickAboutAppButton());
					
//					if(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().isAtAboutPage())
//						softburger6.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().verifyUIOnAboutPage());
					
					softburger6.assertAll();
				}
				
				@Test(priority = 15, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Hamburger_Menu_About_License_Page() {
					SoftAssert softburger7 = new SoftAssert();
					softburger7.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickLicenseButton());
					super.pause(8);
					if(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().getLicensesPageObject().isAt())
					{
						//softburger7.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().getLicensesPageObject().verifyUIOnLicensesPage());
						softburger7.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().getLicensesPageObject().clickCloseButton());
					}
					softburger7.assertAll();
				}
				
				@Test(priority = 16, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Hamburger_Get_Another_Max_Page() {
					SoftAssert softburger8 = new SoftAssert();
					if(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().isAtAboutPage())
						softburger8.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickGetAnotherMaxRouterButton());
					softburger8.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickBackButton());
						
					softburger8.assertAll();
				}
				
//				@Test(priority = 17, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
//				public void Verify_Hamburger_About_Help_Page() {
//					SoftAssert softburger9 = new SoftAssert();
//					softburger9.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickHelpIcon());
//					softburger9.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().getAboutHelpPageObject().clickCloseButton());
//					softburger9.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickBackButton());
//					
//					softburger9.assertAll();
//				}
				
				@Test(priority = 18)
				public void Verify_Hamburger_Surfboard_Help_UI_Page() {
					SoftAssert softburger10 = new SoftAssert();
					softburger10.assertTrue(new HomePage().clickNavigationButton());
					if(new HomePage().getHamburgerMenuPageObject().isAt()) 
						softburger10.assertTrue(new HomePage().getHamburgerMenuPageObject().clickHelpMenuButton());
					
//					if(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().isAtHelpPage())
//						softburger10.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().verifyUIOnHelpPage());
					
					softburger10.assertAll();
				}
					
				@Test(priority = 19, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Hamburger_Surfboard_FAQ_Help_Page() {
					SoftAssert softburger11 = new SoftAssert();
					softburger11.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickFAQButton());
					super.pause(5);
					if(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().getFAQHelpPageObject().isAt()) {
						//softburger11.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().getFAQHelpPageObject().verifyUIOnFAQHelpPage());
						softburger11.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().getFAQHelpPageObject().clickBackButton());}
					
					softburger11.assertAll();
				}
				
				@Test(priority = 20, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Hamburger_Surfboard_Self_Help_Page() {
					SoftAssert softburger12 = new SoftAssert();
					softburger12.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickSelfHelp());
					
					softburger12.assertAll();
				}
				
				@Test(priority = 21, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Hamburger_Surfboard_Chat_With_US_Page() {
					SoftAssert softburger13 = new SoftAssert();
					softburger13.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickLiveChatHelp());
					softburger13.assertTrue(new HomePage().getHamburgerMenuPageObject().getSettingAboutHelpPageObject().clickBackButton());
					
					softburger13.assertAll();
				}	
				
				
				//TC009_Login_And_Test_Hamburger_Menu_Amazon_Feature
				@Test(priority = 22, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Amazon_Features_UI_Page() {
					SoftAssert softfeatures3 = new SoftAssert();
					new HomePage().getFooterIconsPageObject().clickHomeButton();
					softfeatures3.assertTrue(new HomePage().clickNavigationButton());
					softfeatures3.assertTrue(new HomePage().getHamburgerMenuPageObject().clickAmazonFeaturesButton());
//					if(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().isAt())
//						softfeatures3.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().verifyUIOnAFFSPage());
				}
				
				@Test(priority = 23, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Get_Alexa_Skills_Drop_Down_Box() {
					SoftAssert softfeatures4 = new SoftAssert();
					softfeatures4.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().clickGetAlexaSkillsButton());
					softfeatures4.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().alexaSkillsContent.isDisplayed());
					softfeatures4.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().clickAlexaSkillsButtonAgain());
				}
				
				@Test(priority = 24, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Show_Password_Button() {
					SoftAssert softfeatures5 = new SoftAssert();
					softfeatures5.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().clickShowPasswordButton());
					//softfeatures5.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().getPasswordText());
					softfeatures5.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().clickShowPasswordButton());
					//softfeatures5.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().getPasswordText());
				}
				
				@Test(priority = 25, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Copy_Password() {
					SoftAssert softfeatures6 = new SoftAssert();
					softfeatures6.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().clickCopyPasswordButton());
					if(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().clickCopyPasswordOKButton());
				}
				
//				@Test(priority = 26, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
//				public void Verify_Amazon_Alexa_Skills_Link() {
//					SoftAssert softfeatures7 = new SoftAssert();
//					softfeatures7.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().clickAlexaSkillsLink());
//				}
				
//				@Test(priority = 27, , dependsOnMethods = { "Verify_SignUp_And_Onboard" })
//				public void Verify_Please_Tap_Here_Link() {
//					SoftAssert softfeatures6 = new SoftAssert();
//					softfeatures6.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().clickPleaseTapHereLink());
//				}

				@Test(priority = 28, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
				public void Verify_Enable_AFFS_Feature() {
					SoftAssert softfeatures9 = new SoftAssert();
					softfeatures9.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().enableAFFS());
					if(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().getAmazonWifiSimpleSetupPageObject().isAt())
						softfeatures9.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().getAmazonWifiSimpleSetupPageObject().clickCloseButton());
					softfeatures9.assertTrue(new HomePage().getHamburgerMenuPageObject().getAmazonFeaturesPageObject().clickBackButton());
				}
			
		
				@Test(priority = 29, dependsOnMethods = { "Verify_SignUp_And_Onboard"})
				public void Verify_Speed_Test_Page() {
					utils.log().info("                                          ");
					utils.log().info("******************************************");
					utils.log().info("Test: Speed Test and Speed Test History   ");
					utils.log().info("******************************************");
					SoftAssert softspeedtest2 = new SoftAssert();
					softspeedtest2.assertTrue(new HomePage().clickNavigationButton());
					if(new HomePage().getHamburgerMenuPageObject().isAt()) 
					{
						if(new HomePage().getHamburgerMenuPageObject().speedTest.isDisplayed())
							softspeedtest2.assertTrue(new HomePage().getHamburgerMenuPageObject().clickSpeedTestButton());
						try {
							if(new AppRatingDialog().isAt())
								new AppRatingDialog().clickRemindMeLaterLink();
						}catch(Exception e){}
					}
//					if(new SpeedTestPage().isAt())
//					{
//						softspeedtest2.assertTrue(new SpeedTestPage().verifyUIOnSpeedTestPage());
//					}
			  }
			  
			  @Test(priority = 30, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Speed_Test_Page"})
				public void Verify_Perform_Speed_Test() {
					SoftAssert softspeedtest3 = new SoftAssert();
					for (int i = 0; i < 3; i++)	{
						softspeedtest3.assertTrue(new SpeedTestPage().performSpeedTest());
					}
					softspeedtest3.assertTrue(new SpeedTestPage().clickBackButton());
				}
			  
//			  @Test(priority = 31, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Speed_Test_Page"})
//				public void Verify_Speed_Test_Help_page() {
//					SoftAssert softspeedtest4 = new SoftAssert();
//					softspeedtest4.assertTrue(new SpeedTestPage().clickHelpButton());
//					softspeedtest4.assertTrue(new SpeedTestPage().getSpeedTestHelpPageObject().clickCloseButton());
//					softspeedtest4.assertTrue(new SpeedTestPage().clickBackButton());
//					softspeedtest4.assertAll();
//				}
			  
			  @Test(priority = 32, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Speed_Test_Page"})
				public void Verify_Home_Speed_Test_History_Page() {
					SoftAssert softspeedtest5 = new SoftAssert();
					if(new HomePage().isAt()) 
						softspeedtest5.assertTrue(new HomePage().clickSpeedTestHistoryImage());
					
					if(new HomeSpeedTestHistoryPage().isAt())
						softspeedtest5.assertTrue(new HomeSpeedTestHistoryPage().verifyHomeSpeedTestHistory());
					
					softspeedtest5.assertTrue(new HomeSpeedTestHistoryPage().getFooterIconsPageObject().clickHomeButton());
				}
		
		
		
		
		  @Test(priority = 33, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
			public void Verify_Main_Device_UI_On_All_Tab_Page() {
				utils.log().info("                    ");
				utils.log().info("********************");
				utils.log().info("Test: Main Device   ");
				utils.log().info("********************");
				SoftAssert softmain2 = new SoftAssert();
	//			new HomePage().getFooterIconsPageObject().clickHomeButton();
				softmain2.assertTrue(new HomePage().clickMainDeviceImage());
				softmain2.assertTrue(new MainDeviceAllTabPage().verifyUIOnMainDevicePage());		
				softmain2.assertAll();
			}
			
			@Test(priority = 34, dependsOnMethods    = { "Verify_SignUp_And_Onboard", "Verify_Main_Device_UI_On_All_Tab_Page" })
			public void Verify_LED_Settings_UI_On_All_Tab() {
				SoftAssert softmain3 = new SoftAssert();
				softmain3.assertTrue(new MainDeviceAllTabPage().verifyUIOnLedSettings());
				
				softmain3.assertAll();
			}
			
			@Test(priority = 35, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_LED_Settings_UI_On_All_Tab"})
			public void Verify_Decrease_LED_Settings_On_All_Tab_Page() {
				SoftAssert softmain4 = new SoftAssert();
				softmain4.assertTrue(new MainDeviceAllTabPage().decreaseLedBrightnessSettings());
				
				softmain4.assertAll();
			}
			
			@Test(priority = 36, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_LED_Settings_UI_On_All_Tab"})
	  		public void Verify_Increase_LED_Settings_On_All_Tab_Page() {
				SoftAssert softmain5 = new SoftAssert();
				softmain5.assertTrue(new MainDeviceAllTabPage().increaseLedBrightnessSettings());
				
				softmain5.assertAll();
			}
			
			@Test(priority = 37, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_All_Tab_Page"})
			public void Verify_Devices_Count_Validation_On_All_Tab_Page() {
				SoftAssert softmain6 = new SoftAssert();
				softmain6.assertTrue(new MainDeviceAllTabPage().allTabvalidations());
				
				softmain6.assertAll();
			}
			
			@Test(priority = 38, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_All_Tab_Page"})
			public void Verify_Connected_Devices_On_All_Tab_Page() {
				SoftAssert softmain7 = new SoftAssert();
				softmain7.assertTrue(new MainDeviceAllTabPage().verifyConnectedDeviceDetails());
				
				softmain7.assertAll();
			}
			
			@Test(priority = 39, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_All_Tab_Page"})
			public void Verify_Main_Router_Details_On_All_Tab_Page() {
				SoftAssert softmain8 = new SoftAssert();
				softmain8.assertTrue(new MainDeviceAllTabPage().verifyMainRouterDetails());
				super.swipeDown();
				softmain8.assertAll();
			}
			
			@Test(priority = 40, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_All_Tab_Page"})
			public void Verify_Edit_Main_Router_Name_On_All_Tab_Page() {
				SoftAssert softmain9 = new SoftAssert();
				softmain9.assertTrue(new MainDeviceAllTabPage().clickMainDeviceName());
				if(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().isAt())
				{
					softmain9.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().verifyUIOnEditDeviceNameDialog());
					softmain9.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().editMainDeviceName());
					softmain9.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().clickSaveButton());
				}
				
				softmain9.assertAll();
			}
			
//			@Test(priority = 41, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_All_Tab_Page"})
//			public void Verify_Edit_Connected_Device_Name_On_All_Tab_Page() {
//				SoftAssert softmain10 = new SoftAssert();
//					softmain10.assertTrue(new MainDeviceAllTabPage().clickDeviceName(1));
//					if(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().isAt())
//					{
//						softmain10.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().verifyUIOnEditDeviceNameDialog());
//						softmain10.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().editDeviceName());
//						softmain10.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().clickSaveButton());
//					}
//				softmain10.assertAll();
//			}
			
			
			@Test(priority = 42, dependsOnMethods = { "Verify_SignUp_And_Onboard"})
			public void Verify_Main_Device_UI_On_5GHz_Tab_Page() {
				SoftAssert softmain11 = new SoftAssert();
				softmain11.assertTrue(new MainDeviceAllTabPage().click5GhzTab());
		//		if(new MainDeviceAllTabPage().get5GHzPageObject().isAt())
		//			softmain11.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().verifyUIOn5GHzDevicePage());
				softmain11.assertAll();
			}
			
//			@Test(priority = 43)
//			public void Verify_LED_Settings_UI_On_5GHz_Tab_Page() {
//				SoftAssert softmain12 = new SoftAssert();
//				softmain12.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().verifyUIOnLedSettings());
//				softmain12.assertAll();
//			}
//			
//			@Test(priority = 44)
//			public void Verify_Decrease_LED_Settings_On_5GHz_Tab_Page() {
//				SoftAssert softmain13 = new SoftAssert();
//				softmain13.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().decreaseLedBrightnessSettings());
//				
//				softmain13.assertAll();
//			}
//			
//			@Test(priority = 45)
//			public void Verify_Increase_LED_Settings_On_5GHz_Tab_Page() {
//				SoftAssert softmain14 = new SoftAssert();
//				softmain14.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().increaseLedBrightnessSettings());
//				softmain14.assertAll();
//			}
			
			@Test(priority = 46, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_5GHz_Tab_Page"})
			public void Verify_Devices_Count_Validation_On_5GHz_Tab_Page() {
				SoftAssert softmain15 = new SoftAssert();
				softmain15.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().GHz5Tabvalidations());
				softmain15.assertAll();
				
			}
			
			@Test(priority = 47, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_5GHz_Tab_Page"})
			public void Verify_Connected_Devices_On_5GHz_Tab_Page() {
				SoftAssert softmain16 = new SoftAssert();
				softmain16.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().verifyConnectedDeviceDetails());
				softmain16.assertAll();
			}
			
//			@Test(priority = 48)
//			public void Verify_Main_Router_Details_On_5GHz_Tab_Page() {
//				SoftAssert softmain17= new SoftAssert();
//				softmain17.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().verifyMainRouterDetails());
//				super.swipeDown();
//				softmain17.assertAll();
//			}
//			
//			@Test(priority = 49)
//			public void Verify_Edit_Main_Router_Name_On_5GHz_Tab_Page() {
//				SoftAssert softmain18 = new SoftAssert();
//				softmain18.assertTrue(new MainDeviceAllTabPage().clickMainDeviceName());
//				if(new MainDeviceAllTabPage().get5GHzPageObject().getEditMainDeviceNameDialogObject().isAt())
//				{
//					softmain18.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().verifyUIOnEditDeviceNameDialog());
//					softmain18.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().editMainDeviceName1());
//					softmain18.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().clickSaveButton());
//					softmain18.assertTrue(new MainDeviceAllTabPage().clickMainDeviceName());
//					softmain18.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().editMainDeviceName1());
//					softmain18.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().clickSaveButton());
//				}
//				softmain18.assertAll();
//			}
//			
//			@Test(priority = 50)
//			public void Verify_Edit_Connected_Device_Name_On_5GHz_Tab_Page() {
//				SoftAssert softmain19 = new SoftAssert();
//				if (new MainDeviceAllTabPage().get5GHzPageObject().allDevicesCount > 0) {
//					softmain19.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().clickDeviceName(1));
//					if(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().isAt())
//					{
//						softmain19.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().getEditDeviceNameDialogObject().verifyUIOnEditDeviceNameDialog());
//						softmain19.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().getEditDeviceNameDialogObject().editDeviceName1());
//						softmain19.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().getEditDeviceNameDialogObject().clickSaveButton());
//						softmain19.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().clickDeviceName(1));
//						softmain19.assertTrue(new MainDeviceAllTabPage().get5GHzPageObject().getEditDeviceNameDialogObject().editDeviceName1());
//						softmain19.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().getEditDeviceNameDialogObject().clickSaveButton());
//					}
//				}else {
//					utils.log().info("There are no 5.0GHz devices connected to the Main Router ");
//				}
//					
//				softmain19.assertAll();
//			}
			
			
			@Test(priority = 51, dependsOnMethods = { "Verify_SignUp_And_Onboard"})
			public void Verify_Main_Device_UI_On_24GHz_Tab_Page() {
				SoftAssert softmain20 = new SoftAssert();
				softmain20.assertTrue(new MainDeviceAllTabPage().click24GhzTab());
		//		if(new MainDeviceAllTabPage().get24GHzPageObject().isAt())
		//			softmain20.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().verifyUIOn24GHzDevicePage());
				
				softmain20.assertAll();
			}
			
//			@Test(priority = 52)
//			public void Verify_LED_Settings_UI_On_24GHz_Tab_Page() {
//				SoftAssert softmain21 = new SoftAssert();
//				softmain21.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().verifyUIOnLedSettings());
//				
//				softmain21.assertAll();
//			}
//			
//			@Test(priority = 53)
//			public void Verify_Decrease_LED_Settings_On_24GHz_Tab_Page() {
//				SoftAssert softmain22 = new SoftAssert();
//				softmain22.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().decreaseLedBrightnessSettings());
//				
//				softmain22.assertAll();
//			}
//			
//			@Test(priority = 54)
//			public void Verify_Increase_LED_Settings_On_24GHz_Tab_Page() {
//				SoftAssert softmain23 = new SoftAssert();
//				softmain23.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().increaseLedBrightnessSettings());
//				
//				softmain23.assertAll();
//			}
			
			@Test(priority = 55, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_24GHz_Tab_Page"})
			public void Verify_Devices_Count_Validation_On_24GHz_Tab_Page() {
				SoftAssert softmain24 = new SoftAssert();
				softmain24.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().GHz24Tabvalidations());
				softmain24.assertAll();
			}
			
			@Test(priority = 56, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_24GHz_Tab_Page"})
			public void Verify_Connected_Devices_On_24GHz_Tab_Page() {
				SoftAssert softmain25 = new SoftAssert();
				softmain25.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().verifyConnectedDeviceDetails());
				
				softmain25.assertAll();
			}
			
//			@Test(priority = 57)
//			public void Verify_Main_Router_Details_On_24GHz_Tab_Page() {
//				SoftAssert softmain26 = new SoftAssert();
//				softmain26.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().verifyMainRouterDetails());
//				super.swipeDown();
//				softmain26.assertAll();
//			}
//			
//			@Test(priority = 58)
//			public void Verify_Edit_Main_Router_Name_On_24GHz_Tab_Page() {
//				SoftAssert softmain27 = new SoftAssert();
//				softmain27.assertTrue(new MainDeviceAllTabPage().clickMainDeviceName());
//				if(new MainDeviceAllTabPage().get24GHzPageObject().getEditMainDeviceNameDialogObject().isAt())
//				{
//					softmain27.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().verifyUIOnEditDeviceNameDialog());
//					softmain27.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().editDeviceName1());
//					softmain27.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().clickSaveButton());
//					softmain27.assertTrue(new MainDeviceAllTabPage().clickDeviceName(1));
//					softmain27.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().editDeviceName1());
//					softmain27.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().clickSaveButton());
//				}
//				
//				softmain27.assertAll();
//			}
//			
//			@Test(priority = 59)
//			public void Verify_Edit_Connected_Device_Name_On_24GHz_Tab_Page() {
//				SoftAssert softmain28 = new SoftAssert();
//				if (new MainDeviceAllTabPage().get24GHzPageObject().allDevicesCount > 0) {
//					softmain28.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().clickDeviceName(1));
//					if(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().isAt())
//					{
//						softmain28.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().getEditDeviceNameDialogObject().verifyUIOnEditDeviceNameDialog());
//						softmain28.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().getEditDeviceNameDialogObject().editDeviceName1());
//						softmain28.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().getEditDeviceNameDialogObject().clickSaveButton());
//						softmain28.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().clickDeviceName(1));
//						softmain28.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().getEditDeviceNameDialogObject().editDeviceName2());
//						softmain28.assertTrue(new MainDeviceAllTabPage().get24GHzPageObject().getEditDeviceNameDialogObject().clickSaveButton());
//					}
//				}else {
//					utils.log().info("There are no 2.4GHz devices connected to the Main Router ");
//				}
//				
//				softmain28.assertAll();
//			}
			
			@Test(priority = 60, dependsOnMethods = { "Verify_SignUp_And_Onboard"})
			public void Verify_Main_Device_UI_On_Ethernet_Tab_Page() {
				SoftAssert softmain29 = new SoftAssert();
				softmain29.assertTrue(new MainDeviceAllTabPage().clickEthernetTab());
		//		if(new MainDeviceAllTabPage().getEthernetPageObject().isAt())
				//	softmain29.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().verifyUIOnEthernetDevicePage());
				
				softmain29.assertAll();
			}
			
//			@Test(priority = 61)
//			public void Verify_LED_Settings_UI_On_Ethernet_Tab_Page() {
//				SoftAssert softmain30 = new SoftAssert();
//				softmain30.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().verifyUIOnLedSettings());
//				
//				softmain30.assertAll();
//			}
//			
//			@Test(priority = 62)
//			public void Verify_Decrease_LED_Settings_On_Ethernet_Tab_Page() {
//				SoftAssert softmain31 = new SoftAssert();
//				softmain31.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().decreaseLedBrightnessSettings());
//				
//				softmain31.assertAll();
//			}
//			
//			@Test(priority = 63)
//			public void Verify_Increase_LED_Settings_On_Ethernet_Tab_Page() {
//				SoftAssert softmain32 = new SoftAssert();
//				softmain32.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().increaseLedBrightnessSettings());
//				softmain32.assertAll();
//			}
			
			@Test(priority = 64, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_Ethernet_Tab_Page"})
			public void Verify_Devices_Count_Validation_On_Ethernet_Tab_Page() {
				SoftAssert softmain33 = new SoftAssert();
				softmain33.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().ethernetTabvalidations());
				
				softmain33.assertAll();
			}
			
			@Test(priority = 65, dependsOnMethods = { "Verify_SignUp_And_Onboard",  "Verify_Main_Device_UI_On_Ethernet_Tab_Page"})
			public void Verify_Connected_Devices_On_Ethernet_Tab_Page() {
				SoftAssert softmain34 = new SoftAssert();
				softmain34.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().verifyConnectedDeviceDetails());
				new MainDeviceAllTabPage().getEthernetPageObject().clickBackButton();
				softmain34.assertAll();
			}
			
//			@Test(priority = 66)
//			public void Verify_Main_Router_Details_On_Ethernet_Tab_Page() {
//				SoftAssert softmain35 = new SoftAssert();
//				softmain35.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().verifyMainRouterDetails());
//				super.swipeDown();
//				softmain35.assertAll();
//			}
//			
//			@Test(priority = 67)
//			public void Verify_Edit_Main_Router_Name_On_Ethernet_Tab_Page() {
//				SoftAssert softmain36 = new SoftAssert();
//				softmain36.assertTrue(new MainDeviceAllTabPage().clickMainDeviceName());
//				if(new MainDeviceAllTabPage().getEthernetPageObject().getEditMainDeviceNameDialogObject().isAt())
//				{
//					softmain36.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().verifyUIOnEditDeviceNameDialog());
//					softmain36.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().editDeviceName1());
//					softmain36.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().clickSaveButton());
//					softmain36.assertTrue(new MainDeviceAllTabPage().clickDeviceName(1));
//					softmain36.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().editDeviceName1());
//					softmain36.assertTrue(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().clickSaveButton());
//				}
//				
//				softmain36.assertAll();
//			}
//			
//			@Test(priority = 68)
//			public void Verify_Edit_Connected_Device_Name_On_Ethernet_Tab_Page() {
//				SoftAssert softmain37 = new SoftAssert();
//				if (new MainDeviceAllTabPage().getEthernetPageObject().allDevicesCount > 0) {
//					softmain37.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().clickDeviceName(1));
//					if(new MainDeviceAllTabPage().getEditDeviceNameDialogObject().isAt())
//					{
//						softmain37.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().getEditDeviceNameDialogObject().verifyUIOnEditDeviceNameDialog());
//						softmain37.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().getEditDeviceNameDialogObject().editDeviceName1());
//						softmain37.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().getEditDeviceNameDialogObject().clickSaveButton());
//						softmain37.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().clickDeviceName(1));
//						softmain37.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().getEditDeviceNameDialogObject().editDeviceName2());
//						softmain37.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().getEditDeviceNameDialogObject().clickSaveButton());
//					}
//				}else {
//					utils.log().info("There are no Ethernet devices connected to the Main Router ");
//				}
//				softmain37.assertAll();
//			}

//			@Test(priority = 69, dependsOnMethods = { "Verify_SignUp_And_Onboard"})
//			public void Verify_Main_Device_Help_Page() {
//				SoftAssert softmain38 = new SoftAssert();
//				softmain38.assertTrue(new MainDeviceAllTabPage().getEthernetPageObject().clickHelpButton());
//				if(new MainDeviceAllTabPage().getMainRouterDetailsHelpPageObject().isAt())
//					new MainDeviceAllTabPage().getMainRouterDetailsHelpPageObject().clickCloseButton();
//				new MainDeviceAllTabPage().getEthernetPageObject().clickBackButton();
//				
//				softmain38.assertAll();
//			}
		  
			@Test(priority = 70, dependsOnMethods = { "Verify_SignUp_And_Onboard"})
			public void Verify_Devices_UI_Page() {
				utils.log().info("                                            ");
				utils.log().info("********************************************");
				utils.log().info("Test: Online and Offline Connected Devices  ");
				utils.log().info("********************************************");
				SoftAssert softdevices2 = new SoftAssert();
//				new HomePage().getFooterIconsPageObject().clickHomeButton();
					if (new HomePage().isAt())
						softdevices2.assertTrue(new HomePage().clickDevicesImage());
//					if (new DevicesPage().isAt())
//						softdevices2.assertTrue(new DevicesPage().verifyUIOnDevicesPage());
				softdevices2.assertAll();
			}
				
			@Test(priority = 71, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Devices_UI_Page"})
			public void Verify_Online_Devices_Details() 
			{
				SoftAssert softdevices3 = new SoftAssert();
				utils.log().info("Getting the count of devices currently online");
				softdevices3.assertTrue(new DevicesPage().verifyOnlineDeviceDetails());
				softdevices3.assertAll();
			}
			
//			@Test(priority = 72, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Devices_UI_Page"})
//			public void Verify_Edit_Device_Name() 
//			{
//				SoftAssert softdevices4 = new SoftAssert();
//				super.swipeDown();
//				softdevices4.assertTrue(new DevicesPage().verifyEditDeviceName());
//				softdevices4.assertAll();
//			}
			
			@Test(priority = 73, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Devices_UI_Page"})
			public void Verify_Offline_Devices_Details() 
			{
				SoftAssert softdevices5 = new SoftAssert();
//				softdevices5.assertTrue(new DevicesPage().clickOfflineTab());
				utils.log().info("Getting the count of devices currently offline");
				softdevices5.assertTrue(new DevicesPage().verifyOfflineDeviceDetails());
				softdevices5.assertTrue(new DevicesPage().clickBackButton());
				softdevices5.assertAll();
			}
			
			
//			@Test(priority = 74, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Devices_UI_Page"})
//			public void Verify_Devices_Help_Page() 
//			{
//				SoftAssert softdevices6 = new SoftAssert();
//				softdevices6.assertTrue(new DevicesPage().clickHelpButton());
//				if(new DevicesPage().getDevicesHelpPageObject().isAt())
//					softdevices6.assertTrue(new DevicesPage().getDevicesHelpPageObject().clickCloseButton());
//				softdevices6.assertTrue(new DevicesPage().clickBackButton());
//				softdevices6.assertAll();
//			}
		  
			@Test(priority = 75, dependsOnMethods = { "Verify_SignUp_And_Onboard"})
			public void Verify_Devices_Signal_Strength_UI_Page() {
				utils.log().info("                                            ");
				utils.log().info("********************************************");
				utils.log().info("Test: Device Signal Strength Leader Board   ");
				utils.log().info("********************************************");
				SoftAssert softsignal2 = new SoftAssert();
				new HomePage().getFooterIconsPageObject().clickHomeButton();
				super.swipeUp();
				new HomePage().clickDeviceSignalStrengthImage();
				if(new DeviceSignalStrengthLeaderBoardPage().isAt()) 
					softsignal2.assertTrue(new DeviceSignalStrengthLeaderBoardPage().verifyUIOnDeviceSignalStrengthPage());
				
				try {
					if(new DeviceSignalStrengthLeaderBoardPage().getAppRatingDialogObject().isAt())
						softsignal2.assertTrue(new ParentalControlWithProfilesPage().getAppRatingDialogObject().clickRemindMeLaterLink());
				}catch(Exception e) {utils.log().info("App Rating Dialog did not appear");}
				
				softsignal2.assertAll();
			}
			
			@Test(priority = 76, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Devices_Signal_Strength_UI_Page"})
			public void Verify_Sorting_Devices_From_Strong_To_Weak() {
				SoftAssert softsignal4= new SoftAssert();
				softsignal4.assertTrue(new DeviceSignalStrengthLeaderBoardPage().verifySignalStrengthStrongToWeak());
				softsignal4.assertAll();
			}
			
//			@Test(priority = 77, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Devices_Signal_Strength_UI_Page"})
//			public void Verify_Sorting_Devices_From_Weak_To_Strong() {
//				SoftAssert softsignal5= new SoftAssert();
//				softsignal5.assertTrue(new DeviceSignalStrengthLeaderBoardPage().verifySignalStrengthWeakToStrong());
//				softsignal5.assertAll();
//			}
			
			@Test(priority = 78, dependsOnMethods = { "Verify_SignUp_And_Onboard", "Verify_Devices_Signal_Strength_UI_Page"})
			public void Verify_Editing_Device_Name() {
				SoftAssert softsignal6= new SoftAssert();
				softsignal6.assertTrue(new DeviceSignalStrengthLeaderBoardPage().clickDeviceName(1));
				softsignal6.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().editMainDeviceName());
				softsignal6.assertTrue(new MainDeviceAllTabPage().getEditMainDeviceNameDialogObject().clickSaveButton());
				softsignal6.assertTrue(new DeviceSignalStrengthLeaderBoardPage().getFooterIconsPageObject().clickHomeButton());
				softsignal6.assertAll();
			}
			
		
		  @Test(priority = 79, dependsOnMethods = {"Verify_SignUp_And_Onboard" })
			public void Verify_Parental_Control_UI_Page() {
				utils.log().info("                         ");
				utils.log().info("*************************");
				utils.log().info("Test: Parental Control   ");
				utils.log().info("*************************");
				SoftAssert softcontrol2 = new SoftAssert();
				softcontrol2.assertTrue(new HomePage().getFooterIconsPageObject().clickParentalButton());
//					if (new ParentalControlWithProfilesPage().isAt())
//						softcontrol2
//								.assertTrue(new ParentalControlWithProfilesPage().verifyUIOnParentalControlProfilesPage());
				softcontrol2.assertAll();
			}
			
			@Test(priority = 80, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_Parental_Control_UI_Page"})
			public void Verify_Add_Profile_Page() {
				SoftAssert softcontrol3 = new SoftAssert();
				if(new ParentalControlWithProfilesPage().isAt())
					softcontrol3.assertTrue(new ParentalControlWithProfilesPage().enableParentalControl());	
				super.pause(2);
				try {
					if(new ParentalControlWithProfilesPage().getAppRatingDialogObject().isAt())
						softcontrol3.assertTrue(new ParentalControlWithProfilesPage().getAppRatingDialogObject().clickRemindMeLaterLink());
				}catch(Exception e) {utils.log().info("App Rating Dialog did not appear");}
				
				if(new ParentalControlWithProfilesPage().isAt()) {
					for(int i = 1; i <= 3; i++)	{
						softcontrol3.assertTrue(new ParentalControlWithProfilesPage().clickAddProfilesLink());
						softcontrol3.assertTrue(new ParentalControlWithProfilesPage().getAddProfileDialogObject().enterProfileName());
						softcontrol3.assertTrue(new ParentalControlWithProfilesPage().getAddProfileDialogObject().clickCreateProfileButton());
					}				
				}
//				utils.log().info("Deleting a User Profile");
//				super.swipeUserProfile(Direction.LEFT);
//				if(new ParentalControlWithProfilesPage().deleteButton.isDisplayed()) {
//					click(new ParentalControlWithProfilesPage().deleteButton);
//				}
//				if(new ParentalControlWithProfilesPage().isAt()) 
//					softcontrol3.assertTrue(new ParentalControlWithProfilesPage().verifyUserProfile());
				
				softcontrol3.assertAll();
			}
			
			@Test(priority = 81, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_Parental_Control_UI_Page"})
			public void Verify_User_Profile_Page() {
				SoftAssert softcontrol4 = new SoftAssert();
					if (new ParentalControlWithProfilesPage().isAt())
						softcontrol4.assertTrue(new ParentalControlWithProfilesPage().clickOnUserProfile());
					super.pause(3);
//					if (new ParentalControlWithProfilesPage().getUserProfilePageObject().isAt())
//						softcontrol4.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().verifyUIOnUserProfilePage());
				softcontrol4.assertAll();
			}
			
//			@Test(priority = 82, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
//			public void Verify_User_Profile_Help_Page() {
//				SoftAssert softcontrol5 = new SoftAssert();
//				softcontrol5.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickHelpIcon());
//				super.pause(3);
//				
//				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileHelpPageObject().isAt()){
//					//softcontrol5.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileHelpPageObject().verifyUIOnUserProfilePage());
//					softcontrol5.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileHelpPageObject().clickCloseButton());
//				}
//				
//				softcontrol5.assertAll();
//			}
			
			@Test(priority = 83, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Edit_User_Profile_Name() {
				SoftAssert softcontrol6 = new SoftAssert();
				softcontrol6.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getExistingUserName());
				softcontrol6.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickUserProfileNameEditButton());
				
				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalEditUserProfileDialogObject().isAt()){
				//	softcontrol6.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalEditUserProfileDialogObject().verifyUIOnEditUserProfileDialog());
					softcontrol6.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalEditUserProfileDialogObject().enterUserProfileName());
					softcontrol6.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalEditUserProfileDialogObject().clickSaveButton());
					super.pause(3);
				}
				softcontrol6.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().validateUserProfileEditedName());
				softcontrol6.assertAll();
			}
			
			@Test(priority = 84, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Add_Device_To_User_Profile() {
				SoftAssert softcontrol7 = new SoftAssert();
				softcontrol7.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickAddDeviceLink());
					if (new ParentalControlWithProfilesPage().getUserProfilePageObject()
							.getParentalUserProfileAddDevicePageObject().isAt()) {
						softcontrol7.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject()
								.getParentalUserProfileAddDevicePageObject().verifyDevicesInAddDevicePage());
						utils.log().info("Clicking on Add Device button without selecting any device");
						softcontrol7.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject()
								.getParentalUserProfileAddDevicePageObject().clickAddDeviceButton());

						if (new ParentalControlWithProfilesPage().getUserProfilePageObject()
								.getParentalUserProfileAddDevicePageObject().alertTitle.isDisplayed()) {
							utils.log().info("Alert dialog box with message - "
											+ new ParentalControlWithProfilesPage().getUserProfilePageObject()
													.getParentalUserProfileAddDevicePageObject().description.getText()
											+ " - is displayed");
							softcontrol7.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject()
									.getParentalUserProfileAddDevicePageObject().clickCloseButtonOnAlertDialog());
						}

						softcontrol7.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject()
								.getParentalUserProfileAddDevicePageObject().selectADeviceForUserProfile());
						softcontrol7.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject()
								.getParentalUserProfileAddDevicePageObject().clickAddDeviceButton());
						// softcontrol7.assertTrue(new
						// ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddDevicePageObject().verifyDeviceCountAfterAssociatingToUser());
					}
				
				softcontrol7.assertAll();
			}
			
//			@Test(priority = 85, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
//			public void Verify_Add_Device_Help_Page() {
//				SoftAssert softcontrol8 = new SoftAssert();
//				softcontrol8.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickAddDeviceLink());
//				
//				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddDevicePageObject().isAt()) 
//				softcontrol8.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddDevicePageObject().clickHelpIcon());
//				
//				if (new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddDevicePageObject().getParentalAddDeviceHelpPageObject().isAt()) 
//					softcontrol8.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddDevicePageObject().getParentalAddDeviceHelpPageObject().clickCloseButton());
//				
//				softcontrol8.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddDevicePageObject().clickBackButton());
//				
//				softcontrol8.assertAll();
//			}
			
			@Test(priority = 86, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Devices_Associated_With_User_Profile() {
				SoftAssert softcontrol9 = new SoftAssert();
				softcontrol9.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickDeviceListExpandButton());
				softcontrol9.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().verifyAssociatedDeviceList());
//				softcontrol9.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().deleteAssociatedDevice());
				
//				utils.log().info("Deleting an Associated Device");
//				super.swipeUp();
//				super.swipeAssocaitedDevices(Direction.LEFT);
//				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().deleteDeviceIcon.isDisplayed()) {
//					click(new ParentalControlWithProfilesPage().getUserProfilePageObject().deleteDeviceIcon);}
//				softcontrol9.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickDeviceListExpandButton());
				
				try {
					if(new ParentalControlWithProfilesPage().getAppRatingDialogObject().isAt())
						softcontrol9.assertTrue(new ParentalControlWithProfilesPage().getAppRatingDialogObject().clickRemindMeLaterLink());
				}catch(Exception e) {utils.log().info("App Rating Dialog did not appear");}
				
				softcontrol9.assertAll();
			}
			
			@Test(priority = 87, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Add_Rule_To_User_Profile() {
				SoftAssert softcontrol10 = new SoftAssert();
				softcontrol10.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickAddRuleLink());
				
				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().isAt()) 
					softcontrol10.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().clickAddScheduleButton());
				
				softcontrol10.assertAll();
			}
			
			@Test(priority = 88, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Add_EveryDay_Schedule_To_Rule() {
				SoftAssert softcontrol11 = new SoftAssert();
//				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().isAt()) 
//					softcontrol11.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().verifyUIOnAddInternetBlockingScheduleDialog());
				utils.log().info("                                  ");
				utils.log().info("Selecting same start and stop time");
				softcontrol11.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickStartTimeLink());
				softcontrol11.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().clickOkButton());
				softcontrol11.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickStopTimeLink());
				softcontrol11.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().clickOkButton());
				softcontrol11.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickSaveChangesButton());
				
				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().errorDescription.isDisplayed()) {
					utils.log().info("Alert dialog with message - " + new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().errorDescription.getText() + " - is displayed");
					softcontrol11.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickAlertOKButton());}
				
				softcontrol11.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickCloseButton());

				softcontrol11.assertAll();
			}
			
			@Test(priority = 89, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Select_Start_Time_For_EveryDay_Schedule() {
				SoftAssert softcontrol12 = new SoftAssert();
				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().isAt()) 
					softcontrol12.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().clickAddScheduleButton());
				
				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().isAt()) {
					softcontrol12.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickEveryDayButton());
					softcontrol12.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickStartTimeLink());}
				
				if (new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().isAt()) 
					softcontrol12.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().clickOkButton());

				softcontrol12.assertAll();
			}
			
			@Test(priority = 90, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Select_Stop_Time_For_EveryDay_Schedule() {
				SoftAssert softcontrol13 = new SoftAssert();
				//super.pause(65);
				softcontrol13.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickStopTimeLink());
				
				if (new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().isAt()) 
					super.swipeMinutes(Direction.UP);
					
				softcontrol13.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().clickOkButton());
					
				softcontrol13.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickSaveChangesButton());
				super.pause(3);

				softcontrol13.assertAll();
			}
			
			@Test(priority = 91, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Add_Custom_Schedule_To_Rule() {
				SoftAssert softcontrol14 = new SoftAssert();
				if(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().isAt()) {
					softcontrol14.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().clickAddScheduleButton());
					softcontrol14.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickCustomButton());
		//			softcontrol14.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().verifyUIOnCustomClick());
				}
				softcontrol14.assertAll();
			}
			
			@Test(priority = 92, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Add_Custom_Schedule_Select_DOW() {
				SoftAssert softcontrol15 = new SoftAssert();
				softcontrol15.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickSunday());
				softcontrol15.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickTuesday());
				softcontrol15.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickThrusday());

				softcontrol15.assertAll();
				}
			
			@Test(priority = 93, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Add_Custom_Schedule_Select_Start_Time() {
				SoftAssert softcontrol16 = new SoftAssert();
				softcontrol16.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickStartTimeLink());
				
				if (new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().isAt())
					softcontrol16.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().clickOkButton());
				
				softcontrol16.assertAll();
				}
			
			@Test(priority = 94, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Add_Custom_Schedule_Select_Stop_Time() {
				SoftAssert softcontrol17 = new SoftAssert();
				//super.pause(65);
				softcontrol17.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickStopTimeLink());
				
				if (new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().isAt()) 
					super.swipeMinutes(Direction.UP);
				softcontrol17.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().getDatePickerDialogObject().clickOkButton());
					
				softcontrol17.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().getInternetBlockingScheduleDialogObject().clickSaveChangesButton());
				softcontrol17.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().clickBackButton());
				super.pause(3);
				
				softcontrol17.assertAll();
			}
//			
//			@Test(priority = 95, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
//			public void Verify_Enable_Schedule_Time_UI_Page() {
//				SoftAssert softcontrol18 = new SoftAssert();
	//
//				//new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().verifyUIonEnableScheduleTimePage();
//				softcontrol18.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().getParentalUserProfileAddRulePageObject().clickBackButton());
//				
//				softcontrol18.assertAll();
//			}
			
			@Test(priority = 96, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_User_Profile_Page"})
			public void Verify_Rules_Associated_With_User() {
				SoftAssert softcontrol19 = new SoftAssert();
				softcontrol19.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickRuleListExpandButton());
//				softcontrol19.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().verifyRulesAssociatedWithUser());
//				utils.log().info("Deleting Rules Associated with Profile");
//				super.swipeUp();
//				super.swipeUserProfile(Direction.LEFT);
//				if(new ParentalControlWithProfilesPage().deleteButton.isDisplayed()) {
//					click(new ParentalControlWithProfilesPage().deleteButton);
//				}
//  
				
				softcontrol19.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickRuleListExpandButton());
				softcontrol19.assertTrue(new ParentalControlWithProfilesPage().getUserProfilePageObject().clickBackButton());
				
				softcontrol19.assertAll();
			}
			
			@Test(priority = 97, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_Parental_Control_UI_Page"})
			public void Verify_Pause_Internet_For_All_Users() {
				SoftAssert softcontrol20 = new SoftAssert();
				if(new ParentalControlWithProfilesPage().isAt()) {
					new ParentalControlWithProfilesPage().pauseAllProfilesExpandButton.click();
					softcontrol20.assertTrue(new ParentalControlWithProfilesPage().enablePauseInternetAccessForAllUserProfiles());
					//softcontrol20.assertTrue(new ParentalControlWithProfilesPage().verifyPauseInternetAccessForAllUserProfile());
				}
				softcontrol20.assertAll();
			}
			
			@Test(priority = 98, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_Parental_Control_UI_Page"})
			public void Verify_Currently_Blocked_Profiles() {
				SoftAssert softcontrol21 = new SoftAssert();
				softcontrol21.assertTrue(new ParentalControlWithProfilesPage().clickCurrentlyBlockedTab());

				if(new ParentalControlWithProfilesPage().getParentalControlCurrentlyBlockedTabPageObject().isAt()) {
					softcontrol21.assertTrue(new ParentalControlWithProfilesPage().getParentalControlCurrentlyBlockedTabPageObject().verifyInternetPausedUserProfiles());
					softcontrol21.assertTrue(new ParentalControlWithProfilesPage().getParentalControlCurrentlyBlockedTabPageObject().clickProfilesTab());
				}
				softcontrol21.assertAll();
			}
			
			@Test(priority = 99, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_Parental_Control_UI_Page"})
			public void Verify_Resume_Internet_For_All_Users() {
				SoftAssert softcontrol22 = new SoftAssert();
				if(new ParentalControlWithProfilesPage().isAt()) {
					//new ParentalControlWithProfilesPage().pauseAllProfilesExpandButton.click();
					softcontrol22.assertTrue(new ParentalControlWithProfilesPage().disablePauseInternetAccessForAllProfiles());
					utils.log().info("Waiting for 60 seconds for the user profiles to clear from the Blocked list");
					super.pause(60);
					//softcontrol22.assertTrue(new ParentalControlWithProfilesPage().verifyResumeInternetAccessForAllUserProfile());
				}
				softcontrol22.assertAll();
			}
			
			@Test(priority = 100, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_Parental_Control_UI_Page"})
			public void Verify_Currently_Blocked_Users_After_Resuming_Internet_For_All_Users() {
				SoftAssert softcontrol23 = new SoftAssert();
				if(new ParentalControlWithProfilesPage().isAt())
					softcontrol23.assertTrue(new ParentalControlWithProfilesPage().clickCurrentlyBlockedTab());
				
				if(new ParentalControlWithProfilesPage().getParentalControlCurrentlyBlockedTabPageObject().isAt()) {
					softcontrol23.assertTrue(new ParentalControlWithProfilesPage().getParentalControlCurrentlyBlockedTabPageObject().verifyNoBlockedProfileMessages());
					softcontrol23.assertTrue(new ParentalControlWithProfilesPage().getParentalControlCurrentlyBlockedTabPageObject().clickProfilesTab());
				}
				softcontrol23.assertTrue(new ParentalControlWithProfilesPage().clickBackButton());
				softcontrol23.assertAll();
			}
			
//			@Test(priority = 101, dependsOnMethods = {"Verify_SignUp_And_Onboard" , "Verify_Parental_Control_UI_Page"})
//			public void Verify_Parental_Control_Help_Page() {
//				SoftAssert softcontrol24 = new SoftAssert();
//				if(new ParentalControlWithProfilesPage().isAt())
//					softcontrol24.assertTrue(new ParentalControlWithProfilesPage().clickHelpIcon());
//				super.pause(3);
//					
//				if(new ParentalControlWithProfilesPage().getParentalHelpPageObject().isAt()) {
//				//	softcontrol24.assertTrue(new ParentalControlWithProfilesPage().getParentalHelpPageObject().verifyUIOnParentalControlOverviewHelpPage());
//					softcontrol24.assertTrue(new ParentalControlWithProfilesPage().getParentalHelpPageObject().clickCloseButton());
//					super.pause(3);
//				}
//				softcontrol24.assertTrue(new ParentalControlWithProfilesPage().clickBackButton());
//
//				softcontrol24.assertAll();
//			}	
						

			
			@Test(priority = 101, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_Network_UI_Page() {
				utils.log().info("                     ");
				utils.log().info("*********************");
				utils.log().info("Test: Network Page   ");
				utils.log().info("*********************");
				SoftAssert softnet2 = new SoftAssert();
				softnet2.assertTrue(new HomePage().getFooterIconsPageObject().clickNetworkButton());
			//	softnet2.assertTrue(new NetworkPage().verifyUIOnNetworkPage());
				softnet2.assertAll();
			}

//			@Test(priority = 104, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
//			public void Verify_Newtork_Help_Page() {
//				SoftAssert softnet3 = new SoftAssert();
//				softnet3.assertTrue(new NetworkPage().clickHelpButton());
//				softnet3.assertTrue(new NetworkPage().getNetworkHelpPageObject().clickCloseButton());
//				softnet3.assertAll();
//			}

			@Test(priority = 102, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_Newtork_Test_Connection_Speed_Page() {
				SoftAssert softnet4 = new SoftAssert();
		//		super.swipeUp();
				softnet4.assertTrue(new NetworkPage().clickTestConnectionSpeedButton());
				softnet4.assertTrue(new NetworkPage().getSpeedTestPageObject().performSpeedTest());
				softnet4.assertTrue(new NetworkPage().getSpeedTestPageObject().clickBackButton());
				softnet4.assertAll();
			}

			@Test(priority = 103, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_WAN_Settings_UI_Page() {
				SoftAssert softnet5 = new SoftAssert();
				softnet5.assertTrue(new NetworkPage().clickNetworkSettingsExpandButton());
				super.swipeUp();
				softnet5.assertTrue(new NetworkPage().clickWANSettings());
				try {
						if(super.getDriver().findElementById("com.arris.sbcBeta:id/remindMeLaterTxt").isDisplayed())
							super.getDriver().findElementById("com.arris.sbcBeta:id/remindMeLaterTxt").click();
				}catch(Exception e) {utils.log().info("App Rating Dialog did not appear");}
					softnet5.assertTrue(new NetworkPage().getWANSettingsPageObject().verifyUIOnWANSettingsPage());

					softnet5.assertAll();
			}

//			@Test(priority = 104, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
//			public void Verify_WAN_Settings_Help_Page() {
//				SoftAssert softnet6 = new SoftAssert();
//				softnet6.assertTrue(new NetworkPage().getWANSettingsPageObject().clickHelpButton());
//				if (new NetworkPage().getWANSettingsPageObject().getNetworkWanSettingsHelpPageObject().isAt())
//					softnet6.assertTrue(new NetworkPage().getWANSettingsPageObject().getNetworkWanSettingsHelpPageObject().clickCloseButton());
//				softnet6.assertAll();
//			}

			@Test(priority = 105, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_WAN_Settings_WAN_IP_Configuration_IPv4_DHCP_UI_Page() {
				SoftAssert softnet7 = new SoftAssert();
				new NetworkPage().getWANSettingsPageObject().clickWANIPConfigurationLink();
				if (new NetworkPage().getWANSettingsPageObject().getWANIPv4ConfigurationPageObject().isAt())
					softnet7.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv4ConfigurationPageObject().verifyUIOnWANIPv4DHCP());
				softnet7.assertAll();
			}

			@Test(priority = 106, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_WAN_Settings_UI_Page"})
			public void Verify_WAN_Settings_WAN_IP_Configuration_IPv4_Static_UI_Page() {
				SoftAssert softnet8 = new SoftAssert();
				softnet8.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv4ConfigurationPageObject().verifyUIOnWANIPv4Static());
				softnet8.assertAll();
			}

			@Test(priority = 107, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_WAN_Settings_UI_Page"})
			public void Verify_WAN_Settings_WAN_IP_Configuration_IPv6_Stateful_UI_Page() {
				SoftAssert softnet9 = new SoftAssert();
				softnet9.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv4ConfigurationPageObject().clickWANIPv6Tab());
				if (new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().isAt())
					softnet9.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().verifyUIOnWANIPv6Stateful());
				softnet9.assertAll();
			}

			@Test(priority = 108, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_WAN_Settings_UI_Page"})
			public void Verify_WAN_Settings_WAN_IP_Configuration_IPv6_Stateless_UI_Page() {
				SoftAssert softnet10 = new SoftAssert();
				softnet10.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().verifyUIOnWANIPv6Stateless());
				softnet10.assertAll();
			}

			@Test(priority = 109, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_WAN_Settings_UI_Page"})
			public void Verify_WAN_Settings_WAN_IP_Configuration_Help_Page() {
				SoftAssert softnet11 = new SoftAssert();
				new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().clickHelpButton();
				if (new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().getNetworkWANIPConfigurationHelpPageObject().isAt()) {
					softnet11.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().getNetworkWANIPConfigurationHelpPageObject().clickCloseButton());
					softnet11.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().clickBackButton());
					try {
						if(super.getDriver().findElementById("com.arris.sbcBeta:id/remindMeLaterTxt").isDisplayed())
							super.getDriver().findElementById("com.arris.sbcBeta:id/remindMeLaterTxt").click();
				}catch(Exception e) {utils.log().info("App Rating Dialog did not appear");}
				}
				softnet11.assertAll();
			}
			
			@Test(priority = 110, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_WAN_Settings_UI_Page"})
			public void Verify_WAN_Settings_DNS_Configuration_IPv4_Automatic_UI_Page() 
			{
				SoftAssert softnet12 = new SoftAssert();
				softnet12.assertTrue(new NetworkPage().getWANSettingsPageObject().clickDNSConfigurationLink());
				if (new NetworkPage().getWANSettingsPageObject().getWANDNSIPv4ConfigurationPageObject().isAt()) 
					softnet12.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANDNSIPv4ConfigurationPageObject().verifyUIOnDNSIPv4Automatic());
				softnet12.assertAll();
			}
			
			@Test(priority = 111, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_WAN_Settings_DNS_Configuration_IPv4_Static_UI_Page() 
			{
				SoftAssert softnet13 = new SoftAssert();
				softnet13.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANDNSIPv4ConfigurationPageObject().verifyUIOnDNSIPv4Static());
				softnet13.assertAll();
			}
			
			@Test(priority = 112, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_WAN_Settings_DNS_Configuration_IPv6_Automatic_UI_Page() 
			{
				SoftAssert softnet14 = new SoftAssert();
				softnet14.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANDNSIPv4ConfigurationPageObject().clickDNSIPv6Tab());
				if (new NetworkPage().getWANSettingsPageObject().getWANDNSIPv6ConfigurationPageObject().isAt()) 
					softnet14.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANDNSIPv6ConfigurationPageObject().verifyUIOnDNSIPv6Automatic());
				softnet14.assertAll();
			}
			
			@Test(priority = 113, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_WAN_Settings_DNS_Configuration_IPv6_Static_UI_Page() 
			{
				SoftAssert softnet15 = new SoftAssert();
				softnet15.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANDNSIPv6ConfigurationPageObject().verifyUIOnDNSIPv6Static());
				softnet15.assertAll();
			}
			
			@Test(priority = 114, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_WAN_Settings_DNS_Configuration_Help_Page() 
			{
				SoftAssert softnet16 = new SoftAssert();
				softnet16.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().clickHelpButton());
				if (new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().getNetworkWANIPConfigurationHelpPageObject().isAt())
					softnet16.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().getNetworkWANIPConfigurationHelpPageObject().clickCloseButton());
					softnet16.assertTrue(new NetworkPage().getWANSettingsPageObject().getWANIPv6ConfigurationPageObject().clickBackButton());
					try{
						if(new NetworkPage().getAppRatingPageObject().isAt())
							new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
					}catch(Exception e) {
						utils.log().info("App Rating Dialog did not appear");}
					softnet16.assertAll();
			}
			
			@Test(priority = 115, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_WAN_Settings_UI_Page"})
			public void Verify_WAN_Settings_LAC_Alert_Dialog() 
			{
				SoftAssert softnet17 = new SoftAssert();
				if (new NetworkPage().getWANSettingsPageObject().isAt()) 
					softnet17.assertTrue(new NetworkPage().getWANSettingsPageObject().clickLacAlertIcon());
					if(new NetworkPage().getWANSettingsPageObject().getLACAlertDialogObject().isAt())
						softnet17.assertTrue(new NetworkPage().getWANSettingsPageObject().getLACAlertDialogObject().clickCloseDialog());
						softnet17.assertTrue(new NetworkPage().getWANSettingsPageObject().clickBackButton());
				softnet17.assertAll();
			}
			
			@Test(priority = 116, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_LAN_Settings_UI_Page() 
			{
				SoftAssert softnet18 = new SoftAssert();
				if (new NetworkPage().isAt()) {
					softnet18.assertTrue(new NetworkPage().clickLANSettings());
					try{
						if(new NetworkPage().getAppRatingPageObject().isAt())
							new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
					}catch(Exception e) {
//						utils.log().info("App Rating Dialog did not appear");
						}
		//			softnet18.assertTrue(new NetworkPage().getLANSettingsPageObject().verifyUIOnLANSettingsPage());
				}
				softnet18.assertAll();
			}
			
			@Test(priority = 117, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_UI_Page"})
			public void Verify_LAN_Settings_LAN_IP_Reservation_Page() 
			{
				SoftAssert softnet19 = new SoftAssert();
				softnet19.assertTrue(new NetworkPage().getLANSettingsPageObject().clickLANIPResevationLink());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().isAt())
				//	softnet19.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().verifyUIOnNetworkLANIPReservationPage());
				softnet19.assertAll();
			}
			
			@Test(priority = 118, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_LAN_IP_Reservation_Page"})
			public void Verify_LAN_Settings_LAN_IP_Reservation_Add_Reservation_Page() 
			{
				SoftAssert softnet20 = new SoftAssert();
				new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().clickAddReservationButton();
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getLANIPReservationDialogObject().isAt())
				{
				//	softnet20.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getLANIPReservationDialogObject().verifyUIOnReserveLANIP());
					softnet20.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getLANIPReservationDialogObject().enterRuleName());
					softnet20.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getLANIPReservationDialogObject().enterIPAddress());
					softnet20.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getLANIPReservationDialogObject().selectADevice(1));
					softnet20.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getLANIPReservationDialogObject().clickSaveButton());
					softnet20.assertAll();
				}
			}
			
			@Test(priority = 119, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_LAN_IP_Reservation_Add_Reservation_Page"})
			public void Verify_LAN_Settings_LAN_IP_Reservation_Rules() 
			{
				SoftAssert softnet21 = new SoftAssert();
//				softnet21.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().verifyRulesOnLAPIPReservationPage());
				softnet21.assertAll();
			}
			
			@Test(priority = 120, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_LAN_IP_Reservation_Rules"})
			public void Verify_LAN_Settings_LAN_IP_Reservation_Edit_Devices_Page() 
			{
				SoftAssert softnet22 = new SoftAssert();
				softnet22.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().clickEditLAPIPReservation());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getEditLANIPReservationDialogObject().isAt())
				{
//					softnet22.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getEditLANIPReservationDialogObject().verifyUIOnEditReserveLANIP());
					softnet22.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getEditLANIPReservationDialogObject().editRuleName());
					softnet22.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getEditLANIPReservationDialogObject().editIPAddress());
					softnet22.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getEditLANIPReservationDialogObject().clickSaveButton());
				}
				softnet22.assertAll();

			}

			@Test(priority = 121, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_LAN_IP_Reservation_Page"})
			public void Verify_LAN_Settings_LAN_IP_Reservation_Help_Page() {
				SoftAssert softnet23 = new SoftAssert();
//				softnet23.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().clickHelpButton());
//				if (new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getLanIPReservationHelpPageObject().isAt()) {
//					softnet23.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().getLanIPReservationHelpPageObject().clickCloseButton());
					softnet23.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANIPReservationPageObject().clickBackButton());
//				}
				softnet23.assertAll();
			}
			
			@Test(priority = 122, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_UI_Page"})
			public void Verify_LAN_Settings_LAN_Subnet_DHCP_Range_Configuration_Page() 
			{
				SoftAssert softnet24 = new SoftAssert();
				softnet24.assertTrue(new NetworkPage().getLANSettingsPageObject().clickLANSubnetLink());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().isAt()) {
					softnet24.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().verifyUIOnLANSubnetConfigurationPage());
					softnet24.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().verifyDHCPIPAddressRangeForSelectedSubnet());
				}
				softnet24.assertAll();
			}
			
			@Test(priority = 123, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_LAN_Subnet_DHCP_Range_Configuration_Page"})
			public void Verify_Edit_LAN_Subnet_DHCP_Range_Configuration_Page() 
			{
				SoftAssert softnet25 = new SoftAssert();
				
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().EditDHCPIPAddressRangeForFirstSubnet());
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickSaveButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPChangeRangeIPDialogObject().isAt())
					softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPChangeRangeIPDialogObject().clickCloseButton());
				
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().EditDHCPIPAddressRangeForSecondSubnet());
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickSaveButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPChangeRangeIPDialogObject().isAt())
					softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPChangeRangeIPDialogObject().clickCloseButton());
				
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().EditDHCPIPAddressRangeForThirdSubnet());
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickSaveButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPChangeRangeIPDialogObject().isAt())
					softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPChangeRangeIPDialogObject().clickCloseButton());
				
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().verifyLANDHCPRangeBetween1And255());
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickSaveButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPBetween1And255DialogObject().isAt())
					softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPBetween1And255DialogObject().clickCloseButton());
				
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().verifyLANDHCPRangeWithEmptySuffix());
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickSaveButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPBetween1And255DialogObject().isAt())
					softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPBetween1And255DialogObject().clickCloseButton());
				
				softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickResetToDefaultButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPChangeRangeIPDialogObject().isAt())
					softnet25.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANDHCPChangeRangeIPDialogObject().clickCloseButton());

				softnet25.assertAll();
			}
			
			@Test(priority = 124, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_LAN_Subnet_DHCP_Range_Configuration_Page"})
			public void Edit_LAN_Subnet_Configuration_Octets() 
			{
				SoftAssert softnet26 = new SoftAssert();
				
				softnet26.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().verifyFirstLANSubnetConfigurationWithInvalidOctet());
				softnet26.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickSaveButton());
				utils.log().info("Validation Message : " + new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().enterValidIPAddressText1.getText() + " is displayed");
				
				softnet26.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().verifySecondLANSubnetConfigurationWithInvalidOctet());
				softnet26.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickSaveButton());
				utils.log().info("Validation Message : " + new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().enterValidIPAddressText2.getText() + " is displayed");

				softnet26.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().verifyThirdLANSubnetConfigurationWithInvalidOctet());
				softnet26.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickSaveButton());
				utils.log().info("Validation Message : " + new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().enterValidIPAddressText3.getText() + " is displayed");
				
				softnet26.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().verifyThirdLANSubnetConfigurationWithSecondInvalidOctet());
				softnet26.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickSaveButton());
				utils.log().info("Validation Message : " + new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().enterValidIPAddressTex16_31.getText() + " is displayed");
				
				softnet26.assertAll();
			}
			
			@Test(priority = 125, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_LAN_Subnet_DHCP_Range_Configuration_Page"})
			public void Verify_LAN_Settings_LAN_Subnet_DHCP_Range_Configuration_Help_Page() 
			{
				SoftAssert softnet27 = new SoftAssert();
//				softnet27.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickHelpButton());
//					if(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANSubnetRangeHelpPageObject().isAt()) {
//						softnet27.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().getLANSubnetRangeHelpPageObject().clickCloseButton());
					softnet27.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANSubnetDHCPLRangePageObject().clickBackButton());
					softnet27.assertAll();
//				}
			}
			
			@Test(priority = 126, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_UI_Page"})
			public void Verify_LAN_Settings_LAN_DHCP_Lease_Time_UI_Page() 
			{
				SoftAssert softnet28 = new SoftAssert();
//				//remove this if above test are uncommented
//					new NetworkPage().clickNetworkSettingsExpandButton();
//					new NetworkPage().clickLANSettings();
//					try{
//						if(new NetworkPage().getAppRatingPageObject().isAt())
//							new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
//					}catch(Exception e) {
//						utils.log().info("App Rating Dialog did not appear");
//					}
//				//remove this if above test are uncommented
				
					if(new NetworkPage().getLANSettingsPageObject().isAt())
						softnet28.assertTrue(new NetworkPage().getLANSettingsPageObject().clickDHCPLeaseTimeLink());
					if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().isAt())
		//				softnet28.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().verifyUIOnLANLeaseTimePage());
					softnet28.assertAll();
			}
			
			@Test(priority = 127, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_LAN_DHCP_Lease_Time_UI_Page"})
			public void Verify_LAN_Settings_LAN_DHCP_Set_Lease_Time_Page() 
			{
				SoftAssert softnet29 = new SoftAssert();
				
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().clickTimeUnitButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().isAt()){
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().verifyUIOnLANEditLeaseTimePage());
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().clickMinutesRadioButton());}
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().verifyLeaseTimeWithMinutesTimeUnit());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().clickOKButton());
				
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().clickTimeUnitButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().clickHourlyRadioButton());
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().verifyLeaseTimeWithHourlyTimeUnit());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().clickOKButton());
				
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().clickTimeUnitButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().clickDaysRadioButton());
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().verifyLeaseTimeWithDaysTimeUnit());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().clickOKButton());
				
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().clickTimeUnitButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().clickWeeklyRadioButton());
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().verifyLeaseTimeWithWeeklyTimeUnit());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().clickOKButton());
				
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().clickTimeUnitButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().clickForeverRadioButton());
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().verifyLeaseTimeWithForeverTimeUnit());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().clickOKButton());
				
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().clickTimeUnitButton());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getEditTimeUnitPageObject().clickMinutesRadioButton());
				softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().verifySameLeaseTimeForAnyUnit());
				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().isAt())
					softnet29.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLeaseTimeAppliedChangesDialogObject().clickOKButton());
				
				softnet29.assertAll();
			}
			
			@Test(priority = 128, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_LAN_Settings_LAN_DHCP_Lease_Time_UI_Page"})
			public void Verify_LAN_Settings_LAN_DHCP_Set_Lease_Time_Help_Page() 
			{
				SoftAssert softnet30 = new SoftAssert();
//				softnet30.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().clickHelpButton());
//				if(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLANDHCPLeaseTimeHelpPageObject().isAt())
//					softnet30.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().getLANDHCPLeaseTimeHelpPageObject().clickCloseButton());
					softnet30.assertTrue(new NetworkPage().getLANSettingsPageObject().getNetworkLANDHCPLeaseTimePageObject().clickBackButton());
					try{
						if(new NetworkPage().getAppRatingPageObject().isAt())
							new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
					}catch(Exception e) {
						utils.log().info("App Rating Dialog did not appear");
						}
					softnet30.assertTrue(new NetworkPage().getLANSettingsPageObject().clickBackButton());
					softnet30.assertAll();
			}
			
//			@Test(priority = 129, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
//			public void Verify_Device_Priority_Settings_UI_Page() 
//			{
//				SoftAssert softnet31 = new SoftAssert();
//				super.swipeUp();
//				softnet31.assertTrue(new NetworkPage().clickDevicePrioritySettings());
//				super.pause(3);
//				try{
//					if(new NetworkPage().getAppRatingPageObject().isAt())
//						new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
//				}catch(Exception e) {
//					utils.log().info("App Rating Dialog did not appear");
//				}
//				if(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().isAt())
//				{
//					softnet31.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().enableDevicePrioritySettings());
//					super.pause(10);
//
//					try{
//						if(new NetworkPage().getAppRatingPageObject().isAt())
//							new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
//					}catch(Exception e) {
////						utils.log().info("App Rating Dialog did not appear");
//					}
////					softnet31.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().verifyUIOnDevicePrioritySettingsPage());
//					softnet31.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().clickAddDeviceButton());
//				}
//				softnet31.assertAll();
//			}
//			
//			@Test(priority = 130, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_Device_Priority_Settings_UI_Page"})
//			public void Verify_Device_Priority_Settings_Add_Device_UI_Page() 
//			{
//				SoftAssert softnet32 = new SoftAssert();
//				if(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().isAt()) {
//					softnet32.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().verifyUIOnAddDevicePage());
//					softnet32.assertAll();
//				}
//			}
//			
//			@Test(priority = 131, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
//			public void Verify_Device_Priority_Settings_Add_Device_Page() 
//			{
//				SoftAssert softnet33 = new SoftAssert();
////				softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().verifyDeviceListForPrioritization());
//				softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().clickAddDeviceButton());
//				
//				if(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().getSelectDeviceAlertDialogObject().isAt())
//					softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().getSelectDeviceAlertDialogObject().clickOKButton());
//				
////				softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().clickBackButton());
//				
////				softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().clickAddDeviceButton());
////				super.pause(5);
//				softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().selectDeviceFromList());
//				softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().clickAddDeviceButton());
//				super.pause(3);
//				
//				softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().clickAddDeviceButton());
//				super.pause(2);
//				softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().selectDeviceFromList());
//				softnet33.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().clickAddDeviceButton());
//				super.pause(3);
//
//				softnet33.assertAll();
//			}
//			
////			@Test(priority = 132, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_Device_Priority_Settings_Add_Device_Page"})
////			public void Verify_Device_Priority_Settings_Add_Device() 
////			{
////				SoftAssert softnet74 = new SoftAssert();
////				softnet74.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().clickAddDeviceButton());
////				super.pause(5);
////				softnet74.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().selectDeviceFromList());
////				softnet74.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().clickAddDeviceButton());
////				super.pause(30);
//	//
////				softnet74.assertAll();
////			}
//			
//			@Test(priority = 133, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
//			public void Verify_Device_Priority_Settings_Added_Device_Page() 
//			{
//				SoftAssert softnet34 = new SoftAssert();
//				if(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().isAt())
//				{
////					softnet34.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().verifyUIOnNetworkPrioritizedDevices());
//					softnet34.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().selectDevicesWithHighestPriority());
////					softnet34.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().selectDevicesWithHighestPriority(2));
//					
////					if(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddedTwoHighestPriorityDevicesDialogObject().isAt())
////						softnet34.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddedTwoHighestPriorityDevicesDialogObject().clickOkButton());
////					super.pause(5);
//					
//				}
//				softnet34.assertAll();
//			}
//			
//			@Test(priority = 134, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
//			public void Verify_Device_Priority_Settings_Disable_Device_Prioritation() 
//			{
//				SoftAssert softnet35 = new SoftAssert();
////				softnet35.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().clickAddDeviceButton());
////				softnet35.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().clickHelpButton());
////				
////				if(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().getAddDevicePriorityHelpPageObject().isAt()) {
////					softnet35.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().getAddDevicePriorityHelpPageObject().clickCloseButton());
////					softnet35.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getAddDevicePriorityPageObject().clickBackButton());}
//				
//				softnet35.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().disableDevicePrioritySettings());
//				super.pause(5);
//				softnet35.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().clickBackButton());
//				softnet35.assertAll();
//			}
//			
////			@Test(priority = 135, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_Device_Priority_Settings_UI_Page"})
////			public void Verify_Device_Priority_Settings_Help_Page() 
////			{
////				SoftAssert softnet36 = new SoftAssert();
////				softnet36.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().clickHelpButton());
////				
////				if(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getDevicePriorityHelpPageObject().isAt())
////					softnet36.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().getDevicePriorityHelpPageObject().clickCloseButton());
////				
////				softnet36.assertTrue(new NetworkPage().getNetworkDevicePrioritySettingsPageObject().clickBackButton());
////				softnet36.assertAll();
////			}
			
			@Test(priority = 136, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_Network_UI_Page"})
			public void Verify_Time_Zone_Settings_UI_Page() 
			{
				SoftAssert softnet37 = new SoftAssert();
				super.swipeUp();
				softnet37.assertTrue(new NetworkPage().clickTimeZone());
				if(new NetworkPage().getTimeZoneSettingsPageObject().isAt())
					softnet37.assertTrue(new NetworkPage().getTimeZoneSettingsPageObject().verifyUIOnTimeZonePage());
				softnet37.assertTrue(new NetworkPage().getTimeZoneSettingsPageObject().clickPacificiTimeZone());
				softnet37.assertTrue(new NetworkPage().getTimeZoneSettingsPageObject().clickDoneButton());
				super.pause(3);
				softnet37.assertAll();
			}
			
//			@Test(priority = 137, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_Time_Zone_Settings_UI_Page"})
//			public void Verify_Time_Zone_Settings_Help_Page() 
//			{
//				SoftAssert softnet38 = new SoftAssert();
//				softnet38 .assertTrue(new NetworkPage().getTimeZoneSettingsPageObject().clickHelpButton());
//				if (new NetworkPage().getTimeZoneSettingsPageObject().getTimeZoneHelpPageObject().isAt())
//					softnet38 .assertTrue(new NetworkPage().getTimeZoneSettingsPageObject().getTimeZoneHelpPageObject().clickCloseButton());
//				softnet38 .assertTrue(new NetworkPage().getTimeZoneSettingsPageObject().clickBackButton());
//				softnet38 .assertAll();
//			}
			
			@Test(priority = 167, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_Network_UI_Page"})
			public void Verify_General_Settings_UI_Page() 
			{
				SoftAssert softnet39 = new SoftAssert();
				new HomePage().getFooterIconsPageObject().clickNetworkButton();
				new NetworkPage().clickNetworkSettingsExpandButton();
				new NetworkPage().clickGeneralSettings();
				try{
					if(new NetworkPage().getAppRatingPageObject().isAt())
						new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
				}catch(Exception e) {}
				
				if(new NetworkPage().getGeneralSettingsPageObject().isAt())
					try{
						if(new NetworkPage().getAppRatingPageObject().isAt())
							new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
					}catch(Exception e) {}
					softnet39.assertTrue(new NetworkPage().getGeneralSettingsPageObject().verifyUIOnGeneralSettingsPage());
				softnet39.assertAll();
			}
			
			@Test(priority = 168, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_General_Settings_UI_Page"})
			public void Verify_General_Settings_UPnP_Settings() 
			{
				SoftAssert softnet40 = new SoftAssert();
				softnet40.assertTrue(new NetworkPage().getGeneralSettingsPageObject().disableUPnP());
				try{
					if(new NetworkPage().getAppRatingPageObject().isAt())
						new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
				}catch(Exception e) {
					utils.log().info("App Rating Dialog did not appear");
				}
				softnet40.assertTrue(new NetworkPage().getGeneralSettingsPageObject().enableUPnP());
				
				softnet40.assertTrue(new NetworkPage().getGeneralSettingsPageObject().clickUPNPInfoIcon());
				
				if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsUPnPInfoDialogObject().isAt())
					softnet40.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsUPnPInfoDialogObject().clickCloseButton());
				softnet40.assertAll();
			}
			
			@Test(priority = 169, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_General_Settings_UI_Page"})
			public void Verify_General_Settings_IPv6_Enable_Settings() 
			{
				SoftAssert softnet39 = new SoftAssert();
				softnet39.assertTrue(new NetworkPage().getGeneralSettingsPageObject().clickIPv6InfoIcon());
				if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsIPv6EnableInfoDialogObject().isAt())
					softnet39.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsIPv6EnableInfoDialogObject().clickCloseButton());
				softnet39.assertAll();
			}
			
			@Test(priority = 170, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_General_Settings_UI_Page"})
			public void Verify_General_Settings_Bridge_Mode_Settings() 
			{
				SoftAssert softnet42 = new SoftAssert();
				softnet42.assertTrue(new NetworkPage().getGeneralSettingsPageObject().clickBridgeModeInfoIcon());
				if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsBridgeModeInfoDialogObject().isAt()) 
					softnet42.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsBridgeModeInfoDialogObject().clickCloseButton());
				softnet42.assertAll();
			}
			
			@Test(priority = 171, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_General_Settings_UI_Page"})
			public void Verify_General_Settings_Port_Forwarding_Settings() 
			{
				SoftAssert softnet43 = new SoftAssert();
				new NetworkPage().getGeneralSettingsPageObject().clickPortForwardingink();
				if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().isAt())
					softnet43.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().verifyUIOnPortForwardingPage());
				softnet43.assertAll();
			}
			
			@Test(priority = 172, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_General_Settings_Port_Forwarding_Settings"})
			public void Verify_General_Settings_Port_Forwarding_Add_Rules() 
			{
				SoftAssert softnet45 = new SoftAssert();
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().clickAddRuleButton());
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
								.enterPortRuleName());
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
								.selectTCP());
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
								.enterInternalPortStart());
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
								.enterInternalPortEnd());
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
								.enterExternalPortStart());
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
								.enterExternalPortEnd());
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
								.enterIPAddress());
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
								.clickSaveButton());
						super.pause(15);
						
						try {
							if (new NetworkPage().getGeneralSettingsPageObject()
									.getNetworkGeneralSettingsPortForwardingPageObject()
									.getPortForwardingAddRulePageObject().getPortRuleEditFailedDialogObject().isAt())
								
								softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
										.getNetworkGeneralSettingsPortForwardingPageObject()
										.getPortForwardingAddRulePageObject().getPortRuleEditFailedDialogObject()
										.clickOKButton());
						} catch (Exception e) {}
						
						softnet45.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
								.getNetworkGeneralSettingsPortForwardingPageObject().clickBackButton());
						

				softnet45.assertAll();
			}
				

//			@Test(priority = 172, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_General_Settings_Port_Forwarding_Add_Rules"})
//	
//			public void Verify_General_Settings_Port_Forwarding_Edit_Rules() 
//			{
//				SoftAssert softnet46 = new SoftAssert();
//				if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().isAt()) 
//				{
//					softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().clickEditPortFowardingRuleIcon());
//					softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterPortRuleName());
//					softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().selectUDP());
//					softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterInternalPortStart());
//					softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterInternalPortEnd());
//					softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterExternalPortStart());
//					softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterExternalPortEnd());
//					softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterIPAddress());
//					softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().clickSaveButton());
//					try {
//						if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().portNameDialogError.isDisplayed())
//							softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterPortRuleName());
//						else if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().internalPortStartError.isDisplayed())
//							softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterInternalPortStart());
//						else if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().internalPortEndError.isDisplayed())
//							softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterInternalPortEnd());
//						else if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().externalPortStartError.isDisplayed())
//							softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterExternalPortStart());
//						else if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().externalPortEndError.isDisplayed())
//							softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().enterExternalPortEnd());
//						else
//							utils.log().info("All Port details are valid");
//						softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().clickSaveButton());
//					}catch(Exception e) {utils.log().info("All Port details are valid");}
//					
//					super.pause(15);
//					try {
//					if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject().getPortRuleEditFailedDialogObject().isAt()) 
//						softnet46.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.getPortRuleEditFailedDialogObject().clickOKButton());
//						}catch(Exception e) {utils.log().info("Port Rule Edit Failed Dialog did not appear");}
//				}
//				softnet46.assertAll();
//			}
//	
//			@Test(priority = 173, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_General_Settings_Port_Forwarding_Add_Rules"})
//			public void Verify_General_Settings_Port_Forwarding_Add_Rule_Settings_Validations() 
//			{
//				SoftAssert softnet47 = new SoftAssert();
//				new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().clickAddRuleButton();
//					if (new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject()
//							.getPortForwardingAddRulePageObject().isAt()) {
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.verifyEnterPortForwardingRuleName());
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.verifyEnterInternalPortStart());
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.verifyEnterInternalPortEnd());
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.verifyInternalPortStartLessThenPortEnd());
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.verifyEnterExternalPortStart());
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.verifyEnterExternalPortEnd());
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.verifyExternalPortStartLessThenPortEnd());
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.verifyEnterValidIPAddress());
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.verifyEnterInValidIPAddress());
//						softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//								.getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingAddRulePageObject()
//								.clickSaveButton());
//						try {
//							if (new NetworkPage().getGeneralSettingsPageObject()
//									.getNetworkGeneralSettingsPortForwardingPageObject()
//									.getPortForwardingAddRulePageObject().portNameDialogError.isDisplayed())
//								softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//										.getNetworkGeneralSettingsPortForwardingPageObject()
//										.getPortForwardingAddRulePageObject().enterPortRuleName());
//							else if (new NetworkPage().getGeneralSettingsPageObject()
//									.getNetworkGeneralSettingsPortForwardingPageObject()
//									.getPortForwardingAddRulePageObject().internalPortStartError.isDisplayed())
//								softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//										.getNetworkGeneralSettingsPortForwardingPageObject()
//										.getPortForwardingAddRulePageObject().enterInternalPortStart());
//							else if (new NetworkPage().getGeneralSettingsPageObject()
//									.getNetworkGeneralSettingsPortForwardingPageObject()
//									.getPortForwardingAddRulePageObject().internalPortEndError.isDisplayed())
//								softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//										.getNetworkGeneralSettingsPortForwardingPageObject()
//										.getPortForwardingAddRulePageObject().enterInternalPortEnd());
//							else if (new NetworkPage().getGeneralSettingsPageObject()
//									.getNetworkGeneralSettingsPortForwardingPageObject()
//									.getPortForwardingAddRulePageObject().externalPortStartError.isDisplayed())
//								softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//										.getNetworkGeneralSettingsPortForwardingPageObject()
//										.getPortForwardingAddRulePageObject().enterExternalPortStart());
//							else if (new NetworkPage().getGeneralSettingsPageObject()
//									.getNetworkGeneralSettingsPortForwardingPageObject()
//									.getPortForwardingAddRulePageObject().externalPortEndError.isDisplayed())
//								softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//										.getNetworkGeneralSettingsPortForwardingPageObject()
//										.getPortForwardingAddRulePageObject().enterExternalPortEnd());
//							else
//								utils.log().info("All Port details are valid");
//							softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//									.getNetworkGeneralSettingsPortForwardingPageObject()
//									.getPortForwardingAddRulePageObject().clickSaveButton());
//							super.pause(25);
//						} catch (Exception e) {
//							utils.log().info("All Port details are valid");
//						}
//
//						try {
//							if (new NetworkPage().getGeneralSettingsPageObject()
//									.getNetworkGeneralSettingsPortForwardingPageObject()
//									.getPortForwardingAddRulePageObject().getPortRuleEditFailedDialogObject().isAt())
//								softnet47.assertTrue(new NetworkPage().getGeneralSettingsPageObject()
//										.getNetworkGeneralSettingsPortForwardingPageObject()
//										.getPortForwardingAddRulePageObject().getPortRuleEditFailedDialogObject()
//										.clickOKButton());
//							super.pause(25);
//						} catch (Exception e) {
//							utils.log().info("Port Rule Edit Failed Dialog did not appear");
//						}
//					}
//				softnet47.assertAll();
//			}
			
			@Test(priority = 174, dependsOnMethods = {"Verify_SignUp_And_Onboard"})
			public void Verify_General_Settings_Page() 
			{
				SoftAssert softnet48 = new SoftAssert();
//				softnet48.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().clickHelpButton());
//				if(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingHelpPageObject().isAt())
//					softnet48.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().getPortForwardingHelpPageObject().clickCloseButton());
				
//				softnet48.assertTrue(new NetworkPage().getGeneralSettingsPageObject().getNetworkGeneralSettingsPortForwardingPageObject().clickBackButton());
				try{
					if(new NetworkPage().getAppRatingPageObject().isAt())
						new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink();
				}catch(Exception e) {
					utils.log().info("App Rating Dialog did not appear");
				}
				softnet48.assertTrue(new NetworkPage().getGeneralSettingsPageObject().clickBackButton());
				softnet48.assertTrue(new NetworkPage().clickNetworkSettingsExpandButton());
				softnet48.assertAll();
			}
			
		
			@Test(priority = 175, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_Network_UI_Page"})
			public void Verify_Extended_WiFi_Settings_Page() 
			{
				SoftAssert softnet50 = new SoftAssert();
				softnet50.assertTrue(new NetworkPage().clickExtendedWifiSettingsExpandButton());
				
				softnet50.assertTrue(new NetworkPage().enable5GHzWidebandMode());
				if(new NetworkPage().get5GHzWidebandModeAlertDialogObject().isAt())
					softnet50.assertTrue(new NetworkPage().get5GHzWidebandModeAlertDialogObject().clickCloseButton());
				softnet50.assertTrue(new NetworkPage().clickfiveGHzWidebandInfoIcon());
				if(new WideBandModeAlertInfoDialog().isAt())
					softnet50.assertTrue(new WideBandModeAlertInfoDialog().clickCloseButton());
				
				if(new NetworkPage().isAt())
					softnet50.assertTrue(new NetworkPage().enableBandSteeringMode());
				if(new NetworkPage().get5GHzWidebandModeAlertDialogObject().isAt())
					softnet50.assertTrue(new NetworkPage().get5GHzWidebandModeAlertDialogObject().clickCloseButton());
				softnet50.assertTrue(new NetworkPage().clickBandSteeringInfoIcon());
				if(new BandSteeringModeAlertInfoDialog().isAt())
					softnet50.assertTrue(new BandSteeringModeAlertInfoDialog().clickCloseButton());
				
				softnet50.assertTrue(new NetworkPage().clickExtendedWifiSettingsExpandButton());
				softnet50.assertAll();
			}
			
			@Test(priority = 176, dependsOnMethods = {"Verify_SignUp_And_Onboard", "Verify_Network_UI_Page"})
			public void Verify_Guest_WiFi_Network_Page() 
			{
				SoftAssert softnet49 = new SoftAssert();
				
				softnet49.assertTrue(new NetworkPage().enableGuestWifiNetwork());
				
				try {
					if(new NetworkPage().getAppRatingPageObject().isAt())
						softnet49.assertTrue(new NetworkPage().getAppRatingPageObject().clickRemindMeLaterLink());
				}catch(Exception e) {utils.log().info("App Rating Dialog did not appear");}
				
				try {
					if(new NetworkPage().getEnableGuestNetworkDialogObject().isAt()) {
//						softnet49.assertTrue(new NetworkPage().getEnableGuestNetworkDialogObject().verifyUIOnGuestNetworkPage());
						softnet49.assertTrue(new NetworkPage().getEnableGuestNetworkDialogObject().validateGuestNetworkPage());
						softnet49.assertTrue(new NetworkPage().getEnableGuestNetworkDialogObject().enterGuestNetworkName());
						softnet49.assertTrue(new NetworkPage().getEnableGuestNetworkDialogObject().enterGuestNetworkPassword());
						softnet49.assertTrue(new NetworkPage().getEnableGuestNetworkDialogObject().clickSaveChangesButton());
						if(new NetworkPage().getEnableGuestNetworkAlertDialogObject().isAt())
							softnet49.assertTrue(new NetworkPage().getEnableGuestNetworkAlertDialogObject().clickOkButton());
						}
						utils.log().info("Waiting for 120 seconds to create guest wifi connection");
						super.pause(120);
					}catch(Exception e) {utils.log().info("Enable Guest Network Page did not appear");}
				softnet49.assertAll();
			}
			
			
			
			@Test(priority = 148, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
			public void Verify_Network_Health_Page() 
			{
				utils.log().info("                             ");
				utils.log().info("*****************************");
				utils.log().info("Test: Network Health Feature ");
				utils.log().info("*****************************");
				
				SoftAssert softnetwork1 = new SoftAssert();
				new HomePage().getFooterIconsPageObject().clickHomeButton();
				super.pause(10);
				
				 try {
					  if(new HomePage().banner.isDisplayed()){
						  new HomePage().ConnectToMaxRouter(this.ssidName, this.ssidpass, this.udid);
					  }else {
						  utils.log().info("Remote access to your network is currently available");
					}
				}catch(Exception e) {}

				 softnetwork1.assertTrue(new HomePage().clickTapHereToTurnON());
					if (new HomePage().getSkipTutorialPageObject().isAt())
						softnetwork1.assertTrue(new HomePage().getSkipTutorialPageObject().clickSkipText());

					if (new HomePage().getNetworkOtptimizationPageObject().isAt()) {
						softnetwork1.assertTrue(new HomePage().getNetworkOtptimizationPageObject().verifyNetworkOptimizationPageUI());
						softnetwork1.assertTrue(new HomePage().getNetworkOtptimizationPageObject().clickOptimizationIcon());
					}
				softnetwork1.assertAll();
			}
			
			@Test(priority = 149, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Network_Optimization_Settings_Page() {
				SoftAssert softnetwork2 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) {
					softnetwork2.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().verifyNetworkOptimizationSettingsPageUI());
					softnetwork2.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().enableHealthOptimization());
					softnetwork2.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().verifyNetworkOptimizationSettingsEnabledPageUI());
				}
					
				softnetwork2.assertAll();
			}
			
			@Test(priority = 150, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Connected_Device_Signal_Strength_Sensitivity_Medium() {
				SoftAssert softnetwork3 = new SoftAssert();
				super.swipeDown();
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork3.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickConnectedDeviceSignalButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getConnectedDevicesPageObject().isAt()) 
						softnetwork3.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getConnectedDevicesPageObject().verifyConnectedDevicesPageUI());
					softnetwork3.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getConnectedDevicesPageObject().clickBackButton());
					
				softnetwork3.assertAll();
			}
			
			@Test(priority = 151, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Satellite_Signal_Strength_Sensitivity_Medium() {
				SoftAssert softnetwork4 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork4.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickSatelliteSignalButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteSignalPageObject().isAt()) 
						softnetwork4.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteSignalPageObject().verifySatelliteSignalStrengthsPageUI());
					softnetwork4.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteSignalPageObject().clickBackButton());
					
					softnetwork4.assertAll();
			}
			
			@Test(priority = 152, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Satellite_Link_Rate_Sensitivity_Medium() {
				SoftAssert softnetwork5 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork5.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickSatelliteLinkRateButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteLinkRatePageObject().isAt()) 
						softnetwork5.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteLinkRatePageObject().verifySatelliteLinkRatePageUI());
					softnetwork5.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteLinkRatePageObject().clickBackButton());
					
					softnetwork5.assertAll();
			}
			
			@Test(priority = 153, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_ISP_Speed_Link_Rate_Sensitivity_Medium() {
				SoftAssert softnetwork6 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork6.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickISPSpeedRateButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getISPSpeedRatePageObject().isAt()) 
						softnetwork6.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getISPSpeedRatePageObject().verifyISPSpeedRatePageUI());
					softnetwork6.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getISPSpeedRatePageObject().clickBackButton());
					
					softnetwork6.assertAll();
			}
			
			@Test(priority = 154, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Connected_Device_Signal_Strength_Sensitivity_High() {
				SoftAssert softnetwork7 = new SoftAssert();
				super.swipeDown();
				
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().tapHigh();
				
				softnetwork7.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickConnectedDeviceSignalButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getConnectedDevicesPageObject().isAt()) 
					softnetwork7.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getConnectedDevicesPageObject().verifyConnectedDevicesPageUI());
				softnetwork7.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getConnectedDevicesPageObject().clickBackButton());
					
				softnetwork7.assertAll();
			}
			
			@Test(priority = 155, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Satellite_Signal_Strength_Sensitivity_High() {
				SoftAssert softnetwork8 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork8.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickSatelliteSignalButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteSignalPageObject().isAt()) 
					softnetwork8.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteSignalPageObject().verifySatelliteSignalStrengthsPageUI());
				softnetwork8.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteSignalPageObject().clickBackButton());
					
				softnetwork8.assertAll();
			}
			
			@Test(priority = 156, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Satellite_Link_Rate_Sensitivity_High() {
				SoftAssert softnetwork9 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork9.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickSatelliteLinkRateButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteLinkRatePageObject().isAt()) 
						softnetwork9.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteLinkRatePageObject().verifySatelliteLinkRatePageUI());
					softnetwork9.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteLinkRatePageObject().clickBackButton());
					
					softnetwork9.assertAll();
			}
			
			@Test(priority = 157, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_ISP_Speed_Link_Rate_Sensitivity_High() {
				SoftAssert softnetwork10 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork10.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickISPSpeedRateButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getISPSpeedRatePageObject().isAt()) 
						softnetwork10.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getISPSpeedRatePageObject().verifyISPSpeedRatePageUI());
					softnetwork10.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getISPSpeedRatePageObject().clickBackButton());
					
					softnetwork10.assertAll();
			}
			
			@Test(priority = 158, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Connected_Device_Signal_Strength_Sensitivity_Low() {
				SoftAssert softnetwork11 = new SoftAssert();
				super.swipeDown();
				
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().tapLow();
				softnetwork11.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickConnectedDeviceSignalButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getConnectedDevicesPageObject().isAt()) 
						softnetwork11.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getConnectedDevicesPageObject().verifyConnectedDevicesPageUI());
					softnetwork11.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getConnectedDevicesPageObject().clickBackButton());
					
					softnetwork11.assertAll();
			}
			
			@Test(priority = 159, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Satellite_Signal_Strength_Sensitivity_Low() {
				SoftAssert softnetwork12 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork12.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickSatelliteSignalButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteSignalPageObject().isAt()) 
						softnetwork12.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteSignalPageObject().verifySatelliteSignalStrengthsPageUI());
					softnetwork12.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteSignalPageObject().clickBackButton());
					
					softnetwork12.assertAll();
			}
			
			@Test(priority = 160, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Satellite_Link_Rate__Sensitivity_Low() {
				SoftAssert softnetwork13 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork13.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickSatelliteLinkRateButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteLinkRatePageObject().isAt()) 
						softnetwork13.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteLinkRatePageObject().verifySatelliteLinkRatePageUI());
					softnetwork13.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getSatelliteLinkRatePageObject().clickBackButton());
					
					softnetwork13.assertAll();
			}
			
			@Test(priority = 161, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_ISP_Speed_Link_Rate_Sensitivity_Low() {
				SoftAssert softnetwork14 = new SoftAssert();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork14.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickISPSpeedRateButton());
				
				try {
					if(new AppRatingDialog().isAt())
						new AppRatingDialog().clickRemindMeLaterLink();
				}catch(Exception e){utils.log().info("App Rating Dialog did not appear");}
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getISPSpeedRatePageObject().isAt()) 
						softnetwork14.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getISPSpeedRatePageObject().verifyISPSpeedRatePageUI());
					softnetwork14.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().getISPSpeedRatePageObject().clickBackButton());
					
					if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
						new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().tapMedium();
					
			//		new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickBackButton();
					
					softnetwork14.assertAll();
			}
			
//			@Test(priority = 162, dependsOnMethods = { "Verify_Network_Health_Page" })
//			public void Verify_Network_Optimization_Recommendations() {
//				SoftAssert softnetwork15 = new SoftAssert();
//					
//				if(new HomePage().getNetworkOtptimizationPageObject().isAt()) 
//					softnetwork15.assertTrue(new HomePage().getNetworkOtptimizationPageObject().verifyNetworkAfterOptimization());	
//				
//				softnetwork15.assertTrue(new HomePage().getNetworkOtptimizationPageObject().clickSatelliteImage());
//				if(new HomePage().getNetworkOtptimizationPageObject().getSatellitePerformancePageObject().isAt())
//					new HomePage().getNetworkOtptimizationPageObject().getSatellitePerformancePageObject().clickBackButton();
//				
//				softnetwork15.assertTrue(new HomePage().getNetworkOtptimizationPageObject().clickDevicesImage());
//				if(new HomePage().getNetworkOtptimizationPageObject().getWifiClientConnectionPageObject().isAt())
//					new HomePage().getNetworkOtptimizationPageObject().getWifiClientConnectionPageObject().clickBackButton();
//				
//				softnetwork15.assertTrue(new HomePage().getNetworkOtptimizationPageObject().clickISPImage());
//				if(new HomePage().getNetworkOtptimizationPageObject().getISPClientConnectionPageObject().isAt())
//					new HomePage().getNetworkOtptimizationPageObject().getISPClientConnectionPageObject().clickBackButton();
//				
//				softnetwork15.assertTrue(new HomePage().getNetworkOtptimizationPageObject().clickLinkRateImage());
//				if(new HomePage().getNetworkOtptimizationPageObject().getSatellitePerformancePageObject().isAt())
//					new HomePage().getNetworkOtptimizationPageObject().getSatellitePerformancePageObject().clickBackButton();
//	
//				softnetwork15.assertAll();
//			}
			
			@Test(priority = 163, dependsOnMethods = { "Verify_Network_Health_Page" })
			public void Verify_Disabled_Network_Optimization_Settings() {
				SoftAssert softnetwork16 = new SoftAssert();
				
		//		new HomePage().getNetworkOtptimizationPageObject().clickOptimizationIcon();
					
				if(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().isAt()) 
					softnetwork16.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().disableHealthOptimization());
				
				if(new HomeNetowrkTurnOffNetworkOptimizationDialog().isAt())
					new HomeNetowrkTurnOffNetworkOptimizationDialog().clickTurnOffButton();
				super.pause(5);
				new HomePage().getFooterIconsPageObject().clickHomeButton();
							
//				softnetwork16.assertTrue(new HomePage().getNetworkOtptimizationPageObject().getOptimizationSettinsPageObject().clickBackButton());
//				softnetwork16.assertTrue(new HomePage().getNetworkOtptimizationPageObject().clickBackButton());

				softnetwork16.assertAll();
			}
			
						   
			  @Test(priority = 164)
			  public void Verify_Install_Left_Satellite() 
			  {
				    utils.log().info("                            ");
					utils.log().info("****************************");
					utils.log().info("Test: Install Satellite1    ");
					utils.log().info("****************************");
					
					SoftAssert softsatellite1 = new SoftAssert();
					
					performFactoryReset("Satellite1", "/dev/tty.usbserial-142310");
					
					try {
						  try {
							  if(new HomePage().banner.isDisplayed()){
								  new HomePage().ConnectToMaxRouter(this.ssidName, this.ssidpass, this.udid);
							  }else {utils.log().info("Remote access to your network is currently available");}
							 }catch(Exception e) {}
						  
				  			new HomePage().clickLeftSatelliteImage();
				  			new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton();
				  			
				  			try {
				  				if(new AddSatelliteAddNewSatellitePage1().isAt()) {
				  					new AddSatelliteAddNewSatellitePage1().clickNextButton();
				  					super.pause(35);
				  					}
					  		}catch(Exception e) {}
				  			
				  			try {
				  				if(new AddSatelliteAddNewSatellitePage2().isAt()) {
				  					
				  					utils.log().info("Turning OFF Wifi..........");
				  					((AndroidDriver) super.getDriver()).toggleWifi(); //trun off wifi
				  					super.pause(10);
				  					utils.log().info("Turning ON Wifi.........");
				  					((AndroidDriver) super.getDriver()).toggleWifi(); 
				  					super.pause(10);
				  					new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
				  					utils.log().info("Waiting for 120 seconds to establish connection with mainAP network SSID");
				  					super.pause(120);
				  					new AddSatelliteAddNewSatellitePage2().clickNextButton();//To continue with satellite install, please connect to arrisW31- network}
				  					super.waitForVisibility(new AddSatelliteUnpackYourSatellitePage().nextButton);
				  				}
				  			}catch(Exception e) {
								  new AddSatelliteAddNewSatellitePage2().clickCancelButton();
								  if(new HomePage().isAt()) {
									  new TapSevenTimes().tapSeven();
									  super.pause(5);
									  new SevenTapLogs().clickYesButton();
									  super.pause(5);
									  new SevenTapGmail().clickGmailIcon();
									  super.pause(5);
									  new SevenTapEmail().enterEmailAddress();
									  super.pause(5);
									  new SevenTapEmail().clickSendButton();
									  super.pause(5);
									  Assert.fail("Satellite 1 Onboarding - Satellite is not connected to the MainAP SSID");
									  new KillAndRelaunchApp().killApp();
									  new KillAndRelaunchApp().relaunchApp();
								  }
				  			}
				  			
				  			try {
				  				if(new AddSatelliteUnpackYourSatellitePage().isAt()) {
									new AddSatelliteUnpackYourSatellitePage().clickNextButton();
					  				super.waitForVisibility(new AddSatellitePlaceYourSatellitePage().skipButton);
				  				}
				  			}catch(Exception e) {
				  				super.pause(20);
				  				 new TapSevenTimes().tapSeven();
								  super.pause(5);
								  new SevenTapLogs().clickYesButton();
								  super.pause(5);
								  new SevenTapGmail().clickGmailIcon();
								  super.pause(5);
								  new SevenTapEmail().enterEmailAddress();
								  super.pause(5);
								  new SevenTapEmail().clickSendButton();
								  super.pause(5);
								  Assert.fail("Satellite 1 Onboarding - Failed at Unpack your satellite");
								  new KillAndRelaunchApp().killApp();
								  new KillAndRelaunchApp().relaunchApp();
				  			}
								
				  			try {
				  				if(new AddSatellitePlaceYourSatellitePage().isAt()) {
				  					new AddSatellitePlaceYourSatellitePage().clickSkipButton();
									super.waitForVisibility(new AddSatellitePlugInYourSatellitePage().nextButton);
				  				}
				  			}catch(Exception e) {
				  				super.pause(20);
				  				 new TapSevenTimes().tapSeven();
								  super.pause(5);
								  new SevenTapLogs().clickYesButton();
								  super.pause(5);
								  new SevenTapGmail().clickGmailIcon();
								  super.pause(5);
								  new SevenTapEmail().enterEmailAddress();
								  super.pause(5);
								  new SevenTapEmail().clickSendButton();
								  super.pause(5);
								  Assert.fail("Satellite 1 Onboarding - Failed at We did like to help you place your satellite");
								  new KillAndRelaunchApp().killApp();
								  new KillAndRelaunchApp().relaunchApp();
				  			}
							
							try {
								if(new AddSatellitePlugInYourSatellitePage().isAt()) {
									new AddSatellitePlugInYourSatellitePage().clickNextButton();
									utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
									super.pause(120);
								}
									
									try {
										if (new BlueToothConnectionFailedPage().isAt()) {
											new BlueToothConnectionFailedPage().clickTryAgainbutton();
											utils.log().info("Waiting for 120 seconds for your device to establish bluetooth connection");
											super.pause(120);
										}
									} catch (Exception e5) {
									}

									try {
										if (new BlueToothConnectionFailedPage().isAt()) {
											new BlueToothConnectionFailedPage().clickTryAgainbutton();
											utils.log().info("Waiting for 120 seconds for your device to establish bluetooth connection");
											super.pause(120);
										}
									} catch (Exception e7) {
									}

									try {
										if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
											new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
											new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
											utils.log().info("Waiting for 120 seconds for your device to establish bluetooth connection");
											super.pause(120);
										}
									} catch (Exception e8) {
									}
									
							}catch(Exception e) {
								 super.pause(120);
								  new TapSevenTimes().tapSeven();
								  super.pause(5);
								  new SevenTapLogs().clickYesButton();
								  super.pause(5);
								  new SevenTapGmail().clickGmailIcon();
								  super.pause(5);
								  new SevenTapEmail().enterEmailAddress();
								  super.pause(5);
								  new SevenTapEmail().clickSendButton();
								  super.pause(5);
								  Assert.fail("Satellite 1 Onboarding - Unable to plug in your mAX Router and connect to your Mobile Device due to blue tooth connection failure");
								  new KillAndRelaunchApp().killApp();
								  new KillAndRelaunchApp().relaunchApp();
								  
							}
							
							try {
//								super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
								if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
									new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
									utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
									super.pause(120);
								}
									
									try {
										if (new BlueToothConnectionFailedPage().isAt()) {
											new BlueToothConnectionFailedPage().clickTryAgainbutton();
											utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
											super.pause(120);
										}
										
										if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
											new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
											utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
											super.pause(120);
										}
									} catch (Exception e5) {
									}

									try {
										if (new BlueToothConnectionFailedPage().isAt()) {
											new BlueToothConnectionFailedPage().clickTryAgainbutton();
											utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
											super.pause(120);
										}
										
										if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
											new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
											utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
											super.pause(120);
										}
									} catch (Exception e7) {
									}

									try {
										if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
											new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
											new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
											super.pause(120);
										}
										
										if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
											new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
											utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
											super.pause(120);
										}
									} catch (Exception e8) {
									}
									
							}catch (Exception e9) {
								 super.pause(120);
								  new TapSevenTimes().tapSeven();
								  super.pause(5);
								  new SevenTapLogs().clickYesButton();
								  super.pause(5);
								  new SevenTapGmail().clickGmailIcon();
								  super.pause(5);
								  new SevenTapEmail().enterEmailAddress();
								  super.pause(5);
								  new SevenTapEmail().clickSendButton();
								  super.pause(5);
								  Assert.fail("Satellite 1 Onboarding - Unable to connect Max Router to your Mobile Device due to blue tooth connection failure");
								  new KillAndRelaunchApp().killApp();
								  new KillAndRelaunchApp().relaunchApp();
							}
							
						  
							try {
//								super.waitForVisibility(new AddSatelliteSuccessfullyConnectedToInternetPage().nextButton);
								if(new AddSatelliteSuccessfullyConnectedToInternetPage().isAt()) {
									new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton();
									super.waitForVisibility(new AddSatelliteUpToDatePage().nextButton);
									}

							}catch(Exception e) {
								 super.pause(120);
								  new TapSevenTimes().tapSeven();
								  super.pause(5);
								  new SevenTapLogs().clickYesButton();
								  super.pause(5);
								  new SevenTapGmail().clickGmailIcon();
								  super.pause(5);
								  new SevenTapEmail().enterEmailAddress();
								  super.pause(5);
								  new SevenTapEmail().clickSendButton();
								  super.pause(5);
								  Assert.fail("Satellite 1 Onboarding - Unable to connect your Satellite 1 to the Internet");
								  new KillAndRelaunchApp().killApp();
								  new KillAndRelaunchApp().relaunchApp();
							}
						  
							try {
								if(new AddSatelliteUpToDatePage().isAt()) {
									new AddSatelliteUpToDatePage().clickNextButton();
									super.waitForVisibility(new AddSatelliteRegistrationFailedPage().continueButton);
								}
							}catch(Exception e) {
								 super.pause(120);
								  new TapSevenTimes().tapSeven();
								  super.pause(5);
								  new SevenTapLogs().clickYesButton();
								  super.pause(5);
								  new SevenTapGmail().clickGmailIcon();
								  super.pause(5);
								  new SevenTapEmail().enterEmailAddress();
								  super.pause(5);
								  new SevenTapEmail().clickSendButton();
								  super.pause(5);
								  Assert.fail("Satellite 1 Onboarding - Unable to update firmware on Satellite 1 ");
								  new KillAndRelaunchApp().killApp();
								  new KillAndRelaunchApp().relaunchApp();
							}
							
							//Registering your device
							try {
								if(new AddSatelliteRegistrationFailedPage().isAt()) {
									new AddSatelliteRegistrationFailedPage().clickContinueButton();
									super.waitForVisibility(new AddSatelliteCongratulationsPage().continueButton);
								}
							} catch (Exception e13) {
								 super.pause(120);
								  new TapSevenTimes().tapSeven();
								  super.pause(5);
								  new SevenTapLogs().clickYesButton();
								  super.pause(5);
								  new SevenTapGmail().clickGmailIcon();
								  super.pause(5);
								  new SevenTapEmail().enterEmailAddress();
								  super.pause(5);
								  new SevenTapEmail().clickSendButton();
								  super.pause(5);
								  Assert.fail("Satellite 1 Onboarding - Failure to add Satellite ");
								  new KillAndRelaunchApp().killApp();
								  new KillAndRelaunchApp().relaunchApp();
							}

						  
							try {
								if(new AddSatelliteCongratulationsPage().isAt()) {
									new AddSatelliteCongratulationsPage().clickContinueButton();
									super.pause(20);
								}
							}catch(Exception e) {
								 super.pause(120);
								  new TapSevenTimes().tapSeven();
								  super.pause(5);
								  new SevenTapLogs().clickYesButton();
								  super.pause(5);
								  new SevenTapGmail().clickGmailIcon();
								  super.pause(5);
								  new SevenTapEmail().enterEmailAddress();
								  super.pause(5);
								  new SevenTapEmail().clickSendButton();
								  super.pause(5);
								  Assert.fail("Satellite 1 Onboarding - Failed at last step ");
								  new KillAndRelaunchApp().killApp();
								  new KillAndRelaunchApp().relaunchApp();
							}

							new HomePage().verifyLeftRouterDetails();
						
						softsatellite1.assertAll();		  
					
			  }catch(Exception e14) {
				  Assert.fail("Satellite 1 Onboarding - failed");
				  new KillAndRelaunchApp().killApp();
				  new KillAndRelaunchApp().relaunchApp();
			  }
		}



				
				@Test(priority = 165)
				public void Verify_Install_Right_Satellite()
				{
					utils.log().info("                             ");
					utils.log().info("*****************************");
					utils.log().info("Test: Install Satellite2     ");
					utils.log().info("*****************************");
					
					SoftAssert softsatellite2 = new SoftAssert();
					
					performFactoryReset("Satellite2", "/dev/tty.usbserial-142340");
					  
					  try {
						  
					  	  super.pause(10);
						  new KillAndRelaunchApp().killApp();
						  super.pause(5);
						  new KillAndRelaunchApp().relaunchApp();
						  super.pause(10);
					  						  
						  try {
							  if(new HomePage().banner.isDisplayed()){
								  new HomePage().ConnectToMaxRouter(this.ssidName, this.ssidpass, this.udid);
							  }else {utils.log().info("Remote access to your network is currently available");}
							 }catch(Exception e) {}
						  
						new HomePage().clickNavigationButton();
						new HomePage().getHamburgerMenuPageObject().clickAddSatelliteButton();
						new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton();
						super.pause(30);
						try {
							if(new AddSatelliteAddNewSatellitePage1().isAt()) {
								new AddSatelliteAddNewSatellitePage1().clickNextButton(); // Each satellite expands your network	
							}					
						}catch(Exception e) {
							new AddSatelliteAddNewSatellitePage1().clickCancelButton();
							super.pause(120);
							new TapSevenTimes().tapSeven();
							super.pause(5);
							new SevenTapLogs().clickYesButton();
							super.pause(5);
							new SevenTapGmail().clickGmailIcon();
							super.pause(5);
							new SevenTapEmail().enterEmailAddress();
							super.pause(5);
							new SevenTapEmail().clickSendButton();
							super.pause(5);
							Assert.fail("Satellite 2 Onboarding - Unable to add Satellite 2 as previously configured satellite still exists ");
							  new KillAndRelaunchApp().killApp();
							  new KillAndRelaunchApp().relaunchApp();
						}

						new AddSatelliteUnpackYourSatellitePage().clickNextButton();
						new AddSatellitePlaceYourSatellitePage().clickSkipButton();
						
						try {
							if(new AddSatellitePlugInYourSatellitePage().isAt()) {
								new AddSatellitePlugInYourSatellitePage().clickNextButton();
								utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
								super.pause(120);
							}

								try {
									if (new BlueToothConnectionFailedPage().isAt()) {
										new BlueToothConnectionFailedPage().clickTryAgainbutton();
										utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
										super.pause(120);
									}
								} catch (Exception e5) {
								}

								try {
									if (new BlueToothConnectionFailedPage().isAt()) {
										new BlueToothConnectionFailedPage().clickTryAgainbutton();
										utils.log().info("Waiting for 120 seconds for your device to establish bluetooth connection");
										super.pause(120);
									}
								} catch (Exception e7) {
								}

								try {
									if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
										new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
										new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
										utils.log().info("Waiting for 120 seconds for your device to establish bluetooth connection");
										super.pause(120);
									}
								} catch (Exception e8) {
								}

								
						}catch(Exception e) {
							new TapSevenTimes().tapSeven();
							super.pause(5);
							new SevenTapLogs().clickYesButton();
							super.pause(5);
							new SevenTapGmail().clickGmailIcon();
							super.pause(5);
							new SevenTapEmail().enterEmailAddress();
							super.pause(5);
							new SevenTapEmail().clickSendButton();
							super.pause(5);
							  Assert.fail("Satellite 2 Onboarding - Unable to connect Max Router to your Mobile Device due to blue tooth connection failure");
							  new KillAndRelaunchApp().killApp();
							  new KillAndRelaunchApp().relaunchApp();
						}
							
						try {
						//	super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
							if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
								new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
								utils.log().info("Waiting for 120 seconds to establish connection with Wifi");
								super.pause(120);
							}

								try {
									if (new BlueToothConnectionFailedPage().isAt()) {
										new BlueToothConnectionFailedPage().clickTryAgainbutton();
										utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
										super.pause(120);
									}
									
									if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
										new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
										utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
										super.pause(120);
									}
								} catch (Exception e5) {
								}

								try {
									if (new BlueToothConnectionFailedPage().isAt()) {
										new BlueToothConnectionFailedPage().clickTryAgainbutton();
										utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
										super.pause(120);
									}
									
									if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
										new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
										utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
										super.pause(120);
									}
								} catch (Exception e7) {
								}

								try {
									if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
										new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
										new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
										utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
										super.pause(120);
									}
									
									if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
										new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
										utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
										super.pause(120);
									}
								} catch (Exception e8) {
								}
								
						}catch (Exception e9) 
						{
								  new TapSevenTimes().tapSeven();
								  super.pause(5);
								  new SevenTapLogs().clickYesButton();
								  super.pause(5);
								  new SevenTapGmail().clickGmailIcon();
								  super.pause(5);
								  new SevenTapEmail().enterEmailAddress();
								  super.pause(5);
								  new SevenTapEmail().clickSendButton();
								  super.pause(5);
								  Assert.fail("Satellite 2 Onboarding - Unable to connect Max Router to your Mobile Device due to blue tooth connection failure");
								  new KillAndRelaunchApp().killApp();
								  new KillAndRelaunchApp().relaunchApp();
						}
				  
						try {
//							super.waitForVisibility(new AddSatelliteSuccessfullyConnectedToInternetPage().nextButton);
							if(new AddSatelliteSuccessfullyConnectedToInternetPage().isAt()) {
								new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton();
								super.waitForVisibility(new AddSatelliteUpToDatePage().nextButton);
							}
						}catch(Exception e) {
							  new TapSevenTimes().tapSeven();
							  super.pause(5);
							  new SevenTapLogs().clickYesButton();
							  super.pause(5);
							  new SevenTapGmail().clickGmailIcon();
							  super.pause(5);
							  new SevenTapEmail().enterEmailAddress();
							  super.pause(5);
							  new SevenTapEmail().clickSendButton();
							  super.pause(5);
							  Assert.fail("Satellite 2 Onboarding - Unable to connect your Satellite 2 to the Internet");
							  new KillAndRelaunchApp().killApp();
							  new KillAndRelaunchApp().relaunchApp();
						}

						try {
							if(new AddSatelliteUpToDatePage().isAt()) {
								new AddSatelliteUpToDatePage().clickNextButton();
								super.waitForVisibility(new AddSatelliteRegistrationFailedPage().continueButton);}
						}catch(Exception e) {
							  new TapSevenTimes().tapSeven();
							  super.pause(5);
							  new SevenTapLogs().clickYesButton();
							  super.pause(5);
							  new SevenTapGmail().clickGmailIcon();
							  super.pause(5);
							  new SevenTapEmail().enterEmailAddress();
							  super.pause(5);
							  new SevenTapEmail().clickSendButton();
							  super.pause(5);
							  Assert.fail("Satellite 2 Onboarding - Unable to update firmware on Satellite 2 ");
							  new KillAndRelaunchApp().killApp();
							  new KillAndRelaunchApp().relaunchApp();
						}
					
					//Registering your device
						try {
							if (new AddSatelliteRegistrationFailedPage().isAt()) {
								new AddSatelliteRegistrationFailedPage().clickContinueButton(); 
								super.waitForVisibility(new AddSatelliteCongratulationsPage().continueButton);
							}
						} catch (Exception e13) {
							  new TapSevenTimes().tapSeven();
							  super.pause(5);
							  new SevenTapLogs().clickYesButton();
							  super.pause(5);
							  new SevenTapGmail().clickGmailIcon();
							  super.pause(5);
							  new SevenTapEmail().enterEmailAddress();
							  super.pause(5);
							  new SevenTapEmail().clickSendButton();
							  super.pause(5);
							  Assert.fail("Satellite 2 Onboarding - Failure to add Satellite  ");
							  new KillAndRelaunchApp().killApp();
							  new KillAndRelaunchApp().relaunchApp();
						}	
					
						try {
							if(new AddSatelliteCongratulationsPage().isAt()) {
								new AddSatelliteCongratulationsPage().clickContinueButton();
								super.pause(20);
							}
						}catch(Exception e) {
							 super.pause(120);
							  new TapSevenTimes().tapSeven();
							  super.pause(5);
							  new SevenTapLogs().clickYesButton();
							  super.pause(5);
							  new SevenTapGmail().clickGmailIcon();
							  super.pause(5);
							  new SevenTapEmail().enterEmailAddress();
							  super.pause(5);
							  new SevenTapEmail().clickSendButton();
							  super.pause(5);
							  Assert.fail("Satellite 2 Onboarding - Failed on Congratulations Page ");
							  new KillAndRelaunchApp().killApp();
							  new KillAndRelaunchApp().relaunchApp();
						}
					
						new HomePage().verifyRightRouterDetails();
						
						softsatellite2.assertAll();
						
				  }catch(Exception e14) {
					  Assert.fail("Satellite 2 Onboarding - failed");
					  new KillAndRelaunchApp().killApp();
					  new KillAndRelaunchApp().relaunchApp();
				  }
			  }
				
				private void performFactoryReset(String satelliteName, String usbserial) {
					  try {
							utils.log().info("Factory Reset : " + satelliteName);
							SerialComPortCommunicator.resetMAXRouter(usbserial);
							utils.log().info("Waiting for 60 seconds to perform the Factory reset");
							super.pause(60);	
					  }catch(Exception e) {utils.log().info("Unable to Factory reset on : " + satelliteName);}
				}
				
				private boolean checkWifiExists() {
				  if(new InternetConnectionNotAvailable().isAt()) {
					 new InternetConnectionNotAvailable().connectToLocalWifi(this.localWifi, this.localWifiPwd, this.udid);
					 new InternetConnectionNotAvailable().clickTryAgainbutton();
					 super.waitForVisibility(new SelectYourDevicePage().selectYourDeviceNextButton);
					 return true;
				  }else {
					  utils.log().info("Internet Connection is already available");
					  return true;
					  } 
				}


}

					  
		