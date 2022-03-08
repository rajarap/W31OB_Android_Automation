package com.cs.arris.Exceptions;

import com.cs.arris.Utilities.TestUtils;

public class EC_0015_1805_OTP_Screen_Continue_Onboarding extends RuntimeException
{
	TestUtils utils = new TestUtils();

	public EC_0015_1805_OTP_Screen_Continue_Onboarding(String errorMessage, Throwable err) {
        utils.log().info(errorMessage, err);
	}
}
