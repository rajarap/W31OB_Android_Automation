package com.cs.arris.Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Interface.Page;
import com.cs.arris.Utilities.Direction;
import com.cs.arris.Utilities.SwipeActions;
import com.cs.arris.Utilities.TestUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeNetworkHealthOptimizationISPSpeedRatePage extends ParentClass implements Page
{
	public TestUtils utils = new TestUtils();
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/toolbar")
	public MobileElement backButton; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/txtToolBarTitle")
	public MobileElement ispSpeedRateTitle; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/sensitivityStatusText")
	public MobileElement recommendedSensitivityLabel; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/sensitivityImage")
	public MobileElement image; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/linkRateIspText")
	public MobileElement ispRecommendedRate; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/textView10")
	public MobileElement whenToRecommendText; 
	
	@AndroidFindBy(id = "com.arris.sbcBeta:id/sensitivityDescTxt")
	public MobileElement recommendation; 
	
	
	public HomeNetworkHealthOptimizationISPSpeedRatePage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(super.getDriver()), this);
	}
	
	 public FooterIconsPage getFooterIconsPageObject() {
		 FooterIconsPage footerIconsPage = new FooterIconsPage();
	     return footerIconsPage;
	  }
	 
		public boolean clickBackButton() {
			if (backButton.isDisplayed()) {
				click(backButton);
				utils.log().info("Clicked on Back Button");
				return true;
			} else {
				utils.log().info("Back Button is not displayed");
				return false;
			}
		}
		
	 
	 public boolean verifyISPSpeedRatePageUI() {
			
			utils.log().info("                                                                                       ");
			utils.log().info("***************************************************************************************");
			utils.log().info("Details of UI Elements on Network Health Optimization Settings - ISP Speed Rate Page   ");
			utils.log().info("***************************************************************************************");
			try {
				try {
					if (ispSpeedRateTitle.isDisplayed())
						utils.log().info(ispSpeedRateTitle.getText() + " title text is displayed");
				} catch (Exception e3) {
					utils.log().info("ISP Speed Rate title text is not displayed");
				}

				try {
					if (backButton.isDisplayed())
						utils.log().info("Back button is displayed");
				} catch (Exception e2) {
					utils.log().info("Back button is not displayed");
				}
				
				try {
					if (recommendedSensitivityLabel.isDisplayed())
						utils.log().info(recommendedSensitivityLabel.getText() + " is displayed");
				} catch (Exception e1) {
					utils.log().info("Sensitivity Text is not displayed");
				}
				
				try{
					if (ispRecommendedRate.isDisplayed())
						utils.log().info("Recommendation : " + ispRecommendedRate.getText() + " is displayed");
				}catch(Exception e) {
					utils.log().info("Recommendation is not displayed");
				}
				
				try{
					if (whenToRecommendText.isDisplayed())
						utils.log().info(whenToRecommendText.getText() + " label is displayed");
				}catch(Exception e) {
					utils.log().info("When do you get this recommendation? text is not displayed");
				}
				
				try{
					if (recommendation.isDisplayed())
						utils.log().info(recommendation.getText() + " message is displayed");
				}catch(Exception e) {
					utils.log().info("Recommendation message is not displayed");
				}

				return true;
			} catch (Exception e) {
				return false;
			}
		}
	 
	@Override
	public boolean isAt() {
		if(ispSpeedRateTitle.isDisplayed())
		{
			utils.log().info("On Network Health Optimization Settings - ISP Speed Rate Page");
			return true;}
		else {
			utils.log().info("Not on Network Health Optimization Settings - ISP Speed Rate Page");
		return false;}
	}
}
