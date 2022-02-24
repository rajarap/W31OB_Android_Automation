package com.cs.arris.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.Direction;
import com.cs.arris.Utilities.SwipeActions;
import com.cs.arris.Utilities.SwipeOnElement;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ParentalControlWithProfilesPage extends ParentClass implements Page {
	public TestUtils utils = new TestUtils();
	public SwipeActions swipe = new SwipeActions();
	public MobileElement me;
	public int counter = 1;
	public int elementX;
	public int elementY;
	int size;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/txtToolBarTitle']"),
			@AndroidBy(xpath = "//android.widget.TextView[@bounds='[359,149][721,223]']"),
			@AndroidBy(id = "com.arris.sbcBeta:id/txtToolBarTitle") })
	public MobileElement parentalControlTitle;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']"),
			@AndroidBy(xpath = "//android.widget.ImageButton[@bounds='[0,112][147,259]']") })
	public MobileElement backButton;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.ImageView[@resource-id='com.arris.sbcBeta:id/helpIcon']"),
			@AndroidBy(xpath = "//android.widget.ImageView[@bounds='[980,153][1046,219]']"),
			@AndroidBy(id = "com.arris.sbcBeta:id/helpIcon") })
	public MobileElement helpIcon;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.ImageView[@resource-id='com.arris.sbcBeta:id/img_toolbar_remote_lca"),
			@AndroidBy(xpath = "//android.widget.ImageView[@bounds='[909,154][972,217]']"),
			@AndroidBy(id = "com.arris.sbcBeta:id/img_toolbar_remote_lca") })
	public MobileElement cloudIcon;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_parental_view']"),
			@AndroidBy(xpath = "//android.widget.TextView[@bounds='[102,276][540,378]']"),
			@AndroidBy(id = "com.arris.sbcBeta:id/profile_parental_view") })
	public MobileElement profilesTab;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/blocked_parental_view']"),
			@AndroidBy(xpath = "//android.widget.TextView[@bounds='[540,276][978,378]']"),
			@AndroidBy(id = "com.arris.sbcBeta:id/blocked_parental_view") })
	public MobileElement currentlyBlockedTab;

//	@AndroidFindAll({
//			@AndroidBy(xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/parental_enable_disable']"), // toggle
//																														// Icon
//			@AndroidBy(xpath = "//android.widget.Switch[@text='ON']"),
//			@AndroidBy(xpath = "//android.widget.Switch[@bounds='[980,153][1046,219]']"),
//			@AndroidBy(id = "com.arris.sbcBeta:id/parental_enable_disable") })
//	public MobileElement parentalControlToggleIconON;

//	@AndroidFindAll({
//			@AndroidBy(xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/parental_enable_disable']"), // toggle
//																														// Icon
//			@AndroidBy(xpath = "//android.widget.Switch[@text='OFF']"),
//			@AndroidBy(xpath = "//android.widget.Switch[@bounds='[980,153][1046,219]']"),
//			@AndroidBy(id = "com.arris.sbcBeta:id/parental_enable_disable") })
//	public MobileElement parentalControlToggleIconOFF;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/parental_enable_disable' and @checked='true']")
	public MobileElement enableParentalControlToggleButton;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/parental_enable_disable' and @checked='false']")
	public MobileElement disableParentalControlToggleButton;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/pause_internet_enable_disable' and @checked='true']")
	public MobileElement enablePauseAllProfilesToggleButton;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/pause_internet_enable_disable' and @checked='false']")
	public MobileElement disablePauseAllProfilesToggleButton;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='true']")
	public MobileElement enableProfilesToggleButton;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='false']")
	public MobileElement disableProfilesToggleButton;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/add_profile']"),
			@AndroidBy(xpath = "//android.widget.TextView[@bounds='[722,671][978,735]']"),
			@AndroidBy(id = "com.arris.sbcBeta:id/add_profile") })
	public MobileElement addProfileLink;

	// when toggle button is off, add profile link is disabled
	// when toggle button is on, add profile link is enabled

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Enable Parental Control']") // Enable Parental Control Text
	public MobileElement enableParentalControlText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Enable/Disble For All Profiles']") 
	public MobileElement enableDisableProfileText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='User Profiles']") // User Profiles Text
	public MobileElement userProfilesText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pause All Profiles']") // Pause All Profiles Text
	public MobileElement pauseAllProfilesText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pause Internet Access for All Profiles']")
	public MobileElement pauseInternetAccessToAllText;
	
	//When there are no user profiles
	@AndroidFindBy(id = "com.arris.sbcBeta:id/heading_error_message")
	public MobileElement noProfilesText1;
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/heading_error_message_1")
	public MobileElement noProfilesText2;
	
	//Delete Associated Rules
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/delete")
	public MobileElement deleteProfileIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete']")
	public MobileElement deleteProfileLabel;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Are you sure you want delete this Profile? This action cannot be undone']")
	public MobileElement deleteProfileConfirmationText;
	
	//Delete Associated Rules

	
	public ParentalControlWithProfilesPage() {
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}

	public HomePage getHomePageObject() {
		HomePage homePage = new HomePage();
		return homePage;
	}

	// click currently blocked devices tab when enable parental control on profiles
	// tab is ON and profiles are blocked.
	public ParentalControlCurrentlyBlockedPage getParentalControlCurrentlyBlockedTabPageObject() {
		ParentalControlCurrentlyBlockedPage parentalControlCurrentlyBlockedTabPage = new ParentalControlCurrentlyBlockedPage();
		return parentalControlCurrentlyBlockedTabPage;
	}

	public FooterIconsPage getFooterIconsPageObject() {
		FooterIconsPage footerIconsPage = new FooterIconsPage();
		return footerIconsPage;
	}

	// click on currently blocked tab. Alert dialog should be displayed when enable
	// prarental control toggle button is off.
	public ParentalControlAlertDialog getParentalControlAlertDialogObject() {
		ParentalControlAlertDialog alertDialog = new ParentalControlAlertDialog();
		return alertDialog;
	}

	// On-click of Enable parent control toggle button sometime ratings page comes
	// up
	public AppRatingDialog getAppRatingDialogObject() {
		AppRatingDialog ratingDialog = new AppRatingDialog();
		return ratingDialog;
	}

	public ParentalControlAddProfileDialog getAddProfileDialogObject() {
		ParentalControlAddProfileDialog addProfileDialog = new ParentalControlAddProfileDialog();
		return addProfileDialog;
	}

	public ParentalControlUserProfilePage getUserProfilePageObject() {
		ParentalControlUserProfilePage userProfilePage = new ParentalControlUserProfilePage();
		return userProfilePage;
	}

	public ParentalControlHelpPage getParentalHelpPageObject() {
		ParentalControlHelpPage helpPage = new ParentalControlHelpPage();
		return helpPage;
	}

	public ParentalControlPauseInternetforAllProfilesDialog getPauseInternetForAllDialogObject() {
		ParentalControlPauseInternetforAllProfilesDialog pauseInternet = new ParentalControlPauseInternetforAllProfilesDialog();
		return pauseInternet;
	}

	public ParentalControlResumeInternetforAllProfilesDialog getResumeInternetForAllDialogObject() {
		ParentalControlResumeInternetforAllProfilesDialog resumeInternet = new ParentalControlResumeInternetforAllProfilesDialog();
		return resumeInternet;
	}

	public boolean verifyUIOnParentalControlProfilesPage() {
		utils.log().info("**********************************************************");
		utils.log().info("Verifying Objects on Parental Control - Profiles Tab      ");
		utils.log().info("**********************************************************");

		try {
			if (parentalControlTitle.isDisplayed())
				utils.log().info("Title - " + parentalControlTitle.getText() + " - is displayed");
			else
				utils.log().info("Parental Control Title Text is not displayed");

			if (backButton.isDisplayed())
				utils.log().info("Back Button is displayed");
			else
				utils.log().info("Back Button is not displayed");
			
			try {
				if (cloudIcon.isDisplayed())
					utils.log().info("Cloud Icon is displayed");
				}catch(Exception e) {utils.log().info("Cloud Icon is not displayed");}

			if (helpIcon.isDisplayed())
				utils.log().info("Help Icon is displayed");
			else
				utils.log().info("Help Icon is not displayed");

			if (profilesTab.isDisplayed())
				utils.log().info("Profiles Tab is displayed");
			else
				utils.log().info("Profiles Tab is not displayed");

			if (currentlyBlockedTab.isDisplayed())
				utils.log().info("Currently Blocked Tab is displayed");
			else
				utils.log().info("Currently Blocked Tab is not displayed");
			
			if (enableParentalControlText.isDisplayed())
				utils.log().info(enableParentalControlText.getText() + " text is displayed");
			else
				utils.log().info("Enable Parental Control Text is not displayed");
			
			try {
				if (disableParentalControlToggleButton.isDisplayed())
				utils.log().info("Parental Control Switch button is OFF");
			}catch(Exception exp) {utils.log().info("Parental Control is enabled");}
			
			try {
				if (enableParentalControlToggleButton.isDisplayed())
					utils.log().info("Parental Control Switch button is ON");
				}catch(Exception exp) {utils.log().info("Parental Control is disabled");}

			if (userProfilesText.isDisplayed())
				utils.log().info(userProfilesText.getText() + " text is displayed");
			else
				utils.log().info("User Profiles text is not displayed");

			if (addProfileLink.isDisplayed())
				utils.log().info(addProfileLink.getText() + " link is displayed");
			else
				utils.log().info("Add Profile link is not displayed");
			
			try {
				if (pauseAllProfilesText.isDisplayed())
					utils.log().info(pauseAllProfilesText.getText() + " text is displayed");
				}catch(Exception exp) {utils.log().info("Pause All Profiles text is not displayed");}
		
			try {	
				if (pauseInternetAccessToAllText.isDisplayed())
					utils.log().info(pauseInternetAccessToAllText.getText() + " text is displayed");
			}catch(Exception exp) {utils.log().info("Pause Internet For All Profiles text is not displayed");}

			try {	
				if (disablePauseAllProfilesToggleButton.isDisplayed())
					utils.log().info("Pause All Profiles Switch button is OFF");
			}catch(Exception exp) {utils.log().info("Pause All Profiles Switch button enabled");}
			
			try {	
				if (enablePauseAllProfilesToggleButton.isDisplayed())
					utils.log().info("Pause All Profiles Switch button is ON");
			}catch(Exception exp) {utils.log().info("Pause All Profiles Switch button disabled");}
			
			try {	
				if (noProfilesText1.isDisplayed())
					utils.log().info(noProfilesText1.getText());
			}catch(Exception exp) {utils.log().info("Currently there are users under Parental Control ");}

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickBackButton() {
		if (backButton.isDisplayed()) {
			click(backButton);
			utils.log().info("Clicked on Back Button");
			return true;
		} else {
			utils.log().info("Back button is not displayed");
			return false;
		}
	}

	public boolean clickHelpIcon() {
		if (helpIcon.isDisplayed()) {
			click(helpIcon);
			utils.log().info("Clicked on Help Icon");
			return true;
		} else {
			utils.log().info("Help button is not displayed");
			return false;
		}
	}

	public boolean clickProfilesTab() {
		if (profilesTab.isDisplayed()) {
			click(profilesTab);
			utils.log().info("Clicked Profiles Tab on Parental Control Page");
			return true;
		} else {
			utils.log().info("Profiles Tab on Parental Control Page is not displayed");
			return false;
		}
	}

	public boolean clickCurrentlyBlockedTab() {
		if (profilesTab.isDisplayed()) {
			click(currentlyBlockedTab);
			utils.log().info("Clicked Currently Blocked Tab on Parental Control Page");
			return true;
		} else {
			utils.log().info("Currently Blocked Tab on Parental Control Page is not displayed");
			return false;
		}
	}

	public boolean enableParentalControl() {
		try {
			click(disableParentalControlToggleButton);
			utils.log().info("Parental Control is turned ON. Add Profile option is enabled to add new profiles.");
			return true;
		} catch(Exception e) {
			utils.log().info("Parental Control is already enabled");
			return true;
		}
	}

	public boolean disableParentalControl() {
		try {
			click(enableParentalControlToggleButton);
			utils.log().info("Parental Control is turned OFF. Add Profile option is disabled");
			return true;
		} catch(Exception e) {
			utils.log().info("Parental Control is already disabled");
			return true;
		}
	}

	public boolean enablePauseInternetAccessForAllUserProfiles() {
		if (disablePauseAllProfilesToggleButton.isDisplayed()) {
			click(disablePauseAllProfilesToggleButton);
			if (this.getPauseInternetForAllDialogObject().isAt()) {
				this.getPauseInternetForAllDialogObject().verifyUIOnPauseInternetForAllDialog();
				this.getPauseInternetForAllDialogObject().clickYesPauseButton();
				super.pause(5);
			}
			utils.log().info("Pause All Profiles is turned ON");
			return true;
		} else {
			utils.log().info("Internet is already Paused for all user profiles");
			return true;
		}
	}

	public boolean disablePauseInternetAccessForAllProfiles() {
		if (enablePauseAllProfilesToggleButton.isDisplayed()) {
			click(enablePauseAllProfilesToggleButton);
			if (this.getResumeInternetForAllDialogObject().isAt()) {
				this.getResumeInternetForAllDialogObject().verifyUIOnResumeInternetForAllDialog();
				this.getResumeInternetForAllDialogObject().clickYesResumeButton();
				super.pause(5);
			}
			utils.log().info("Pause All Profiles is turned OFF");
			return true;
		} else {
			utils.log().info("Internet is already Resumed for all users");
			return true;
		}

	}

	public boolean clickAddProfilesLink() {
		if (addProfileLink.isDisplayed()) {
			click(addProfileLink);
			utils.log().info("Clicked on Add Profile Link");
			return true;
		} else {
			utils.log().info("Add Profile link is not displayed");
			return false;
		}
	}

//	public int getCountOfProfiles() {
//		int size = profileListView.size();
//		try {
//			if (super.profileNames.size() == size)
//				utils.log().info("Count of User Profiles : " + size);
//		} catch (Exception e) {
//			utils.log().info("Number of user profiles created in app does not match with size of arraylist");
//		}
//		return size;
//	}

	public boolean verifyUserProfile() {

		utils.log().info("**********************************************************");
		utils.log().info("Details of User Profiles created in Parental Control Page");
		utils.log().info("**********************************************************");

		try {
			for (int i = 1; i <= 3; i++) {
				utils.log().info("User Profile : " + i);
				utils.log().info("------------------");
				List<MobileElement> entity = (List<MobileElement>) super.getDriver().findElementsByXPath(
						"//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[" + i
								+ "]");

				for (MobileElement e : entity) {
					try {
						if (e.findElementByXPath(
								"//android.widget.ImageView[@resource-id='com.arris.sbcBeta:id/profile_image']")
								.isDisplayed())
							utils.log().info("Profile Image is displayed");
					} catch (Exception exp) {
						utils.log().info("Profile Image is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
								.isDisplayed()) {
							utils.log().info("Profile user Name is : " + e.findElementByXPath(
									"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
									.getText());
						}
					} catch (Exception exp) {
						utils.log().info("User Profile Name is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_connected_devices']")
								.isDisplayed()) {
							utils.log().info("Number of Devices Paused for Internet Connection is : " + (e
									.findElementByXPath(
											"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_connected_devices']")
									.getText()));
						}
					} catch (Exception exp) {
						utils.log().info("Number of Devices Paused for Internet Connection is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/pause_internet_message']")
								.isDisplayed()) {
							utils.log().info("Paused Internet Label is displayed : " + (e.findElementByXPath(
									"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/pause_internet_message']")
									.getText()));
						}
					} catch (Exception exp) {
						utils.log().info("Paused Internet Label is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='false']")
								.isDisplayed()) {
							utils.log()
									.info("Internet is not Paused for this user. Switch is : " + (e.findElementByXPath(
											"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='false']")
											.getText()));
						} else
							utils.log().info("Internet is Paused for this user. Switch is : " + (e.findElementByXPath(
									"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='true']")
									.getText()));
					} catch (Exception exp) {
						utils.log().info("Paused Internet Switch is not displayed ");
					}

					utils.log().info("****************************************************");
					utils.log().info("                                                    ");
				}
				if (i >= 3)
					super.swipeUp();
				super.pause(3);
			}
			return true;
		} catch (Exception exp) {
			utils.log().info("Error in retrieving User Profile list in Parental Control Profiles Page ");
			return false;
		}
	}

	public boolean pauseInternetForSelectedUserProfile() {
		utils.log().info("**********************************************");
		utils.log().info("Internet Is Paused For Selected User Profiles ");
		utils.log().info("**********************************************");

		try {
			for (int i = 0; i < 5; i += 2) {
				utils.log().info("User Profile : " + i);
				utils.log().info("----------------------");
				List<MobileElement> entity = (List<MobileElement>) super.getDriver().findElementsByXPath(
						"//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[" + i
								+ "]");
				for (MobileElement e : entity) {
					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
								.isDisplayed()) {
							utils.log().info("Profile user Name is : " + e.findElementByXPath(
									"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
									.getText());
							selectedProfileNames.add(e.findElementByXPath(
									"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
									.getText());
						}
					} catch (Exception exp) {
						utils.log().info("User Profile Name is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='false']")
								.isDisplayed())
							utils.log()
									.info("Internet is not Paused for this user. Switch is : " + (e.findElementByXPath(
											"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='false']")
											.getText()));
						else
							utils.log().info("Internet is Paused for this user. Switch is : " + (e.findElementByXPath(
									"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='true']")
									.getText()));
					} catch (Exception exp) {
						utils.log().info("Paused Internet Switch is not displayed ");
					}
					utils.log().info("****************************************************");
					utils.log().info("                                                    ");
				}
				if (i == 3)
					new SwipeActions().swipeScreen(Direction.UP);
				super.pause(3);
			}
			return true;
		} catch (Exception exp) {
			utils.log().info("Error in retrieving User Profile list in Parental Control Profiles Page ");
			return false;
		}
	}

	public boolean clickOnUserProfile() {
		utils.log().info("****************************************");
		utils.log().info("Selecting a User Profile from the list  ");
		utils.log().info("****************************************");
		//super.generateRandomNumber13();

		try {
			for (int i = 1; i <= 1; i++) {
//				utils.log().info("User Profile : " + i);
//				utils.log().info("------------------");
				List<MobileElement> entity = (List<MobileElement>) super.getDriver().findElementsByXPath(
						"//androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+i+"]");

				for (MobileElement e : entity) {
					try {
						//if (e.findElementByXPath("//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']").isDisplayed()) {
							utils.log().info("Clicking on User profile Name : " + super.getDriver().findElementByXPath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]").getText());
							click(super.getDriver().findElementByXPath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
						//}
					} catch (Exception exp) {
						utils.log().info("User Profile Name is not displayed ");
					}
				}
			}
			return true;
		} catch (Exception exp) {
			utils.log().info("User Profile does not exits. Please create one");
			return false;
		}
	}
	
	public boolean deleteUserProfile() {
		utils.log().info("****************************************");
		utils.log().info("Deleting a User Profile from the list  ");
		utils.log().info("****************************************");
		//super.generateRandomNumber13();

		try {
			for (int i = 3; i <= 3; i++) {
//				utils.log().info("User Profile : " + i);
//				utils.log().info("------------------");
				List<MobileElement> entity = (List<MobileElement>) super.getDriver().findElementsByXPath(
						"//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[" + i
								+ "]");

				for (MobileElement e : entity) 
				{
					try {
						if (e.findElementByXPath("//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']").isDisplayed())
							utils.log().info("Deleting on User profile Name : " + e.findElementByXPath("//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
							.getText());
							elementX = e.findElementByXPath("//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']").getLocation().getX();
							elementY = e.findElementByXPath("//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']").getLocation().getY();
							new SwipeOnElement().swipeAction(elementX, elementY, "Left");
							if(deleteProfileIcon.isDisplayed())
								click(deleteProfileIcon);
					} catch (Exception exp) {
						utils.log().info("Unable to Delete the selected user profile");
					}
				}
			}
			return true;
		} catch (Exception exp) {
			utils.log().info("User Profile does not exits. Please create one");
			return false;
		}
	}

	public boolean verifyPauseInternetAccessForAllUserProfile() {
		counter = 1;
		utils.log().info("***************************************************");
		utils.log().info("Internet Is Paused For The Following User Profiles ");
		utils.log().info("***************************************************");
		try {
			for (int i = 1; i <= 3 ; i++) {
				utils.log().info("User Profile : " + counter);
				utils.log().info("----------------------");
				List<MobileElement> entity = (List<MobileElement>) super.getDriver().findElementsByXPath(
						"//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[" + i
								+ "]");
				
				for (MobileElement e : entity) {
					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
								.isDisplayed()) {
							utils.log().info("Profile user Name is : " + e.findElementByXPath(
									"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
									.getText());
						}
					} catch (Exception exp) {
						utils.log().info("User Profile Name is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_connected_devices']")
								.isDisplayed()) {
							utils.log().info("Number of Devices Paused for Internet Connection is : " + (e
									.findElementByXPath(
											"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_connected_devices']")
									.getText()));
						}
					} catch (Exception exp) {
						utils.log().info("Number of Devices Paused for Internet Connection is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/pause_internet_message']")
								.isDisplayed()) {
							utils.log().info("Paused Internet Label is displayed : " + (e.findElementByXPath(
									"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/pause_internet_message']")
									.getText()));
						}
					} catch (Exception exp) {
						utils.log().info("Paused Internet Label is not displayed ");
					}

					try {
						if (e.findElementByXPath("//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='true']").isDisplayed())
							utils.log().info("Internet is Paused for this user. Switch is : " + (e.findElementByXPath(
									"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='true']").getText()));
					} catch (Exception exp) {
						utils.log().info("Internet is not Paused for this user. Switch is : " + (e.findElementByXPath("//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='true']").getText()));
					}
					utils.log().info("****************************************************");
					utils.log().info("                                                    ");
					counter++;
				}
				if (i == 3)
					new SwipeActions().swipeScreen(Direction.UP);
				super.pause(3);
			}
			return true;
		} catch (Exception exp) {
			utils.log().info("Error in retrieving User Profile list in Parental Control Profiles Page ");
			return false;
		}
	}

	public boolean verifyResumeInternetAccessForAllUserProfile() {
		counter = 1;
		utils.log().info("****************************************************");
		utils.log().info("Internet Is Resumed For The Following User Profiles ");
		utils.log().info("****************************************************");
		
		try {
			for (int i = 1; i <= 3 ; i++) {
				utils.log().info("User Profile : " + counter);
				utils.log().info("----------------------");
				List<MobileElement> entity = (List<MobileElement>) super.getDriver().findElementsByXPath(
						"//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[" + i
								+ "]");
				for (MobileElement e : entity) {
					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
								.isDisplayed()) {
							utils.log().info("Profile user Name is : " + e.findElementByXPath(
									"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_name']")
									.getText());
						}
					} catch (Exception exp) {
						utils.log().info("User Profile Name is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_connected_devices']")
								.isDisplayed()) {
							utils.log().info("Number of Devices Paused for Internet Connection is : " + (e
									.findElementByXPath(
											"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/profile_connected_devices']")
									.getText()));
						}
					} catch (Exception exp) {
						utils.log().info("Number of Devices Paused for Internet Connection is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/pause_internet_message']")
								.isDisplayed()) {
							utils.log().info("Paused Internet Label is displayed : " + (e.findElementByXPath(
									"//android.widget.TextView[@resource-id='com.arris.sbcBeta:id/pause_internet_message']")
									.getText()));
						}
					} catch (Exception exp) {
						utils.log().info("Paused Internet Label is not displayed ");
					}

					try {
						if (e.findElementByXPath(
								"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='false']")
								.isDisplayed()) {
							utils.log()
									.info("Internet is not Paused for this user. Switch is : " + (e.findElementByXPath(
											"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='false']")
											.getText()));
						} else
							utils.log().info("Internet is Paused for this user. Switch is : " + (e.findElementByXPath(
									"//android.widget.Switch[@resource-id='com.arris.sbcBeta:id/profile_enable_disable' and @checked='true']")
									.getText()));
					} catch (Exception exp) {
						utils.log().info("Paused Internet Switch is not displayed ");
					}
					utils.log().info("****************************************************");
					utils.log().info("                                                    ");
					counter++;
				}
				if (i == 3)
					new SwipeActions().swipeScreen(Direction.UP);
				super.pause(3);
			}
			return true;
		} catch (Exception exp) {
			utils.log().info("Error in retrieving User Profile list in Parental Control Profiles Page ");
			return false;
		}
	}

	@Override
	public boolean isAt() {
		if (enableParentalControlText.isDisplayed()) {
			utils.log().info("On Parental Control - Profiles Page");
			return true;
		} else {
			utils.log().info("Not on Parental Control - Profilees Page");
			return false;
		}
	}
}
