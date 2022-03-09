package com.cs.arris.Utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.cs.arris.Base.ParentClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailTest extends ParentClass{

		public TestUtils utils = new TestUtils();
		public AndroidDriver<AndroidElement> androidDriver;
		public WebDriver driver;
		String content;
		public TouchAction action;
		
		public void clickGoButton() {
			int x = 1000;
			int y = 905;
			PointOption p = new PointOption();
			p.withCoordinates(x, y);
			utils.log().info("Clicking on Go Button");
			action = new TouchAction(super.getDriver());
			action.tap(p).release().perform();
		}

		  public String getValidOTP(String emailId) 
		  {
			  
			  super.getDriver().activateApp("com.android.chrome");
			  super.getDriver().getContextHandles();
			  super.getDriver().context("WEBVIEW_chrome");
			  
			  super.getDriver().get("https://yopmail.com");
			  super.pause(5);
			  super.getDriver().findElement(By.id("login")).sendKeys(emailId);
			  super.pause(5);
//			  driver.findElement(By.xpath("//android.widget.Button[@bounds='[955,863][1055,960]']")).click();  //go arrow
//			  super.getDriver().findElement(By.id("refreshbut")).click();  //go arrow
			  clickGoButton();
			  super.pause(5);
			  super.getDriver().findElement(By.xpath("//android.widget.CheckBox[@bounds='[34,708][81,753]']")).click();  //click checkbox
			  super.pause(5);
			  String content =  super.getDriver().findElement(By.xpath("//android.view.View[@bounds='[23,582][1057,1218]']")).getText();

			  String otpCode = getOTPCode(content);
			  super.pause(5);
			  utils.log().info("OTP CODE : " + otpCode);
			  super.getDriver().context("NATIVE_APP");
			  super.getDriver().activateApp("com.arris.sbcBeta");
			  return otpCode;

//			  WebDriverManager.chromedriver().setup();
//			  utils.log().info("Browser URL is : " + super.getDriver().getCurrentUrl());
//			  
//			  Set<String> allContext = super.getDriver().getContextHandles();
//			  for (String context : allContext) {
//				if (context.contains("WEBVIEW"))
//					super.getDriver().context(context);
//			  }
//			  utils.log().info("Switched to WEBVIEW");
//			  
//			  if(super.getDriver().isBrowser()) {
//				  super.getDriver().manage().window().maximize();
//				  super.getDriver().get("https://yopmail.com");
//				  super.getDriver().findElement(By.id("login")).sendKeys(emailId);
//				  super.getDriver().findElement(By.className("md")).click();
//
//				  super.getDriver().findElement(By.xpath("//*[@id='mail']/div)")).getText();
//			  }
//
//
//			  super.getDriver().context("NATIVE_APP");
//			  String otpCode = getOTPCode(content);
//			  return otpCode;
		}
		  
//		  public String getValidOTP(String emailId) 
//		  {
//			  utils.log().info("Inside getvalidOTP method1 ");
//		  
//			  DesiredCapabilities capabilities = DesiredCapabilities.android();
//	         // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//	          capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//	          capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
//	          capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getProps().getProperty("androidUDID"));
//	          capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//	  
//	          try {
//				driver = new RemoteWebDriver(new URL(getProps().getProperty("appiumURL")), capabilities);
//			} catch (MalformedURLException e) {e.printStackTrace();}
//	          
//	          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			  
////			  utils.log().info("Inside getvalidOTP method2 ");
////			  Set<String> allContext = super.getDriver().getContextHandles();
////			  for (String context : allContext) {
////			  if (context.contains("WEBVIEW"))
////				super.getDriver().context(context);
////				}
//			  
//			  driver.get("https://yopmail.com");
//			  super.pause(5);
//			  driver.findElement(By.id("login")).sendKeys(emailId);
//			  super.pause(5);
////			  driver.findElement(By.xpath("//android.widget.Button[@bounds='[955,863][1055,960]']")).click();  //go arrow
//			  driver.findElement(By.id("refreshbut")).click();  //go arrow
//			  super.pause(5);
//			  driver.findElement(By.xpath("//android.widget.CheckBox[@bounds='[34,708][81,753]']")).click();  //click checkbox
//			  super.pause(5);
//			  String content = driver.findElement(By.xpath("//android.view.View[@bounds='[23,582][1057,1218]']")).getText();
//			  driver.quit();
//			  
//			  utils.log().info("Inside getvalidOTP method3");
//			  
//			  String otpCode = getOTPCode(content);
//			  super.pause(5);
//			  utils.log().info("OTP CODE : " + otpCode);
//			  super.getDriver().activateApp("com.arris.sbcBeta");
//			  return otpCode;
//		}
		  
		  
			private String getOTPCode(String content) 
			{
		        String otpCodePattern = "[^a-zA-Z:!.\"<>\\/=\\-;,\\s*]\\d\\d\\d\\d\\d";
		        Pattern p = Pattern.compile(otpCodePattern);
		        Matcher m = p.matcher(content); 
		        if(m.find())
		        	return m.group(0);
		        else
		        	return "No Matcher";
			}

}


//System.setProperty("webdriver.chrome.driver","/Surfboard/chromedriver");
//driver = new ChromeDriver();
