package com.cs.arris.Tests;

import org.testng.annotations.Test;

import java.lang.reflect.Method;
import org.testng.annotations.BeforeMethod;
import com.cs.arris.Base.ParentClass;
import com.cs.arris.Pages.ConnectionToWifiNeededPage;
import com.cs.arris.Utilities.TestUtils;


public class TC067_Verify_Connect_To_Wifi extends ParentClass
{
	TestUtils utils = new TestUtils();
	
	  @BeforeMethod
	  public void beforeMethod(Method m) 
	  {
		   utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
	  }
	  
	  @Test(priority = 1)
	  public void factory_reset()
	  {
		  new ConnectionToWifiNeededPage().turnOnWifi("Arris-Guest", "ARRS!Gu3st", "ce071717bb59293c057e");
		  
	  }
}
