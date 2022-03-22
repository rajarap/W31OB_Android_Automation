package com.cs.arris.Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Pages.AccessResourcesOnDevicePage;
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
import com.cs.arris.Pages.BTPairingPage;
import com.cs.arris.Pages.BTPairingPanelPage;
import com.cs.arris.Pages.BTSwipePage;
import com.cs.arris.Pages.BTUnPairingPage;
import com.cs.arris.Pages.BTUnPairingRouterPage;
import com.cs.arris.Pages.BlueToothConnectionFailedPage;
import com.cs.arris.Pages.BlueToothConnectionFailedTroubleShootPage;
import com.cs.arris.Pages.BlueToothConnectionFailedTroubleShootProceedPage;
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
import com.cs.arris.Pages.InternetConnectionNotAvailable;
import com.cs.arris.Pages.NameYourNetwokSSIDPage;
import com.cs.arris.Pages.NetworkOptimizationDialog;
import com.cs.arris.Pages.NetworkOptimizationDialog2;
import com.cs.arris.Pages.OptimizeYourNetworkPage;
import com.cs.arris.Pages.PlugInMaxRouterPage;
import com.cs.arris.Pages.ResendOTPDialog;
import com.cs.arris.Pages.SelectYourDevicePage;
import com.cs.arris.Pages.SelectYourDevicePage2;
import com.cs.arris.Pages.SetUpYourWiFiManagementPage;
import com.cs.arris.Pages.SetupHomeNetworkPage;
import com.cs.arris.Pages.SiginPage;
import com.cs.arris.Pages.SignupPage;
import com.cs.arris.Pages.SystemFirmwareUpdatePage;
import com.cs.arris.Pages.TermsAndConditionsPage;
import com.cs.arris.Pages.UnPackYourBoxPage;
import com.cs.arris.Utilities.Direction;
import com.cs.arris.Utilities.KillAndRelaunchApp;
import com.cs.arris.Utilities.SevenTapEmail;
import com.cs.arris.Utilities.SevenTapGmail;
import com.cs.arris.Utilities.SevenTapLogs;
import com.cs.arris.Utilities.TapSevenTimes;
import com.cs.arris.Utilities.TestUtils;


public class TC0012_Test_SignUp_And_Onboard_Satellite extends ParentClass
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
		  utils.log().info("Manually switch on and reest your mAX MainAP Router");
			//Call factory reest method here and wait for 40 secnds for the device to emit blue and white led light.
			super.pause(20);
			utils.log().info("Pairing your Max router with your mobile");
	    	new BTSwipePage().swipeDownOnce(Direction.DOWN);
	    	new BTSwipePage().swipeDownTwice(Direction.DOWN);
	    	new BTSwipePage().clickBluetooth();
	    	new BTPairingPage().switchOffBluetooth();
	    	super.pause(5);
	    	new BTPairingPage().switchOnBluetooth();
	    	super.pause(10);
	    	new BTPairingPage().clickMAXRouter();;
			super.pause(5);
			if(new BTPairingPanelPage().isAt()) {
				new BTPairingPanelPage().clickOKButton();
			}
		  
		  try {
			  new GetStartedPage().clickGetStartedButton();
			  new GrantPermissionsPage().clickContinueButton();
			  new DeviceLocationPage().clickAllow();
			  super.pause(5);
			  new AccessResourcesOnDevicePage().clickAllow();
			  new SelectYourDevicePage().selectSurfboardMaxOption();
			  new SelectYourDevicePage().clickNextButton();
			  new SelectYourDevicePage2().selectMaxProAX11000RadioButton();
			  new SelectYourDevicePage2().clickNextButton();
			  super.pause(5);
			  
			  try {
				  do {
					  if(new InternetConnectionNotAvailable().isAt()) {
						  new ConnectionToWifiNeededPage().turnOnRouterWifi(this.localWifi, this.localWifiPwd, this.udid);
						  super.pause(10);
						  new InternetConnectionNotAvailable().clickTryAgainbutton();
						  new SelectYourDevicePage2().selectMaxProAX11000RadioButton();
						  new SelectYourDevicePage2().clickNextButton();
					  }
				  }while(new SiginPage().signUpButton.isDisplayed());
			  }catch(Exception e){}
			  
			  new SiginPage().clickSignUpButton();
			  email = new SignupPage().getEmailAddress(); 
			  new SignupPage().enterValidEmailAddress(email+"@mail7.io");
			  new SignupPage().enterFirstName(firstName);
			  new SignupPage().enterLastName(lastName);
			  new SignupPage().clickAgreeTermsAndConditionsCheckBox();
			  super.pause(5);
			  if(new TermsAndConditionsPage().isAt()) {
				for(int i=1; i<=17; i++) {
					super.swipeUp();
				}
				  super.pause(3);
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
			  super.pause(3);
			  new OptimizeYourNetworkPage().clickSkipOptimizeButton();
			  new SetupHomeNetworkPage().clickNextButton();
			  new UnPackYourBoxPage().clickNextButton();
			  new PlugInMaxRouterPage().clickNextButton();
			  super.pause(40);
				try {
					if(new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
						new BlueToothConnectionFailedPage().clickTryAgainbutton();
						super.pause(40);
					}
				}catch(Exception e) {}
			  new ConnectMaxRouterToMobileDevicePage().clickNextButton();
			  super.pause(20);
			  new ConnectMaxRouterToInternetPage().clickNextButton();
			  super.pause(20);
			  new SystemFirmwareUpdatePage().clickNextButton();
			  super.pause(10);
			  new ErrorCode_0000_1506_Warranty_Support_Page().clickContinueButton();	 
			  new NameYourNetwokSSIDPage().enterSSIDName(this.ssidName);
			  new NameYourNetwokSSIDPage().enterSSIDPassword(this.ssidpass);
			  new NameYourNetwokSSIDPage().clickNextButton();
			  super.pause(25);
			  new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
			  super.pause(15);
			  try {
				  if(new ConnectionToWifiNeededPage().continueButton.isDisplayed())
					  new ConnectionToWifiNeededPage().clickContinue();
			  }catch(Exception e) {}
			  super.pause(15);
//			  try {
//				  if(new ConnectionToWifiNeededPage().continueButton.isDisplayed())
//					  new ConnectionToWifiNeededPage().clickContinue();
//			  }catch(Exception e) {}
//			  super.pause(15);
			  new CongratulationsPage().clickContinueButton();
			  super.pause(5);
			  new SetUpYourWiFiManagementPage().clickskipTutorialButton();
			  super.pause(5);
			  new InstallAdditionalSatellitePage().clickInstallLaterButton();
			  super.pause(3);
			  new NetworkOptimizationDialog().clickOkButton();
			  super.pause(20);
			  try {
				  if(new NetworkOptimizationDialog2().okButton.isDisplayed()) 
					  new NetworkOptimizationDialog2().clickOkButton();
				  }catch(Exception e) {}
			  super.pause(35);
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
			  new SevenTapEmail().clickSendButton();
			  new KillAndRelaunchApp().killApp();
		  }
	  }
	  
	  
	   @Test(priority = 102, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
		public void Verify_Install_Left_Satellite() {
		   utils.log().info("                            ");
			utils.log().info("****************************");
			utils.log().info("Test: Install Left Satellite");
			utils.log().info("****************************");
			
			SoftAssert softsatellite1 = new SoftAssert();
			
			utils.log().info("Manually switch on and reest your first Satellite");
			super.pause(60);
	    	new BTSwipePage().swipeDownOnce(Direction.DOWN);
	    	new BTSwipePage().swipeDownTwice(Direction.DOWN);
	    	new BTSwipePage().clickBluetooth();
	    	new BTPairingPage().switchOffBluetooth();
	    	super.pause(5);
	    	new BTPairingPage().switchOnBluetooth();
	    	super.pause(10);
	    	new BTPairingPage().clickMAXRouter();;
			super.pause(5);
			if(new BTPairingPanelPage().isAt()) {
				new BTPairingPanelPage().clickOKButton();
			}
		
//			new HomePage().getFooterIconsPageObject().clickHomeButton();
			try {
				if (new HomePage().isAt())
					softsatellite1.assertTrue(new HomePage().clickLeftSatelliteImage());

				softsatellite1.assertTrue(new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton());
				super.pause(5);

				try {
					softsatellite1.assertTrue(new AddSatelliteAddNewSatellitePage1().clickNextButton()); // Each satellite expands your network
					super.pause(60);
					
					if(new AddSatelliteAddNewSatellitePage2().isAt()) {
						new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
						super.pause(10);
						new AddSatelliteAddNewSatellitePage2().clickNextButton();}		
					
					try {
						if(new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
							new BlueToothConnectionFailedPage().clickTryAgainbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
					try {
						if(new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
							new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
							new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
							super.pause(30);
						}
					}catch(Exception e) {}
					
				}catch(Exception e) {}
				


				try {
					softsatellite1.assertTrue(new AddSatelliteUnpackYourSatellitePage().clickNextButton());
					softsatellite1.assertTrue(new AddSatellitePlaceYourSatellitePage().clickSkipButton());
					softsatellite1.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
					super.pause(100);
					
					try {
						if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
							new BlueToothConnectionFailedPage().clickTryAgainbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
							new BlueToothConnectionFailedPage().clickTryAgainbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
							new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
							new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
				} catch (Exception e) {}
		
				softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
				super.pause(75);
				softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
				super.pause(20);
				softsatellite1.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
				super.pause(150);
				
				try {
					if (new AddSatelliteRegistrationFailedPage().isAt()) {
						softsatellite1.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton());
						super.pause(150);
					}
				} catch (Exception e) {	}

				softsatellite1.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
				super.pause(20);
				softsatellite1.assertTrue(new HomePage().verifyLeftRouterDetails());
			
			softsatellite1.assertAll();
		}catch(Exception e) {
//			  new TapSevenTimes().tapSeven();
//			  super.pause(3);
//			  new SevenTapLogs().clickYesButton();
//			  super.pause(3);
//			  new SevenTapGmail().clickGmailIcon();
//			  super.pause(3);
//			  new SevenTapEmail().enterEmailAddress();
//			  super.pause(3);
//			  new SevenTapEmail().clickSendButton();
			  new KillAndRelaunchApp().killApp();
			  super.pause(3);
			  new KillAndRelaunchApp().relaunchApp();
			  super.pause(15);
		}
	}


		
		@Test(priority = 120, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
		public void Verify_Install_Right_Satellite() {
			utils.log().info("                             ");
			utils.log().info("*****************************");
			utils.log().info("Test: Install Right Satellite ");
			utils.log().info("*****************************");
			
			SoftAssert softsatellite2 = new SoftAssert();
			utils.log().info("Manually switch on and reset your second Satellite");
			super.pause(60);
	    	new BTSwipePage().swipeDownOnce(Direction.DOWN);
	    	new BTSwipePage().swipeDownTwice(Direction.DOWN);
	    	new BTSwipePage().clickBluetooth();
	    	new BTPairingPage().switchOffBluetooth();
	    	super.pause(5);
	    	new BTPairingPage().switchOnBluetooth();
	    	super.pause(10);
	    	new BTPairingPage().clickMAXRouter();;
			super.pause(5);
			if(new BTPairingPanelPage().isAt()) {
				new BTPairingPanelPage().clickOKButton();
			}

			
//			new HomePage().getFooterIconsPageObject().clickHomeButton();
			try {

				if (new HomePage().isAt())
					softsatellite2.assertTrue(new HomePage().clickRightSatelliteImage());

				softsatellite2.assertTrue(new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton());
				super.pause(5);
				softsatellite2.assertTrue(new AddSatelliteAddNewSatellitePage1().clickNextButton()); // Each satellite expands your network
				super.pause(30);		

				try {
					softsatellite2.assertTrue(new AddSatelliteUnpackYourSatellitePage().clickNextButton());
					softsatellite2.assertTrue(new AddSatellitePlaceYourSatellitePage().clickSkipButton());
					softsatellite2.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
					super.pause(100);
					
					try {
						if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
							new BlueToothConnectionFailedPage().clickTryAgainbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
							new BlueToothConnectionFailedPage().clickTryAgainbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
							new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
							new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
				} catch (Exception e) {}
				
				softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
				super.pause(75);
				softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
				super.pause(20);
				softsatellite2.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
				super.pause(100);
				
				try {
					if (new AddSatelliteRegistrationFailedPage().isAt()) {
						softsatellite2.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton());
						super.pause(100);
					}
				} catch (Exception e) {	}
				

				softsatellite2.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
				super.pause(20);
				softsatellite2.assertTrue(new HomePage().verifyRightRouterDetails());
			
			softsatellite2.assertAll();
		}catch(Exception e) {
//			  new TapSevenTimes().tapSeven();
//			  super.pause(3);
//			  new SevenTapLogs().clickYesButton();
//			  super.pause(3);
//			  new SevenTapGmail().clickGmailIcon();
//			  super.pause(3);
//			  new SevenTapEmail().enterEmailAddress();
//			  super.pause(3);
//			  new SevenTapEmail().clickSendButton();
			  new KillAndRelaunchApp().killApp();
			  super.pause(3);
			  new KillAndRelaunchApp().relaunchApp();
			  super.pause(15);
		}
	}
			
		@Test(priority = 169)
		public void UnPair_W31_mAX_Router() 
		{
	    	new BTSwipePage().swipeDownOnce(Direction.DOWN);
	    	new BTSwipePage().swipeDownTwice(Direction.DOWN);
	    	new BTSwipePage().clickBluetooth();
	    	new BTPairingPage().clickDetailsButton();
	    	
			for(int i = 1; i <= 3; i++) {
				super.pause(5);
				new BTUnPairingPage().clickUnPairIcon();
				super.pause(3);
				new BTUnPairingRouterPage().clickUnPairOption();
			}
			new BTSwipePage().swipeUpOnce(Direction.UP);
		}

}










//@Test(priority = 2, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
//	public void Verify_Install_Left_Satellite() {
//		utils.log().info("                            ");
//		utils.log().info("****************************");
//		utils.log().info("Test: Install Left Satellite");
//		utils.log().info("****************************");
//		
//		SoftAssert softsatellite1 = new SoftAssert();
//		
//		utils.log().info("Manually switch on and reest your first Satellite");
//		super.pause(60);
// 	new BTSwipePage().swipeDownOnce(Direction.DOWN);
// 	new BTSwipePage().swipeDownTwice(Direction.DOWN);
// 	new BTSwipePage().clickBluetooth();
// 	new BTPairingPage().switchOffBluetooth();
// 	super.pause(5);
// 	new BTPairingPage().switchOnBluetooth();
// 	super.pause(10);
// 	new BTPairingPage().clickMAXRouter();;
//		super.pause(5);
//		if(new BTPairingPanelPage().isAt()) {
//			new BTPairingPanelPage().clickOKButton();
//		}
//	
////			new HomePage().getFooterIconsPageObject().clickHomeButton();
//		try {
//			if (new HomePage().isAt())
//				softsatellite1.assertTrue(new HomePage().clickLeftSatelliteImage());
//
//			softsatellite1.assertTrue(new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton());
//			super.pause(5);
//			softsatellite1.assertTrue(new AddSatelliteAddNewSatellitePage1().clickNextButton()); // Each satellite expands your network
//			super.pause(60);
//		//	super.waitFor(null);
//			
//			try {
//				if(new AddSatelliteAddNewSatellitePage2().isAt()) {
//					new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
//					super.pause(10);
//					new AddSatelliteAddNewSatellitePage2().clickNextButton();}				
//			}catch(Exception e) {}
//			
//			try {
//				if(new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//					new BlueToothPage().enableBlueTooth();
//					pause(5);
//					new BlueToothConnectionFailedPage().clickTryAgainbutton();
//					super.pause(30);
//				}
//			}catch(Exception e) {}
//			
//			try {
//				if(new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
//					new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
//					new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
//					super.pause(23);
//				}
//			}catch(Exception e) {}
//			
//			softsatellite1.assertTrue(new AddSatelliteUnpackYourSatellitePage().clickNextButton());
//			softsatellite1.assertTrue(new AddSatellitePlaceYourSatellitePage().clickSkipButton());
//			softsatellite1.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
//			super.pause(35);
//			try {
//				if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
////					new BlueToothPage().enableBlueTooth();
////					pause(5);
//					new BlueToothConnectionFailedPage().clickTryAgainbutton();
//					super.pause(30);
//				}
//			} catch (Exception e) {
//			}
//
//			try {
//				if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
//					new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
//					new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
//					super.pause(23);
//				}
//			} catch (Exception e) {
//			}
//			
//			
//			softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
//			super.pause(75);
//			softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
//			super.pause(20);
//			softsatellite1.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
//			super.pause(10);
//			try {
//				if (new AddSatelliteRegistrationFailedPage().isAt()) {
//					softsatellite1.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton());
//				}
//			} catch (Exception e) {	}
//			super.pause(60);
//			softsatellite1.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
//			super.pause(15);
//			softsatellite1.assertTrue(new HomePage().verifyLeftRouterDetails());
//		
//		softsatellite1.assertAll();
//	}catch(Exception e) {
//		  new TapSevenTimes().tapSeven();
//		  super.pause(3);
//		  new SevenTapLogs().clickYesButton();
//		  super.pause(3);
//		  new SevenTapGmail().clickGmailIcon();
//		  super.pause(3);
//		  new SevenTapEmail().enterEmailAddress();
//		  super.pause(3);
//		  new SevenTapEmail().clickSendButton();
//		  new KillAndRelaunchApp().killApp();
//		  super.pause(3);
//		  new KillAndRelaunchApp().relaunchApp();
//		  super.pause(15);
//	}
//}
//
//
//	
//	@Test(priority = 3, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
//	public void Verify_Install_Right_Satellite() {
//		utils.log().info("                             ");
//		utils.log().info("*****************************");
//		utils.log().info("Test: Install Right Satellite ");
//		utils.log().info("*****************************");
//		
//		SoftAssert softsatellite2 = new SoftAssert();
//		utils.log().info("Manually switch on and reset your second Satellite");
//		super.pause(60);
// 	new BTSwipePage().swipeDownOnce(Direction.DOWN);
// 	new BTSwipePage().swipeDownTwice(Direction.DOWN);
// 	new BTSwipePage().clickBluetooth();
// 	new BTPairingPage().switchOffBluetooth();
// 	super.pause(5);
// 	new BTPairingPage().switchOnBluetooth();
// 	super.pause(10);
// 	new BTPairingPage().clickMAXRouter();;
//		super.pause(5);
//		if(new BTPairingPanelPage().isAt()) {
//			new BTPairingPanelPage().clickOKButton();
//		}
//
//		
////		new HomePage().getFooterIconsPageObject().clickHomeButton();
//		try {
//
//			if (new HomePage().isAt())
//				softsatellite2.assertTrue(new HomePage().clickRightSatelliteImage());
//
//			softsatellite2.assertTrue(new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton());
//			super.pause(5);
//			softsatellite2.assertTrue(new AddSatelliteAddNewSatellitePage1().clickNextButton()); // Each satellite expands your network
//			super.pause(30);
//			
////			try {
////				softsatellite2.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
////				super.pause(100);
////				
////				try {
////					if(new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
////						new BlueToothPage().enableBlueTooth();
////						pause(5);
////						new BlueToothConnectionFailedPage().clickTryAgainbutton();
////						super.pause(30);
////					}
////				}catch(Exception e) {}
////				
////				try {
////					if(new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
////						new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
////						new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
////						super.pause(23);
////					}
////				}catch(Exception e) {}
////			}catch(Exception e) {}
//			
//			softsatellite2.assertTrue(new AddSatelliteUnpackYourSatellitePage().clickNextButton());
//			softsatellite2.assertTrue(new AddSatellitePlaceYourSatellitePage().clickSkipButton());
//			softsatellite2.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
//			super.pause(60);
//			try {
//				if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
////					new BlueToothPage().enableBlueTooth();
////					pause(5);
//					new BlueToothConnectionFailedPage().clickTryAgainbutton();
//					super.pause(30);
//				}
//			} catch (Exception e) {
//			}
//
//			try {
//				if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
//					new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
//					new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
//					super.pause(23);
//				}
//			} catch (Exception e) {
//			}
//
//			
//			softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
//			super.pause(75);
//			softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
//			super.pause(20);
//			softsatellite2.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
//			super.pause(10);
//			try {
//				if (new AddSatelliteRegistrationFailedPage().isAt()) {
//					softsatellite2.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton());
//				}
//			} catch (Exception e) {	}
//			super.pause(60);
//			softsatellite2.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
//			super.pause(15);
//			softsatellite2.assertTrue(new HomePage().verifyRightRouterDetails());
//		
//		softsatellite2.assertAll();
//	}catch(Exception e) {
//		  new TapSevenTimes().tapSeven();
//		  super.pause(3);
//		  new SevenTapLogs().clickYesButton();
//		  super.pause(3);
//		  new SevenTapGmail().clickGmailIcon();
//		  super.pause(3);
//		  new SevenTapEmail().enterEmailAddress();
//		  super.pause(3);
//		  new SevenTapEmail().clickSendButton();
//		  new KillAndRelaunchApp().killApp();
//		  super.pause(3);
//		  new KillAndRelaunchApp().relaunchApp();
//		  super.pause(15);
//	}
//}
