package com.cs.arris.Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import java.time.Duration;

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
import com.cs.arris.Pages.AttentionPage;
import com.cs.arris.Pages.BTPairingPage;
import com.cs.arris.Pages.BTPairingPanelPage;
import com.cs.arris.Pages.BTPairingScanPage;
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
import com.cs.arris.Pages.ForgetNetworkConnectionsPage;
import com.cs.arris.Pages.ForgetNetworkPasswordPage;
import com.cs.arris.Pages.ForgetNetworkSettings;
import com.cs.arris.Pages.ForgetNetworkWifiPage;
import com.cs.arris.Pages.GetStartedPage;
import com.cs.arris.Pages.GrantPermissionsPage;
import com.cs.arris.Pages.HomePage;
import com.cs.arris.Pages.InstallAdditionalSatellitePage;
import com.cs.arris.Pages.InternetConnectionNotAvailable;
import com.cs.arris.Pages.MultipleDevicesFoundPage;
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
import com.cs.arris.Utilities.SerialComPortCommunicator;
import com.cs.arris.Utilities.SevenTapEmail;
import com.cs.arris.Utilities.SevenTapGmail;
import com.cs.arris.Utilities.SevenTapLogs;
import com.cs.arris.Utilities.TapSevenTimes;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


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
		  try {
			  new GetStartedPage().clickGetStartedButton();
			  new GrantPermissionsPage().clickContinueButton();
			  new DeviceLocationPage().clickAllow();
			  super.pause(2);
			  new AccessResourcesOnDevicePage().clickAllow();
			  
			  try {
				  if(new InternetConnectionNotAvailable().isAt()) {
					  new InternetConnectionNotAvailable().connectToLocalWifi(this.localWifi, this.localWifiPwd, this.udid);
					  new InternetConnectionNotAvailable().clickTryAgainbutton();
				  super.pause(5);}
			  }catch(Exception e) {utils.log().info("Internet Connection is Available");} 

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
			  new PlugInMaxRouterPage().clickNextButton();
			  super.pause(40);
			  new ConnectMaxRouterToMobileDevicePage().clickNextButton(); //Successfully connected
			  new ConnectMaxRouterToInternetPage().clickNextButton();
			  new SystemFirmwareUpdatePage().clickNextButton();
			  new ErrorCode_0000_1506_Warranty_Support_Page().clickContinueButton();	 
			  new NameYourNetwokSSIDPage().enterSSIDName(this.ssidName);
			  new NameYourNetwokSSIDPage().enterSSIDPassword(this.ssidpass);
			  new NameYourNetwokSSIDPage().clickNextButton();
			  new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
			  try {
				  if(new ConnectionToWifiNeededPage().continueButton.isDisplayed()) {
					  new ConnectionToWifiNeededPage().turnOnRouterWifi(this.ssidName, this.ssidpass, this.udid);
					  new ConnectionToWifiNeededPage().clickContinue();}
			  }catch(Exception e) {}
			  super.pause(5);
			  new CongratulationsPage().clickContinueButton();
			  new SetUpYourWiFiManagementPage().clickskipTutorialButton();
			  new InstallAdditionalSatellitePage().clickInstallLaterButton();
			  new NetworkOptimizationDialog().clickOkButton();
			  super.pause(50);
			  try {
				  if(new NetworkOptimizationDialog2().okButton.isDisplayed()) 
					  new NetworkOptimizationDialog2().clickOkButton();
				  }catch(Exception e) {}
			  new HomePage().getSSIDName();  
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
			  new KillAndRelaunchApp().killApp();
		  }
	  }
	
	   @Test(priority = 102)
		public void Verify_Install_Left_Satellite() {
		    utils.log().info("                            ");
			utils.log().info("****************************");
			utils.log().info("Test: Install Satellite1    ");
			utils.log().info("****************************");
			
			SoftAssert softsatellite1 = new SoftAssert();

			  try {
					utils.log().info("Factory Reset Satellite 1");
					SerialComPortCommunicator.resetMAXRouter("/dev/tty.usbserial-142340");
					super.pause(75);	

			  }catch(Exception e) {utils.log().info("Unable to Factory reset satellite 1");}

			try {
				if (new HomePage().isAt())
					softsatellite1.assertTrue(new HomePage().clickLeftSatelliteImage());

				softsatellite1.assertTrue(new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton());
				
				softsatellite1.assertTrue(new AddSatelliteAddNewSatellitePage1().clickNextButton()); // Each satellite expands your network
				super.pause(30);
				 //Please connect to continue with satellite install
				
					try {
						softsatellite1.assertTrue(new AddSatelliteAddNewSatellitePage2().clickNextButton());
						super.pause(100);
						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								super.pause(100);}
							}catch(Exception e) {}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
							new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
							new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
							super.pause(100);
						}
					}catch(Exception e) {}

				
				softsatellite1.assertTrue(new AddSatelliteUnpackYourSatellitePage().clickNextButton());
				softsatellite1.assertTrue(new AddSatellitePlaceYourSatellitePage().clickSkipButton());

					
					try {
						softsatellite1.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
						super.pause(100);
						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								super.pause(100);}
							}catch(Exception e) {}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedPage().isAt()) {
							new BlueToothConnectionFailedPage().clickTryAgainbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
							new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
							new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
		
				softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
				super.pause(75);
				softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
				super.pause(15);
				softsatellite1.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
				super.pause(15);
				//Registering device
				try {
					if (new AddSatelliteRegistrationFailedPage().isAt()) {
						softsatellite1.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton());
					}
				} catch (Exception e) {	}
				super.pause(35);
				//Finalizing your setup
				softsatellite1.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
				super.pause(20);
				softsatellite1.assertTrue(new HomePage().verifyLeftRouterDetails());
			
			softsatellite1.assertAll();
			
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
			  new KillAndRelaunchApp().killApp();
			  new KillAndRelaunchApp().relaunchApp();
		}
	}


		
		@Test(priority = 120)
		public void Verify_Install_Right_Satellite() {
			utils.log().info("                             ");
			utils.log().info("*****************************");
			utils.log().info("Test: Install Satellite2     ");
			utils.log().info("*****************************");
			
			SoftAssert softsatellite2 = new SoftAssert();
			  try {
					utils.log().info("Factory Reset Satellite 2");
					SerialComPortCommunicator.resetMAXRouter("/dev/tty.usbserial-142310");
					super.pause(75);
			  }catch(Exception e) {utils.log().info("Unable to Factory reset satellite 2");}

			try {

				if (new HomePage().isAt()) {
					softsatellite2.assertTrue(new HomePage().clickNavigationButton());
					softsatellite2.assertTrue(new HomePage().getHamburgerMenuPageObject().clickAddSatelliteButton());}

				softsatellite2.assertTrue(new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton());
				softsatellite2.assertTrue(new AddSatelliteAddNewSatellitePage1().clickNextButton()); // Each satellite expands your network
				softsatellite2.assertTrue(new AddSatelliteUnpackYourSatellitePage().clickNextButton());
				softsatellite2.assertTrue(new AddSatellitePlaceYourSatellitePage().clickSkipButton());

					try {
						softsatellite2.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
						super.pause(100);
						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								super.pause(100);}
							}catch(Exception e) {}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedPage().isAt()) {
							new BlueToothConnectionFailedPage().clickTryAgainbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
							new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
							new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
							super.pause(100);
						}
					}catch(Exception e) {}

				
				try {	
					try {
						softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
						super.pause(75);
						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								super.pause(100);}
							}catch(Exception e) {}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedPage().isAt()) {
							new BlueToothConnectionFailedPage().clickTryAgainbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
					
					try {
						if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
							new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
							new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
							super.pause(100);
						}
					}catch(Exception e) {}
				}catch (Exception e) {}
				
//				softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
				softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
				super.pause(15);
				softsatellite2.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
				super.pause(15);
				//Registering your device
				try {
					if (new AddSatelliteRegistrationFailedPage().isAt()) {
						softsatellite2.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton()); 
					}
				} catch (Exception e) {	}
				//Finalizing your setup
				super.pause(35);
				softsatellite2.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
				super.pause(30);
				softsatellite2.assertTrue(new HomePage().verifyRightRouterDetails());
			
			softsatellite2.assertAll();
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
			  new KillAndRelaunchApp().killApp();
			  new KillAndRelaunchApp().relaunchApp();
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//try {
//if(new AddSatelliteAddNewSatellitePage2().isAt()) {
//	softsatellite1.assertTrue(new AddSatelliteAddNewSatellitePage2().clickNextButton());
//	super.pause(100);
//}
//}catch(Exception e) {}
	
	
	
	
	
	
	
	  
	  
//	   @Test(priority = 102)
//		public void Verify_Install_Left_Satellite() {
//		   utils.log().info("                             ");
//			utils.log().info("****************************");
//			utils.log().info("Test: Install Satellite1    ");
//			utils.log().info("****************************");
//			
//			SoftAssert softsatellite1 = new SoftAssert();
//			
////			utils.log().info("Manually switch on your first satellite");
////			super.pause(45);
//			  try {
//					utils.log().info("Factory Reset Satellite 1");
//					SerialComPortCommunicator.resetMAXRouter("/dev/tty.usbserial-142340");
//					super.pause(75);	
//
//			  }catch(Exception e) {utils.log().info("Unable to Factory reset satellite 1");}
//
//			try {
//				if (new HomePage().isAt()) {
//					softsatellite1.assertTrue(new HomePage().clickLeftSatelliteImage());
//
//				softsatellite1.assertTrue(new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton());
//				softsatellite1.assertTrue(new AddSatelliteAddNewSatellitePage1().clickNextButton()); // Each satellite expands your network
//				super.pause(20);
//				softsatellite1.assertTrue(new AddSatelliteAddNewSatellitePage2().clickNextButton());//Please connect to continue with satellite install
//				super.pause(60);
//				}
//
//				try {
//					if(new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) 
//					{
//							new BlueToothConnectionFailedPage().clickTryAgainbutton();
//							super.pause(100);
//							softsatellite1.assertTrue(new AddSatelliteUnpackYourSatellitePage().clickNextButton());
//							softsatellite1.assertTrue(new AddSatellitePlaceYourSatellitePage().clickSkipButton());
//							softsatellite1.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
//							super.pause(75);
//							
//							try {
//								if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//									new BlueToothConnectionFailedPage().clickTryAgainbutton();
//									super.pause(100);}
//							}catch(Exception e) {}
//							
//							try {
//								if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//									new BlueToothConnectionFailedPage().clickTryAgainbutton();
//									super.pause(100);}
//							}catch(Exception e) {}
//							
//							try {
//								if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
//									new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
//									new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
//									super.pause(100);}
//							}catch(Exception e) {}
//				
//							softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
//							super.pause(75);
//							softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
//							super.pause(15);
//							softsatellite1.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
//							super.pause(15);
//							//Registering device
//							try {
//								if (new AddSatelliteRegistrationFailedPage().isAt()) {
//									softsatellite1.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton());}
//							}catch (Exception e) {	}
//							super.pause(55);
//							//Finalizing your setup
//							softsatellite1.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
//							super.pause(20);
//							softsatellite1.assertTrue(new HomePage().verifyLeftRouterDetails());
//					
//					}else {
//						if(new AddSatelliteUnpackYourSatellitePage().unpackYourSatelliteTitle.isDisplayed()) {
//							softsatellite1.assertTrue(new AddSatelliteUnpackYourSatellitePage().clickNextButton());
//							softsatellite1.assertTrue(new AddSatellitePlaceYourSatellitePage().clickSkipButton());
//							softsatellite1.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
//							super.pause(75);
//						
//							try {
//							if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//								new BlueToothConnectionFailedPage().clickTryAgainbutton();
//								super.pause(100);}
//							}catch(Exception e) {}
//						
//							try {
//								if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//									new BlueToothConnectionFailedPage().clickTryAgainbutton();
//									super.pause(100);}
//							}catch(Exception e) {}
//						
//							try {
//								if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
//								new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
//								new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
//								super.pause(100);}
//							}catch(Exception e) {}
//			
//							softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
//							super.pause(75);
//							softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
//							super.pause(15);
//							softsatellite1.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
//							super.pause(15);
//							//Registering device
//							try {
//								if (new AddSatelliteRegistrationFailedPage().isAt()) {
//									softsatellite1.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton());}
//							} catch (Exception e) {	}
//							super.pause(55);
//							//Finalizing your setup
//							softsatellite1.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
//							super.pause(20);
//							softsatellite1.assertTrue(new HomePage().verifyLeftRouterDetails());}
//					}
//				}catch(Exception e) {}
//
//				softsatellite1.assertAll();
//			
//			}catch(Exception e) {
////				  new TapSevenTimes().tapSeven();
////				  super.pause(5);
////				  if(new SevenTapLogs().isAt()) {
////					  new SevenTapLogs().clickYesButton();
////					  super.pause(5);
////				  }
////				  if(new SevenTapGmail().isAt()) {
////					  new SevenTapGmail().clickGmailIcon();
////					  super.pause(5);
////				  }
////				  if(new SevenTapEmail().isAt()) {
////					  new SevenTapEmail().enterEmailAddress();
////					  super.pause(5);
////					  new SevenTapEmail().clickSendButton();
////					  super.pause(5);
////				  }
////			  new KillAndRelaunchApp().killApp();
////			  new KillAndRelaunchApp().relaunchApp();
//				  
//				  if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//						new BlueToothConnectionFailedPage().clickTryAgainbutton();
//						super.pause(100);}
//				  
//				  try {
//						if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
//							new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
//							new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
//							super.pause(100);
//						}
//					}catch(Exception e1) {}
//				  
//				    softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
//					super.pause(75);
//					softsatellite1.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
//					super.pause(15);
//					softsatellite1.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
//					super.pause(15);
//					//Registering device
//					try {
//						if (new AddSatelliteRegistrationFailedPage().isAt()) {
//							softsatellite1.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton());
//						}
//					} catch (Exception e1) {	}
//					super.pause(55);
//					//Finalizing your setup
//					softsatellite1.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
//					super.pause(20);
//					softsatellite1.assertTrue(new HomePage().verifyLeftRouterDetails());
//				
//					softsatellite1.assertAll();
//		}
//	}
//
//
//		
//		@Test(priority = 120)
//		public void Verify_Install_Right_Satellite() {
//			utils.log().info("                             ");
//			utils.log().info("*****************************");
//			utils.log().info("Test: Install Satellite2     ");
//			utils.log().info("*****************************");
//			
//			SoftAssert softsatellite2 = new SoftAssert();
////			utils.log().info("Manually switch on your second satellite");
////			super.pause(45);
//			  try {
//					utils.log().info("Factory Reset Satellite 2");
//					SerialComPortCommunicator.resetMAXRouter("/dev/tty.usbserial-142310");
//					super.pause(75);
//			  }catch(Exception e) {utils.log().info("Unable to Factory reset satellite 2");}
//
//			try {
//
//				if (new HomePage().isAt()) {
//					softsatellite2.assertTrue(new HomePage().clickNavigationButton());
//					softsatellite2.assertTrue(new HomePage().getHamburgerMenuPageObject().clickAddSatelliteButton());}
//
//				softsatellite2.assertTrue(new AddSatelliteInstallAdditionalSatelliteDialog().clickInstallSatelliteButton());
//				softsatellite2.assertTrue(new AddSatelliteAddNewSatellitePage1().clickNextButton()); // Each satellite expands your network
//				
//				softsatellite2.assertTrue(new AddSatelliteUnpackYourSatellitePage().clickNextButton());
//				softsatellite2.assertTrue(new AddSatellitePlaceYourSatellitePage().clickSkipButton());
//				softsatellite2.assertTrue(new AddSatellitePlugInYourSatellitePage().clickNextButton());
//				super.pause(75);
//				
//				try {
//					if(new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//							new BlueToothConnectionFailedPage().clickTryAgainbutton();
//							super.pause(100);
//							
//							try {
//								if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//									new BlueToothConnectionFailedPage().clickTryAgainbutton();
//									super.pause(100);}
//							}catch(Exception e) {}
//							
//							try {
//								if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionMessage.isDisplayed()) {
//									new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
//									new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
//									super.pause(100);}
//							}catch(Exception e) {}
//				
//							softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
//							super.pause(75);
//							softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
//							super.pause(15);
//							softsatellite2.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
//							super.pause(15);
//							//Registering device
//							try {
//								if (new AddSatelliteRegistrationFailedPage().isAt()) {
//									softsatellite2.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton());}
//							}catch (Exception e) {	}
//							super.pause(55);
//							//Finalizing your setup
//							softsatellite2.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
//							super.pause(30);
//							softsatellite2.assertTrue(new HomePage().verifyRightRouterDetails());
//					} else {
//						if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
//							softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
//							super.pause(75);
//						
//							try {
//								if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//									new BlueToothConnectionFailedPage().clickTryAgainbutton();
//									super.pause(100);
//								}
//							}catch(Exception e) {}
//						
//							try {
//								if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//									new BlueToothConnectionFailedPage().clickTryAgainbutton();
//									super.pause(100);
//								}
//							}catch(Exception e) {}
//						
//							try {
//								if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionFailedTroubleShootButton.isDisplayed()) {
//									new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
//									new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
//									super.pause(100);
//								}
//							}catch(Exception e) {}
//						}
//					}
//					}catch (Exception e) {}		
//			
//				softsatellite2.assertAll();
//			  
//			}catch(Exception e) {
////				  new TapSevenTimes().tapSeven();
////				  super.pause(5);
////				  if(new SevenTapLogs().isAt()) {
////					  new SevenTapLogs().clickYesButton();
////					  super.pause(5);
////				  }
////				  if(new SevenTapGmail().isAt()) {
////					  new SevenTapGmail().clickGmailIcon();
////					  super.pause(5);
////				  }
////				  if(new SevenTapEmail().isAt()) {
////					  new SevenTapEmail().enterEmailAddress();
////					  super.pause(5);
////					  new SevenTapEmail().clickSendButton();
////					  super.pause(5);
////				  }
////			  new KillAndRelaunchApp().killApp();
////			  new KillAndRelaunchApp().relaunchApp();
//				  
//					if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//						new BlueToothConnectionFailedPage().clickTryAgainbutton();
//						super.pause(100);
//					}
//					
//					try {
//						softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
//						super.pause(75);
//						
//						try {
//							if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//								new BlueToothConnectionFailedPage().clickTryAgainbutton();
//								super.pause(100);
//							}
//						}catch(Exception e1) {}
//						
//						try {
//							if (new BlueToothConnectionFailedPage().bluetoothConnectionFailed.isDisplayed()) {
//								new BlueToothConnectionFailedPage().clickTryAgainbutton();
//								super.pause(100);
//							}
//						}catch(Exception e1) {}
//						
//						try {
//							if (new BlueToothConnectionFailedTroubleShootPage().bluetoothConnectionFailedTroubleShootButton.isDisplayed()) {
//								new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
//								new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
//								super.pause(100);
//							}
//						}catch(Exception e1) {}
//					}catch (Exception e1) {}
//					
////					softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedPage().clickNextButton());
//					softsatellite2.assertTrue(new AddSatelliteSuccessfullyConnectedToInternetPage().clickNextButton());
//					super.pause(15);
//					softsatellite2.assertTrue(new AddSatelliteUpToDatePage().clickNextButton());
//					super.pause(15);
//					//Registering your device
//					try {
//						if (new AddSatelliteRegistrationFailedPage().isAt()) {
//							softsatellite2.assertTrue(new AddSatelliteRegistrationFailedPage().clickContinueButton()); 
//						}
//					} catch (Exception e1) {	}
//					//Finalizing your setup
//					super.pause(55);
//					softsatellite2.assertTrue(new AddSatelliteCongratulationsPage().clickContinueButton());
//					super.pause(30);
//					softsatellite2.assertTrue(new HomePage().verifyRightRouterDetails());
//				
//				softsatellite2.assertAll();
//		}
//	}

