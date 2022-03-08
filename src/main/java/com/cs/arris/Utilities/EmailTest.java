package com.cs.arris.Utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.cs.arris.Base.ParentClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailTest extends ParentClass{

		public TestUtils utils = new TestUtils();
		public AndroidDriver<AndroidElement> androidDriver;
		public WebDriver driver;
		String content;
		
		public void displayMessage() {
			utils.log().info("Inside EmailTest class ");
		}

//		  public String getValidOTP(String emailId) 
//		  {
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
//		}
		  
		  public String getValidOTP(String emailId) throws MalformedURLException 
		  {
			  utils.log().info("Inside getvalidOTP method1 ");
		  
			  DesiredCapabilities capabilities = DesiredCapabilities.android();
	          capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	          capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	          capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getProps().getProperty("androidUDID"));
	          capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	  
	          driver = new RemoteWebDriver(new URL(getProps().getProperty("appiumURL")), capabilities);
	          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  
			  utils.log().info("Inside getvalidOTP method2 ");
//			  System.setProperty("webdriver.chrome.driver","/Surfboard/chromedriver");
//			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  utils.log().info("Inside getvalidOTP method3");
			  
			  driver.get("https://yopmail.com");
			  driver.findElement(By.id("login")).sendKeys(emailId);
			  driver.findElement(By.className("md")).click();
			  driver.findElement(By.xpath("//*[@id='mail']/div)")).getText();
			  driver.quit();
			  
			  String otpCode = getOTPCode(content);
			  utils.log().info("OTP CODE : " + otpCode);
			  utils.log().info("Inside getvalidOTP method4");
			  return otpCode;
		}
		  
		  
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
