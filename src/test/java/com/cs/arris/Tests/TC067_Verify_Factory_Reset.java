package com.cs.arris.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;

import com.cs.arris.Base.ParentClass;
import com.cs.arris.Utilities.ResetMAXRouter;
import com.cs.arris.Utilities.TestUtils;
import com.cs.arris.Workflows.TC01_EC_0001_1201_Disconnect_Bluetooth_On_Mobile_Workflow;
import com.cs.arris.Workflows.TC03_Verify_Invalid_OTP_Workflow;
import com.cs.arris.Workflows.TC51_Signin_And_Onboard_Workflow;

public class TC067_Verify_Factory_Reset extends ParentClass
{
	TestUtils utils = new TestUtils();
	
	  @BeforeMethod
	  public void beforeMethod(Method m) 
	  {
		   utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
	  }
	  
	  @Test(priority = 1)
	  public void Factory_Reset()
	  {
	//	  new ResetMAXRouter().reset();
		  
	  }
}
