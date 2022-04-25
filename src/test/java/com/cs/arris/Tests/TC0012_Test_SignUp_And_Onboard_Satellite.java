package com.cs.arris.Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

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
import com.cs.arris.Pages.RemoteAccessUnavailableTroubleShootPage;
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
				  new SelectYourDevicePage().selectSurfboardMaxOption();
				  new SelectYourDevicePage().clickNextButton();
				  new SelectYourDevicePage2().selectMaxProAX11000RadioButton();
				  new SelectYourDevicePage2().clickNextButton();
				  new SiginPage().clickSignUpButton();
				  email = new SignupPage().getEmailAddress(); 
				  new SignupPage().enterValidEmailAddress(email+"@mailinator.com");
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
							if(new MultipleDevicesFoundPage().isAt()) {
								Assert.fail("Main AP Onboarding - Multiple devices were found");
							}
						} catch (Exception e5) {}

						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								super.pause(120);
							}
						} catch (Exception e5) {}

						try {
							if (new BlueToothConnectionFailedPage().isAt()) {
								new BlueToothConnectionFailedPage().clickTryAgainbutton();
								super.pause(120);
							}
						} catch (Exception e7) {}

						try {
							if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
								new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
								new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
								super.pause(120);
							}
						} catch (Exception e8) {}
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
						Assert.fail("Main AP Onboarding - Either multiple devices were found or blue tooth connection failed");
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
								utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
								super.pause(120);
							}
							super.waitForVisibility(new ConnectMaxRouterToMobileDevicePage().nextButton);
							if (new ConnectMaxRouterToMobileDevicePage().isAt()) {
								new ConnectMaxRouterToMobileDevicePage().clickNextButton();
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
							super.waitForVisibility(new ConnectMaxRouterToMobileDevicePage().nextButton);
							if (new ConnectMaxRouterToMobileDevicePage().isAt()) {
								new ConnectMaxRouterToMobileDevicePage().clickNextButton();
							utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
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
							super.waitForVisibility(new ConnectMaxRouterToMobileDevicePage().nextButton);
							if (new ConnectMaxRouterToMobileDevicePage().isAt()) {
								new ConnectMaxRouterToMobileDevicePage().clickNextButton();
							utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
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
						Assert.fail("Main AP Onboarding - Unable to connect Max Router to your Mobile Device due to blue tooth connection failure2");
						new KillAndRelaunchApp().killApp();
					}
					
					try {
						super.waitForVisibility(new ConnectMaxRouterToInternetPage().nextButton);
						if (new ConnectMaxRouterToInternetPage().isAt()) {
							new ConnectMaxRouterToInternetPage().clickNextButton();
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
				  super.pause(60);
				  
				  
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
	
	
	  @Test(priority = 164, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
	  public void Verify_Install_Left_Satellite() 
	  {
		    utils.log().info("                            ");
			utils.log().info("****************************");
			utils.log().info("Test: Install Satellite1    ");
			utils.log().info("****************************");
			
			SoftAssert softsatellite1 = new SoftAssert();
			
			new HomePage().getFooterIconsPageObject().clickHomeButton();
			
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
		  				if(new AddSatelliteAddNewSatellitePage2().isAt()) 
		  				{
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
						super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
						if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
							new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
							utils.log().info("Waiting for 120 seconds to connect you max router to the internet");
							super.pause(120);
						}
							
							try {
								if (new BlueToothConnectionFailedPage().isAt()) {
									new BlueToothConnectionFailedPage().clickTryAgainbutton();
									utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
									super.pause(120);
                                  
                              	super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
										if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
										new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
										utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
										super.pause(120);
                                  	}
									}
							} catch (Exception e5) {
							}

							try {
								if (new BlueToothConnectionFailedPage().isAt()) {
									new BlueToothConnectionFailedPage().clickTryAgainbutton();
									utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
									super.pause(120);
                                  
                              	super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
										if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
										new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
										utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
										super.pause(120);
										}
                              	}
							} catch (Exception e7) {
							}

							try {
								if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
									new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
									new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
									super.pause(120);
							
									super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
									if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
										new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
										utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
										super.pause(120);
										}
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
						super.waitForVisibility(new AddSatelliteSuccessfullyConnectedToInternetPage().nextButton);
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



		
		@Test(priority = 165, dependsOnMethods = { "Verify_SignUp_And_Onboard" })
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
				  super.pause(20);
			  						  
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
						super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
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
                                  
                              	super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
										if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
										new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
										utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
										super.pause(120);
                                  	}
									}
							} catch (Exception e5) {
							}

							try {
								if (new BlueToothConnectionFailedPage().isAt()) {
									new BlueToothConnectionFailedPage().clickTryAgainbutton();
									utils.log().info("Waiting for 120 seconds to establish connection with bluetooth");
									super.pause(120);
                                  
                              	super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
										if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
										new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
										utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
										super.pause(120);
										}
                              	}
							} catch (Exception e7) {
							}

							try {
								if (new BlueToothConnectionFailedTroubleShootPage().isAt()) {
									new BlueToothConnectionFailedTroubleShootPage().clickTroubleShootButton();
									new BlueToothConnectionFailedTroubleShootProceedPage().clickProceedbutton();
									super.pause(120);
							
									super.waitForVisibility(new AddSatelliteSuccessfullyConnectedPage().nextButton);
									if(new AddSatelliteSuccessfullyConnectedPage().isAt()) {
										new AddSatelliteSuccessfullyConnectedPage().clickNextButton();
										utils.log().info("Waiting for 120 seconds to establish wifi connection with internet");
										super.pause(120);
										}
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
					super.waitForVisibility(new AddSatelliteSuccessfullyConnectedToInternetPage().nextButton);
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